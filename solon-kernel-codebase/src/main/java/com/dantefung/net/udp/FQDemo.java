package com.dantefung.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/**
 * ���󣺸�FeiQ������Ϣ
 * 
 * ���������������Ҫ�����ݽ��м��ܣ�����������Ŀ���ǿ��ǵ��˰�ȫ�����⡣
 * �����ܵķ�ʽ����򵥵ľ��ǽ���ָ����ʽ���ַ�����������յ������ݲ�������Ҫ
 * ��ĸ�ʽ����ô�����ݾͻ�ֱ�Ӷ�����������
 * 
 * ��QҪ����յ����ݸ�ʽ��
 *     version:time:sender:ip��flag:content
 *     version:�汾��1.0
 *     time:ʱ�䡣
 *     sender:�����ߡ�
 *     ip:�����ߵ�IP��ַ��
 *     flag:���͵ı�ʶ��32����ʶ��Ҫ���죩
 *     content:����������ϣ��Ҫ���͵����ݡ�
 *     
 * @author Dante Fung
 *
 */
public class FQDemo
{
	public static void main(String[] args) throws Exception
    {
	    // 1������UDP����
		DatagramSocket datagramSocket = new DatagramSocket();
		// 2��׼��Ҫ���͵����ݣ���װ�����ݰ�
		String data = getData("Hello FQ!");
		byte[] buf = data.getBytes();
		DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("169.254.147.26"), 2425);
		// 3����������
		datagramSocket.send(packet);
		// 4���ͷ���Դ���ͷŶ˿ڣ�
		datagramSocket.close();
    }
	
	public static String getData(String content)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("1.0:")
		  .append(System.currentTimeMillis()+":")
		  .append("Dante:")
		  .append("192.168.1.1:")
		  .append("32:")
		  .append(content);
		return sb.toString();
	}
}
