package com.dantefung.IO;
/*
 * �쳣����������˲������������
 * 
 * 
 * ������쳣�� 
 *     �������⣺Error  ���ǲ�������������һ�㶼�Ǻ����صģ�����˵�ڴ������
 *     ���⣺Exception
 *         ����ʱ����:����RuntimeException�쳣��Ҫ����
 *         ����ʱ����:RuntimeException  ������������Ҳ��������Ϊ��������⣬�������������ֿ϶��������ǵĴ��벻�Ͻ���
 * 
 * ���������������⣬����û������������ôjvm������Ĭ�ϵĴ���
 * 
 * ���쳣�����ƣ�ԭ�򼰳��ֵ��������Ϣ����ڿ���̨��
 * 
 * ͬʱ���������
 * ���ǵĳ����ܼ���ִ�С�
 * **/
public class ExceptionDemo {
    public static void main(String[] args)
    {
    	int a = 10;
    	int b = 0;
    	
    	System.out.println(a/b);
    	System.out.println("over");
    }
}
