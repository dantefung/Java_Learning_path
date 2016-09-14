/*
 * ʾ������Sample3_8: Matrix���������ȵ�ȫѡ��Ԫ��˹��ȥ��
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;

public class Sample3_8
{
	public static void main(String[] args) 
	{
		// ��������
		double[] mtxData9 = {
				3.0,-3.0,-2.0,4.0,
				5.0,-5.0,1.0,8.0,
				11.0,8.0,5.0,-7.0,
				5.0,-1.0,-3.0,-1.0};

		// �������
		Matrix mtx9 = new Matrix(4, mtxData9);

		// ������ȵ�ȫѡ��Ԫ��˹��ȥ��
		int rankValue = mtx9.computeRankGauss();
		System.out.println(new Integer(rankValue).toString());
	}
}
