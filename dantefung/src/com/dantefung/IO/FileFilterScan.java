package com.dantefung.IO;

import java.io.File;

/*
 *����
 *    ɨ�� C:\Users\Administrator\myJavaPath\Java_Learning_Path\dantefung
 *    �������ļ���������.javaΪ��׺���ļ�����ӡ�����
 *    
 *ʵ�֣�
 *    1.��װĿ¼
 *    2.��ȡ��Ŀ¼�µ��ļ����ļ��ж���
 *    3.�����ж��Ƿ�Ϊ�ļ��У�
 *        �ǣ�
 *            ����2
 *        ��
 *            �ж��Ƿ���.javaΪ��׺���ļ���
 *                �ǣ�
 *                    ��ӡ������ļ�������
 *                �����κβ�����
 *               
 *                
 * 
 * 
 * 
 **/
public class FileFilterScan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.��װĿ¼
		File srcFolder = new File("C:\\Users\\Administrator\\myJavaPath\\Java_Learning_Path\\dantefung");
		//�ݹ����
		getAllJavaFilePaths(srcFolder);
	}

	public static void getAllJavaFilePaths(File srcFolder) {		
		
		//2.��ȡ��Ŀ¼�µ��ļ����ļ��е�File����
		File[] fileArray = srcFolder.listFiles();
		
		
		
		for(File f : fileArray)
		{    
			//�����ж��Ƿ�Ϊ�ļ���
			if(f.isDirectory())
			{
				//����2
				getAllJavaFilePaths(f);
			}
			else
			{
				//�ж��Ƿ���.javaΪ��׺���ļ���
				if(f.getName().endsWith(".java"))
				{
					//�ǣ���������ļ��ľݶ�·����
				    System.out.println( f.getAbsolutePath());
				}
			}
		}
	}

}
