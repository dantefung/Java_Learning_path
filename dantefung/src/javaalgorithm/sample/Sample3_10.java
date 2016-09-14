/*
 * ʾ������Sample3_10: Matrix��ľ�������Ƿֽ�
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;

public class Sample3_10
{
	public static void main(String[] args) 
	{
		// ��������
		double[] mtxData11 = {
				2.0,4.0,4.0,2.0,
				3.0,3.0,12.0,6.0,
				2.0,4.0,-1.0,2.0,
				4.0,2.0,1.0,1.0};

		// �������
		Matrix mtx11 = new Matrix(4, mtxData11);

		// ��������Ƿֽ�
		Matrix mtxL = new Matrix();
		Matrix mtxU = new Matrix();
		if (mtx11.splitLU(mtxL, mtxU))
		{
			System.out.println("�ֽ���L����=");
			System.out.println(mtxL);
			System.out.println("-------------------------------"); 
			System.out.println("�ֽ���U����=");
			System.out.println(mtxU);
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
