package com.dantefung.chainOfResponsibility.filter;

import java.util.ArrayList;
import java.util.List;

/**Tomcat���ǽӿڡ�
 * 
 * �����࣬������Ƭ˼�롣AOP��--dantefung�Լ��ĸ���
 * 
 * @author DanteFung
 *
 */
public class FilterChain implements Filter {
	List<Filter> filters = new ArrayList<Filter>();
	
	public FilterChain addFilter(Filter f)
	{
		this.filters.add(f);
		return this;//����д�ĺô����ǿ���ʵ����ʽ��̡�
	}
	
	//��Filter��������һ�����壬��ô�������Ҳ��һ�����Filter����Ҳ��doFilter����������
	public String doFilter(String str)
	{
		String r =str;
		for(Filter f: filters)
		{
			r = f.doFilter(r);
		}
		return r;
	}
}
