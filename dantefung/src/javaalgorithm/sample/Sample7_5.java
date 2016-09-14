/*
 * ʾ������Sample7_5: Integral�ļ���һά���ֵ�����ʽ��
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Integral;

public class Sample7_5 
{
	public static void main(String[] args)
	{
		// ����Integral�����࣬���������غ���Func
		class Integ extends Integral
		{
			public double func(double x)
			{
				return Math.exp(-x*x);
			}
		};

		// ���
		Integ integ = new Integ();
		double value = integ.getValuePq(0.0, 4.3, 0.00001);

		// ��ʾ���
		System.out.println(value);
	}
}
