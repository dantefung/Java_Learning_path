package com.dantefung.IO.part2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * ���л����� �Ѷ�������һ���ķ�ʽ�����ı��ļ������������д��䡣���� --�����ݣ�ObjectOutputStream�� 
 * �����л����� ���ı��ļ��е����������ݻ��������е����������ݻ�ԭ�ɶ���������--����ObjectInputStream��
 * 
 */
public class ObjectStreamDemo {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		//��������Ҫ�Զ���������ֻ��������������Զ���һ����
		//���л�������ʵ���ǰѶ���д���ı��ļ�
		
		write();
		
		read();
	}

	private static void read() throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		//���������л�����
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
		
		//��ԭ����
		Object obj = ois.readObject();
		
		//�ͷ���Դ
		ois.close();
		
		System.out.println(obj);
	}

	private static void write() throws IOException{
		// TODO Auto-generated method stub
		//�������л�����
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
		
		//��������
		Person p = new Person();
		
		//public final void writeObject(Object obj)
		oos.writeObject(p);
		
		//�ͷ���Դ
		oos.close();
	}

}
