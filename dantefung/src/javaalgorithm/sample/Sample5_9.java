/*
 * ʾ������Sample5_9: NLEquations���������Է�����һ��ʵ������ţ�ٷ�
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.NLEquations;

public class Sample5_9
{
	public static void main(String[] args)
	{
		// ����NLEquation�����࣬���������غ���func
	 	class NLEq extends NLEquations
		{
			protected double func(double[] x, double[] y)
			{
				y[0]=x[0]*x[0]+x[1]*x[1]+x[2]*x[2]-1.0;
				y[1]=2.0*x[0]*x[0]+x[1]*x[1]-4.0*x[2];
				y[2]=3.0*x[0]*x[0]-4.0*x[1]+x[2]*x[2];

				return 0.0;
			}
		}
		// ���
	 	NLEq nleq = new NLEq();
	    double[] x={1.0,1.0,1.0};
	    double t=0.1; 
		double h=0.1;
	    double eps = 0.0000001;
		if (nleq.getRootsetNewton(3, x, t, h, 100, eps))
		{
			for (int i=0; i<3; ++i)
			{
				System.out.println(x[i]);
			}
		}
		else
			System.out.println("���ʧ��");
	}
}
