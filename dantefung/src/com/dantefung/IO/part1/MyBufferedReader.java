package com.dantefung.IO.part1;

import java.io.IOException;
import java.io.Reader;

/*
 * ��Readerģ��BufferedReader��readLine()���ܡ�
 * 
 * readLine():һ�ζ�ȡһ�У����ݻ��з��ж��Ƿ������ֻ�������ݣ������ػ��з���
 * 
 * 
 * װ������Decorator�����ģʽ��
 * �ı�������ǣ����ı�������������Ϊ��
 * 
 * ������
 * Wrapper
 * 
 * �ŵ㣺
 * ͨ��ʹ��װ����ģʽ������������ʱ����һ����Ĺ��ܡ�
 * 
 * ��ͼ��
 * ��̬�ظ�һ���������һЩ�����ְ��
 * 
 * ������
 * ��ʱ����ϣ����ĳ��  ����  ������  ������  ���һЩ���ܡ�
 * 
 * ��������MyBufferedReader ������װԭ����Reader
 * 
 * */
public class MyBufferedReader {
     private Reader r;//����ӿڱ�̣��ۺ϶���
     
     public MyBufferedReader(Reader r)
     {
    	 this.r = r;
     }
     
     /*
      *˼���� дһ������������ֵ��һ���ַ����� 
      */
     public String readLine() throws IOException
     {
		
    	 /*
    	  * WHY?--WHAT��--HOW��
    	  * 
    	  *��Ҫ ����һ���ַ������Ҹ���ô���أ�
    	  *
    	  *���Ǳ���ȥ����r�����ܹ���ȡʲô�����أ�
    	  *��������ȡ������һ�ζ�ȡһ���ַ�����һ�ζ�ȡһ���ַ�����
    	  *
    	  *��ô������Ҫ����һ���ַ��������ĸ������ȽϺ��أ�
    	  *�����Ǻ������뵽�ַ�����ȽϺã������������ˣ������������ĳ����Ƕ೤�أ�
    	  *������û�а跹��������ĳ��ȣ��㶨��೤�Ķ������ʡ����ԣ�ֻ��ѡ��һ�ζ�ȡһ���ַ���
    	  *
    	  *�����أ�ʹ�����ַ�ʽ��ʱ�������ٶ�ȡ��һ���ַ���ʱ����һ���ַ��Ͷ�ʧ�ˣ����ԣ�������Ӧ�ö���һ����ʱ�洢�ռ�
    	  *�Ѷ�ȡ�������ַ��洢������
    	  *�����˭�ȽϺ����أ����飬���ϣ��ַ��������������ɹ�ѡ��
    	  *
    	  *�����򵥵ķ���������ѡ��ʹ���ַ������������󡣲���ʹ�õ���StringBuilder
    	  *
    	  *StringBuilder�ڵ��߳���Ч�ʱȽϸߡ�
    	  */
    	 StringBuilder sb = new StringBuilder();
    	 /*
    	  *�������ȡ���鷳�����жϽ��������ǽ���֮ǰӦ����һֱ����ȡ��ֱ��-1 
    	  * 
    	  *ע�⣺windows�µĻ����� \r\n
    	  */
    	 
    	 /*
 		  *hello
 		  *world
 		  *java	
 		
 		  *104101108108111
 		  *119111114108100
 		  *1069711897
 		  */
    	 
    	 int ch = 0;
    	 while((ch = this.r.read()) != -1)
    	 {
    		 if(ch == '\r')
    		 {
    			 continue;
    		 }
    		 
    		 if(ch == '\n')
    		 {
    			 return sb.toString();
    		 }
    		 else
    		 {
    			 sb.append((char)ch);
    		 }
    	    		 
    	 }
    	 
		 //Ϊ�˷�ֹ���ݶ�ʧ���ж�sb�ĳ��Ȳ��ܴ���0
		 if(sb.length() > 0)
		 {
			 return sb.toString();
		 }
		 
    	 return null;
     }
     
     /*
      * 
      * ��дһ���رշ�����
      * 
      */
     public void close() throws IOException
     {
    	 this.r.close();
     }
}
