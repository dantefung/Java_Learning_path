/*
 * ʾ������Sample3_19: Matrix�����ʵ�Գƾ�������ֵ�������������ſɱȹ��ط�
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;

public class Sample3_19 
{
	public static void main(String[] args) 
	{
		// ��������
		double[] mtxData20 = {
				10.0,1.0,2.0,3.0,4.0,
				1.0,9.0,-1.0,2.0,-3.0,
				2.0,-1.0,7.0,3.0,-5.0,
				3.0,2.0,3.0,12.0,-1.0,
				4.0,-3.0,-5.0,-1.0,15.0};

		// �������
		Matrix mtx20 = new Matrix(5, 5, mtxData20);

		// ��ʵ�Գƾ�������ֵ�������������ſɱȹ��ط�
		double[] valArray1 = new double[mtx20.getNumColumns()];
		Matrix mtxVV1 = new Matrix();
		if (mtx20.computeEvJacobi(valArray1, mtxVV1, 0.000001))
		{
			System.out.println("����ֵ=");
			String s = "";
			for (int i=0; i<mtx20.getNumColumns(); ++i)
			{
				s += valArray1[i] + ", ";
			}
			System.out.println(s);
			System.out.println("-------------------------------"); 
			System.out.println("��Ӧ����������=");
			for (int i=0; i<mtx20.getNumColumns(); ++i)
			{
				System.out.println(mtxVV1.toStringCol(i, ", "));
			}
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
