package com.dantefung.IO;

import java.io.File;

/*
 * �ж�e��Ŀ¼���Ƿ��к�׺Ϊ.jpg���ļ�������У���������ļ����ơ�
 * 
 * ������
 * 		A����װe�ж�Ŀ¼
 * 		B����ȡ��Ŀ¼�������ļ������ļ��е�File����
 * 		C��������File���飬�õ�ÿһ��File����Ȼ���ж�
 * 		D���Ƿ����ļ�
 * 			�ǣ������ж��Ƿ�����.jpgΪ��׺��
 * 				�ǣ���������ļ�������
 * 				�񣺲���������
 * 			�񣺲���������
 * 
 * 
 * 
 * 
 * ***/
public class FileFilterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��װe�ж�Ŀ¼
		File file = new File("e:\\");
		
		//��ȡ��Ŀ¼�������ļ������ļ��е�File���顣
		File[] fileArray = file.listFiles();
		
		//������File���飬�õ�ÿһ��File����Ȼ��
		for(File f : fileArray)
		{   //�Ƿ����ļ�
			if(f.isFile())
			{    //�����ж��Ƿ���.jpg��β��
				if(f.getName().endsWith(".jpg"))
				{   //������ļ������֡�
					System.out.println(f.getName());
				}
			}
	}
	}

}
