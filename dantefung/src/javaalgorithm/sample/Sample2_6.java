/*
 * ʾ������Sample2_6: Complex��ʵ��ָ������
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Complex;

public class Sample2_6 
{
	public static void main(String[] args) 
	{
		Complex cpx = new Complex(16, 81);
		double f = 3;
		Complex cpxPow = cpx.pow(f);
		System.out.println(cpx + "��" + f + "����Ϊ" + cpxPow);
	}
}
