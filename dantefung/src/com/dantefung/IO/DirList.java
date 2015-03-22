package com.dantefung.IO;

import java.io.File;
import java.util.Arrays;


 //io/DirList.java
 //Display a directory listing using regular expressions.
 //{Args:"D.*/.java"}

public class DirList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path =new File(".");//ƥ������з�֮��������ַ���
		String[] list;
		if(args.length == 0)
		{
			list = path.list();// ����һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��
		}
		else
		{
			list = path.list(new DirFilter(args[0]));//����ģʽ���ص�����������һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼��
		}
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);//����ĸ˳������
		for(String dirItem : list)
		{
			System.out.println(dirItem);
		}
		
	}

}
