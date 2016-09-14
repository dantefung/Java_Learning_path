/*
 * ʾ������Sample7_1: Integral�ı䲽�����������
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Integral;

public class Sample7_1 
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
		double value = integ.getValueTrapezia(0.0, 1.0, 0.00001);

		// ��ʾ���
		System.out.println(value);
	}
}
