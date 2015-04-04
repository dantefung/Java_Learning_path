package com.dantefun.IO.part1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺸��ƶ༶�ļ���
 * 
 * 
 * ����Դ��C:\Users\Administrator\myJavaPath\Java_Learning_Path\dantefung\src\com\dantefung\IO\part1
 * 
 * Ŀ�ĵأ�E:\demo
 * 
 * ������
 *    A����װ����ԴFile
 *    B����װĿ�ĵ�File
 *    C���жϸ�File���ļ��л����ļ�
 *        a:���ļ���
 *            ����Ŀ�ĵ�Ŀ¼�´������ʼѼ�
 *            ��ȡ��File�����µ������ļ������ļ���File����
 *            �����õ�ÿһFile����
 *            �ص�C
 *        b�����ļ�
 *            �͸��ƣ��ֽ�����
 * 
 * 
 * */
public class CopyFoldersDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String srcPath = "C:\\Users\\Administrator\\myJavaPath\\Java_Learning_Path\\dantefung\\src\\com\\datefung\\IO\\part1";
		String destPath = "E:\\Demo";
		
		//��װ����ԴFile
		File srcFile = new File(srcPath);
		//��װĿ�ĵ�File
		File destFile = new File(destPath);
		
		//�����ļ��й���
		copyFolder(srcFile, destFile);
	}

	private static void copyFolder(File srcFile, File destFile) throws IOException{
		// TODO Auto-generated method stub
		//�жϸ�File���ļ������ļ���
		if(srcFile.isDirectory())
		{
			//�ļ��� 
			File newFolder = new File(destFile, srcFile.getName());
			newFolder.mkdir();
			
			//��ȡ��File�����µ������ļ������ļ���File����
			File[] fileArray = srcFile.listFiles();
			for(File file : fileArray)
			{
				copyFolder(file,newFolder);
			}
		}
		else
		{
			//�ļ�
			File newFile = new File(destFile, srcFile.getName());
			copyFile(srcFile, newFile);
		}
	}

	private static void copyFile(File srcFile, File newFile) throws IOException{
		// TODO Auto-generated method stub
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
		
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = bis.read()) != -1)
		{
			bos.write(bys, 0, len);
		}
		
		//�ͷ���Դ
		bis.close();
		bos.close();
	
	}

}
