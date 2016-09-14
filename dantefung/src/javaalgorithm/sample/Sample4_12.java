/*
 * ʾ������Sample4_12: LEquations��ĸ�˹�����¶�������
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;
import javaalgorithm.algorithm.LEquations;

public class Sample4_12 
{
	public static void main(String[] args)
	{
		// ϵ����������
		double[] mtxDataCoef11 = {
				7.0,2.0,1.0,-2.0,
				9.0,15.0,3.0,-2.0,
				-2.0,-2.0,11.0,5.0,
				1.0,3.0,2.0,13.0};
		// ������������
		double[] mtxDataConst11 = {
				4.0,
				7.0,
				-1.0,
				0.0};
		
		// ����ϵ������
		Matrix mtxCoef11 = new Matrix(4, mtxDataCoef11);
		// ���쳣������
		Matrix mtxConst11 = new Matrix(4, 1, mtxDataConst11);

		// �������Է�����
		LEquations leqs11 = new LEquations(mtxCoef11, mtxConst11);
		
		// ��˹�����¶�������
		Matrix mtxResult11 = new Matrix();
		if (leqs11.getRootsetGaussSeidel(mtxResult11, 0.0001))
		{
			System.out.println(mtxResult11);
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
