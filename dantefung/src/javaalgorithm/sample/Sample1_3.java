/*
 * ʾ������Sample1_3: ���
 */
package javaalgorithm.sample;

public class Sample1_3 
{
	public static void main(String[] args) 
	{
		//
		// �������
		//
		int maxInt = 2147483647;
		int minInt = -2147483648;
		int a = maxInt + 1;
		int b = minInt - 1;
		int c = maxInt * 2;
		System.out.println("�������磺");
		System.out.println("maxInt = " + maxInt);
		System.out.println("maxInt + 1 = " + a);
		System.out.println("maxInt * 2 = " + c);
		System.out.println("�������磺");
		System.out.println("minInt = " + minInt);
		System.out.println("minInt - 1 = " + b);
		
		//
		// ���������
		//
		float maxFloat = 3.4028235E38f;
		float u = maxFloat * 2;
		System.out.println("\n���������磺");
		System.out.println("maxFloat = " + maxFloat);
		System.out.println("maxFloat * 2 = " + u);
	}
}
