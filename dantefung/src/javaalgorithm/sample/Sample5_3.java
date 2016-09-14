/*
 * ʾ������Sample5_3: NLEquations���������Է���һ��ʵ���İ��ؽ������
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.NLEquations;
import javaalgorithm.algorithm.Real;

public class Sample5_3 
{
	public static void main(String[] args)
	{
		// ����NLEquation�����࣬���������غ���func
	 	class NLEq extends NLEquations
		{
	 		protected double func(double x)
	 		{
			    double y = 6.0-x*x;
				return y;
	 		}
		}
		// ���
	 	NLEq nleq = new NLEq();
		Real x = new Real(0.0);
		if (nleq.getRootAitken(x, 60, 0.000001))
			System.out.println("��õĸ�Ϊ��" + x);
		else
			System.out.println("���ʧ��");
	}
}
