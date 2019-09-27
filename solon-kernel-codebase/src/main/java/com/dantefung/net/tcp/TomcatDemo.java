package com.dantefung.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ����
 * ģ���������������������ݣ�ͬʱ֤��������������֮���ͨѶ��
 * ʹ����tcpЭ��
 * @author Dante Fung
 *
 */
public class TomcatDemo extends Thread
{
	private Socket socket;
	
	public TomcatDemo(Socket socket)
    {
	    this.socket = socket;
    }
	
	// д���̵߳�����
	@Override
	public void run()
	{
	    try
	    {
	    	InputStream in = socket.getInputStream();
	    	byte[] buf = new byte[1024];
			int length = in.read(buf);
			System.out.println("tcp�ķ���˽��յ������ݣ�" + new String(buf,0,length));
		    OutputStream out = socket.getOutputStream();
		    // ��������������
		    out.write("<font size='36px' color='red'>��ð��������������</font>".getBytes());
		    socket.close();
	    }
	    catch (Exception e)
	    {
		    e.printStackTrace();
	    }
	}
	
	public static void main(String[] args) throws Exception
    {
	    ServerSocket serverSocket = new ServerSocket(8080);
	    // ���Ͻ��������������
	    while(true)
	    {
	    	Socket socket = serverSocket.accept();
	    	new TomcatDemo(socket).start();
	    }
    }
}
