/**
 * Project Name:dantefung
 * File Name:NameObserver.java
 * Package Name:com.dantefung.dp.observer
 * Date:2016-3-28����9:57:34
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.dp.observer;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * ���ƹ۲���
 * ClassName:NameObserver <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-28 ����9:57:34 <br/>
 * @author   Dante Fung
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class NameObserver implements Observer
{
	
	// �۲��߱���ʵ�ֵ�update����
	@Override
	public void update(Observerable o, Object arg)
	{
		if(arg instanceof String)
		{
			// ��Ʒ���Ƹı�ֵ��name��
			String name = (String)arg;
			// ����һ��Jframe��������ʾ���۲�����״̬�ı�
		/*	JFrame f = new JFrame("�۲���");
			JLabel l = new JLabel("���Ƹı�Ϊ��" + name);
			f.add(l);
			f.pack();
			f.setVisible(true);*/
			System.out.println("���ƹ۲��ߣ�"+ o + "��Ʒ�����Ѿ��ı�Ϊ��" + name);
		}
	}

}

