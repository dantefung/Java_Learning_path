/**
 * Project Name:dantefung
 * File Name:PorkyNoodle.java
 * Package Name:com.dantefung.dp.bridge
 * Date:2016-3-28����8:57:14
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.dp.bridge;
/**
 * ClassName:PorkyNoodle <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-28 ����8:57:14 <br/>
 * @author   Dante Fung
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class PorkyNoodle extends AbstractNoodle
{
	
	public PorkyNoodle(Peppery peppery)
	{
		super(peppery);
	}

	// ʵ��eat()���󷽷�
	@Override
	public void eat()
	{
		System.out.println("����һ�������������������," + super.style.style());
	}

}

