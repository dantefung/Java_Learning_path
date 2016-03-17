/**
 * Project Name:dantefung
 * File Name:Facade.java
 * Package Name:com.dantefung.dp.facade
 * Date:2016-3-17����12:55:14
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.dp.facade;
/**
 * ClassName:Facade <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-17 ����12:55:14 <br/>
 * @author   Dante Fung
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class Facade
{
	// ���屻Facede��װ����������
	private Payment pay;
	private Cook cook;
	private Waiter waiter;
	
	// ������
	public Facade()
	{
		this.pay = new PaymentImpl();
		this.cook = new CookImpl();
		this.waiter = new WaiterImpl();
	}
	
	public void serveFood()
	{
		// ���ε����������ŵķ�������װ��һ��serveFood��������
		String food = pay.pay();
		food = cook.cook(food);
		waiter.serve(food);
	}
}

