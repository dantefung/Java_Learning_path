/**
 * Project Name:dantefung
 * File Name:AbstractNoodle.java
 * Package Name:com.dantefung.dp.bridge
 * Date:2016-3-28����8:49:14
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.dp.bridge;
/**
 * ���ų����ṩ��һ��AbstractNoodle�����࣬�ó����ཫ�����һ��Peppery���ԣ�
 * �����Դ����˸���������ζ��񡣳���ͨ��AbstractNoodle���һ��Peppery���󣬴Ӷ���������������ζ���
 * ���ά���ϵı仯����AbstractNoodle����Ҳ���԰����ܶ�ʵ���࣬��ͬʵ����������������ڲ��Ϸ�����ά���ϵı仯��
 * ClassName:AbstractNoodle <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-28 ����8:49:14 <br/>
 * @author   Dante Fung
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public abstract class AbstractNoodle
{
	// ���һ��Peppery���������ڽ���ά�ȵı仯��������
	protected Peppery style;
	// ÿ��Noodle�������һ��Peppery����
	public AbstractNoodle(Peppery style)
	{
		this.style = style;
	}
	/*
	 * ��������ĳ�����ʾ�������AbstractNoodleʵ��������һ��Pepperyʵ����ϣ�
	 * ��ͬ��AbstractNoodleʵ���벻ͬ��Pepperyʵ����ϣ��Ϳ������ζ��񡢲��Ϸ������ά���ϱ仯������ˡ�
	 * 
	 * �ɴ˿ɼ���AbstractNoodle��������Կ�����һ�����������������Žӡ������Ĳ��Ϸ��ĸı����ζ���ı仯��
	 * ʹ�������������Եõ��ް󶨵����䡣
	 */
	
	public abstract void eat();
}

