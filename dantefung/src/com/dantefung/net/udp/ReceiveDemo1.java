package com.dantefung.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo1
{
	/**
	 * ����UDP���ն˵�˼·��
	 * 1������UDP socket����,��ΪҪ�������ݣ�������ȷһ���˿ںš�
	 * 2���������ݰ������ڴ洢�յ������ݡ����������ݰ�����ķ���������Щ���ݡ�
	 * 3��ʹ��socket�����receive���������յ����ݴ洢�����ݰ��С�
	 * 4��ͨ�����ݰ��ķ����������ݰ��е����ݡ�
	 * 5���ر���Դ��
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception
    {
		System.out.println("���ն�����.......");
		// 1������UDP���նˣ�����Ҫ����һ���˿�
		DatagramSocket datagramSocket = new DatagramSocket(9090);
		// 2��׼��һ���յ����ݰ���׼����������
		byte[] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf,buf.length);// ���ݰ������߱��洢���������ǽ�����buf�ֽ�������д洢��
		System.out.println("receive����֮ǰ...");
		// 3������udp�ķ��񣬽������ݰ�
		datagramSocket.receive(packet);// ���շ��͹��������ݰ��������Ѿ��洢���ֽ������С�
		// receive������һ�������͵ķ��������û�н��յ����ݰ�����һֱ�ȴ���ȥ��
		// 4��ͨ�����ݰ�����ķ������������е����ݣ����磺��ַ���˿ڡ��������ݵ�
		String ip = packet.getAddress().getHostAddress();
		int port = packet.getPort();
		String text = new String(packet.getData(),0,packet.getLength());
		System.out.println(" ip: " + ip + " port: " + port + " text: " + text);
		System.out.println("���ն˽��յ������ݣ�" + new String(buf,0,packet.getLength()));// packet.getLength() ��ȡ���ݰ����ν��յ��ֽڸ���
		//System.out.println("���ն˽��յ������ݣ�" + new String(buf));
		System.out.println("receive����֮��...");
		// 5���ر���Դ���ͷŶ˿ڣ�
		datagramSocket.close();
    }

}
