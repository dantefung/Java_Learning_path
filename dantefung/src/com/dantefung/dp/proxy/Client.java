package com.dantefung.dp.proxy;

import com.dantefung.dp.proxy.*;

public class Client {
	public static void main(String[] args) throws Exception {
		Tank t = new Tank();
		InvocationHandler h = new TimeHandler(t);//���B��
		
		Moveable m = (Moveable)Proxy.newProxyInstance(Moveable.class, h);
		
		m.move();//���ö�̬���ɵ������û��Զ���ӿ��еķ�����
	}
}
