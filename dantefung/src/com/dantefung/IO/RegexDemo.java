package com.dantefung.IO;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "A1B22C333D4444E55555F";
		/**��������淶��\d��һ��淶�� ��ʾ����   ������ʾ��\d+ ���������Գ���1�λ��Ρ�**/
		String pat = "\\d+";  //�����滻����
		
		//Step1:���ù�������һ��ģ���ࡣ
		Pattern p = Pattern.compile(pat);
		
		//Step2:��֤��ƥ�䡣
		Matcher m = p.matcher(str);
		
		//Step3:�滻
		String newString = m.replaceAll("_");
		
		System.out.println(newString);
	}

}
