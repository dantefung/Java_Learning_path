/*
 * ʾ������Sample6_10: Interpolation��İ��ؽ�Ⱦ��𲽲�ֵ
 */
package javaalgorithm.sample;

import javaalgorithm.algorithm.Interpolation;

public class Sample6_10 
{
	public static void main(String[] args)
	{
		// ����
		int n = 10;
		double x0 = 0.10;
		double xstep = 0.10;
		double[] y = {0.904837,0.860708,0.778801,0.670320,0.606531,0.565525,0.496585,0.427415,0.394554,0.367879};
		double[] t = {0.15,0.55};
		
		// ��ֵ����
		for (int i=0; i<t.length; ++i)
		{
			double yt = Interpolation.getValueAitken(n, x0, xstep, y, t[i], 0.0000001);
			System.out.println("f(" + t[i] + ") = " + yt);
		}
	}
}
