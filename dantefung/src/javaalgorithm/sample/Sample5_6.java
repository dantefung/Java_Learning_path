/*
 * ʾ������Sample5_6: NLEquations�����ʵϵ����������ȫ������ţ����ɽ��
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Complex;
import javaalgorithm.algorithm.NLEquations;

public class Sample5_6 
{
	public static void main(String[] args)
	{
		// ����NLEquation������
	 	class NLEq extends NLEquations
		{
		}
		// ���
	 	NLEq nleq = new NLEq();
		int n = 6;
		double[] xr = new double[n];
		double[] xi = new double[n];
		double[] a = {-20.0,7.0,-7.0,1.0,3.0,-5.0,1.0};
		if (nleq.getRootNewtonDownHill(n, a, xr, xi))
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
