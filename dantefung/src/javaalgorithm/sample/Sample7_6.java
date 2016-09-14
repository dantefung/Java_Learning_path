/*
 * ʾ������Sample7_6: Integral�ĸ��񵴺��������
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Integral;

public class Sample7_6 
{
	public static void main(String[] args)
	{
		// ����Integral�����࣬���������غ���Func
		class Integ extends Integral
		{
			public double func(double x)
			{
				return 0.0;
			}
		};

		// ����
	    double[] s = new double[2];
		double[] fa={0.0,1.0,0.0,-3.0};
	    double[] fb={6.2831852,1.0,-6.2831852,-3.0};
	    double a=0.0; 
		double b=6.2831852;
	    int m=30; 
		int n=4;

		// ���
		Integ integ = new Integ();
		double value = integ.getValuePart(a, b, m, n, fa, fb, s);

		// ��ʾ���
		System.out.println("s[0] = " + s[0]);
		System.out.println("s[1] = " + s[1]);
	}
}
