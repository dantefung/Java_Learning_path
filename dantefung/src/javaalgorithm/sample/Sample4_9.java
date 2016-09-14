/*
 * ʾ������Sample4_9: LEquations������Գ������������ƽ������
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;
import javaalgorithm.algorithm.LEquations;

public class Sample4_9 
{
	public static void main(String[] args)
	{
		// ϵ����������
		double[] mtxDataCoef8 = {
				5.0,7.0,6.0,5.0,
				7.0,10.0,8.0,7.0,
				6.0,8.0,10.0,9.0,
				5.0,7.0,9.0,10.0};
		// ������������
		double[] mtxDataConst8 = {
				23.0,92.0,
				32.0,128.0,
				33.0,132.0,
				31.0,124.0};
		
		// ����ϵ������
		Matrix mtxCoef8 = new Matrix(4, mtxDataCoef8);
		// ���쳣������
		Matrix mtxConst8 = new Matrix(4, 2, mtxDataConst8);

		// �������Է�����
		LEquations leqs8 = new LEquations(mtxCoef8, mtxConst8);
		
		// ���Գ������������ƽ������
		Matrix mtxResult8 = new Matrix();
		if (leqs8.getRootsetCholesky(mtxResult8))
		{
			System.out.println(mtxResult8);
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
