package com.dantefung.dp.factory.common;

public class CarFactory implements VehicleFactory {
	private static Car car = new Car();//�����Ǿ�̬�ģ��������ڴ����Ǻ㶨����ġ�
	
	private static Car getInstance()//����ģʽ,������˽�еĽ��ޱ�����ʹ�á�
	{
		return car;
	}
	
	@Override
	public Moveable creatVehicle() 
	{
		return CarFactory.getInstance();
	}

}
