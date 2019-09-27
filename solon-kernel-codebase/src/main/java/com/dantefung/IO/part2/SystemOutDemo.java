package com.dantefung.IO.part2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 
 *转换流的应用。 
 * 
 */
public class SystemOutDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//获取标准输入流
		//PrintStream ps = System.out;
		//OutputStream os = ps;
		//OutputStream os = System.out; //多态
		//我能不能按照刚才使用标准输入流的方式一样把数据输出到控制台呢？
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
