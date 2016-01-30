package com.dantefung.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Ⱥ�ĵĽ��ն�
 * @author Dante Fung
 *
 */
public class ChatReceive extends Thread
{
	@Override
	public void run()
	{
		try
        {
			// 1������UDP����
	        DatagramSocket socket = new DatagramSocket(9090);
	        // 2��׼��һ���յ����ݰ�����������
	        byte[] buf = new byte[1024];
	        DatagramPacket packet = new DatagramPacket(buf,buf.length);
	        // 3�����ϵĽ�������
	        boolean flag = true;
	        while(flag)
	        {
	        	socket.receive(packet);
	        	// ��ȡ�Է���ip��ַ����
	        	InetAddress ip = packet.getAddress();
	        	System.out.println(ip.getHostAddress() + "˵��" + new String(buf,0,packet.getLength()));
	        }
	        // 4���ر���Դ���ͷŶ˿ڣ�
	        socket.close();
        }
        catch (Exception e)
        {
	        e.printStackTrace();
        }
	}
}
