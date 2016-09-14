/*
 * ʾ������Sample3_14: Matrix���Լ���Գƾ���Ϊ�Գ����Խ���ĺ�˹�ɶ��±任��
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;

public class Sample3_14
{
	public static void main(String[] args) 
	{
		// ��������
		double[] mtxData15 = {
				10.0,1.0,2.0,3.0,4.0,
				1.0,9.0,-1.0,2.0,-3.0,
				2.0,-1.0,7.0,3.0,-5.0,
				3.0,2.0,3.0,12.0,-1.0,
				4.0,-3.0,-5.0,-1.0,15.0};

		// �������
		Matrix mtx15 = new Matrix(5, 5, mtxData15);

		// Լ���Գƾ���Ϊ�Գ����Խ���ĺ�˹�ɶ��±任��
		Matrix mtxQ1 = new Matrix();
		Matrix mtxT = new Matrix();
		double[] bArray = new double[mtx15.getNumColumns()];
		double[] cArray = new double[mtx15.getNumColumns()];
		if (mtx15.makeSymTri(mtxQ1, mtxT, bArray, cArray))
		{
			System.out.println("�˻�����Q=");
			System.out.println(mtxQ1);
			System.out.println("-------------------------------"); 
			System.out.println("���Խ���=");
			System.out.println(mtxT);
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
