/**
 * Project Name:dantefung
 * File Name:Product.java
 * Package Name:com.dantefung.dp.observer
 * Date:2016-3-28����9:51:37
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.dp.observer;
/**
 * ���۲���
 * ClassName:Product <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-28 ����9:51:37 <br/>
 * @author   Dante Fung
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class Product extends Observerable
{
	// ������������
	private String name;
	private double price;
	
	// �޲εĹ�����
	public Product()
	{

	}
	
	public Product(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	
	public String getName()
	{
		return name;
	}
	
	// ���������name��setter�������޸�Product��name����ʱ
	// ������Ȼ�����ö�����ע������й۲���
	public void setName(String name)
	{
		this.name = name;
		notifyObservers(name);
	}
	
	public double getPrice()
	{
		return price;
	}
	
	// ���������price��setter�������޸�Product��price����ʱ
	// ������Ȼ�����ö�����ע������й۲���
	public void setPrice(double price)
	{
		this.price = price;
		notifyObservers(price);
	}
}

