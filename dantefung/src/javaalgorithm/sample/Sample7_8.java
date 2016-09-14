/*
 * ʾ������Sample7_8: Integral�����Ƕ�����˹�����
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Integral;

public class Sample7_8 
{
	public static void main(String[] args)
	{
		// ����Integral�����࣬���������غ���Func
		class Integ extends Integral
		{
			public double func(double x)
			{
				return x*Math.exp(-x);
			}
		};

		// ���
		Integ integ = new Integ();
		double value = integ.getValueLgreGauss();

		// ��ʾ���
		System.out.println(value);
	}
}
