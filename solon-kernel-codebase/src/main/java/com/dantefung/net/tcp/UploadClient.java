package com.dantefung.net.tcp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * TcpЭ�飬�ı��ļ��ϴ��ͻ��ˡ�
 * @author Dante Fung
 *
 */
public class UploadClient
{
	public static void main(String[] args) throws Exception
    {
	    // 1������tcpͨѶ������
		Socket socket = new Socket(InetAddress.getLocalHost(),10005);
		// 2�������ַ�����������ȡ���ص��ı��ļ���
		BufferedReader br = new BufferedReader(new FileReader("src\\com\\dantefung\\net\\tcp\\client.txt"));
		// 3����ȡsocket�����������������װ�ɴ�ӡ��(��ӡ������ָ���Զ�ˢ�º�����Զ�����)��
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		
		// 4�����ϵظ������д����
		String line = null;
		while((line=br.readLine()) != null)
		{
			out.println(line);
		}
		// ���߷���ˣ��ͻ��˵�����д���ˡ�
		socket.shutdownOutput();
//		out.println("over");// ������ǣ����������һ���ȷ���һ����ǰʱ��ĺ���ֵ������ˣ�����˵�ʱ��ֱ�����������ֵ��Ϊ�ͻ��˽���д���ݵı��
		
		// 5����ȡ����˷��ص����ݡ�
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		String str = bufIn.readLine();
		System.out.println(str);
		
		// 6���ͷ���Դ.
		socket.close();
		
    }
}
