package com.dantefung.IO.part1;

import java.io.FileReader;
import java.io.IOException;

/*
 * 
 *����MyBufferedReader��ʱ����Ͱ�������BufferedReaderһ����ʹ�á� 
 * 
 * 
 */
public class MyBufferedReaderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
       MyBufferedReader mbr = new MyBufferedReader(new FileReader("my.txt"));
       
       String line = null;
       while((line = mbr.readLine()) != null)
       {
    	   System.out.println(line);
       }
       
       //�ͷ���Դ
       mbr.close();
       
       //���Ҫ֪���������ֵı��룬�ɲ�ȡ���µķ�ʽ��ȡ��
       //System.out.println('\r' + 0);
       //System.out.println('\n' + 0);
	}

}
