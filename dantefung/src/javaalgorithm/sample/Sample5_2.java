/*
 * ʾ������Sample5_2: NLEquations���������Է���һ��ʵ����ţ�ٷ�
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Real;
import javaalgorithm.algorithm.NLEquations;

public class Sample5_2 
{
	public static void main(String[] args)
	{
		// ����NLEquation�����࣬���������غ���func
	 	class NLEq extends NLEquations
		{
			protected void func(double x, double[] y)
			{
				y[0]=x*x*(x-1.0)-1.0;
				y[1]=3.0*x*x-2.0*x;
			}
		}
		// ���
	 	NLEq nleq = new NLEq();
		Real x = new Real(1.5);
		if (nleq.getRootNewton(x, 60, 0.000001))
			System.out.println("��õĸ�Ϊ��" + x);
		else
			System.out.println("���ʧ��");
	}
}
