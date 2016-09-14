/*
 * ʾ������Sample4_7: LEquations���һ����ͷ���������
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;
import javaalgorithm.algorithm.LEquations;

public class Sample4_7 
{
	public static void main(String[] args)
	{
		// ϵ����������
		double[] mtxDataCoef6 = {
				3.0,-4.0,1.0,0.0,0.0,0,0,0,
				-2.0,-5.0,6.0,1.0,0.0,0,0,0,
				1.0,3.0,-1.0,2.0,-3.0,0,0,0,
				0,2.0,5.0,-5.0,6.0,-1.0,0,0,
				0,0,-3.0,1.0,-1.0,2.0,-5.0,0,
				0,0,0,6.0,1.0,-3.0,2.0,-9.0,
				0,0,0,0,-4.0,1.0,-1.0,2.0,
				0,0,0,0,0,5.0,1.0,-7.0};
		// ������������
		double[] mtxDataConst6 = {
				13.0,29.0,-13.0,
				-6.0,17.0,-21.0,
				-31.0,-6.0,4.0,
				64.0,3.0,16.0,
				-20.0,1.0,-5.0,
				-22.0,-41.0,56.0,
				-29.0,10.0,-21.0,
				7.0,-24.0,20.0};
		
		// ����ϵ������
		Matrix mtxCoef6 = new Matrix(8, mtxDataCoef6);
		// ���쳣������
		Matrix mtxConst6 = new Matrix(8, 3, mtxDataConst6);

		// �������Է�����
		LEquations leqs6 = new LEquations(mtxCoef6, mtxConst6);
		
		// һ����ͷ���������
		Matrix mtxResult6 = new Matrix();
		if (leqs6.getRootsetBand(5, mtxResult6))
		{
			System.out.println(mtxResult6);
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
