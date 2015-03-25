package com.dantefung.IO;

import java.io.File;
import java.io.IOException;

/**
 * �������ܣ�
 * public boolean createNewFile():�����ļ�   false����������������ļ��Ͳ������ˡ�
 * public boolean mkdir():�����ļ���  false����������������ļ��Ͳ������ˡ�
 * public boolean mkdirs():�����༶�ļ��С�
 * 
 * �����Ĳ�һ�������ӡ�
 * ע�⣺�㵽��Ҫ�����ļ������ʼѼѣ����������������Ҫ�����ˡ�
 * **/
public class FileDemo {
	public static void main(String[] args) throws IOException
	{//������Ҫ��e��Ŀ¼�´���һ���ļ���demo
		File file = new File("e:\\demo");
		System.out.println("mkdir:" + file.mkdir());
		
		//������Ҫ��e��Ŀ¼demo�´���һ���ļ�a.txt
		File file2 = new File("e:\\demo\\a.txt");
		System.out.println("createNewFile:" + file.createNewFile());
	
		//������e��Ŀ¼test�´���һ���ļ�b.txt
		File file3 = new File("e:\\test");
		System.out.println("mkdir:" + file3.mkdir());
		
		File file4 = new File("e:\\test\\a.txt");
		System.out.println("createNewFile:" + file.createNewFile());
		
	    //ע�⣺Ҫ����ĳ��Ŀ¼�´������ݣ���Ŀ¼���ȱ������
		//���� Exception in thread "mian" java.io.IOException��ϵͳ�Ҳ���ָ����·����
	
		//������e��Ŀ¼test�´���aaaĿ¼��
		File file5 = new File("e:\\test\\aaa");
		System.out.println("mkdir:" + file5.mkdir());
		
		
		//��ʵ�������и��򵥵ķ�����
		File file7 = new File("e:\\aaa\\bbb\\ccc\\ddd");
		System.out.println("mkdir:" + file4.mkdirs());
		
		//���������������� ���ᱨ�����ԡ�����ֻ�ܴ����ļ��С�
		File file8 = new File("e:\\liuyi\\a.txt");
		System.out.println("mkdirs:" + file8.mkdirs());
	}
}
