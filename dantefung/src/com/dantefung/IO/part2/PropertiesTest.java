package com.dantefung.IO.part2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 *����һ���ı��ļ���user.txt�� ����֪�������Ǽ�ֵ����ʽ�ģ����ǲ�֪��������ʲô��
 *��дһ�������ж��Ƿ���"lisi"�����ļ����ڣ�����м��ı���ֵΪ"100"
 * 
 * ������
 *     A�����ļ��е����ݼ��ص�������
 *     B���������ϣ���ȡ�õ�ÿһ��
 *     C���жϼ��Ƿ���Ϊ"lisi"�ģ�����о��޸���ֵΪ"100"
 *     D���Ѽ����е��������´洢���ļ���
 */
public class PropertiesTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����һ�����϶���
		Properties prop = new Properties();
		
		Reader r = new FileReader("User.txt");
		//��User.txt�е����ݼ��ص������С�
		prop.load(r);
		
	    //��ȡ���м��ļ���
		Set<String> set = prop.stringPropertyNames();
		//����set���ϲ����ж��Ƿ���Ϊ"lisi"�ļ�������о��޸���ֵΪ"100"
		for(String key : set)
		{
		    //֮��������д�ж������Ƿ�ֹ���ֿ�ָ���쳣��key�п���Ϊ�ա�
			if("lisi".equals(key))
			{
				prop.setProperty(key, "100");
				break;
			}
		}
		
		// �Ѽ����е��������´洢���ļ���
		Writer w = new FileWriter("User.txt");
		prop.store(w, null);
		w.close();
	}

}
