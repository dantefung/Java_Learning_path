package com.dantefung.IO.part2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 
 *ת������Ӧ�á� 
 * 
 */
public class SystemOutDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//��ȡ��׼������
		//PrintStream ps = System.out;
		//OutputStream os = ps;
		//OutputStream os = System.out; //��̬
		//���ܲ��ܰ��ող�ʹ�ñ�׼�������ķ�ʽһ�����������������̨�أ�
		//OutputStreamWriter osw = new OutputSteamWriter(os);
		//BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("hello");
		bw.newLine();
		// bw.flush();
		bw.write("world");
		bw.newLine();
		// bw.flush();
		bw.write("java");
		bw.newLine();
		bw.flush();
		
		bw.close();
	}

}
