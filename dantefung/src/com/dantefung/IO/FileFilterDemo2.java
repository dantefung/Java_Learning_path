package com.dantefung.IO;

import java.io.File;
import java.io.FilenameFilter;

/*
 * A:�Ȼ�ȡ���еģ�Ȼ�������ʱ�������жϣ�������������������
 * B����ȡ��ʱ����Ѿ��������������ˣ�Ȼ��������ɡ�
 * 
 * Ҫ��ʵ�����Ч�����ͱ���ѧϰһ���ӿڣ��ļ����ƹ�����
 * public String[] list(FilenameFilter filter)
 * public File[] listFiles(FilenameFilter filter)
 * 
 * 
 * */
public class FileFilterDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��װe�ж�Ŀ¼
		File file = new File("e:\\");
		
		//��ȡ��Ŀ¼�������ļ������ļ��е�String����
		//public String[] list(FilenameFilter filter)
		String[] strArray = file.list(new FilenameFilter()
		{

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				
				//ͨ��������ԣ����Ǿ�֪���ˣ���������ļ������ļ��е����ƼӲ��ӵ������У�ȡ��������ķ���ֵ��true����false
				//���ԣ������true ���� falseӦ��������ͨ��ĳ���жϵõ��ġ�
				//System.out.println(dir + "---------" + name);
				File file = new File(dir, name);
				//System.out.println(file);
				
				//boolean flag = file.isFile();
				//boolean flag2 = name.endsWith(".jpg");
				//return flag && flag2;
				
				return new File(dir, name).isFile() && name.endsWith(".jpg");
			}
			
		});
		
		//�������
		for(String str : strArray)
		{
			System.out.println(str);
		}
	}

}
