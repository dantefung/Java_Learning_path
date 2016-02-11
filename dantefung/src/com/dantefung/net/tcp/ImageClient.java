package com.dantefung.net.tcp;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
/**
 * Tcp�ͻ���
 * @author Dante Fung
 *
 */
public class ImageClient
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
		// ��ȡ����˷���������
		InputStream inputStream = socket.getInputStream();
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:/c.jpg"));
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = inputStream.read(buf)) != -1)
		{
			bos.write(buf, 0, len);
		}
		// 4���ر���Դ
		socket.close();
    }
}
