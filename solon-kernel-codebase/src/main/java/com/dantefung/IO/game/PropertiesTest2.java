package com.dantefung.IO.game;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 * 
 *����һ�������ֵ�С��Ϸ�ĳ������дһ������ʵ���ڲ�������ֻ����5�Σ�����5�ξ���ʾ��
 *��Ϸ�����Ѿ��������븶�ѡ�
 * 
 */
public class PropertiesTest2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//�����ݼ��ص�������
		Properties prop = new Properties();
		Reader r = new FileReader("count.txt");
		prop.load(r);//��r��ָ����ļ��е����ݸ��Ƶ�����prop�С���    ���ء�
		
		//���Լ��ĳ����ҵ�Ȼ֪������ļ���˭
		String value = prop.getProperty("count");
		int number = Integer.parseInt(value);
		
		if(number > 5)
		{
			System.out.println("��Ϸ�����ѽ������븶�ѡ�");
			System.exit(0);
		}
		else
		{
			number ++;
			prop.setProperty("count", String.valueOf(number));
			Writer w = new FileWriter("count.txt");
			prop.store(w, null);
			//�ͷ���Դ��
			w.close();
			
			GuessNumber.start();
		}
	}

}
