package com.dantefung.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Tcp�����
 * @author Dante Fung
 *
 */
public class Demo2Server
{
	public static void main(String[] args) throws Exception
    {
	    // 1������tcp���񣬶���Ҫ����һ���˿ڡ�
		ServerSocket serverSocket = new ServerSocket(9090);
		// 2�����տͻ��˵���������
		/**
		 * ��������˵��tcp�ǻ���IO���������ݴ���ģ��ڶ���Ӧ���ǻ�ȡ��Ӧ���������󣬶�ȡ�ͻ������͵����ݡ�
		 * �ǳ��ź���serverSocketû��getInputStream()������������ǣ�
		 * ˭���أ�socket�С���socket�и�serverSocket��ʲô��ϵ�أ�
		 * �У�serverSocket���Բ���sokcet��
		 */
		System.out.println("====accept֮ǰ===");
		Socket socket = serverSocket.accept();// ��һ�������͵ķ��������û�пͻ����������ӣ���ô��һֱ�ȴ���ȥ��
		InputStream in = socket.getInputStream();
		byte[] buf = new byte[1024];
		int length = in.read(buf);
		System.out.println("tcp�ķ���˽��յ������ݣ�" + new String(buf,0,length));
		System.out.println("====accept֮��===");
		
		// �����Ҫ�������ݸ��ͻ���
		
		
		// 4���ر���Դ
		socket.close();
		// ��������£����ɷ������Ļ���һ���ǲ��رյġ�
		//serverSocket.close();
		
    }
}
