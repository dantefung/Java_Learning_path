/**
 * Project Name:dantefung
 * File Name:Client.java
 * Package Name:com.dantefung.dp.builder
 * Date:2016-3-16����3:24:42
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.dp.builder;
/**
 * ClassName:Client <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-16 ����3:24:42 <br/>
 * @author   Dante Fung
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class Client
{
	public static void main(String[] args)
	{
		/*
		 * ��ʽ����
		 * 1�� �ȴ���һ�������ߣ�new NutritionFacts.Builder();
		 * 2�� ѡ���Եĵ��ý������ڲ��ķ���Ϊ��ѡ���������ֵ��
		 * 
		 * �ŵ㣺builderģʽģ���˾����Ŀ�ѡ������
		 * �����ԣ������Ĺ��������߾�̬�����о��ж�����������������ʱ��Builderģʽ�����в����ѡ��
		 */
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100)
		.sodium(35).carbohydrate(27).build();
	}
}

