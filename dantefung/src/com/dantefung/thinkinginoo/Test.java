package com.dantefung.thinkinginoo;

public class Test {
	public static void main(String[] args) {
		Driver d = new Driver();
		d.setName("����");
		//����Ķ��B��
		d.drive(new Car());
		d.drive(new Plane());	
		d.drive(new Broom());	
	}

}
