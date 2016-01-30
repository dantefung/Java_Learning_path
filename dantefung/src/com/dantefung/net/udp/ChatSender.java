package com.dantefung.net.udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/**
 * Ⱥ�ĵķ��Ͷ�
 * @author Dante Fung
 *
 */
public class ChatSender extends Thread
{
	@Override
	public void run()
	{
		try
        {
			// 1������UDP����
	        DatagramSocket socket = new DatagramSocket();
	        // 2��׼��Ҫ���͵����ݣ������ݷ�װ�����ݰ���
	        String data = null;
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        // ׼�����ݰ�
	        DatagramPacket p = null;
	        while((data=br.readLine()) != null)
	        {
	        	System.out.println(data);
	        	// �����ݷ�װ�����ݰ���,Ⱥ�����ù㲥IP��ַ
	        	p = new DatagramPacket(data.getBytes(),data.getBytes().length,InetAddress.getByName("10.10.20.255"),9090);
	        	socket.send(p);
	        }
	        // �ر���Դ
	        socket.close();
        }
        catch (Exception e)
        {
	        e.printStackTrace();
        }
	}
}
