package com.dantefun.IO.part1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * ���� ����һ���ı��ļ��д洢�˼������ƣ�����Э�����ʵ�������ȡһ���˵����֡�
 * 
 * 
 * ������
 *    A�����ı��ļ��е����ݴ洢��������
 *    B���������һ������
 *    C�����ݸ�������ȡһ��ֵ��
 * 
 * 
 * 
 * 
 * 
 * */
public class GetName {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//���ı��ļ������ݴ洢��������
		BufferedReader br = new BufferedReader(new FileReader("c.txt"));
	    ArrayList<String> array = new ArrayList<String>();
	    
	    String line = null;
	    while((line = br.readLine()) != null)
	    {
	    	array.add(line);
	    }
	    
	    //�������һ������
	    Random rd = new Random();
	    int index = rd.nextInt(array.size());
	    
	    //���ݸ�������ȡһ��ֵ��
	    String name = array.get(index);
	    System.out.println( "���������ǣ�"+ name);
	    
	}

}
