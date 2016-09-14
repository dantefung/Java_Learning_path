/*
 * ʾ������Sample4_14: LEquations������������С��������ĺ�˹�ɶ��±任��
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;
import javaalgorithm.algorithm.LEquations;

public class Sample4_14 
{
	public static void main(String[] args)
	{
		// ϵ����������
		double[] mtxDataCoef13 = {
				1.0,1.0,-1.0,
				2.0,1.0,0.0,
				1.0,-1.0,0.0,
				-1.0,2.0,1.0};
		// ������������
		double[] mtxDataConst13 = {
				2.0,
				-3.0,
				1.0,
				4.0};
		
		// ����ϵ������
		Matrix mtxCoef13 = new Matrix(4, 3, mtxDataCoef13);
		// ���쳣������
		Matrix mtxConst13 = new Matrix(4, 1, mtxDataConst13);

		// �������Է�����
		LEquations leqs13 = new LEquations(mtxCoef13, mtxConst13);
		
		// ���������С��������ĺ�˹�ɶ��±任��
		Matrix mtxResult13 = new Matrix();
		Matrix mtxResultQ = new Matrix();
		Matrix mtxResultR = new Matrix();
		if (leqs13.getRootsetMqr(mtxResult13, mtxResultQ, mtxResultR))
		{
			System.out.println(mtxResult13);
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
