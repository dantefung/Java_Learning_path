package com.dantefung.IO.part2;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 
 *�����������
 *    RandomAccesFile�಻����������Object�������
 *    �����ں���InputStream��OutputStream�Ĺ���
 *    ֧�ֶ��ļ���������ʶ�ȡ��д�롣
 *    
 *     public RandomAccessFile(String name, String mode):��һ���������ļ�·�����ڶ��������ǲ����ļ���ģʽ��
 *     ģʽ�����֣�������õ�һ�ֽ�"rw"�����ַ�ʽ��ʾ�Ҽȿ���д���ݣ�Ҳ���Զ�ȡ���ݡ�
 * 
 * 
 * 
 */
public class RandomAccessFileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		write();
		read();
	}

	private static void read() throws IOException{
		// TODO Auto-generated method stub
		//�����������������
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		
		int i = raf.readInt();
		System.out.println(i);
		//���ļ�ָ�����ͨ��getFilePointer������ȡ����ͨ��seek��������
		System.out.println("��ǰ�ļ���ָ��λ���ǣ�" + raf.getFilePointer());
		
		char ch = raf.readChar();
		System.out.println(ch);
		System.out.println("��ǰ�ļ���ָ��λ���ǣ�" + raf.getFilePointer());
		
		String s = raf.readUTF();
		System.out.println(s);
		System.out.println("��ǰ�ļ���ָ��λ���ǣ�" + raf.getFilePointer());
		
		//�Ҳ�����ͷ��ʼ�ˣ��Ҿ�Ҫ��ȡa����ô���أ�
		raf.seek(4);
		ch = raf.readChar();
		System.out.println(ch);
	}

	private static void write() throws IOException{
		// TODO Auto-generated method stub
		//�����������������
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		
	    //��ô�棿
		raf.writeInt(100);
		raf.writeChar('a');
		raf.writeUTF("�й�");
		
		raf.close();
	}

}
