package com.dantefung.IO.part1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
 * ��֪s.txt�ļ�����������һ���ַ�����"hcexfgijkamdnoqrzstuvwybpl"
 * ��д�����ȡ�������ݣ������������д��ss.txt�С�
 * 
 * ������
 *     A����s.txt����ļ�����������
 *     B����ȡ���ļ������ݣ��洢��һ���ַ�����
 *     C�����ַ���ת��Ϊ�ַ�����
 *     D�����ַ������������
 *     E�����������ַ�����ת��Ϊ�ַ���
 *     F�����ַ����ٴ�д��ss.txt��
 * 
 *������ɺ󣬵����Ŀdantefung �Ҽ�-- refresh���ɿ�����Ŀ��Ŀ¼����ss.txt�ļ����ɡ�
 * 
 * */
public class StringDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new FileReader("s.txt"));
        
        //һ�ζ�дһ���ַ�����
        String line = null;
        
        line = br.readLine();
        
        //���ַ���ת��Ϊ�ַ����顣
        char[] chs = line.toCharArray();

        //�ͷ���Դ
        br.close();
        
        //���ַ������������
        Arrays.sort(chs);
        
        //���������ַ�����ת��Ϊ�ַ���
        String s = new String(chs);
        
        //���ַ����ٴ�д��ss.txt�С�
        BufferedWriter bw = new BufferedWriter(new FileWriter("ss.txt"));
        
        bw.write(chs);
        bw.newLine();
        bw.flush();//��һ��
        
        //�ͷ���Դ
        bw.close();
 
	}

}
