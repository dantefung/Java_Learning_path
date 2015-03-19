package com.dantefung.chainOfResponsibility.filter;

public class MsgProcessor {
	private String msg;
//	/**һϵ�еĴ������
//	 * �ŵ㣺
//	 * ������չ��˳��
//	 * 
//	 * ���д�������ļ��о͸������ˣ��������ļ�һ�ľ��С�
//	 * version2
//	 */
//	Filter[] filters ={new HTMLFilter(),new SensitiveFilter(),new FaceFilter()};
	
	FilterChain fc;
	
	/*��һ�����߼��Ͽ��ܻ������չ���ܷ������׵����չ�������װ������
	 * Ҫ�󣺹��ˣ����˵Ĺ����ܶ�̬��ָ����
	 * 
	 * ��Ȼ���µĴ�����չ�Բ��С�
	 * 
	 * version1
	 * */
//	public String process()
//	{
//		//process the html tag<>
////		String r = msg.replace('<','[');
////		r = r.replace('>',']');
//		//��ȻҲ���Բ�����ʽ��̵ķ�ʽ��
//		String r = msg.replace('<','[').replace('>',']');
//		//process the sensitive words
//		r = r.replace("����ҵ","��ҵ")
//		 .replace("����", "");
//		return r;
//	}

	public FilterChain getFc() {
		return fc;
	}

	public void setFc(FilterChain fc) {
		this.fc = fc;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
//	//version2
//	public String process()
//	{
//		String r =msg;
//		//��������
//		for(Filter f: filters)
//		{
//			r = f.doFilter(r);
//		}
//		return r;
//	}
	
	//version3
	public String process()
	{
		return fc.doFilter(msg);
	}
}
