package com.dantefung.dp.iterator;
import com.dantefung.dp.iterator.Collection;
//ģ��JDK�е�ArrayList
public class ArrayList implements Collection {
	Object[] objects = new Object[10];//��������ģ��װ�����������������
	private int index = 0;
	public int getIndex() {
		return index;
	}

	//���ö�̬����ʵ�֡�
	public void add(Object o)
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
	
	public Iterator iterator()
	{
		return new ArrayListIterator();
	}
	
	//�ڲ���һ����װ�ࡣ
	private class ArrayListIterator implements Iterator
	{
		private int currentIndex = 0;
		
		@Override
		public Object next() {
			Object o= objects[currentIndex];
			currentIndex ++;
			return o;
		}

		@Override
		public boolean hasNext() {	
			if(currentIndex >=index) return false;
			else return true;
		}
		
	}
	
	
}
