/*
 * ʾ������Sample7_9: Integral�İ������أ���˹�����
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Integral;

public class Sample7_9 
{
	public static void main(String[] args)
	{
		// ����Integral�����࣬���������غ���Func
		class Integ extends Integral
		{
			public double func(double x)
			{
				return x*x*Math.exp(-x*x);
			}
		};

		// ���
		Integ integ = new Integ();
		double value = integ.getValueHermiteGauss();

		// ��ʾ���
		System.out.println(value);
	}
}
