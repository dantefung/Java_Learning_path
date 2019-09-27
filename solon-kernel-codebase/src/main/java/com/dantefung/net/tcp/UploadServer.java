package com.dantefung.net.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TcpЭ�飬�ı��ļ��ϴ������
 * @author Dante Fung
 *
 */
public class UploadServer
{
	public static void main(String[] args) throws Exception
    {
	    // 1������tcp����
		ServerSocket serverSocket = new ServerSocket(10005);
		// 2�����տͻ�������
		Socket socket = serverSocket.accept();
		System.out.println(socket.getInetAddress().getHostAddress() + "......connected");
		// 3����ȡsocket���ֽ�����������ת����װ�Ρ�
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		// 4�������ַ���������
		BufferedWriter bw = new BufferedWriter(new FileWriter("src\\com\\dantefung\\net\\tcp\\server.txt"));
		// ���϶�ȡ�ͻ��˷��͹��������ݡ�
		String line = null;
		while((line=bufIn.readLine()) != null)
		{
//			if("over".equals(line)) break;
			
			bw.write(line);
			bw.newLine();
			// ������Ĭ����8kb��һ��װ�����Զ�ˢ������һ������£���������δ��װ��
			// ��ˣ���Ҫ�Լ��ֶ�ˢ��һ�����ݣ������������������ȥ��
			bw.flush();
		}
		// 5�����ͻ��˻�д��Ϣ
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		out.println("�ϴ��ɹ�������");
		
		// 6���ͷ���Դ.
		bw.close();
		socket.close();
		serverSocket.close();
    }
}
