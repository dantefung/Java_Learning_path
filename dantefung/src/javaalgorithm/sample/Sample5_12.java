/*
 * ʾ������Sample5_12: NLEquations�����ʵ�����򸴺�������һ�����������ؿ��巨
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Real;
import javaalgorithm.algorithm.Complex;
import javaalgorithm.algorithm.NLEquations;

public class Sample5_12 
{
	public static void main(String[] args)
	{
		// ����NLEquation�����࣬���������غ���func
	 	class NLEq extends NLEquations
		{
	 		protected double func(double x, double y)
			{
				double u=x*x-y*y-6.0*x+13.0;
				double v=2.0*x*y-6.0*y;
				double z=Math.sqrt(u*u+v*v);
				return z;
			}
		}
		// ���
	 	NLEq nleq = new NLEq();
	    Real x=new Real(0.5); 
		Real y=new Real(0.5); 
		double b=1.0; 
		int m=10;
		double eps=0.000001;
		nleq.getRootMonteCarlo(x, y, b, m, eps);
		System.out.println(new Complex(x.doubleValue(),y.doubleValue()));
	}
}
