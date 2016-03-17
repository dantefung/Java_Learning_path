/**
 * Project Name:dantefung
 * File Name:NutritionFacts.java
 * Package Name:com.dantefung.dp.builder
 * Date:2016-3-16����3:11:17
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.dp.builder;
/**
 * �����ǡ�Effective Java���ڶ��� ���������ٶ��� ��2�� �����������
 * ����ʱҪ����ʹ�ù�������
 * 
 * ������ģʽ
 * 
 * Nutrition:n.Ӫ����Ӫ��ѧ��Ӫ��Ʒ
 * calory:��·��
 * sodium:��
 * carbohydrate��̼ˮ���������
 * 
 * ClassName:NutritionFacts <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-16 ����3:11:17 <br/>
 * @author   Dante Fung
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class NutritionFacts
{
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	
	// �����ľ�̬���ڲ���
	public static class Builder
	{
		// Required parameters
		private final int servingSize;
		private final int servings;
		
		// Optional parameters - initialized to default values
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;
		
		public Builder(int servingSize, int servings)
		{
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int val)
		{
			calories = val;
			return this;
		}
		
		public Builder fat(int val)
		{
			fat = val;
			return this;
		}
		
		public Builder carbohydrate(int val)
		{
			carbohydrate = val;
			return this;
		}
		
		public Builder sodium(int val)
		{
			sodium = val;
			return this;
		}
		
		public NutritionFacts build()
		{
			return new NutritionFacts(this);
		}
	}
	
	// ˽�й�����
	private NutritionFacts(Builder builder)
	{
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
}

