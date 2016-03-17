/**
 * Project Name:dantefung
 * File Name:DiscountContext.java
 * Package Name:com.dantefung.dp.strategy
 * Date:2016-3-16����5:07:34
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.dp.strategy;
/**
 * ClassName:DiscountContext <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-16 ����5:07:34 <br/>
 * @author   Dante Fung
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class DiscountContext
{
	// ���һ��DisocuntStrategy���󡣺ϳɸ���ԭ�򡣶�̬��
	private DiscountStrategy strategy;
	// ������������һ��DiscountStrategy����
	public DiscountContext(DiscountStrategy strategy)
	{
		this.strategy = strategy;
	}
	
	// ����ʵ����ʹ�õ�DiscountStrategy����õ��ۿۼ�
	public double getDiscountPrice(double price)
	{
		// ���strategyΪnull��ϵͳ�Զ�ѡ��oldDiscount��
		if(strategy == null)
		{
			strategy = new OldDiscount();
		}
		
		return this.strategy.getDiscount(price);
	}
	
	// �ṩ�л��㷨�ķ���
	public void changeDiscount(DiscountStrategy strategy)
	{
		this.strategy = strategy;
	}
}

