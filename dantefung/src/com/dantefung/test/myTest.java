package com.dantefung.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dantefung.enumtest.EnumDemo.WeekDay;

public class myTest {
	//��ʼ����Դ
/*     @Before
	public void before()
	{
	    System.out.println("before");	
	}
	*/
	@BeforeClass
	public static void before()
	{
	    System.out.println("before");	
	}
	
	
	@Test
	public void test()
	{
	    print(WeekDay.SUN);	
	}
	
	@Test
	public void test2()
	{
	    print(WeekDay.MON);	
	}
	
	
	public void print(WeekDay w)//SUN MON TUE THI FOR FRI SAT
	{
		String value = w.localValue();
		System.out.println(value);
	}
	
/*	@After
	public void after()
	{
		System.out.println("after");
	}*/
	
	@AfterClass
	public static void after()
	{
		System.out.println("after");
	}
	
}	
/*	//�����󷽷���ö��
	//��ζ���ö�ٵĹ��췽�����������ֶΣ�ȥ��װ�������Ϣ
      enum WeekDay {//class   SUN ������   �������� ��   MON ����һ  ����������  �� TUE �����  ����������    �� THI ������  ������С�� �� FRI ������  ��������ת��    �� SAT  ������  ����������
		SUN("������")
		{//�����ڲ��࣬ΪWeekD	ay������
			   public String localValue()
			   {
				    return "��������";
			   }
		}
		, MON("����һ")
		{
			public String localValue()
			{
				return "����������";
			}
		}

		, TUE("���ڶ�")
		{
			public String localValue()
			{
				return "����������";
			}
		}
		, THI("������")
		{
			public String localValue()
			{
				return "������С��";
			}
		}
		, FRI("������")
		{
			public String localValue()
			{
				return "��������ת��";
			}
		}
		, SAT("������")//object ͨ�����췽��ʵ��������
		{
			public String localValue()
			{
				return "����������";
			}
		};
		
		private String value;//��װÿ�������Ӧ����������
		//����WeekDay�Ĺ��췽��
		private WeekDay(String value)  //Ĭ�ϵ���͹��캯������вι��캯��
		{
			this.value = value;
		}
		
		//���󷽷���if{...}else{...}װ��Ϊһ����������
		public abstract String localValue();
	}*/
