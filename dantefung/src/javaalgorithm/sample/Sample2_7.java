/*
 * ʾ������Sample2_7: Complex�ิ��ָ������
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Complex;

public class Sample2_7 
{
	public static void main(String[] args) 
	{
		Complex cpx1 = new Complex(1, 1);
		Complex cpx2 = new Complex(1, 1);
		Complex cpxPow = cpx1.pow(cpx2, 0);
		System.out.println(cpx1 + "��" + cpx2 + "����Ϊ" + cpxPow);
	}
}
