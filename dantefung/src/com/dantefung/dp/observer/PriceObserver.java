/**
 * Project Name:dantefung
 * File Name:PriceObserver.java
 * Package Name:com.dantefung.dp.observer
 * Date:2016-3-28����10:02:20
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.dp.observer;
/**
 * ClassName:PriceObserver <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-28 ����10:02:20 <br/>
 * @author   Dante Fung
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class PriceObserver implements Observer
{
	// ʵ�ֹ۲��߱���ʵ�ֵ�update��������
	@Override
	public void update(Observerable o, Object arg)
	{
		if(arg instanceof Double)
		{
			System.out.println("�۸�۲��ߣ�" + o + "��Ʒ�۸��Ѿ��ı�Ϊ��" + arg);
		}
	}

}

