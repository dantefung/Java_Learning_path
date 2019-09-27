package com.dantefung.reflecttest;
/**
 * @author dantefung 
 * @since 2014-11-1 
 * @version 1.0
 * study by itcast's course
 * take note 
 * */
public class ReflectPoint {
//    int x;//�˴�Ĭ��Ϊ˽�еĳ�Ա�������ֶΣ����ԣ�,��ʱ����getDclaredField(pt1)���Է���
    private int x;//��ʱ��ҪgetDclaredField(pt1)��fieldX.setAccessible(true);����Ϊ���Է���
	public int y;//�˴���ʾ�����������Ա�������ֶΣ����ԣ��ǹ��еģ����getField��pt1�����Ի�ȡ��y��ֵ
	public String str1 = "ball";
	public String str2 = "basketball";
	public String str3 = "itcast";
	public ReflectPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	/*����Դ�������Զ����ɵ�*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	/*����Դ�������Զ����ɵ�*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReflectPoint other = (ReflectPoint) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	/*����Դ�������Զ����ɵ�*/
	@Override
	public String toString() {
		return "ReflectPoint [str1=" + str1 + ", str2=" + str2 + ", str3="
				+ str3 + "]";
	}

	
	

}
