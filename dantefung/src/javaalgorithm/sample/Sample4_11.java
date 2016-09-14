/*
 * ʾ������Sample4_11: LEquations�������в����ȷ����������ѷ����
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;
import javaalgorithm.algorithm.LEquations;

public class Sample4_11 
{
	public static void main(String[] args)
	{
		// ϵ����������
		double[] mtxDataCoef10 = {
				6.0,5.0,4.0,3.0,2.0,1.0,
				5.0,6.0,5.0,4.0,3.0,2.0,
				4.0,5.0,6.0,5.0,4.0,3.0,
				3.0,4.0,5.0,6.0,5.0,4.0,
				2.0,3.0,4.0,5.0,6.0,5.0,
				1.0,2.0,3.0,4.0,5.0,6.0};
		// ������������
		double[] mtxDataConst10 = {
				11.0,
				9.0,
				9.0,
				9.0,
				13.0,
				17.0};
		
		// ����ϵ������
		Matrix mtxCoef10 = new Matrix(6, mtxDataCoef10);
		// ���쳣������
		Matrix mtxConst10 = new Matrix(6, 1, mtxDataConst10);

		// �������Է�����
		LEquations leqs10 = new LEquations(mtxCoef10, mtxConst10);
		
		// ����в����ȷ����������ѷ����
		Matrix mtxResult10 = new Matrix();
		if (leqs10.getRootsetTlvs(mtxResult10))
		{
			System.out.println(mtxResult10);
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
