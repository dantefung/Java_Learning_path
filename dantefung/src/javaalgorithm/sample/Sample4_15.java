/*
 * ʾ������Sample4_15: LEquations������������С��������Ĺ����淨
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;
import javaalgorithm.algorithm.LEquations;

public class Sample4_15 
{
	public static void main(String[] args)
	{
		// ϵ����������
		double[] mtxDataCoef14 = {
				1.0,1.0,-1.0,
				2.0,1.0,0.0,
				1.0,-1.0,0.0,
				-1.0,2.0,1.0};
		// ������������
		double[] mtxDataConst14 = {
				2.0,
				-3.0,
				1.0,
				4.0};
		
		// ����ϵ������
		Matrix mtxCoef14 = new Matrix(4, 3, mtxDataCoef14);
		// ���쳣������
		Matrix mtxConst14 = new Matrix(4, 1, mtxDataConst14);

		// �������Է�����
		LEquations leqs14 = new LEquations(mtxCoef14, mtxConst14);
		
		// ���������С��������Ĺ����淨
		Matrix mtxResult14 = new Matrix();
		Matrix mtxResultAP = new Matrix();
		Matrix mtxResultU = new Matrix();
		Matrix mtxResultV = new Matrix();
		if (leqs14.getRootsetGinv(mtxResult14, mtxResultAP, mtxResultU, mtxResultV, 0.0001))
		{
			System.out.println(mtxResult14);
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
