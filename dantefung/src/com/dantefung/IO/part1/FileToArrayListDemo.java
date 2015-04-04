package com.dantefung.IO.part1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 *���󣺴��ı��ļ��ж�ȡ���ݣ�ÿһ��Ϊһ���ַ������ݣ��������У�����������
 *
 * ������
 *     ͨ����Ŀ����˼���ǿ���֪�����µ�һЩ���ݣ�
 *         ����Դ��һ���ı��ļ���
 *         Ŀ�ĵ���һ�����ϡ�
 *         ����Ԫ�����ַ�����
 *         
 * ����Դ��
 *     b.txt -- FileReader -- BufferedReader
 * Ŀ�ĵأ�
 *     ArrayList<String>
 * 
 * 
 * 
 * 
 **/
public class FileToArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		//��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		//��װĿ�ĵأ��������϶���
		ArrayList<String> array = new ArrayList<String>();
		
		//��ȡ���ݵ�������
		String line = null;
		while((line = br.readLine()) != null)
		{
		    array.add(line);	
		}
		
		//�ͷ���Դ
		br.close();
		
		//��������
		for(String s : array)
		{
			System.out.println(s);
		}
	}

}
