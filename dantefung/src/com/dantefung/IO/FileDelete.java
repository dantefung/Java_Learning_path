package com.dantefung.IO;

import java.io.File;
import java.io.IOException;

/*
 * 
 * ɾ�����ܣ�
 * public boolen delete()
 * 
 * ע�⣺
 *     A:�����㴴���ļ������ļ�������д�̷�·������ô��Ĭ������Ŀ·���¡�
 *     B:java�е�ɾ�����߻���վ��
 *     C��Ҫɾ��һ���ļ��У����ļ����ڲ������ļ������ļ��С�
 * 
 * */
public class FileDelete {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�����ļ�
		File file = new File ("e:\\a.txt");
		System.out.println("createNewFile:" + file.createNewFile());
	
		//�Ҳ�С��д�������� �ˣ�
		File file2 = new File("a.txt");
		System.out.println("createNewFile:" + file2.createNewFile());
	
		//���漸����
		File file3 = new File("aaa\\bbb\\ccc");
		System.out.println("mkdir" + file3.mkdirs());
		
		//ɾ�����ܡ�
		File file4 = new File("a.txt");
		System.out.println("delete:" + file4.delete());
		
		File file5 = new File("\\aaa\\bbb\\ccc");
		System.out.println("delete:" + file5.delete());
		
		//��Ҫɾ��aaa�ļ��С�
		File file6 = new File("aaa\\bbb");
		File file7 = new File("aaa");
		System.out.println("delete:" + file6.delete());
		System.out.println("delete:" + file7.delete());
	}

}
