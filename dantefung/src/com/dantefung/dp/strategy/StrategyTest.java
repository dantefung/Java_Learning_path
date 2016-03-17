/**
 * Project Name:dantefung
 * File Name:StrategyTest.java
 * Package Name:com.dantefung.dp.strategy
 * Date:2016-3-16����4:49:18
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.dp.strategy;
/**
 * ����ģʽ���ڷ�װϵ�е��㷨����Щ�㷨ͨ������װ��һ������ΪContext�����У��ͻ��˳����������
 * ѡ������һ���㷨�ͣ�����ContextΪ�ͻ���ѡ��һ����ѵ��㷨----ʹ�ò���ģʽ��������Ϊ��֧��
 * �㷨�������л� ��
 * 
 *   �������³����������������ڿ���һ��������꣬�����Ϊ�˸��õش�����������Ҫ��ͼ����д��۴�����
 *   ������Ҫ���Ǹ��ִ��۴����ļ��㷽����
 *   
 *   Ϊ��ʵ������������ṩ�ĸ��ִ������󣬳�����ʹ�����µķ�ʽʵ�֣�
 *   
 * // һ��ʵ��discount()��������  
 * public double discount(double price)
 * {
 * 	   // ��Բ�ͬ������ò�ͬ���㷨
 *     switch(getDiscountType())
 *     {
 *     	  case VIP_DISCOUNT:
 *            return vipDiscount(price);
 *            break;
 *        case OLD_DISCOUNT:
 *            return oldDiscount(price);
 *            break;
 *        case SALE_DISCOUNT:
 *            return saleDiscount(price);
 *            break;
 *            
 *        ...
 *            
 *     }
 * }
 *  
 * 
 * ���㣺
 * 		�����еĸ��ִ��۷�������ֱ��д����discount(double price)�����С�
 * 		�����һ�죬�������Ҫ����һ�ִ��������أ��ǿ�����Ա�����޸�����3�����룺
 *      1��������Ҫ����һ���������ó������������Ĵ������͡�
 *      2�������Ҫ��switch���������һ��case��䡣
 *      3����󿪷���Ա��Ҫʵ��xxxDiscount����������ʵ�������Ĵ����㷨��
 * 
 * Ϊ�˸ı����ֲ��õ���ƣ����潫��ѡ��ʹ�ò���ģʽ��ʵ�ָù��ܡ�
 * 
 * ClassName:StrategyTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-16 ����4:49:18 <br/>
 * @author   Dante Fung
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class StrategyTest
{
	public static void main(String[] args)
	{
		// �ͻ���û��ѡ����۲�����
		DiscountContext dc = new DiscountContext(null);
		double price1 = 79;
		// ʹ��Ĭ�ϵĴ��۲���
		System.out.println("79Ԫ����Ĭ�ϴ��ۺ�ļ۸��ǣ�" + dc.getDiscountPrice(price1));
	    // �ͻ���ѡ����ʵ�VIP���۲���
		dc.changeDiscount(new VipDiscount());
		double price2 = 89;
		// ʹ��vip���۵õ��Ĵ��ۼ۸�
		System.out.println("89Ԫ�����VIP�û��ļ۸��ǣ�" + dc.getDiscountPrice(price2));
	}
	
	/*
	 * �ٴο���ǰ������󣺵�ҵ����Ҫ����һ�ִ�������ʱ��ϵͳֻ��Ҫ���¶���һ��DiscountStrategyʵ���࣬��ʵ����ʵ��getDiscount()����
	 * ����ʵ���µĴ����㷨���ɡ��ͻ��˳�����Ҫ�л�Ϊ�µĴ��۲���ʱ������Ҫ�ȵ���DiscountContext��changeDiscount()�����л�Ϊ�µĴ��۲��ԡ�
	 * 
	 * ������Ľ����п��Կ�����ʹ�ò���ģʽ�����ÿͻ��˴����ڲ�ͬ�Ĵ��۲���֮���л�����Ҳ��һ��СС�ź���
	 * �ͻ��˴�����Ҫ�Ͳ�ͬ�Ĳ�������ϡ�Ϊ���ֲ����㣬���ǿ��Կ���ʹ�������ļ���ָ��DiscountContextʹ�����ִ��۲���----��ͳ��׷����˿ͻ��˺;�����۲����ࡣ
	 * 
	 * ���ܵ�������Ŷ��߶�Hibernate��Dialect����һ��о��ˣ����Dialect�����������ݿⷽ�Եĳ����࣬����ͬ�����ݿ�־û����ʿ��ܴ���һЩ���
	 * �����ڷ�ҳ�㷨�ϴ��ڽϴ�Ĳ��죬Dialect��ͬ����ʹ�����һ���ض����ݿ���ʲ��ԡ�Ϊ���ÿͻ��˴������������ݿ⡢�����Dialectʵ������룬Hibernate��Ҫ��hibernate.cfg.xml
	 * �ļ���ָ��Ӧ����ʹ�õ�Dialect���ࡣ
	 * 
	 * ������Ƶ��ǣ�Spring��Resource�ӿ�Ҳ��һ�����͵Ĳ��Խӿڣ���ͬ��ʵ��������˲�ͬ����Դ���ʲ��ԡ���ȻSpring���Էǳ������ܡ���ѡ����ʵ�Resourceʵ���࣬ͨ����˵��Spring����
	 * ����ǰ׺������ʹ�ú��ʵ�Resourceʵ���ࣺ���ɸ���ApplicationContext��ʵ����������ʹ�ú��ʵ�Resourceʵ���ࡣ
	 *
	 */
}

