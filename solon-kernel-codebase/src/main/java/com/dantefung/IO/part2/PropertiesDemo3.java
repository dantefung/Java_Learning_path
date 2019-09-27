package com.dantefung.IO.part2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 *����ļ��ϱ�����Properties���ϣ�
 *public void load(Reader r):���ļ��е����ݶ�ȡ�������� 
 *public void store(Writer writer, String comments):�Ѽ����е����ݴ洢���ļ��С�
 *
 *
 *��������Ϸ��
 *   ���ȱ���ͼ���
 *   ����ȺӢ��������־���ɽ�������������
 *   
 *   ����=1
 *   ���컭�=1
 * 
 */
public class PropertiesDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		myStore();
		myLoad();	
	}

	private static void myStore() throws IOException {
		// TODO Auto-generated method stub
		//�������϶���
		Properties prop = new Properties();
		
		prop.setProperty("����", "27");
		prop.setProperty("����", "25");
		prop.setProperty("����", "30");
		
		//public void store(Writer writer, String comments):�Ѽ����е����ݴ洢���ļ��С�
		Writer w = new FileWriter("name.txt");
		prop.store(w, "2015-4-5 14:55");//�ڶ�����������ӱ�ע��Ϣ��
		w.close();
	}

	private static void myLoad() throws IOException {
		// TODO Auto-generated method stub
		//public void load(Reader reader):���ļ��е����ݶ�ȡ��������
		//ע�⣺����ļ������ݱ����Ǽ�ֵ����ʽ
		Reader r = new FileReader("name.txt");
		//�������϶���
		Properties prop = new Properties();
		prop.load(r);
		//�ͷ���Դ
		r.close();
		
		System.out.println("prop:" + prop);
	}

}
