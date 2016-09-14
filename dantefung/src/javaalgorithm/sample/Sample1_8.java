/*
 * ʾ������Sample1_8: ����Real�����ʵ�����ô�ֵ
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Real;

public class Sample1_8
{
	/**
	 * ��ͼ����a, b��ֵ, ���ܳɹ�
	 */
	public static void swap(Real a, Real b)
	{
		int c = a.intValue();
		a.setValue(b);
		b.setValue(c);
		
		System.out.println("\n�ں���swap��a, b��ֵ");
		System.out.println("a = " + a.intValue());
		System.out.println("b = " + b.intValue());
	}

	public static void main(String[] args) 
	{
		Real a = new Real(2);
		Real b = new Real(100);
		System.out.println("����ǰa, b��ֵ");
		System.out.println("a = " + a.intValue());
		System.out.println("b = " + b.intValue());

		// ��ͼ����a, b��ֵ
		swap(a, b);
		
		System.out.println("\n������a, b��ֵ");
		System.out.println("a = " + a.intValue());
		System.out.println("b = " + b.intValue());
	}
}
