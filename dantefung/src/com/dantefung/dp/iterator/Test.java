package com.dantefung.dp.iterator;
import com.dantefung.dp.iterator.ArrayList;
/**
 * @author DanteFung
 * @since 2015/2/12
 * 
 * Learning from mashibing's vedio. 
 * */
import com.dantefung.dp.iterator.LinkedList;
public class Test {

	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		LinkedList al = new LinkedList();
		
		/* �ɸ��������ָ�����ࡣ
		 * ����ӿڱ�̡�
		 * 
		 * ֻ��Խӿڱ��,�Ͳ���Ҫ�����ҵľ���ʵ������ʲô��
		 * �ŵ㣺
		 * �����ĳ���������滻����ʵ��ֻ���һ�����뼴�ɡ�
		 * ��������ļ��������붼���øġ�
		 * */
//		Collection c = new ArrayList();
		Collection c = new LinkedList();
		for(int i=0; i<15; i++)
		{
			c.add(new Cat(i));
		}
		System.out.println(c.size());
		
		/*
		 * ����������˵����õľ��Ǳ�������Ҫͳһһ��ʵ�ַ�ʽ��
		 * 
		 * ÿһ�����������Լ��ı�����ʽ��������Ҫ�뷽�跨����Щ�����ı�����ʽͳһ������
		 * 
		 * ֻ����һ�ֹ�ͬ�ķ�ʽ���ӿڻ�����ࡣ
		 * 
		 * */
//		ArrayList al = (ArrayList)c;
//		for(int i=0; i<al.getIndex(); i ++)
//		{
//			
//		}
		/**
		 * ������ͳһ�Ľӿڣ�����ͳһ��ʵ�ַ�ʽ��ͳһ�ĵ�����ʽ���ڲ��ľ���ʵ�ֲ��ܡ�
		 * **/
		Iterator it = c.iterator();
		while(it.hasNext())//���������һ����
		{
			Object o = it.next();
			System.out.println(o + " ");
		}
		
		c.add(new Cat(15));
		Iterator it2 = c.iterator();
		while(it.hasNext())//���������һ����
		{
			Object o = it2.next();
			System.out.println(o + " ");
		}
		
	}

}
