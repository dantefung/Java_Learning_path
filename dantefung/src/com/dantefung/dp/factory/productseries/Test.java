package com.dantefung.dp.factory.productseries;

public class Test {

	public static void main(String[] args) {
		DefualtFactory defualtFactory = new MagicFactory();//Ҫ����һ��������Ʒϵ�еĹ����ڴ��޸ļ��ɡ�
		Moveable vehicle = defualtFactory.creatVehicle();
		Food food = defualtFactory.creatFood();
		Weapon weapon = defualtFactory.creatWeapon();
		vehicle.run();
		food.printName();
		weapon.shoot();
	}

}
