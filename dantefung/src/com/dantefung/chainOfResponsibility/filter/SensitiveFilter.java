package com.dantefung.chainOfResponsibility.filter;

public class SensitiveFilter implements Filter {

	@Override
	public String doFilter(String str) 
	{
		String r = str.replace("����ҵ","��ҵ").replace("����", "");
		return r;
	}

}
