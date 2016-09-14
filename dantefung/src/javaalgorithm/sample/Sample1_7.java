/*
 * ʾ������Sample1_7: �������
 */
package javaalgorithm.sample;

public class Sample1_7
{
	/**
	 * ����a, b��ֵ, �ܳɹ�
	 */
	public static void swap(int[] a, int[] b)
	{
		int c = a[0];
		a[0] = b[0];
		b[0] = c;
		
		System.out.println("\n�ں���swap��a, b��ֵ");
		System.out.println("a = " + a[0]);
		System.out.println("b = " + b[0]);
	}

	/**
	 * ����a, b��ֵ, ���ܳɹ�
	 */
	public static void swap2(int[] a, int[] b)
	{
		int[] c = new int[1];
		c = a;
		a = b;
		b = c;
		
		System.out.println("\n�ں���swap2��a, b��ֵ");
		System.out.println("a = " + a[0]);
		System.out.println("b = " + b[0]);
	}

	public static void main(String[] args) 
	{
		int[] a = {2};
		int[] b = {100};
		System.out.println("����ǰa, b��ֵ");
		System.out.println("a = " + a[0]);
		System.out.println("b = " + b[0]);

		// ��ͼ����a, b��ֵ
		swap(a, b);
		
		System.out.println("\n������a, b��ֵ");
		System.out.println("a = " + a[0]);
		System.out.println("b = " + b[0]);

		// ��ͼ����a, b��ֵ
		swap2(a, b);
		
		System.out.println("\n������a, b��ֵ");
		System.out.println("a = " + a[0]);
		System.out.println("b = " + b[0]);
	}
}
