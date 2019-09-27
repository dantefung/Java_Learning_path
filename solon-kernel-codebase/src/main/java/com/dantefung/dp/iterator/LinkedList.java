package com.dantefung.dp.iterator;
//��LinkedList��дһ��������
public class LinkedList implements Collection {
	Node head = null;
	Node tail = null;
	int size = 0;//�������ݡ�
	public void add(Object o)
	{
		Node n = new Node(o,null);
		if(head == null) //��ӽ���������ڵ��ǵ�һ���ڵ㡣
		{
			head = n;//�����^
			tail = n;//Ҳ��β
			tail.setNext(null);
		}
		else
		{
			tail.setNext(n);//tail��¼����һ���ڵ�����á�
			tail = n;//tail����Ҫ�����¼ӽ����Ľڵ㡣tail������ָ����һ���ڵ㡣
			size ++;
		}
	}
	
	public int size()
	{
		return size;
	}

	@Override
	public Iterator iterator() {
		return new LinkedListIterator();
	}
	
	private class LinkedListIterator implements Iterator
	{

		@Override
		public Object next() {
			Object e;
			if(head != null)
			{
				Object data = head.getData();
				head = head.getNext();
				return data;
			}
			else
			{
				return null;
			}
					
		}

		@Override
		public boolean hasNext() {
			if(head == null)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		
	}
}
