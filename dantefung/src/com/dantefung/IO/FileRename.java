package com.dantefung.IO;

import java.io.File;

/**
 * 
 * 
 * ���������ܣ�
 * public boolean renameTo(File dest)
 * 
 * ���·������ͬ�����Ǹ�����
 * ���·������ͬ�����Ǹ��������С�
 * 
 * 
 * ·�����̷���ʼ������·�� c:\\a.txt\
 * ·�������̷���ʼ�����·�� a.txt
 * */
public class FileRename {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����һ���ļ�����
		File file = new File("e:\\˧��.jpg");
		
		//������Ҫ�޸�������ļ�������Ϊ"��������.jpg"
		File newFile = new File("��������.jpg");
		
		//�ȿ��Ի�����Ҳ����˳���Ļ��ļ�·����
		System.out.println("renameTo:" + file.renameTo(newFile));
	}

}
