/*
 * ʾ������Sample2_11: Complex�����������
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Complex;

public class Sample2_11 
{
	public static void main(String[] args) 
	{
		Complex cpx = new Complex(0.25, 0.25);
		Complex cpxTan = cpx.tan();
		System.out.println(cpx + "������Ϊ" + cpxTan);
	}
}
