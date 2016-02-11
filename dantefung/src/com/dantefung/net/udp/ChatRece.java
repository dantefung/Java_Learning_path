package com.dantefung.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChatRece implements Runnable
{
	private DatagramSocket ds;
	
	public ChatRece(DatagramSocket ds)
    {
	    this.ds = ds;
    }

	@Override
    public void run()
    {
	    try
        {
	        while(true)
	        {
	        	// 2��׼��һ���յ����ݰ���׼����������
	        	byte[] buf = new byte[1024];
	        	DatagramPacket packet = new DatagramPacket(buf,buf.length);// ���ݰ������߱��洢���������ǽ�����buf�ֽ�������д洢��
	        	// 3������udp�ķ��񣬽������ݰ�
	        	ds.receive(packet);// ���շ��͹��������ݰ��������Ѿ��洢���ֽ������С�
	        	// receive������һ�������͵ķ��������û�н��յ����ݰ�����һֱ�ȴ���ȥ��
	        	// 4��ͨ�����ݰ�����ķ������������е����ݣ����磺��ַ���˿ڡ��������ݵ�
	        	String ip = packet.getAddress().getHostAddress();
	        	int port = packet.getPort();
	        	String text = new String(packet.getData(),0,packet.getLength());
	        	System.out.println(" ip: " + ip + " :port: " + port + " ��: " + text);
	        	if("886".equals(text))
	        	{
	        		System.out.println(ip + "::" + "�˳��������ң���");
	        	}
	        }
        }
        catch (Exception e)
        {
	        e.printStackTrace();
	        throw new RuntimeException(e);
        }
	    
    }
	
}
