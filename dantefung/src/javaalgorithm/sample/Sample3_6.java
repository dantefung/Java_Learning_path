/*
 * ʾ������Sample3_6: Matrix����в����Ⱦ�������İ����ط���
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;

public class Sample3_6
{
	public static void main(String[] args) 
	{
		// ��������
		double[] mtxData7 = {
				10, 5, 4, 3, 2, 1,
				-1,10, 5, 4, 3, 2,
				-2,-1,10, 5, 4, 3,
				-3,-2,-1,10, 5, 4,
				-4,-3,-2,-1,10, 5,
				-5,-4,-3,-2,-1,10};

		// �������
		Matrix mtx7 = new Matrix(6, mtxData7);

		// �в����Ⱦ�������İ����ط���
		if (mtx7.invertTrench())
		{
			System.out.println(mtx7);
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
