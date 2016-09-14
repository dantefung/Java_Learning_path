/*
 * ʾ������Sample5_11: NLEquations���������Է���һ��ʵ�������ؿ��巨
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Real;
import javaalgorithm.algorithm.NLEquations;

public class Sample5_11 
{
	public static void main(String[] args)
	{
		// ����NLEquation�����࣬���������غ���func
	 	class NLEq extends NLEquations
		{
			protected double func(double x)
			{
				double z = Math.exp(-x*x*x)-Math.sin(x)/Math.cos(x)+800.0;
				return z;
			}
		}
		// ���
	 	NLEq nleq = new NLEq();
	    Real x=new Real(0.5); 
		double b=1.0; 
		int m=10;
		double eps=0.000001;
		nleq.getRootMonteCarlo(x, b, m, eps);
		System.out.println(x);
	}
}
