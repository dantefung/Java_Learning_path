/*
 * ʾ������Sample3_11: Matrix���һ��ʵ�����QR�ֽ�
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;

public class Sample3_11 
{
	public static void main(String[] args) 
	{
		// ��������
		double[] mtxData12 = {
				1.0,1.0,-1.0,
				2.0,1.0,0.0,
				1.0,-1.0,0.0,
				-1.0,2.0,1.0};

		// �������
		Matrix mtx12 = new Matrix(4, 3, mtxData12);

		// һ��ʵ�����QR�ֽ�
		Matrix mtxQ = new Matrix();
		if (mtx12.splitQR(mtxQ))
		{
			System.out.println("�ֽ���Q����=");
			System.out.println(mtxQ);
			System.out.println("-------------------------------"); 
			System.out.println("�ֽ���R����=");
			System.out.println(mtx12);
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
