/**
 * Project Name:dantefung
 * File Name:VipDiscount.java
 * Package Name:com.dantefung.dp.strategy
 * Date:2016-3-16����4:48:38
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.dp.strategy;
/**
 * ClassName:VipDiscount <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-16 ����4:48:38 <br/>
 * @author   Dante Fung
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class VipDiscount implements DiscountStrategy
{

	// ��дgetDiscount(double originPrice)�������ṩvip�����㷨
	@Override
	public double getDiscount(double originPrice)
	{
		System.out.println("ʹ��VIP�ۿ�....");
		return originPrice*0.5;
	}

}

