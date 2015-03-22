package com.dantefung.IO;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;
//Uses anonymous inner Classes.
//{Args: E:\ }
public class DirList2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path = new File("E:\\");//ƥ������з�֮��������ַ���
		String[] list;
		if(args.length == 0)
		{
			list = path.list();// ����һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��
		}
		else
		{
			list = path.list(filter(args[0]));//����ģʽ���ص�����������һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼��
		}
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);//����ĸ˳������
		for(String dirItem : list)
		{
			System.out.println(dirItem);
		}
	}
	
	public static FilenameFilter filter(final String regex)
	{
		//Creation of anonymous inner class:
		return new FilenameFilter(){
			private Pattern pattern = Pattern.compile(regex);
			public boolean accept(File dir, String name)
			{
				return pattern.matcher(name).matches();
			}
		};
	}
	
	

}
