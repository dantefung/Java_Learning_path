package com.dantefung.IO.part1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �����ı��ļ���
 * 
 * ������
 *    �������ݣ��������ֻ���ñʼǱ��򿪲��ܹ������������ַ�������������ֽ�����
 *    ͨ����ԭ������֪������Ӧ�ò����ַ���������һЩ��
 *    ���ַ�����5�ַ�ʽ�������������Ŀ������5�ַ�ʽ���Ƽ����յ�5�֡�
 *    
 *    ����Դ��
 *       C:\\a.txt -- FileReader -- BufferedReader
 *     
 *    Ŀ�ĵأ�
 *       D��\\b.txt -- FileWriter -- BufferedWriter
 * 
 * 
 * 
 * */
public class CopyFileDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		String srcString = "c:\\a.txt";
		String destString = "d:\\b.txt";
		
		//method1();
		//method2();
		//method3();
		//method4();
		method5(srcString, destString);
	}
	
	//�ַ�������һ�ζ�дһ���ַ�����
	private static void method5(String srcString, String destString) throws IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader(srcString));
		BufferedWriter bw = new BufferedWriter(new FileWriter(destString));
		
		String line = null;
		while((line = br.readLine()) != null)
		{
			bw.write(line);
			bw.newLine();//����
			bw.flush();//��һ�ţ������ݴӻ��������߳�����
		}
		
		//�ͷ���Դ��
		bw.close();
		br.close();
		
	}
	
	//�ַ�������һ�ζ�дһ���ַ����顣
	private static void method4(String srcString, String destString) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(srcString));
		BufferedWriter bw = new BufferedWriter(new FileWriter(destString));
		
		char[] chs = new char[1024];
		int len = 0;
		while((len = br.read(chs)) != -1)
		{
			bw.write(chs, 0, len);
		}
		
		//�ͷ���Դ��
		br.close();
		bw.close();
	}
	
	//�ַ�������һ�ζ�дһ���ַ���
	private static void method3(String srcString, String destString) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(srcString));
		BufferedWriter bw = new BufferedWriter(new FileWriter(destString));
		
		int ch = 0;
		while((ch = br.read()) != -1)
		{
			bw.write(ch);
		}
		
		//�ͷ���Դ
		br.close();
		bw.close();
	}
	
	//�����ַ���һ�ζ�дһ���ַ����顣
	private static void method2(String srcString, String destString) throws IOException
	{
		FileReader fr = new FileReader(srcString);
		FileWriter fw = new FileWriter(destString);
		
		char[] chs = new char[1024];
		int len = 0;
		while((len = fr.read(chs)) != -1)
		{
			fw.write(chs, 0, len);
		}
		
		//�ͷ���Դ
		fr.close();
		fw.close();
	} 
	
	//�����ַ���һ�ζ�дһ���ַ�
	private static void method1(String srcString, String destString) throws IOException
	{
		FileReader fr = new FileReader(srcString);
        FileWriter fw = new FileWriter(destString);
        
        int ch = 0;
        while((ch = fr.read()) != -1)
        {
        	fw.write(ch);
        }
        
        //�ͷ���Դ
        fr.close();
        fw.close();
	}
}
