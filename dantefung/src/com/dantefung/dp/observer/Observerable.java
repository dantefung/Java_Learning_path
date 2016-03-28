/**
 * Project Name:dantefung
 * File Name:Observerable.java
 * Package Name:com.dantefung.dp.observer
 * Date:2016-3-28����9:43:12
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.dp.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName:Observerable <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-28 ����9:43:12 <br/>
 * @author   Dante Fung
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public abstract class Observerable
{
	// ��һ��List������ö��������а󶨵��¼�������
	List<Observer> observers = new ArrayList<Observer>();
	// ����һ�����������ڴӸ�������ע��۲���
	public void registerObserver(Observer o)
	{
		observers.add(o);
	}
	
	// ����һ�����������ڴӸ�������ɾ���۲���
	public void removeObserver(Observer o)
	{
		observers.remove(o);
	}
	
	// ֪ͨ��������ע������й۲���
	public void notifyObservers(Object value)
	{
		// ����ע�ᵽ�ñ��۲����ϵ����й۲���
		for(Iterator it = observers.iterator();it.hasNext();)
		{
			Observer o = (Observer)it.next();
			// ��ʾÿ���۲��ߵ�update()����
			o.update(this, value);
		}
	}
}

