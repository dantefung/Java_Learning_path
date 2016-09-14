/*
 * ʾ������Sample4_3: LEquations���ȫѡ��Ԫ��˹��Լ����ȥ��
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;
import javaalgorithm.algorithm.LEquations;

public class Sample4_3 
{
	public static void main(String[] args)
	{
		// ϵ����������
		double[] mtxDataCoef2 = {
				1.0,3.0,2.0,13.0,
				7.0,2.0,1.0,-2.0,
				9.0,15.0,3.0,-2.0,
				-2.0,-2.0,11.0,5.0};
		// ������������
		double[] mtxDataConst2 = {
				9.0,0.0,
				6.0,4.0,
				11.0,7.0,
				-2.0,-1.0};
		
		// ����ϵ������
		Matrix mtxCoef2 = new Matrix(4, mtxDataCoef2);
		// ���쳣������
		Matrix mtxConst2 = new Matrix(4, 2, mtxDataConst2);

		// �������Է�����
		LEquations leqs2 = new LEquations(mtxCoef2, mtxConst2);
		
		// ȫѡ��Ԫ��˹��Լ����ȥ��
		Matrix mtxResult2 = new Matrix();
		if (leqs2.GetRootsetGaussJordan(mtxResult2))
		{
			System.out.println(mtxResult2);
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
