/*
 * ʾ������Sample4_13: LEquations������Գ�����������Ĺ����ݶȷ�
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;
import javaalgorithm.algorithm.LEquations;

public class Sample4_13 
{
	public static void main(String[] args)
	{
		// ϵ����������
		double[] mtxDataCoef12 = {
				5.0,7.0,6.0,5.0,
				7.0,10.0,8.0,7.0,
				6.0,8.0,10.0,9.0,
				5.0,7.0,9.0,10.0};
		// ������������
		double[] mtxDataConst12 = {
				23.0,
				32.0,
				33.0,
				31.0};
		
		// ����ϵ������
		Matrix mtxCoef12 = new Matrix(4, mtxDataCoef12);
		// ���쳣������
		Matrix mtxConst12 = new Matrix(4, 1, mtxDataConst12);

		// �������Է�����
		LEquations leqs12 = new LEquations(mtxCoef12, mtxConst12);
		
		// ���Գ�����������Ĺ����ݶȷ�
		Matrix mtxResult12 = new Matrix();
		leqs12.getRootsetGrad(mtxResult12, 0.0001);
		System.out.println(mtxResult12);
	}
}
