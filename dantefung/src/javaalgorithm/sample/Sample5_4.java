/*
 * ʾ������Sample5_4: NLEquations���������Է���һ��ʵ��������ʽ�ⷨ
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.NLEquations;
import javaalgorithm.algorithm.Real;

public class Sample5_4 
{
	public static void main(String[] args)
	{
		// ����NLEquation�����࣬���������غ���func
	 	class NLEq extends NLEquations
		{
	 		protected double func(double x)
	 		{
			    double y = x*x*(x-1.0)-1.0;
				return y;
	 		}
		}
		// ���
	 	NLEq nleq = new NLEq();
		Real x = new Real(1.0);
		if (nleq.getRootPq(x, 0.000001))
			System.out.println("��õĸ�Ϊ��" + x);
		else
			System.out.println("���ʧ��");
	}
}
