package com.dantefung.IO;

import java.io.File;

/*
 * ��ȡ���ܣ��߼�����
 * public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
 * public File[] listFiles():��ȡָ��Ŀ¼�������ļ������ļ��е�File����
 * 
 * 
 * */
public class FileObtainHigh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   //ָ��һ��Ŀ¼
		File file = new File("e:\\");
		
		//public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
		String[] strArray = file.list();
		for(String s : strArray)
		{
			System.out.println(s);
		}
		
		System.out.println("-------------------");
		
		//public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�file����
		File[] fileArray = file.listFiles();
		for(File f : fileArray)
		{
			System.out.println(f.getName());
		}
	}

}
