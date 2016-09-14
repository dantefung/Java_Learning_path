/*
 * ʾ������Sample3_15: Matrix���ʵ�Գ����Խ����ȫ������ֵ�����������ļ���
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;

public class Sample3_15 
{
	public static void main(String[] args) 
	{
		// ��������
		double[] mtxData16 = {
				10.0,1.0,2.0,3.0,4.0,
				1.0,9.0,-1.0,2.0,-3.0,
				2.0,-1.0,7.0,3.0,-5.0,
				3.0,2.0,3.0,12.0,-1.0,
				4.0,-3.0,-5.0,-1.0,15.0};

		// �������
		Matrix mtx16 = new Matrix(5, 5, mtxData16);

		// ʵ�Գ����Խ����ȫ������ֵ�����������ļ���
		Matrix mtxQ2 = new Matrix();
		Matrix mtxT2 = new Matrix();
		double[] bArray2 = new double[mtx16.getNumColumns()];
		double[] cArray2 = new double[mtx16.getNumColumns()];
		// 1: Լ���Գƾ���Ϊ�Գ����Խ���: ��˹�ɶ��±任��
		if (mtx16.makeSymTri(mtxQ2, mtxT2, bArray2, cArray2))
		{
			// 2: ����ȫ������ֵ����������
			if (mtx16.computeEvSymTri(bArray2, cArray2, mtxQ2, 60, 0.0001))
			{
				System.out.println("����ֵ=");
				String s = "";
				for (int i=0; i<mtxQ2.getNumColumns(); ++i)
				{
					s += new Float(bArray2[i]).toString() + ", ";
				}
				System.out.println(s);
				System.out.println("-------------------------------"); 
				System.out.println("��Ӧ����������=");
				for (int i=0; i<mtxQ2.getNumColumns(); ++i)
				{
					System.out.println(mtxQ2.toStringCol(i, ", "));
				}
			}
			else
			{
				System.out.println("ʧ��");
			}
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
