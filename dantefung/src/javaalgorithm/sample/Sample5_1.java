/*
 * ʾ������Sample5_1: NLEquations���������Է���ʵ���ĶԷַ�
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.NLEquations;

public class Sample5_1 
{
	public static void main(String[] args)
	{
		// ����NLEquation�����࣬���������غ���func
	 	class NLEq extends NLEquations
		{
	 		protected double func(double x)
	 		{
				double z = (((((x-5.0)*x+3.0)*x+1.0)*x-7.0)*x+7.0)*x-20.0;
				return z;
	 		}
		}
		// ���
	 	NLEq nleq = new NLEq();
		double[] x = new double[6];
		int n = nleq.getRootBisect(6, x, -2, 5, 0.2, 0.0001);
		System.out.println("�������" + n + "������");
	    for (int i=0; i<=n-1; i++)
		{
			System.out.println(x[i]);
		}
	}
}
