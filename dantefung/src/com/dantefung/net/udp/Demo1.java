package com.dantefung.net.udp;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo1
{
	public static void main(String[] args) throws UnknownHostException
    {
	    // InetAddress ip = InetAddress.getLocalHost();
		InetAddress ip = InetAddress.getByName("www.baidu.com");
	    System.out.println("�������� " + ip.getHostName());
	    System.out.println("ip�ţ� " + ip.getHostAddress());
    }
}
