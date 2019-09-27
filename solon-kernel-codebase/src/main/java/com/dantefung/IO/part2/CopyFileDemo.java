package com.dantefung.IO.part2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ���� DataStreamDemo.java ���Ƶ�Copy.java��
 *
 * ����Դ��
 *     DataStreamDemo.java -- ��ȡ���� -- FileReader -- BufferedReader
 * Ŀ�ĵأ�
 *     Copy.java -- д���� -- FileWriter -- BufferedWriter -- PrintWriter    
 * 
 */
public class CopyFileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
        //��ǰ�İ汾
		//��װ����Դ
		//BufferedReader br = new BufferedReader(new FileReader("DataStreamDemo.java"));
		//��װĿ�ĵ�
		//BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));
		
		//String line = null;
		//while((line=br.read()) != null)
		//{
		//	bw.write(line);
		//  bw.newLine();
		//  bw.flush();
		//}
		
		//�ͷ���Դ
		//bw.close();
		//br.close();
		
		
		//��ӡ���Ľ���
		//��װ����Դ
		BufferedReader pr = new BufferedReader(new FileReader("DataStreamDemo.java"));
		//��װĿ�ĵ�
		PrintWriter pw = new PrintWriter(new FileWriter("Copy.java"),true);
		
		String line = null;
		while((line=pr.readLine()) != null)
		{
			pw.println(line);
		}
		
		//�ͷ���Դ
		pw.close();
		pr.close();
	}

}
