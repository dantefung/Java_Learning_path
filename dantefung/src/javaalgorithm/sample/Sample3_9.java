/*
 * ʾ������Sample3_9: Matrix��ĶԳ��������������˹���ֽ�������ʽ����ֵ
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Real;
import javaalgorithm.algorithm.Matrix;

public class Sample3_9
{
	public static void main(String[] args) 
	{
		// ��������
		double[] mtxData10 = {
				5.0,7.0,6.0,5.0,
				7.0,10.0,8.0,7.0,
				6.0,8.0,10.0,9.0,
				5.0,7.0,9.0,10.0};

		// �������
		Matrix mtx10 = new Matrix(4, mtxData10);

		// �Գ��������������˹���ֽ�������ʽ����ֵ
		Real detRealValue = new Real();
		if (mtx10.computeDetCholesky(detRealValue))
		{
			System.out.println("����ʽ=" + detRealValue); 
			System.out.println("�ֽ��������Ǿ���="); 
			System.out.println(mtx10); 
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
