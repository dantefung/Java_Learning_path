/*
 * ʾ������Sample1_5: �����������Ͳ���ʵ�����ô�ֵ
 */
package javaalgorithm.sample;

public class Sample1_5
{
	/**
	 * ��ͼ����a, b��ֵ, ���ǲ��ܳɹ�
	 */
	public static void swap(int a, int b)
	{
		int c = a;
		a = b;
		b = c;
		
		System.out.println("\n�ں���swap��a, b��ֵ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public static void main(String[] args) 
	{
		int a = 2;
		int b = 100;
		System.out.println("����ǰa, b��ֵ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// ��ͼ����a, b��ֵ
		swap(a, b);
		
		System.out.println("\n������a, b��ֵ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
