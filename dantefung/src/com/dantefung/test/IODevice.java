package com.dantefung.test;
/**
 * @author dantefung
 * @since  2015-3-30
 * 
 * �������ߡ�
 * */
public class IODevice {

	private Computer computer;

	public void IODevice(String data, Computer computer)
	{
		this.computer = computer;
		System.out.println("*****************IODevice��" + "Computer�����ã�����������յ�..." + "***************");
		int i = 0;
		while(i < 10)
		{
			if(i == 9)
			{
				System.out.println("�����ռ����-------" + "\n");	
				System.out.println("IODevice:Computer���������" + "\n");
				computer.callback(data.concat("-----IODevice�Ѿ��������ݡ�"));
		        break;
			}
			
			System.out.println("�����ռ��С�����");
			++ i;
		}
	}
	


	
}
