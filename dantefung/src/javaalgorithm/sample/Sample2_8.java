/*
 * ʾ������Sample2_8: Complex�����Ȼ��������
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Complex;

public class Sample2_8 
{
	public static void main(String[] args) 
	{
		Complex cpx = new Complex(3, 2);
		Complex cpxLog = cpx.log();
		System.out.println(cpx + "����Ȼ����Ϊ" + cpxLog);
	}
}
