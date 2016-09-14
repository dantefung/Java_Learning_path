/*
 * ʾ������Sample7_7: Integral�����õ£���˹�����
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Integral;

public class Sample7_7 
{
	public static void main(String[] args)
	{
		// ����Integral�����࣬���������غ���Func
		class Integ extends Integral
		{
			public double func(double x)
			{
				return x*x+Math.sin(x);
			}
		};

		// ���
		Integ integ = new Integ();
		double value = integ.getValueLegdGauss(2.5, 8.4, 0.00001);

		// ��ʾ���
		System.out.println(value);
	}
}
