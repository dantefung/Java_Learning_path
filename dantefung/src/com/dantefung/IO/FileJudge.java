package com.dantefung.IO;

import java.io.File;


/*
 * �жϹ��ܣ�
 * public boolean isDirectory();�ж��Ƿ���Ŀ¼
 * public boolean isFile():�ж��Ƿ����ļ�
 * public boolean exists():�ж��Ƿ����
 * public boolean canRead()���ж��Ƿ�ɶ�
 * public boolean canWrite():�ж��Ƿ��д
 * public boolean isHidden():�ж��Ƿ�����
 * 
 * 
 * **/
public class FileJudge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����ļ�����
		File file = new File("a.txt");
		
		System.out.println("isDrectory:" + file.isDirectory());//false
		System.out.println("isFile:" + file.isFile());//true
		System.out.println("exists:" + file.exists());//true
		System.out.println("canRead:" + file.canRead());//true
		System.out.println("canWrite:" + file.canWrite());//true
		System.out.println("isHidden:" + file.isHidden());//false
	}

}