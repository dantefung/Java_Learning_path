/*
 * ʾ������Sample3_5: Matrix��ĶԳ��������������
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;

public class Sample3_5 
{
	public static void main(String[] args) 
	{
		// ��������
		double[] mtxData6 = {
			5.0,7.0,6.0,5.0,
			7.0,10.0,8.0,7.0,
			6.0,8.0,10.0,9.0,
			5.0,7.0,9.0,10.0};

		// �������
		Matrix mtx6 = new Matrix(4, mtxData6);

		// �Գ��������������
		if (mtx6.invertSsgj())
		{
			System.out.println(mtx6);
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
