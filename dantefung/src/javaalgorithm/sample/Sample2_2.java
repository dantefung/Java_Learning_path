/*
 * ʾ������Sample2_2: Complex��˷�����
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Complex;

public class Sample2_2 
{
	public static void main(String[] args) 
	{
		Complex cpx1 = new Complex(4.2, 9.4);
		Complex cpx2 = new Complex(6.5, 8.8);
		
		Complex cpx3 = cpx1.multiply(cpx2); 
		System.out.println("(" + cpx1 + ")*(" + cpx2 + ") = " + cpx3);
	}
}
