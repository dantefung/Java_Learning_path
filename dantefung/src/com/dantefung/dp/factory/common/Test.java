package com.dantefung.dp.factory.common;
//����ӿڱ�̲��ԡ�  ��ͨ��������Ծ���ĵ�����Ʒ���ԡ�
public class Test {

	public static void main(String[] args) {
		//ͳһ�����B��
		VehicleFactory factory = new CarFactory();//�ŵ㣺��չ�Ժá�Ҫ��ֻ�����һ���ط���
//		VehicleFactory factory = new PlaneFactory();
		Moveable moveable = factory.creatVehicle();
		moveable.run();
	}

}
