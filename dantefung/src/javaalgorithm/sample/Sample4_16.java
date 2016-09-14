/*
 * ʾ������Sample4_16: LEquations��Ĳ�̬����������
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Matrix;
import javaalgorithm.algorithm.LEquations;

public class Sample4_16 
{
	public static void main(String[] args)
	{
		// ϵ����������
		double[] mtxDataCoef15 = {
				3.4336,-0.5238,0.67105,-0.15272,
				-0.5238,3.28326,-0.73051,-0.2689,
				0.67105,-0.73051,4.02612,0.01835,
				-0.15272,-0.2689,0.01835,2.75702};
		// ������������
		double[] mtxDataConst15 = {
				-1.0,
				1.5,
				2.5,
				-2.0};
		
		// ����ϵ������
		Matrix mtxCoef15 = new Matrix(4, mtxDataCoef15);
		// ���쳣������
		Matrix mtxConst15 = new Matrix(4, 1, mtxDataConst15);

		// �������Է�����
		LEquations leqs15 = new LEquations(mtxCoef15, mtxConst15);
		
		// ��̬����������
		Matrix mtxResult15 = new Matrix();
		if (leqs15.getRootsetMorbid(mtxResult15, 60, 0.0001))
		{
			System.out.println(mtxResult15);
		}
		else
		{
			System.out.println("ʧ��");
		}
	}
}
