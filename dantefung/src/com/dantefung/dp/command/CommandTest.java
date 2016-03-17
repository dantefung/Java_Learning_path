/**
 * Project Name:dantefung
 * File Name:CommandTest.java
 * Package Name:com.dantefung.dp.command
 * Date:2016-3-16����4:24:38
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.dp.command;
/**
 * 
 * 
 * ClassName:CommandTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-16 ����4:24:38 <br/>
 * @author   Dante Fung
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class CommandTest
{

	/**
	 * main:
	 * �����������ProcessArray�����each()��������������ʱ��ÿ�δ���
	 * ������Ҫ���벻ͬ�ġ�������Ϊ��----Ҳ����ҪΪeach()�������벻ͬ��Command����
	 * ��ͬ��Command�����װ�˲�ͬ�ġ�������Ϊ����
	 * 
	 * ʵ����process�����͡�������Ϊ���ķ��룬���β�ͬ�Ĵ�����Ϊ�ֱ���
	 * ������ͬ��Command�������ṩ��
	 * 
	 * ������������ģʽ�����Ŷ�spring�����HibernateTemplate��executeXxx()����
	 * �ҵ���һ��о���HibernateTemplateʹ����executeXxx()�����ֲ���HibernateTemplate��
	 * ���㣬�÷�����Ҫ����һ��HibernateCallback()�ӿڣ��ýӿڵĴ������£�
	 * 
	 * //����һ��HibernateCallback�ӿڣ��ýӿڷ�װ�־û��Ĵ�����Ϊ
	 * public interface HibernateCallback()
	 * {
	 * 		Object doInHibernate(Session session);
	 * } 
	 * 
	 * �����HibernateCallback�ӿھ���һ�����͵�Command�ӿڣ�һ��HibernateCallback�����װ
	 * �Զ���ĳ־û�����
	 * 
	 *   ��HibernateTemplate���ԣ��󲿷ֳ־û�����������ͨ��һ��������ʵ�֣�HibernateTemplate�������Hibernate�ĳ־û�
	 *   ����������ʧ��ʹ��Hibernate�־û�����������ԡ�
	 *   
	 *   ͨ��HibernateCallback�Ϳ����ֲ�HibernateTemplate����ԵĲ����ȱ�㣬������HibernateTemplate��executeXxx()����ʱ��
	 *   ����HibernateCallback�����doInHibernate()���������Զ���ĳ־û�����----�����Զ���ĳ־û���������
	 *   executeXxx()������������Ĵ���Ƭ����ʾ��
	 *   
	 *   List list = getHibernateTemplate()
	 *         .executeFind(new HibernateCallback()
	 *        {
	 *   		  // ʵ��HibernateCallback�ӿڱ���ʵ�ֵķ���
	 *            public Object doInHibernate(Session session)
	 *            {
	 *            	 // ִ��Hibernate��ҳ��ѯ
	 *               List result = session.createQuery(hql)
	 *                           .setFirstResult(offset)
	 *                           .setMaxResults(pageSize)
	 *                           .list();
	 *               return result;
	 *            }
	 *        });
	 * 
	 *  <br/>
	 * TODO(����������������������� �C ��ѡ).<br/>
	 * TODO(�����������������ִ������ �C ��ѡ).<br/>
	 * TODO(�����������������ʹ�÷��� �C ��ѡ).<br/>
	 * TODO(�����������������ע������ �C ��ѡ).<br/>
	 *
	 * @author Dante Fung
	 * @param args
	 * @since JDK 1.6
	 */
	public static void main(String[] args)
	{
		ProcessArray pa = new ProcessArray();
		int[] target = {3, -4, 6, 4};
		
		//��һ�δ������飬���崦����Ϊȡ����Command���� �ص���
		pa.each(target, new Command()
		{

			@Override
			public void process(int[] target)
			{
				for(int tem : target)
				{
					System.out.println("���������Ŀ�������Ԫ�أ�" + tem);
				}
			}
			
		});
		
		System.out.println("--------------------");
		
		// �ڶ��δ������飬���崦����Ϊȡ����Command����
		pa.each(target, new Command()
		{
			@Override
			public void process(int[] target)
			{
				int sum = 0;
				for(int tem : target)
				{
					sum += tem;
				}
				System.out.println("����Ԫ�ص��ܺ��ǣ�" + sum);
			}
		});
		
		
	}

}

