/*
 * ʾ������Sample4_10: LEquations���������ϡ�跽�����ȫѡ��Ԫ��˹��Լȥ��ȥ��
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;
import javaalgorithm.algorithm.LEquations;

public class Sample4_10 
{
	public static void main(String[] args)
	{
		// ϵ����������
		double[] mtxDataCoef9 = {
				0.0,0.0,-1.0,0.0,0.0,0.0,2.0,0.0,
				0.0,6.0,0.0,0.0,0.0,-6.0,0.0,0.0,
				0.0,0.0,0.0,2.0,0.0,0.0,0.0,-4.0,
				3.0,0.0,0.0,0.0,-2.0,0.0,1.0,0.0,
				0.0,0.0,6.0,0.0,0.0,0.0,5.0,0.0,
				1.0,0.0,0.0,0.0,-3.0,0.0,0.0,2.0,
				0.0,4.0,0.0,-1.0,0.0,0.0,0.0,0.0,
				0.0,0.0,1.0,0.0,-1.0,0.0,0.0,-2.0};
		// ������������
		double[] mtxDataConst9 = {
				4.0,
				6.0,
				-8.0,
				-2.0,
				27.0,
				-9.0,
				2.0,
				-4.0};
		
		// ����ϵ������
		Matrix mtxCoef9 = new Matrix(8, mtxDataCoef9);
		// ���쳣������
		Matrix mtxConst9 = new Matrix(8, 1, mtxDataConst9);

		// �������Է�����
		LEquations leqs9 = new LEquations(mtxCoef9, mtxConst9);
		
		// ������ϡ�跽�����ȫѡ��Ԫ��˹��Լȥ��ȥ��
		Matrix mtxResult9 = new Matrix();
		if (leqs9.getRootsetGgje(mtxResult9))
		{
			System.out.println(mtxResult9);
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
