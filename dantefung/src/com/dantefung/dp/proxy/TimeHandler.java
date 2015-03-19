package com.dantefung.dp.proxy;

import java.lang.reflect.Method;
import com.dantefung.dp.proxy.InvocationHandler;

public class TimeHandler implements InvocationHandler {
	private Object target;
	
	public TimeHandler(Object target)
	{
		super();
		this.target = target;
	}
	
	/**�����ľ���ʵ�ֽ����û�**/
	@Override
	public void invoke(Object o, Method m)
	{
		long start = System.currentTimeMillis();
		System.out.println("starttime:" + start);
		System.out.println(o.getClass().getName());
		try
		{
			/**����java.lang.reflect.Method.invoke����������Ŀ������move()����������˵ʵ�����û��Զ���ӿڵ�һ������ʵ�����еķ�����**/
			m.invoke(target);//Open Declaration Object java.lang.reflect.Method.invoke(Object obj, Object... args) 
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end-start));
	}
}
