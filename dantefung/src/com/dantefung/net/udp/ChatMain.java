package com.dantefung.net.udp;


public class ChatMain
{
	public static void main(String[] args) throws Exception
    {
	    // �����̶߳���
		ChatSender sender = new ChatSender();
		ChatReceive receive = new ChatReceive();
		// �����߳�
		sender.start();
		receive.start();
    }
}
