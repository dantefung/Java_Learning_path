package com.dantefung.IO.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *System.in ��׼������ ���ǴӼ��̻�ȡ���ݵ� 
 * 
 * ����¼�����ݣ�
 *     A��main������args���ղ���
 *         java Hello World hello world java 
 *     B:Scanner (JDK5�Ժ��)
 *        Scanner sc = new Scanner(System.in)
 *        String s = sc.nextLine();
 *     C��ͨ���ַ���������װ��׼������ʵ��
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * 
 */
public class SystemInDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//��ȡ��׼������
		//InputStream is = System.in
		//��Ҫһ�λ�ȡһ���в����أ�
		//�С�
		//��ôʵ���أ�
		//Ҫ��ʵ�֣��������֪��һ�ζ�ȡһ�����ݵķ������ĸ��أ�
		//readLine()
		//������������ĸ������أ�
		//BufferedReader
		//���ԣ������Ӧ�ô���BufferedReader�Ķ��󣬵��ǵײ㻹��ʹ�ñ�ש��������
		//BufferedReader br = new BufferedReader(is);
		//�������ǵ���������Ӧ�þͿ����ˣ�����ȴ�����ˡ�
		//ԭ���ǣ��ַ�������ֻ������ַ��������������������ֽ��������Բ���ʹ��
		//��ô���һ�����ʹ���ˣ�����۸���һ�����������
		//���ֽ���ת��Ϊ�ַ�����Ȼ����ͨ���ַ�����������
		//InputStreamReader isr = new InpuStreamReader(is);
		//BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������һ���ַ�����");
		String line = br.readLine();
		System.out.println("��������ַ����ǣ�" + line);
		System.out.println("������һ��������");
		line = br.readLine();
		int i = Integer.valueOf(line);
		System.out.println("������������ǣ�" + i);
		
	}

}
