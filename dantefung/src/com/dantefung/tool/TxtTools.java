/**
 * Project Name:Select2Demo
 * File Name:TxtTools.java
 * Package Name:com.dantefung.test
 * Date:2016��11��3������10:56:04
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.tool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.regex.Pattern;

/**
 * ClassName:TxtTools <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016��11��3�� ����10:56:04 <br/>
 * @author   Dante Fung
 * @version  1.0.1
 * @since    JDK 1.7
 * @see 	 
 */
public class TxtTools {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File("D:\\baby1.txt")));
		BufferedWriter zh = new BufferedWriter(new FileWriter(new File("D:\\ZH.txt")));
		BufferedWriter en = new BufferedWriter(new FileWriter(new File("D:\\EN.txt")));
		Pattern pattern = Pattern.compile("^[A-Za-z0-9]+|[A-Za-z0-9]+(\\.|\\,)$");
		
		
		String line = "";
//		System.out.println(Pattern.matches("^[[A-Za-z0-9]{1,}\\.{0,}]$","aaaa."));
		while(null != (line = br.readLine())){
//			System.out.println(line.replace(" ", "")  + " ==== " + pattern.matcher(line.replace(" ", "")).lookingAt());
			// System.out.println(line.replace(" ", "")  + " ==== " + line.indexOf("��"));
			// 1�����   eg.184
			if(Pattern.matches("^[0-9]+$", line.replace(" ", ""))){
				System.out.println(line);
				write(en, line);
				write(zh, line);
				
			}
			// 2��ʱ����  eg.00:05:00,970-->00:05:02,370
			if(Pattern.matches("^([0-9]+):([0-9]+):([0-9]+),([0-9]+)-->([0-9]+):([0-9]+):([0-9]+),([0-9]+)$",line.replace(" ", ""))){
				write(en, line);
				write(zh, line);
			}
			// 3�� ��Ļ   eg.��һ��֮���֪����������Ҫʲô  || eg.it��s what we want
			// ƥ������ֵ�Ӣ�Ļ�Ӣ�ĵ��ַ���
			if(pattern.matcher(line.replace(" ", "")).lookingAt()){
				if(!Pattern.matches("^[0-9]+$", line.replace(" ", ""))
						&& !Pattern.matches("^([0-9]+):([0-9]+):([0-9]+),([0-9]+)-->([0-9]+):([0-9]+):([0-9]+),([0-9]+)$",line.replace(" ", ""))
						&& !Pattern.matches("^[0-9\u4e00-\u9fa5]+$", line.replace(" ", ""))){
					//System.out.println("EN:" + line);
					write(en, line);
				}
			}
			// ƥ������ֵ����Ļ������ַ���
			if(Pattern.matches("^[0-9\u4e00-\u9fa5]+$",line.replace(" ", ""))){
				if(!Pattern.matches("^[0-9]+$", line.replace(" ", ""))){
					//System.out.println("ZH:" + line);
					write(zh, line);
				}
			}
			
			// 4������
			if("".equals(line) || Pattern.matches("^[\\s]*$",line)){
				zh.newLine();
				en.newLine();
			}
		}
//		close(br,zh,en);
	}

	/**
	 * 
	 * close:�ر������ͷ���Դ. <br/>
	 * TODO(����������������������� �C ��ѡ).<br/>
	 * TODO(�����������������ִ������ �C ��ѡ).<br/>
	 * TODO(�����������������ʹ�÷��� �C ��ѡ).<br/>
	 * TODO(�����������������ע������ �C ��ѡ).<br/>
	 *
	 * @author Dante Fung
	 * @param args
	 * @throws IOException
	 * @since JDK 1.7
	 */
	private static void close(Object...args) throws IOException {
		for(int i = 0; i < args.length; i ++){
			if( null != args[i] && args[i] instanceof Reader){
				Reader r = (Reader)args[i];
				r.close();
			}else{
				Writer w = (Writer)args[i];
				w.close();
			}
		}
	}

	/**
	 * 
	 * write:д���ݵ��ļ�. <br/>
	 * TODO(����������������������� �C ��ѡ).<br/>
	 * TODO(�����������������ִ������ �C ��ѡ).<br/>
	 * TODO(�����������������ʹ�÷��� �C ��ѡ).<br/>
	 * TODO(�����������������ע������ �C ��ѡ).<br/>
	 *
	 * @author Dante Fung
	 * @param bw
	 * @param line
	 * @throws IOException
	 * @since JDK 1.7
	 */
	private static void write(BufferedWriter bw, String line) throws IOException {
		bw.write(line);
		bw.newLine();
		bw.flush();
	}
	
}

