package com.dantefung.dp.iterator.generic;

public class GenericArrayList <E>{
	Object[] objects = new Object[10];//��������ģ��װ�����������������
	private int index = 0;
	public int getIndex() {
		return index;
	}

	//���ö�̬����ʵ�֡�
	public void add(E o)
	{
		//���ж������Ƿ����ˡ������ˣ��ͽ�ԭ������������չ��
		if(index == objects.length)
		{
			/**����һ���µ�����**/
			Object[] newObjects = new Object[objects.length * 2];//JDK���ڲ��㷨���������ģ��ڲ����и���Ȩֵ�����ݼ�Ȩֵ��ȷ��Ҫ�Ӷ��١�
			/**��ԭ���������ڵ�����copy���µ������**/
			System.arraycopy(objects, 0, newObjects, 0, objects.length);
			/**ԭ�������������ָ�����µ����顣**/
			objects = newObjects;
		}
		objects[index] = o;
		index ++;
	}
	
	public int size()
	{
		return index;
	}
	
	public static void main(String[] args)
	{
		GenericArrayList<String> a = new GenericArrayList<String>();
		a.add("hello");
	}
}
