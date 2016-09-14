/*
 * ʾ������Sample4_1: LEquations��Ļ����÷�
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;
import javaalgorithm.algorithm.LEquations;

public class Sample4_1 
{
	public static void main(String[] args)
	{
		// ϵ����������
		double[] mtxDataCoef = {
				0.2368,0.2471,0.2568,1.2671,
				0.1968,0.2071,1.2168,0.2271,
				0.1581,1.1675,0.1768,0.1871,
				1.1161,0.1254,0.1397,0.1490};
		// ������������
		double[] mtxDataConst = {
				1.8471,
				1.7471,
				1.6471,
				1.5471};
		
		// ����ϵ������
		Matrix mtxCoef = new Matrix(4, mtxDataCoef);
		// ���쳣������
		Matrix mtxConst = new Matrix(4, 1, mtxDataConst);

		// �������Է�����
		LEquations leqs = new LEquations(mtxCoef, mtxConst);
		Matrix mtxCoef1 = leqs.getCoefMatrix();
		Matrix mtxConst1 = leqs.getConstMatrix();
		int equNum = leqs.getNumEquations();
		int uvNum = leqs.getNumUnknowns();
		System.out.println("ϵ������ = ");
		System.out.println(mtxCoef);
		System.out.println("�������� = ");
		System.out.println(mtxConst);
		System.out.println("���̸��� = " + equNum);
		System.out.println("δ֪������ = " + uvNum);
	}
}
