package com.dantefung.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SenderDemo1
{
	public static void main(String[] args) throws Exception
    {
		System.out.println("���Ͷ�����......");
	    // 1������UDP�����Ƚ�����ͷ��
		DatagramSocket datagramSocket = new DatagramSocket();
		// 2��׼�����ݣ���װ�����ݰ���׼�����װ����װ�䣩
		String data = "Hello World!!";
		DatagramPacket packet = new DatagramPacket(data.getBytes(),data.getBytes().length,InetAddress.getLocalHost(),9090);
		// 3�����ͣ����ͼ�װ�䣩
		datagramSocket.send(packet);
		// 4���ͷŶ˿�
		datagramSocket.close();
    }
}
