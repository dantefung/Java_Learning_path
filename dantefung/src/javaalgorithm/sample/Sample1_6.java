/*
 * ʾ������Sample1_6: �����������͵ķ�װ��Ҳ����ʵ�����ô�ֵ
 */
package javaalgorithm.sample;

public class Sample1_6
{
	/**
	 * ��ͼ����a, b��ֵ, ���ܳɹ�
	 */
	public static void swap(Integer a, Integer b)
	{
		Integer c = new Integer(a.intValue());
		a = b;
		b = c;
		
		System.out.println("\n�ں���swap��a, b��ֵ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public static void main(String[] args) 
	{
		Integer a = new Integer(2);
		Integer b = new Integer(100);
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
