/*
 * ʾ������Sample2_10: Complex����������
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Complex;

public class Sample2_10
{
	public static void main(String[] args) 
	{
		Complex cpx = new Complex(0.75, 0.25);
		Complex cpxCos = cpx.cos();
		System.out.println(cpx + "������Ϊ" + cpxCos);
	}
}
