/**
 * Project Name:dantefung
 * File Name:BeafNoodle.java
 * Package Name:com.dantefung.dp.bridge
 * Date:2016-3-28����8:59:03
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.dp.bridge;
/**
 * ��PorkyNoodle��BeafNoodle�п��Կ�����AbstractNoodle������
 * ����ʵ����ʵ��eat()����ʱ��������˲��Ϸ��ı仯��Ҳ�������ζ���ı仯���Ӷ��ɱ��ֳ�����ά���ϵ�
 * �仯��
 * ClassName:BeafNoodle <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-28 ����8:59:03 <br/>
 * @author   Dante Fung
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class BeafNoodle extends AbstractNoodle
{

	public BeafNoodle(Peppery peppery)
	{
		super(peppery);
	}

	@Override
	public void eat()
	{
		System.out.println("����һ����ζ��ţ������," + super.style.style());
	}

}

