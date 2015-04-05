package com.dantefung.IO.part2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * 
 *nio����jdk4���֣������IO���Ĳ���Ч�ʣ�����Ŀǰ�����Ǵ�Χ��ʹ��
 *�˽⼴�ɡ�
 *
 * JDK7֮���NIO
 * Path:·��
 * Paths:��һ����̬��������һ��·��
 *      public static Path get(URL uri)
 * Files:�ṩ�˾�̬����������ʹ��
 *      public static long copy(Path source, OutputStream out):�����ļ�
 *      public static Path write(Path path,Iterable<? extends CharSequence> lines,Charset cs,OpenOption... options));
 * 
 * 
 */
public class NIODemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		// public static long copy(Path source,OutputStream out)
		// Files.copy(Paths.get("ByteArrayStreamDemo.java"), new
		// FileOutputStream(
		// "Copy.java"));
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");

		Files.write(Paths.get("array.txt"), array, Charset.forName("GBK"));
	}

}
