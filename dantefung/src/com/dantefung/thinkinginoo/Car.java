package com.dantefung.thinkinginoo;

public class Car extends Vehicle {
	private String name;
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	//��д�˸����go()����
	public void go(Address dest)
	{
		System.out.println("һ·���Ÿ裬ð���̣�ȥ��" + dest.getName());
	}
}
