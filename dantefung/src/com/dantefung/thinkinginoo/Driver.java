package com.dantefung.thinkinginoo;

public class Driver {
	private String name;//˽�����ԣ�Ϊ�˰�ȫ�ԡ�
//	private Car c;//˽�ҳ�������ͨ�����εķ�ʽ����������֮��Ĺ�ϵ��
	
	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

//	public void drive(Car car)
//	{
//		car.go(new Address("����"));
//	}
//	
//	public void drive(Car car,Address dest)
//	{
//		car.go(dest);
//	}
	
	//�����洫����˭�����õľ���˭�ķ������@���Ƕ��B��
	public void drive(Vehicle v)
	{
		v.go(new Address("����"));
	}
}
