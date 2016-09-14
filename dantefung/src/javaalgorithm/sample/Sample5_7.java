/*
 * ʾ������Sample5_7: NLEquations�����ϵ����������ȫ������ţ����ɽ��
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Complex;
import javaalgorithm.algorithm.NLEquations;

public class Sample5_7 
{
	public static void main(String[] args)
	{
		// ����NLEquation������
	 	class NLEq extends NLEquations
		{
		}
		// ���
	 	NLEq nleq = new NLEq();
		int n = 5;
		double[] xr = new double[n];
		double[] xi = new double[n];
	    double[] ar={0.1,21.33,4.9,0.0,3.0,1.0};
	    double[] ai={-100.0,0.0,-19.0,-0.01,2.0,0.0};
		if (nleq.getRootNewtonDownHill(n, ar, ai,xr, xi))
		{
			for (int i=0; i<n; ++i)
			{
				Complex cpx = new Complex(xr[i], xi[i]);
				System.out.println(cpx);
			}
		}
		else
			System.out.println("���ʧ��");
	}
}
