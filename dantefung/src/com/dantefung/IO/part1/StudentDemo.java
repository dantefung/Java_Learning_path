package com.dantefung.IO.part1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 *����
 *    ����¼��5��ѧ����Ϣ�����������ĳɼ�����ѧ�ɼ���Ӣ��ɼ����������ִܷӸߵ��ʹ����ı��ļ��� 
 * 
 * ������
 *     A������ѧ���ࡣ
 *     B���������϶���
 *         TreeSet<Student>
 *     C:����¼��ѧ����Ϣ�洢�����ϡ�
 *     D���������ϣ�������д���ı��ļ���
 * 
 * 
 * 
 * 
 **/
public class StudentDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�������϶���
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>()
	    {
		    @Override
		    public int compare(Student s1, Student s2)
		    {
		    	int num = s2.getSum() - s1.getSum();
		    	int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
		    	int num3 = num2 == 0 ? s1.getMath() - s2.getMath() : num2;
		    	int num4 = num3 == 0 ? s1.getEnglish() - s2.getEnglish() : num3;
		    	int num5 = num4 == 0 ? s1.getName().compareTo(s2.getName()) : num4;
		    	
				return num5;
		    }
		});
		
		//����¼��ѧ����Ϣ�洢������
		for(int x = 1; x <= 5; x++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("�������" + x +"��ѧ����ѧϰ��Ϣ");
			System.out.println("������");
			String name = sc.nextLine();
			System.out.println("���ĳɼ���");
			int chinese = sc.nextInt();
			System.out.println("��ѧ�ɼ���");
			int math = sc.nextInt();
			System.out.println("Ӣ��ɼ���");
			int english = sc.nextInt();
			
			//����ѧ������
			Student s = new Student();
			s.setName(name);
			s.setChinese(chinese);
			s.setEnglish(english);
			s.setMath(math);
			
			//��ѧ����Ϣ��ӵ�����
			ts.add(s);				
		}
		
		//�������ϣ�������д�뵽�ı��ļ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));
		bw.write("ѧ����Ϣ���£�");
		bw.newLine();//���С�
		bw.flush();//��һ���ȡ�
		bw.write("���������ĳɼ�����ѧ�ɼ���Ӣ��ɼ�");
		bw.newLine();
		bw.flush();//����һ�š�
		
		for(Student student : ts)
		{
			StringBuilder sb = new StringBuilder();//���̵߳�ʱ����StringBuilderЧ�ʸߡ�
			//��ʽ���á�
			sb.append(student.getName())
			  .append(",")
			  .append(student.getChinese())
			  .append(",")
			  .append(student.getMath())
			  .append(",")
			  .append(student.getEnglish());
			
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();//��һ���ȡ�
		}
		
		//�ͷ���Դ
		bw.close();
		System.out.println("ѧ����Ϣ�洢��ϣ�������");
		
	
	}

}
