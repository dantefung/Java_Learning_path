package com.dantefung.net.tcp;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
/**
 * Tcp�ͻ���
 * @author Dante Fung
 *
 */
public class Demo1Client
{
	public static void main(String[] args) throws Exception
    {
	    // 1������TCP����,TCP�Ŀͻ���һ�����������Ͼ�Ҫ�������ӡ�
		Socket socket = new Socket(InetAddress.getLocalHost(),9090);
		// 2����ȡ��Ӧ����������ΪTCP�ǻ���IO���������ݴ���ġ�
		String data = "�����ҵĵ�һ��TCP���ӣ���";
		OutputStream outputStream = socket.getOutputStream();
		// 3��������д��
		outputStream.write(data.getBytes());
		// 4���ر���Դ
		socket.close();
    }
}
