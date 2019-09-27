package com.dantefung.enumtest;

public class EnumDemo {
	public static void main(String[] args) {
		WeekDay weekday = WeekDay.MON;
		WeekDay weekday2 = WeekDay.FRI;
		System.out.println(weekday2);
		System.out.println(weekday2.localValue());
		
	}


	//�����󷽷���ö��
	//��ζ���ö�ٵĹ��췽�����������ֶΣ�ȥ��װ�������Ϣ
	public enum WeekDay {//class   SUN ������   �������� ��   MON ����һ  ����������  �� TUE �����  ����������    �� THI ������  ������С�� �� FRI ������  ��������ת��    �� SAT  ������  ����������
		SUN("������")
		{//�����ڲ��࣬ΪWeekDay������
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
		private WeekDay(String value)  //Ĭ�ϵ��޲ι��캯������вι��캯��
		{
			this.value = value;
		}
		
		//���󷽷���if{...}else{...}װ��Ϊһ����������
		public abstract String localValue();
	}
	
}
