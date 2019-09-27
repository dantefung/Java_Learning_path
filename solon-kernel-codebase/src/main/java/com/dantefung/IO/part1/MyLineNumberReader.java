package com.dantefung.IO.part1;

import java.io.IOException;
import java.io.Reader;

public class MyLineNumberReader {
    private Reader r;//�ۺ϶���
    private int lineNumber =0;
    
    public MyLineNumberReader(Reader r)
    {
    	this.r = r;//�˴���ȡ   ����ע��  ����á�IOC(���Ʒ�ת)
    }
    
    public int getLineNumber()
    {
    	return lineNumber;
    }
    
    public void setLineNumber(int lineNumber)
    {
    	this.lineNumber = lineNumber;
    }
    
    public String readLine() throws IOException
    {
    	lineNumber++;
    	
    	StringBuilder sb = new StringBuilder();
    	
    	int ch = 0;
    	while((ch=r.read()) != -1)
    	{
    		if( ch == '\r')
    		{
    			continue;
    		}
    		
    		if( ch == '\n')
    		{
    			return sb.toString();
    		}
    		else
    		{
    			sb.append((char)ch);
    		}
    	}
    	
    	if(sb.length() > 0)
    	{
    		sb.toString();
    	}
    	return null;
    }
    
    //�ͷ���Դ
    public void close() throws IOException
    {
    	this.r.close();
    }
}
