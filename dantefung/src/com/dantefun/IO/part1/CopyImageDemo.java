package com.dantefun.IO.part1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  ����ͼƬ��
 *  
 *   ������
 *       �������ݣ��������֪���ñʼǱ��򿪲��ܹ������������ַ�������������ֽ�����
 *       ͨ����ԭ������֪��Ӧ�ò����ֽ�����
 *       ���ֽ�����4�з�ʽ�����ԣ��������Ŀ���Ǿ���4�з�ʽ���Ƽ�������4�з�ʽ��
 *       
 *       ����Դ��
 *       C��\\a.jpg -- FileInputStream -- BufferedInputStream
 *       
 *       Ŀ�ĵأ�
 *       D��\\b.jpg -- FileOutputStream -- BufferedOutputStream
 * 
 * 
 * */
public class CopyImageDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//ʹ���ַ�����Ϊ·��
		//String srcString = "C:\\a.jpg";
		//String destString = "D:\\b.jpg";
		File srcFile = new File("C:\\a.jpg");
		File destFile = new File("D:\\b.jpg");
		
		//method1(srcFile,destFile);
		//method2(srcFile,destFile);
		//method3(srcFile,destFile);
		method4(srcFile,destFile);
		
	}

	//��Ч����д���ݡ� �ֽڻ���һ�ζ�дһ���ֽ����顣
	private static void method4(File srcFile, File destFile) throws IOException 
	{
		// TODO Auto-generated method stub
	    //���ش��ӣ��ļ��ֽ����׽��˸�Ч������(Decoratorģʽ)��
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
		
		//�����ֽ����顣��һ�����������������ݣ����˻�������ã����Ӹ�Ч�Ķ�д���ݡ���
		byte[] by = new byte[1024];
		int len = 0;
		while((len = bis.read()) != -1)
		{
	          bos.write(by, 0, len);	          
		}
		
		//����javaͨ��C��C++���õײ�ϵͳ����Դ�����Ҫ�ͷ�ϵͳ��Դ��
		
		//�ͷ���Դ��
		bis.close();
		bos.close();
		
	}
	
	//��Ч����д���ݣ��ֽڻ�����һ�ζ�дһ���ֽڡ�
	private static void method3(File srcFile, File destFile) throws IOException
	{
		//���ش��ӣ��ļ��ֽ����׽��˸�Ч������
		
		//��װ������Դ��ȡ���ݵĶ��� �ö���ָ���ļ���
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		
		//��װ��Ŀ�ĵ�д���ݵĶ���
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
		
		int len = 0;
		while((len = bis.read()) != -1)
		{
			bos.write(len);
		}
		
		//�ͷ���Դ
		bis.close();
		bos.close();
		
	}
	
	//�����ֽ���һ�ζ�дһ���ֽ����顣
	private static void method2(File srcFile, File destFile) throws IOException
	{
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile);
		
		byte[] by = new byte[1024];
		int len = 0;
		while((len = fis.read()) != -1)
		{
			fos.write(by, 0, len);
		}
		
		//�ͷ���Դ
		fis.close();
		fos.close();
	}
	
	//�����ֽ���һ�ζ�дһ���ֽ�
	private static void method1(File srcFile, File destFile) throws IOException
	{
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile);
		
		int len = 0;
		while((len = fis.read()) != -1)
		{
			fos.write(len);
		}
		
		//�ͷ���Դ
		fis.close();
		fos.close();
	}

}
