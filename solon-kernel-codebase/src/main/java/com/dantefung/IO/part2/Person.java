package com.dantefung.IO.part2;

import java.io.Serializable;

/*
 *NotSerialiableException��δ���л��쳣
 *
 * ��ͨ��ʵ��java.io.Serializable �ӿ������������л����ܡ�Ϊʵ�ִ˽ӿڵ��ཫ�޷�ʹ���κ�״̬���л����߷����л���
 * �ýӿھ�Ȼû���κη���������������û�з����Ľӿڱ���Ϊ��ǽӿڡ�
 * 
 * java.io.InvalidClassException:
 * 
 * 
 * Ϊʲô���������أ�
 *      personʵ�������л��ӿڣ���ô������ҲӦ����һ�����ֵ��
 *      ������ֵ������100.
 *      ��ʼ��ʱ��
 *      Person.class -- id=100
 *      write���ݣ� oos.txt -- id=100
 *      read���ݣ�  oos.txt -- id=100
 *      
 *      ���ڣ�
 *      Persom.class -- id=200
 *      write���ݣ� oos.txt -- id=100
 *      read���ݣ� oos.txt -- id=100
 *      
 *      ������ʵ�ʿ����У����ܻ���Ҫʹ����ǰд�������ݣ���������д�롣��ô�죿
 *      ����һ��ԭ������Ϊ�����ǵ�idֵ��ƥ�䡣
 *      
 *      ÿ���޸�java�ļ������ݵ�ʱ��class�ļ���idֵ���ᷢ���ı䡣
 *      ����ȡ�ļ���ʱ�򣬻��class�ļ��е�idֵ��java�ļ�����һ���̶���ֵ�����������޸��ļ���ʱ�����idֵ���ᷢ���ı���
 *      �����أ�������а취�������idֵ��java�ļ�����һ���̶���ֵ�����������޸��ļ���ʱ�����idֵ���ᷢ���ı���
 *      ���ᡣ���ڹؼ���������ܹ�֪�����idֵ��α�ʾ�أ�
 *      ���õ��ģ��㲻�ü�ס��Ҳû��ϵ�������꼴�ɡ�
 *      ���ѵ�û�п�����ɫ��������
 *      
 *      ����Ҫ֪�����ǣ�
 *          ������ʵ�������л��ӿڵ�ʱ��Ҫ������ɫ���������⣬�Ϳ����Զ�����һ�����л�idֵ��
 *          ���Ҳ������ֵ�Ժ����Ƕ�������κθĶ�������ȡ��ǰ��������û������ġ�
 * 
 * 
 * ע�⣺
 *     ��һ�����п����кܶ�ĳ�Ա��������Щ�Ҳ���������л������ʸ���ô�죿
 *     ʹ��transient�ؼ�����������Ҫ���л��ĳ�Ա����
 */
public class Person implements Serializable{

	/**
	 * ͨ�������ɫ���������ɵġ�
	 */
	private static final long serialVersionUID = 7501560121587131792L;

	private String name;
	
	private transient int age;
	
	public Person()
	{
		super();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
}
