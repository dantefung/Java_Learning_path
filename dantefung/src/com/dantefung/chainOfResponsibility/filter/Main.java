package com.dantefung.chainOfResponsibility.filter;

/**
 * @autor DanteFung
 * 
 * ����д���У���д���Գ�����д��ʵ�֡�
 * �����ޱ�̡�������һ��ԭ�򣬾�����д���ԣ���д�����֮�󣬾�֪���Լ����࣬��Ҫʵ����Щ������
 * 
 * Filter   
 * */
public class Main {
	
	public static void main(String[] args){
		String msg = "��Һ�:��,<script>,���У�����ҵ�������ڿ�û�о�����Ϊ��������һ�";
		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg); 
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter())
		  .addFilter(new SensitiveFilter());
		
		FilterChain fc2 = new FilterChain();
		fc2.addFilter(new FaceFilter());
		fc2.addFilter(fc);
		mp.setFc(fc);
		String result = mp.process();
		System.out.println(result);
	}

}
