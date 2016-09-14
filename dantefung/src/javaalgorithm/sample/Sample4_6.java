/*
 * ʾ������Sample4_6: LEquations���������Խ��߷������׷�Ϸ�
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;
import javaalgorithm.algorithm.LEquations;

public class Sample4_6 
{
	public static void main(String[] args)
	{
		// ϵ����������
		double[] mtxDataCoef5 = {
				13,12,0,0,0,
				11,10,9,0,0,
				 0, 8,7,6,0,
				 0, 0,5,4,3,
				 0, 0,0,2,1};
		// ������������
		double[] mtxDataConst5 = {
				3.0,
				0.0,
				-2.0,
				6.0,
				8.0};
		
		// ����ϵ������
		Matrix mtxCoef5 = new Matrix(5, mtxDataCoef5);
		// ���쳣������
		Matrix mtxConst5 = new Matrix(5, 1, mtxDataConst5);

		// �������Է�����
		LEquations leqs5 = new LEquations(mtxCoef5, mtxConst5);
		
		// ������Խ��߷������׷�Ϸ�
		Matrix mtxResult5 = new Matrix();
		if (leqs5.getRootsetTriDiagonal(mtxResult5))
		{
			System.out.println(mtxResult5);
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
