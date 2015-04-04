package com.dantefung.IO.part1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺸��Ƶ����ļ���
 * 
 * ����Դ��e:\\demo
 * Ŀ�ĵأ�e:\\test
 * 
 * ������
 * 
 *    	A����װĿ¼
 *      B����ȡ��Ŀ¼�µ������ı���File����
 *      C��������File���飬�õ�ÿһ��File����
 *      D���Ѹ�File���и���
 * 
 * 
 * 
 * 
 * */
public class CopyFolderDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		//��װĿ¼
		File srcFolder = new File("e:\\demo");
		//��װĿ�ĵ�
		File destFolder = new File("e:\\test");
		
		//���Ŀ�ĵ��ļ��в����ڣ��ʹ���
		if(!destFolder.exists())
		{
			destFolder.mkdir();
		}
		
		//��ȡ��Ŀ¼�µ������ı���File����
		File[] files = srcFolder.listFiles();
		
		//������File���飬�õ�ÿһ��File����
		for(File file : files)
		{
			//System.out.println(file);
			//����Դ��e:\\demo
			//Ŀ�ĵأ�e:\\test
			String name = file.getName();//e.mp3
			File newFile = new File(destFolder, name);
			
			copyFile(file, newFile);
		}
	}

	private static void copyFile(File file, File newFile) throws IOException 
	{
		// TODO Auto-generated method stub
		
	    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
	    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
		
		byte[] by = new byte[1024];
	    int len = 0;
	    while((len = bis.read(by)) != -1)
	    {
	    	bos.write(by, 0, len);
	    }

	    //�ͷ���Դ
	    bis.close();
	    bos.close();
	
	}

}
