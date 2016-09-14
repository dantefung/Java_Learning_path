/*
 * ʾ������Sample4_5: LEquations��ĸ�ϵ���������ȫѡ��Ԫ��˹��Լ����ȥ��
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Complex;
import javaalgorithm.algorithm.Matrix;
import javaalgorithm.algorithm.LEquations;

public class Sample4_5 
{
	public static void main(String[] args)
	{
		// ϵ����������
		// ʵ��
		double[] mtxDataCoef4Real = {
				1.0,3.0,2.0,13.0,
				7.0,2.0,1.0,-2.0,
				9.0,15.0,3.0,-2.0,
				-2.0,-2.0,11.0,5.0};
		// �鲿
		double[] mtxDataCoef4Imag = {
				3.0,-2.0,1.0,6.0,
				-2.0,7.0,5.0,8.0,
				9.0,-3.0,15.0,1.0,
				-2.0,-2.0,7.0,6.0};
		// ������������
		// ʵ��
		double[] mtxDataConst4Real = {
				2.0,-2.0,
				7.0,3.0,
				3.0,2.0,
				9.0,1.0};
		// �鲿
		double[] mtxDataConst4Imag = {
				1.0,3.0,
				2.0,7.0,
				-2.0,9.0,
				3.0,2.0};
		
		// ����ϵ������
		Matrix mtxCoef4Real = new Matrix(4, mtxDataCoef4Real);
		Matrix mtxCoef4Imag = new Matrix(4, mtxDataCoef4Imag);
		// ���쳣������
		Matrix mtxConst4Real = new Matrix(4, 2, mtxDataConst4Real);
		Matrix mtxConst4Imag = new Matrix(4, 2, mtxDataConst4Imag);

		// �������Է�����
		LEquations leqs4 = new LEquations(mtxCoef4Real, mtxConst4Real);
		
		// ��ϵ���������ȫѡ��Ԫ��˹��Լ����ȥ��
		Matrix mtxResult4Real = new Matrix();
		Matrix mtxResult4Imag = new Matrix();
		if (leqs4.GetRootsetGaussJordan(mtxCoef4Imag, mtxConst4Imag, mtxResult4Real, mtxResult4Imag))
		{
			for (int i=0; i<mtxConst4Real.getNumRows(); ++i)
			{
				Complex cp1 = new Complex(mtxResult4Real.getElement(i,0), mtxResult4Imag.getElement(i,0));
				Complex cp2 = new Complex(mtxResult4Real.getElement(i,1), mtxResult4Imag.getElement(i,1));
				System.out.println(cp1 + ", " + cp2);
			}
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
