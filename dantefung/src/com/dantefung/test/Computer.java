package com.dantefung.test;
//�����ߡ�
public class Computer implements CallBackFun{	
	String data = "";
	private IODevice IODevice;
	
	public Computer()
	{
		
	}
	
	public Computer(IODevice iodevice)
	{
		this.IODevice = iodevice;
	}
	
	//������ҵ�ļ��㺯����
	public void compute()
	{
		System.out.println("Computer ������ҵ��... ...");
		System.out.println("*********computer:iodevice���������***********" + "\n");
		this.IODevice.IODevice("�ص�Computer�Ļص�����", new Computer());/*��IO�豸�����ռ����ݵ������ͬʱ��
																	���Լ��Ķ����룬��IO�豸�ռ��������ݣ�
																	�Ա�ص��ص�������֪ͨ�������Ѿ��ռ���ɡ�
																	*/
		
		
		//29����bug��������
		if(getData().equals("�ص�Computer�Ļص�����-----IODevice�Ѿ��������ݡ�"))
		{
			System.out.println("IODevice��֪ͨ�Ѿ��յ���");
		}
		else
		{
			System.out.println("δ�յ�IODevice����Ϣ��");
		}
		

	}
	
	//�ص�������
	@Override
	public void callback(String data) 
	{
		// TODO Auto-generated method stub
		setData(data);
		System.out.println("Computer:��������Ѿ��յ���" + "\n");
		System.out.println(data);
		System.out.println("Sucessful!!!");
	}
	
	private void setData(String data)
	{
		this.data = data;
	}
	
	private String getData()
	{
		return this.data;
	}

					
}

