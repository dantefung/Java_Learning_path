/*
 * ʾ������Sample7_3: Integral������Ӧ���������
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Integral;

public class Sample7_3 
{
	public static void main(String[] args)
	{
		// ����Integral�����࣬���������غ���Func
		class Integ extends Integral
		{
			public double func(double x)
			{
				return 1.0/(1.0+25.0*x*x);
			}
		};

		// ���
		Integ integ = new Integ();
		double value = integ.getValueATrapezia(-1.0, 1.0, 0.0001, 0.000001);

		// ��ʾ���
		System.out.println(value);
	}
}
