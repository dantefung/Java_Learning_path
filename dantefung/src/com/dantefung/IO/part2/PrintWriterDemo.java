package com.dantefung.IO.part2;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @since 2015-4-5
 * 
 * ��ӡ��
 * �ֽڴ�ӡ�� PrintStream
 * �ַ���ӡ�� printWriter
 * 
 * ��ӡ�����ص㣺
 *     A��ֻ��Щ���ݵģ�û�ж�ȡ���ݡ����ܲ���Ŀ�ĵأ����ܲ�������Դ��
 *     B�����Բ����������͵����ݡ�
 *     C������������Զ�ˢ�£��ܹ��Զ�ˢ�¡�
 *     D�������ǿ���ֱ�Ӳ����ı��ļ��ġ�
 *         ��Щ������ʱ����ֱ�Ӳ����ı��ļ����أ�
 *         FileInputStream
 *         FileOutputStream
 *         FileReader
 *         FileWriter
 *         PrintStream
 *         PrintWriter
 *         ��API,�鿴������Ĺ��췽�������ͬʱ��File���ͺ�String���͵Ĳ�����һ����˵���ǿ���ֱ�Ӳ����ļ���
 *         
 *         ����
 *             �������������ܹ�ֱ�Ӷ�д�ļ���
 *             �߼������ڻ������������ṩ��һЩ�����Ĺ��ܡ�
 * 
 * ������󣬵��ѡ�е�ǰ��dantefung��Ŀ���Ҽ�--ˢ�£����ɿ�������Ŀ��Ŀ¼��������pw.txt�ļ���
 * 
 */
public class PrintWriterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
        //��ΪWriter������ʹ��
		PrintWriter pw = new PrintWriter("pw.txt");
		
		pw.write("Hello");
		pw.write("world");
		pw.write("java");
		
		//�ͷ���Դ
		pw.close();
	}

}
