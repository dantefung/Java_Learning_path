package com.dantefung.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo1
{
	public static void main(String[] args) throws Exception
    {
		// 1������UDP����ˣ�����Ҫ����һ���˿�
		DatagramSocket datagramSocket = new DatagramSocket(9090);
		// 2��׼��һ���յ����ݰ���׼����������
		byte[] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf,buf.length);// ���ݰ������߱��洢���������ǽ�����buf�ֽ�������д洢��
		System.out.println("receive����֮ǰ...");
		// 3������udp�ķ��񣬽������ݰ�
		datagramSocket.receive(packet);// ���շ��͹��������ݰ��������Ѿ��洢���ֽ������С�
		// receive������һ�������͵ķ��������û�н��յ����ݰ�����һֱ�ȴ���ȥ��
		System.out.println("���ն˽��յ������ݣ�" + new String(buf,0,packet.getLength()));// packet.getLength() ��ȡ���ݰ����ν��յ��ֽڸ���
		//System.out.println("���ն˽��յ������ݣ�" + new String(buf));
		System.out.println("receive����֮��...");
		// 4���ر���Դ���ͷŶ˿ڣ�
		datagramSocket.close();
    }

}
