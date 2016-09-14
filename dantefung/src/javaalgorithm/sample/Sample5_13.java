/*
 * ʾ������Sample5_13: NLEquations���������Է�����һ��ʵ�������ؿ��巨
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.NLEquations;

public class Sample5_13
{
	public static void main(String[] args)
	{
		// ����NLEquation�����࣬���������غ���func
	 	class NLEq extends NLEquations
		{
			protected double func(double[] x)
			{ 
				double f,f1,f2,f3;
				int n=x.length;
				f1=3.0*x[0]+x[1]+2.0*x[2]*x[2]-3.0;
				f2=-3.0*x[0]+5.0*x[1]*x[1]+2.0*x[0]*x[2]-1.0;
				f3=25.0*x[0]*x[1]+20.0*x[2]+12.0;
				f=Math.sqrt(f1*f1+f2*f2+f3*f3);
				return(f);
			}
		}
		// ���
	 	NLEq nleq = new NLEq();
	    double[] x={0.0,0.0,0.0};
	    double b=2.0; 
		int m=10; 
		int n=3; 
		double eps=0.000001;
		nleq.getRootsetMonteCarlo(n, x, b, m, eps);
	    for (int i=0; i<=n-1; i++)
		{
			System.out.println(x[i]);
		}
	}
}
