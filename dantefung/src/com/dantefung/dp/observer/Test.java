/**
 * Project Name:dantefung
 * File Name:Test.java
 * Package Name:com.dantefung.dp.observer
 * Date:2016-3-28����10:04:14
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.dp.observer;
/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-28 ����10:04:14 <br/>
 * @author   Dante Fung
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class Test
{
	public static void main(String[] args)
	{
		// ����һ�����۲����
		Product p = new Product("���ӻ�",176);
		// ���������۲��߶���
		NameObserver no = new NameObserver();
		PriceObserver po = new PriceObserver();
		// �򱻹۲��߶�����ע�������۲��߶���
		p.registerObserver(no);
		p.registerObserver(po);
		// �������setter�������ı�Product��name��price����
		p.setName("����");
		p.setPrice(345f);
	}
}

