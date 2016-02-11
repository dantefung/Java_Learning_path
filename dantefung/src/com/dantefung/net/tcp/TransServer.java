package com.dantefung.net.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Tcp�ı�ת�������
 * @author Dante Fung
 *
 */
public class TransServer
{
	public static void main(String[] args) throws Exception
    {
		System.out.println("������������... ...");
	    /*
	     * �ı�ת������ˣ�
	     * ������
	     * 1��ServerSocket����
	     * 2����ȡsocket����
	     * 3��Դ��socket,��ȡ�ͻ��˷��͹�����Ҫת�������ݡ�
	     * 4��Ŀ�ģ���ʾ�ڿ���̨�ϡ�
	     * 5��������ת���ɴ�д���͸��ͻ��ˡ�
	     */
		// 1��
		ServerSocket serverSocket = new ServerSocket(10004);
		// 2����ȡsocket����
		Socket socket = serverSocket.accept();
		// ��ȡIp
		String ip = socket.getInetAddress().getHostAddress();
		System.out.println(ip + ".........connected");
		// 3����ȡsocket�ֽڶ�ȡ����ת����װ�Ρ�
		BufferedReader brIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		// 4����ȡsocket�ֽ��������ת����װ�Σ������������ʱ�򣬼ǵ���д�����ݵ�ʱ�򣬼ǵõ���һ��ˢ�·�������
		BufferedWriter bwOut = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//		PrintWriter pwOut = new PrintWriter(socket.getOutputStream(),true);
		
		String line = null;
		/**
		 * ����ʽ�������������б�ǲ���Ϊһ�����ݶ��ꡣ���򣬻���Ϊ����û�ж��꣬
		 * һֱ�ȴ����ݹ�����
		 */
		while((line=brIn.readLine()) != null)
		{
			System.out.println(line);
//			pwOut.println(line.toUpperCase());
			bwOut.write(line.toUpperCase() + "\r\n");// ���з�Ϊ����ʽ����readLine()�Ľ������
			bwOut.flush();//�����ݴ�BufferedReader �� BufferedWriterˢ��socket�������������
		}
		
		// 5���ͷ���Դ
		socket.close();
		serverSocket.close();
    }
}
