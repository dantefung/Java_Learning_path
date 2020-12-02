/*
 * Copyright (C), 2015-2020
 * FileName: SlideWindow
 * Author:   DANTE FUNG
 * Date:     2020/12/3 2:18 上午
 * Description: 滑动窗口限流工具
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 * DANTE FUNG        2020/12/3 2:18 上午   V1.0.0
 */
package com.dantefung.algorithm.limit;

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Title: SlideWindow
 * @Description: 滑动窗口限流工具，单机版
 * @author DANTE FUNG
 * @date 2020/12/03 02/18
 * @since JDK1.8
 */
public class SlideWindow {

	/**
	 * 队列ID和队列的映射关系，
	 * 队列里存储的是每一次通过时候的时间戳,
	 * 这样可以使得程序有多个限流队列
	 */
	private volatile static Map<String, List<Long>> MAP = new ConcurrentHashMap<>();

	private SlideWindow() {

	}

	/**
	 * 滑动时间窗口限流算法
	 * 在指定时间窗口，指定限制次数内，是否允许通过
	 *
	 * @param listId     队列id
	 * @param count      限制次数
	 * @param timeWindow 时间窗口大小
	 * @return 是否允许通过
	 */
	public static synchronized boolean isGo(String listId, int count, long timeWindow) {
		// 获取当前时间
		long nowTime = System.currentTimeMillis();
		// 根据队列id，取出对应的限流队列，若没有则创建
		List<Long> list = MAP.computeIfAbsent(listId, k -> new LinkedList<>());
		// 如果队列还没满，则允许通过，并添加当前时间戳到队列开始位置
		if (list.size() < count) {
			list.add(0, nowTime);
			return true;
		}

		// 队列已满（达到限制次数），则获取队列中最早添加的时间戳
		Long farTime = list.get(count - 1);
		// 用当前时间戳 减去 最早添加的时间戳
		if (nowTime - farTime <= timeWindow) {
			// 若结果小于等于timeWindow，则说明在timeWindow内，通过的次数大于count
			// 不允许通过
			return false;
		} else {
			// 若结果大于timeWindow，则说明在timeWindow内，通过的次数小于等于count
			// 允许通过，并删除最早添加的时间戳，将当前时间添加到队列开始位置
			list.remove(count - 1);
			list.add(0, nowTime);
			return true;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		while (true) {
			// 任意10秒内，只允许2次通过
			System.out.println(LocalTime.now().toString() + SlideWindow.isGo("ListId", 2, 10000L));
			// 睡眠0-10秒
			Thread.sleep(1000 * new Random().nextInt(10));
		}
	}
}
