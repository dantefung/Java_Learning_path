/*
 * ʾ������Sample1_4: �������
 */
package javaalgorithm.sample;

public class Sample1_4 
{
	public static void main(String[] args) 
	{
		//
		// �����������
		//
		int maxInt = 2147483647;
		int minInt = -2147483648;
		long a = (long)maxInt + 1;
		long b = (long)minInt - 1;
		long c = (long)maxInt * 2;
		System.out.println("�����������磺");
		System.out.println("maxInt = " + maxInt);
		System.out.println("maxInt + 1 = " + a);
		System.out.println("maxInt * 2 = " + c);
		System.out.println("�����������磺");
		System.out.println("minInt = " + minInt);
		System.out.println("minInt - 1 = " + b);
		
		//
		// ���⸡�������
		//
		float maxFloat = 3.4028235E38f;
		double u = (double)maxFloat * 2;
		System.out.println("\n���⸡�������磺");
		System.out.println("maxFloat = " + maxFloat);
		System.out.println("maxFloat * 2 = " + u);
	}
}
