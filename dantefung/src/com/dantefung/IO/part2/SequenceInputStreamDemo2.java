package com.dantefung.IO.part2;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * 
 *@author DanteFung
 *@since 2015-4-5 9:19 
 * 
 * �ϲ�����
 * 
 */
public class SequenceInputStreamDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//���� ������������ļ������ݸ��Ƶ�Copy.java�С�
		//ByteArrayStreamDemo.java,CopyFileDemo.java,DataStreamDemo.java
		
		//SequenceInputStream(Enumeration e)
		//ͨ���򵥵Ļع�����֪����Enumeration��Vector�е�һ�������ķ���ֵ����
		//Enumeration<E> elements()
		
		Vector<InputStream> v = new Vector<InputStream>();
		InputStream s1 = new FileInputStream("ByteArrayStreamDemo.java");
		InputStream s2 = new FileInputStream("CopyFileDemo.java");
		InputStream s3 = new FileInputStream("DataStreamDemo.java");
		
		v.add(s1);
		v.add(s2);
		v.add(s3);
		
		Enumeration<InputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Copy.java"));
		
		//��ζ�д�أ���ʵ�ܼ򵥣���Ͱ�����ǰ��ô��д�����ڻ�����ô��д
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = sis.read(bys))!= -1)
		{
			bos.write(bys, 0, len);
		}
		
		//�ͷ���Դ
		sis.close();
		bos.close();
		
	}

}
