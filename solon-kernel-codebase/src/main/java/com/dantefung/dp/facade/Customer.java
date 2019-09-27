/**
 * Project Name:dantefung
 * File Name:Customer.java
 * Package Name:com.dantefung.dp.facade
 * Date:2016-3-17����12:51:47
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.dp.facade;
/**
 * ������ʹ��������ģʽ�󣬿ͻ��˴���ֻ��Ҫ����������н������ͻ��˴����ü�Ϊ�򵥡�
 * 
 * �Ķ����˴����Ŷ��߶�Spring��HibernateTemplate���е�о��ˣ�������
 * �ĳ���ʹ��HibernateTemplate��find()����ʱ������ֻҪ��һ�д��뼴�ɵõ�
 * ��ѯ���ص�List����ʵ���ϸ�find()���������������µĴ��룺
 * 
 * Session session = sf.openSession();
 * Query query = session.createQuery(hql);
 * for(int i = 0; i < args.length; i ++)
 * {
 * 		query.setParameter(i,args[i]);
 * }
 * query.list();
 * 
 * ��ˣ����ǿ�����ΪHibernateTemplate��SessionFactory��Session��Query��������棬
 * ���ͻ��˳�����Ҫ���г־û���ѯʱ���������������Щ�࣬����ֱ�ӵ���HibernateTemplate������ķ������ɡ�
 * 
 *  ����֮�⣬JavaEEӦ����ʹ��ҵ���߼��������װDAO���Ҳ�ǵ��͵�����ģʽ----ÿ��ҵ���߼���������ڶ�
 *  DAO��������棬ϵͳ�Ŀ�����������ֱ�ӷ���DAO�����������ҵ���߼���������϶��DAO������������蹦�ܣ�
 *  ��Actionֻ����ҵ���߼�����������ɡ�
 * 
 * ClassName:Customer <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-17 ����12:51:47 <br/>
 * @author   Dante Fung
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class Customer
{
	public void haveDinner()
	{
		/*// ���δ�����������ʵ��
		Payment pay = new PaymentImpl();
		Cook cook = new CookImpl();
		Waiter waiter = new WaiterImpl();
		// ���ε�����������ʵ���ķ�����ʵ���ò͹���
		String food = pay.pay();
		food = cook.cook(food);
		waiter.serve(food);*/
		
		// ֱ��һ����Facade����ʵ���ò͵ķ���
		Facade f = new Facade();
		f.serveFood();
	}
}

