/**
 * Project Name:dantefung
 * File Name:DiscountStrategy.java
 * Package Name:com.dantefung.dp.strategy
 * Date:2016-3-16����5:02:18
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.dp.strategy;
/**
 * ClassName:DiscountStrategy <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-16 ����5:02:18 <br/>
 * @author   Dante Fung
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface DiscountStrategy
{
	
	// ����һ�����ڼ�����ۼ۵ķ���
	double getDiscount(double originPrice);
}

