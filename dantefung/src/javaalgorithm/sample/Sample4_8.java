/*
 * ʾ������Sample4_8: LEquations������ԳƷ�����ķֽⷨ
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;
import javaalgorithm.algorithm.LEquations;

public class Sample4_8 
{
	public static void main(String[] args)
	{
		// ϵ����������
		double[] mtxDataCoef7 = {
				5.0,7.0,6.0,5.0,1.0,
				7.0,10.0,8.0,7.0,2.0,
				6.0,8.0,10.0,9.0,3.0,
				5.0,7.0,9.0,10.0,4.0,
				1.0,2.0,3.0,4.0,5.0};
		// ������������
		double[] mtxDataConst7 = {
				24.0,96.0,
				34.0,136.0,
				36.0,144.0,
				35.0,140.0,
				15.0,60.0};
		
		// ����ϵ������
		Matrix mtxCoef7 = new Matrix(5, mtxDataCoef7);
		// ���쳣������
		Matrix mtxConst7 = new Matrix(5, 2, mtxDataConst7);

		// �������Է�����
		LEquations leqs7 = new LEquations(mtxCoef7, mtxConst7);
		
		// ���ԳƷ�����ķֽⷨ
		Matrix mtxResult7 = new Matrix();
		if (leqs7.getRootsetDjn(mtxResult7))
		{
			System.out.println(mtxResult7);
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
