package com.dantefung.tool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * ��������
 * Process ������ 
 * 		         �������ڽ��̣��ػ����̣�Microsoft Windows �ϵ� Win16/DOS ���̣�
 *         ���� shell �ű���
 *         
 * Runtime ÿ�� Java Ӧ�ó�����һ�� Runtime ��ʵ����
 *         ʹӦ�ó����ܹ��������еĻ��������ӡ�
 *         ����ͨ�� getRuntime ������ȡ��ǰ����ʱ�� 
 * @author Dante Fung
 *
 */
public class NetConnector
{
	public void connect(String no)
	{
		// �鿴ip
//		String[] cmd = {"cmd.exe","/C","ipconfig"};
//		String cmd = "cmd.exe /C ipconfig";
		// ��������
		String cmd = "cmd.exe /c rasdial ������� lixueyuan0" + no + " 123456";
		int exitValue = createProcess(cmd);
        if( exitValue == 0)
        {
        	System.out.println("���ųɹ�����");
        }
        else
        {
        	System.err.println("exit value=" + exitValue);
        }
	    
	}
	
	public int createProcess(String cmd)
	{
		Process process = null;
		 try
	        {
		    	// ����һ����������
		        process = Runtime.getRuntime().exec(cmd);
	        }
	        catch (IOException e)
	        {
		        e.printStackTrace();
		        throw new RuntimeException(e);
	        }
		    // ��ȡ�ӽ��̵������� ��ʵ��ע����������������л�����һ�������⡣ 
		    InputStream in = process.getInputStream();
		    // �ֽ��ַ�ת����
		    InputStreamReader isr = new InputStreamReader(in);
		    // �����ַ���������
		    BufferedReader br = new BufferedReader(isr);
		    
		    String line;
		    try
	        {
		        while((line = br.readLine()) != null)
		        {
		        	System.out.println(line);
		        }
		        
		        // 0 ��ʾ������ֹ
		        int exitValue = process.waitFor();
		        System.out.println(exitValue);
		        return exitValue;
	        }
	        catch (Exception e)
	        {
		        e.printStackTrace();
		        throw new RuntimeException(e);
	        }
		    finally
		    {
		    	// �ر���Դ
		    	try
	            {
		            br.close();
		            process.getOutputStream().close();
		            in.close();
		            isr.close();
	            }
	            catch (IOException e)
	            {
		            e.printStackTrace();
		            throw new RuntimeException(e);
	            }
		    }
	}
	
	public boolean ping()
	{
		Process process = null;
		// ping
		String ping = "cmd.exe /c ping www.baidu.com -n 1";
		// �Ͽ���������
		String disconn = "cmd.exe /c rasdial /DISCONNECT";
		int exitValue = createProcess(ping);
		if(exitValue == 0)
		{
			System.out.println("�����ɹ�����");
			return true;
		}
		else
		{
			System.err.println("����ʧ�ܣ����ڶϿ�����...");
			int exitCode = createProcess(disconn);
			if(exitCode == 0)
			{
				System.out.println("�Ͽ����ӳɹ�����");
			}
			return false;
		}
	}
	
	public static void main(String[] args)
    {
		
	    NetConnector connector = new NetConnector();
	    for(int i = 1; i < 61; i ++)
	    {
	    	System.out.println("==========��" + i + "�� ��������===========");
	    	connector.connect(i<=9?"0"+i:i+"");
	    	//connector.connect(String.format("%02d", i));
	    	if(connector.ping())
	    	{
	    		break;
	    	}
	    	System.out.println("�������³�������...");
	    }
    }
}
