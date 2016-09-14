/*
 * ʾ������Sample3_12: Matrix���һ��ʵ���������ֵ�ֽ�
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;

public class Sample3_12
{
	public static void main(String[] args) 
	{
		// ��������
		double[] mtxData13 = {
				1.0,1.0,-1.0,
				2.0,1.0,0.0,
				1.0,-1.0,0.0,
				-1.0,2.0,1.0};

		// �������
		Matrix mtx13 = new Matrix(4, 3, mtxData13);

		// һ��ʵ���������ֵ�ֽ�
		System.out.println("һ��ʵ���������ֵ�ֽ�");
		Matrix mtxU1 = new Matrix();
		Matrix mtxV = new Matrix();
		if (mtx13.splitUV(mtxU1, mtxV, 0.0001))
		{
			System.out.println("�ֽ���U����=");
			System.out.println(mtxU1);
			System.out.println("-------------------------------"); 
			System.out.println("�ֽ���V����=");
			System.out.println(mtxV);
			System.out.println("-------------------------------"); 
			System.out.println("�ֽ���A����=");
			System.out.println(mtx13);
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
