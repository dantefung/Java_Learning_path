/*
 * ʾ������Sample1_1: ���Ȳ������������Υ�����������
 */
package javaalgorithm.sample;

public class Sample1_1 
{
	public static void main(String[] args) 
	{
		//
		// ���Ȳ��㵼��Υ���ӷ������
		//
        System.out.println("���Ȳ��㵼��Υ���ӷ������");
        float a = 1;
        float b = 6.0E-8f;
        float c = 8.0E-8f;
        float s1 = (a+b)+c;
        float s2 = a+(b+c);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("(a+b)+c = " + s1);
        System.out.println("a+(b+c) = " + s2);
        if (s1 == s2)
        	System.out.println("====> (a+b)+c = a+(b+c)");
        else
        	System.out.println("====> (a+b)+c != a+(b+c)");

		//
		// ��������Υ���ӷ������
		//
        System.out.println("\n��������Υ���ӷ������");
        float d  = 0.63576f;
        float e  = 0.7687806f;
        float f  = 0.3344711f;
        s1 = (d+e)+f;
        s2 = d+(e+f);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("(d+e)+f = " + s1);
        System.out.println("d+(e+f) = " + s2);
        if (s1 == s2)
        	System.out.println("====> (d+e)+f = d+(e+f)");
        else
        	System.out.println("====> (d+e)+f != d+(e+f)");

		//
		// ���Ȳ��㵼��Υ���˷������
		//
        System.out.println("\n���Ȳ��㵼��Υ���˷������");
        float u = 0.6f;
        float v = 2.1E-45f;
        float w = 3.4E38f;
        s1 = (u*v)*w;
        s2 = u*(v*w);
        System.out.println("u = " + u);
        System.out.println("v = " + v);
        System.out.println("w = " + w);
        System.out.println("(u*v)*w = " + s1);
        System.out.println("u*(v*w) = " + s2);
        if (s1 == s2)
        	System.out.println("====> (u*v)*w = u*(v*w)");
        else
        	System.out.println("====> (u*v)*w != u*(v*w)");

		//
		// ��������Υ���˷������
		//
        System.out.println("\n��������Υ���˷������");
        float x = 0.7095392f;
        float y = 0.7706766f;
        float z = 0.4584696f;
        s1 = (x*y)*z;
        s2 = x*(y*z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("(x*y)*z = " + s1);
        System.out.println("x*(y*z) = " + s2);
        if (s1 == s2)
        	System.out.println("====> (x*y)*z = x*(y*z)");
        else
        	System.out.println("====> (x*y)*z != x*(y*z)");
	}
}
