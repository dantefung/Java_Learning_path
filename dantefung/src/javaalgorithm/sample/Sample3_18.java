/*
 * ʾ������Sample3_18: Matrix�����ʵ�Գƾ�������ֵ�������������ſɱȷ�
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;

public class Sample3_18 
{
	public static void main(String[] args) 
	{
		// ��������
		double[] mtxData19 = {
				2.0,-1.0,0.0,
				-1.0,2.0,-1.0,
				0.0,-1.0,2.0};

		// �������
		Matrix mtx19 = new Matrix(3, 3, mtxData19);

		// ��ʵ�Գƾ�������ֵ�������������ſɱȷ�
		double[] valArray = new double[mtx19.getNumColumns()];
		Matrix mtxVV = new Matrix();
		if (mtx19.computeEvJacobi(valArray, mtxVV, 100, 0.0001))
		{
			System.out.println("����ֵ=");
			String s = "";
			for (int i=0; i<mtx19.getNumColumns(); ++i)
			{
				s += valArray[i] + ", ";
			}
			System.out.println(s);
			System.out.println("-------------------------------"); 
			System.out.println("��Ӧ����������=");
			for (int i=0; i<mtx19.getNumColumns(); ++i)
			{
				System.out.println(mtxVV.toStringCol(i, ", "));
			}
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
