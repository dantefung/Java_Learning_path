/**
 * Project Name:dantefung
 * File Name:Command.java
 * Package Name:com.dantefung.dp.command
 * Date:2016-3-16����4:22:16
 * Copyright (c) 2016, fhlin0611@foxmail.com All Rights Reserved.
 *
*/

package com.dantefung.dp.command;
/**
 * ����ӿڱ�̡�������תԭ��
 * Command�ӿ��ﶨ����һ��process����������������ڷ�װ��������Ϊ���������
 * ����û�з�����----��Ϊ���ڻ��޷�ȷ�����������Ϊ��
 * 
 * 
 * ClassName:Command <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-16 ����4:22:16 <br/>
 * @author   Dante Fung
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface Command
{
	// �ӿ��ﶨ���process�������ڷ�װ��������Ϊ��
	void process(int[] target);
}

