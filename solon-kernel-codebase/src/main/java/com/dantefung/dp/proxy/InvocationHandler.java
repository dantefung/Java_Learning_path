package com.dantefung.dp.proxy;

import java.lang.reflect.Method;
//�����������������ʵ�������û�����д���ڴ������档
public interface InvocationHandler {
	public void invoke(Object o, Method m);
}
