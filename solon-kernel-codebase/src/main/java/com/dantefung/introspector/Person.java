package com.dantefung.introspector;

public class Person {//javabean   ��������̣��û�һ�������ύ���������Ǿ�Ҫ�ö�����з�װ��

	/**
	 * �ֶ�ʲôʱ����ܳ�Ϊ�����أ�
	 * ֻ������ֶζ����ṩ��getter��setter�ķ�����
	 * ���ǲ��ܳ�֮Ϊ���ԡ�һ��Bean��������������getter��setter��������
	 * */
	private String name;  //�ֶΣ���Ա������
	private String password;//�ֶΣ���Ա������
	private int age;//�ֶΣ���Ա������
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/**�ʣ����Bean��û��Ab���ԣ�
	 * �С�
	 *��ΪBeanӵ��ʲô������������getter��setter�����������ġ�
	 *���������ֶξ����ġ�
	 *
	 * �ʣ����Bean�ж��ٸ����ԣ�
	 * ��5����
	 * ����ÿ���඼��Object������࣬��˼̳���getClass()����
	 * getClass������getPassword()/setPassword()��getName()/setName()��getAge()/setAge()��getAb()��
	 * ����Щ���������Կ�����5�����ԣ�Class��Password��Name��Age��Ab
	 * **/
	public String getAb(){
		return null;
	}
	
}
