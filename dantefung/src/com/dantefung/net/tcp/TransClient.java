package com.dantefung.net.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
/**
 * TCP�ı�ת���ͻ���
 * @author Dante Fung
 *
 */
public class TransClient
{
	public static void main(String[] args) throws Exception
    {
		System.out.println("�ͻ�������... ...");
	    /*
	     * ˼·��
	     * �ͻ��ˣ�
	     * 1������socket�˵㡣
	     * 2���ͻ��˵�����Դ�����̡�
	     * 3���ͻ��˵�Ŀ�ģ�socket��
	     * 4�����շ���˵����ݣ�Դ��socket��
	     * 5����������ʾ�ڿ���̨��Ŀ�ģ�����̨��
	     * 6������Щ���в��������ݶ����ı����ݡ�
	     * 
	     * ת���ͻ��ˣ�
	     * 1������socket�ͻ��˶���
	     * 2����ȡ����¼�롣
	     * 3����¼�����Ϣ���͸�socket��������
	     */
		// 1������socket�ͻ��˶���
		Socket socket = new Socket("192.168.1.102",10004);
		// 2����ȡ����¼�롣
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 3��socket�����
		/**
		 * ��������ݵ�ʱ���ǲ��Ǳ�֤������ԭ���Բ���ĳ�ȥ�ˡ�
		 * PrintWriter
		 * 
		 * ��סһ�㣬����дsocket����ʱ��,���������������out��in�ģ����Ƕ���Ϊsocket����
		 * ���ǲ���in��out�����Ƕ���Ϊһ��������������
		 * ע�⣺�ⲻ�ǹ淶����ֻ�����ܽ�Ĺ��ɣ������ܴ�������һ�ۿ�����ʲô����
		 */
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		// ʹ�ø��߼�һ��Ĵ�ӡ��
		/*
		 * ����˵����
		 * 1���ֽ������
		 * 2���Ƿ��Զ�ˢ��
		 *   �����Զ����С�
		 */
//		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		
		// 4�� socket������������ȡ����˷��صĴ�д���ݡ�
		InputStream in = socket.getInputStream();
		// Ϊ�˲����ַ����㣬���ǽ��ֽ�������ת��Ϊ�ַ���������
		InputStreamReader isr = new InputStreamReader(in);
		// Ϊ���ö�ȡЧ�ʸ�Щ������ת������ַ��������ṩ���幦�ܣ�װ����ģʽ����
		BufferedReader bufIn = new BufferedReader(isr);
		String line = null;
		/**
		 * readLine������һ�������ķ���,�������б�ǲ���Ϊһ�����ݶ��ꡣ
		 * ���򣬻���Ϊ����û�ж��꣬һֱ�ȴ����ݹ�����
		 */
		while((line=br.readLine()) != null )
		{
			if("over".equals(line))
			{
				break;
			}
			
			// ���Ǵ����Զ�ˢ�¹����ڴ�ӡ
//			out.println(line);
			bw.write(line + "\r\n");
			bw.flush();
			
			// ��ȡ����˷��ͻ�����һ�д�д����
			String upperStr = bufIn.readLine();
			System.out.println("�ͻ���===" + upperStr);
			System.out.println(upperStr);
		}
		
		// 5���ͷ���Դ���ر���������socket���Ͻ�����ǣ���
		socket.close();
    }
}
