package com.dantefung.test;

public class TestForCdetails {
	public static void main(String[] args){
		int j=0;
		int k=0;
		for(int i = 0; i < 100; i++)
		{
			j=++j;//�����++j���ȼӺ��ã�����������Ȼ��ֵ����j;
		}
		System.out.println(j);
		
		for(int i = 0; i < 100; i++)
		{
			k=k++;//�����++j�����ú�ӣ������Ƚ�ֵ����j��Ȼ��ſ�ʼ����;
		}
		System.out.println(k);
	}
}
