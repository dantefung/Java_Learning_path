package com.dantefung.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class SafeReceive {
	
	public static void main(String[] args) {
		try {
			//��һ���� ����udp�ķ��񣬲���Ҫ����һ���˿�
			DatagramSocket socket = new DatagramSocket(9090);
			//�ڶ����� ׼���յ����ݰ���׼����������
			byte[] buf = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			boolean flag = true;
			while(flag){
				socket.receive(packet);
				System.out.println(new String(buf,0,packet.getLength()));
				Thread.sleep(100);
			}
			//�ر���Դ
			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
