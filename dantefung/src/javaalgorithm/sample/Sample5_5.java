/*
 * ʾ������Sample5_5: NLEquations�����ʵϵ����������ȫ������QR����
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Complex;
import javaalgorithm.algorithm.NLEquations;

public class Sample5_5 
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
		double[] a = {-30.0,10.5,-10.5,1.5,4.5,-7.5,1.5};
		if (nleq.getRootQr(n, a, xr, xi, 60, 0.000001))
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
