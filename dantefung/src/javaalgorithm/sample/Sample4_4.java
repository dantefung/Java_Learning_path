/*
 * ʾ������Sample4_4: LEquations��ĸ�ϵ���������ȫѡ��Ԫ��˹��ȥ��
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Complex;
import javaalgorithm.algorithm.Matrix;
import javaalgorithm.algorithm.LEquations;

public class Sample4_4
{
	public static void main(String[] args)
	{
		// ϵ����������
		// ʵ��
		double[] mtxDataCoef3Real = {
				1.0,3.0,2.0,13.0,
				7.0,2.0,1.0,-2.0,
				9.0,15.0,3.0,-2.0,
				-2.0,-2.0,11.0,5.0};
		// �鲿
		double[] mtxDataCoef3Imag = {
				3.0,-2.0,1.0,6.0,
				-2.0,7.0,5.0,8.0,
				9.0,-3.0,15.0,1.0,
				-2.0,-2.0,7.0,6.0};
		// ������������
		// ʵ��
		double[] mtxDataConst3Real = {
				2.0,
				7.0,
				3.0,
				9.0};
		// �鲿
		double[] mtxDataConst3Imag = {
				1.0,
				2.0,
				-2.0,
				3.0};
		
		// ����ϵ������
		Matrix mtxCoef3Real = new Matrix(4, mtxDataCoef3Real);
		Matrix mtxCoef3Imag = new Matrix(4, mtxDataCoef3Imag);
		// ���쳣������
		Matrix mtxConst3Real = new Matrix(4, 1, mtxDataConst3Real);
		Matrix mtxConst3Imag = new Matrix(4, 1, mtxDataConst3Imag);

		// �������Է�����
		LEquations leqs3 = new LEquations(mtxCoef3Real, mtxConst3Real);
		
		// ��ϵ���������ȫѡ��Ԫ��˹��ȥ��
		Matrix mtxResult3Real = new Matrix();
		Matrix mtxResult3Imag = new Matrix();
		if (leqs3.GetRootsetGauss(mtxCoef3Imag, mtxConst3Imag, mtxResult3Real, mtxResult3Imag))
		{
			for (int i=0; i<mtxConst3Real.getNumRows(); ++i)
			{
				Complex cp = new Complex(mtxResult3Real.getElement(i,0), mtxResult3Imag.getElement(i,0));
				System.out.println(cp);
			}
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
