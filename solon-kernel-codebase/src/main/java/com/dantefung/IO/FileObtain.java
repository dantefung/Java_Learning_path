package com.dantefung.IO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��ȡ���ܣ�
 * public String getAbsolutePath()����ȡ����·��
 * public String getPath()����ȡ���·����
 * public String getName()����ȡ����
 * public long length()����ȡ���ȡ��ֽ�����
 * public long lastModified()����ȡ���һ���޸ĵ��¼�������ֵ��
 * 
 * �߼����ܣ�
 * public String[] list()
 * public File[] listFiles()
 * 
 * **/
public class FileObtain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //�����ļ�����
		File file = new File("demo\\test.txt");
		
		System.out.println("getAbsolutePath:" + file.getAbsoluteFile());
		System.out.println("getPath:" + file.getPath());
		System.out.println("getName:" + file.getName());
		System.out.println("length:" + file.length());
		System.out.println("lastModified:" + file.lastModified());
		
		
		//1427285125847
		Date d = new Date(1427285125847L);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
		
		
	}

}
