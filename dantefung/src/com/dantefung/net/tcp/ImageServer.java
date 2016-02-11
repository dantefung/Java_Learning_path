package com.dantefung.net.tcp;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;

/**
 * tcp�����ļ��ķ������������Ҫ���ܶ���ͻ��˵����ӣ�
 * һ���������ӣ����ϸ��ͻ��˷���ͼƬ����
 * 
 * @author Dante Fung
 *
 */
public class ImageServer extends Thread
{
	// ���̰߳汾�Ĵ���
	/*@Override
	public void run()
	{
		try
        {
	        // 1������tcp�����
			ServerSocket serverSocket = new ServerSocket(9090);
			// 2�����տͻ��˵���������
			Socket socket = serverSocket.accept();
			// 3�����ͻ��˷���ͼƬ����
			// 3.1����ȡ����������
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:aa.jpg"));
			// 3.2����ȡ���������
			OutputStream out = socket.getOutputStream();
			// 3.3����дͼƬ����
			byte[] buf = new byte[1024];
			int len = 0;
			while((len = bis.read(buf)) != -1)
			{
				out.write(buf, 0, len);
			}
			// 4���ͷ���Դ
			bis.close();
			socket.close();
        }
        catch (Exception e)
        {
        	e.printStackTrace();
        	throw new RuntimeException(e);
        }
	}*/
	
	// ����Ϊ���̰߳汾�Ĵ���
	
	private Socket socket;
	
	// ���ڴ洢ip��ַ
	private HashSet<String> ips = new HashSet<String>();
	
	public ImageServer(Socket socket)
    {
		this.socket = socket;
    }
	
	@Override
	public void run()
	{
		try
		{
			// 3�����ͻ��˷���ͼƬ����
			// 3.1����ȡ����������
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:aa.jpg"));
			// 3.2����ȡ���������
			OutputStream out = socket.getOutputStream();
			// 3.3����дͼƬ����
			byte[] buf = new byte[1024];
			int len = 0;
			while((len = bis.read(buf)) != -1)
			{
				out.write(buf, 0, len);
			}
			
			// ��ȡ�Է���IP��ַ����
			String ip = socket.getInetAddress().getHostAddress();
			/**
			 * �����Ƕ���ͻ��˿���������ÿ���ͻ��˶�����Ψһ����ˣ�ͳ�Ƶ�ʱ��
			 * ��Ӧ�����ظ���ip��ַ�����ԣ����ǽ�ѡ��һ���������洢���������ϵ�����
			 * ��Ӧ��ѡ�����set���ϣ�set���������Ԫ���ǲ������ظ��ģ���set����
			 * ����Щ�ӽӿڣ�treeSet�����������õģ� & hashSet(�������ظ�)
			 */
			if(ips.add(ip))
			{
				System.out.println("��ϲ��" + ip + "�û����سɹ�����  ��ǰ���ص������ǣ�" + ips.size());
			}
			
			// 4���ͷ���Դ
			bis.close();
			socket.close();
	    }
	    catch (Exception e)
	    {
	    	e.printStackTrace();
	    	throw new RuntimeException(e);
	    }
	}
	
	public static void main(String[] args) throws Exception
    {
	    // 1������tcp���ն�
		ServerSocket serverSocket = new ServerSocket(9090);
		// ���Ͻ��ܿͻ��˵�����
		while(true)
		{
			// 2�����տͻ��˵���������
			Socket socket = serverSocket.accept();
			// Ϊÿ���ͻ��˿���һ���߳�
			new ImageServer(socket).start();
		}
		
    }
}
