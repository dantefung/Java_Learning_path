package com.dantefung.introspector;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * ΪʲôҪѧ��ʡ��
* �������ʱ������Ҫʹ��java�������������װ��������ݣ�
*ÿ�ζ�ʹ�÷��似����ɴ�����������鷳��
* ����sun��˾������һ��API��ר������java��������ԡ�
*
*ʲô��java��������Ժ����ԵĶ�д������
*
*��ʡ����javaBean���Ե����ַ�ʽ��
*ͨ��PropertyDescriptor�����Bean������
*ͨ��Introspector�������Bean�����BeanInfo��
*Ȼ��ͨ��BeanInfo����ȡ���Ե���������PropertyDescriptor����
*ͨ����������������Ϳ��Ի�ȡĳ�����Զ�Ӧ��getter/setter������
*Ȼ��ͨ�����������������Щ������
* **/
//ʹ����ʡAPI����bean���ԡ�
public class Demo1 {
	
	//�õ�bean����������
	@Test
	public void test1()throws Exception
	{
		System.out.println("-----------��ȡ���е����ԣ������Ӹ����Ǽ̳���������---------------");
	    BeanInfo info = Introspector.getBeanInfo(Person.class);		
	    PropertyDescriptor[] pds = info.getPropertyDescriptors();
	    for(PropertyDescriptor pd :pds)
	    {
	    	System.out.println(pd.getName());
	       /*���н����
	    	*ab
	    	*age
	    	*class
	    	*name
	    	*password
	    	*
	    	*�ɼ�,Beanӵ��ʲô������������getter��setter�����������ġ�
	    	*
	    	**/
	    }
	    //��ô���Ҿ����ȡ�Լ������ԣ�����Ҫ�Ӱְ�����̳��������ԡ�
	    System.out.println("-----------��ȡbean�Լ������е�����---------------");
	    BeanInfo info2 = Introspector.getBeanInfo(Person.class,Object.class/*Stop,ֹͣ��г�����������Ц����*/);
	    PropertyDescriptor[] pd2s = info2.getPropertyDescriptors();
	    for(PropertyDescriptor pd :pd2s)
	    {
	    	System.out.println(pd.getName());
	       /*���н����
	    	*ab
	    	*age
	    	*name
	    	*password
	    	*
	    	**/
	    }
	}
	    
	   
	  
	    //����bean��ָ�����ԣ�age
	    @Test
		public void test2() throws Exception
		{
	    	System.out.println("-------------����bean��ָ�����ԣ�age-----------");
	    	
	    	
	    	Person p = new Person();
	    	//p.setAge(45),��ͳ�ı�̡���д��ܣ�����ļ��������õ���API��û�õ�
	    	
	        PropertyDescriptor pd = new PropertyDescriptor("age",Person.class);
	        Method method = pd.getWriteMethod();//public void setAge(int age) 
	        method.invoke(p, 45/*�Զ�װ��*/);
	        
	        System.out.println(p.getAge());
	        
	        //��ȡ���Ե�ֵ
	        method = pd.getReadMethod();// public getAge()
	        System.out.println(method.invoke(p,null));

		}
	    
	    //�߼������ͬ����ȡ��ǰ���������Ե����͡�
	    @Test
	    public void test3() throws Exception
	    {
	    	Person p = new Person();
	    	
	    	PropertyDescriptor pd = new PropertyDescriptor("age",Person.class);
	    	System.out.println(pd.getPropertyType());
	    }
	

}
