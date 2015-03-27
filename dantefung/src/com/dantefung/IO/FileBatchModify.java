package com.dantefung.IO;



	import java.io.File;

	/*
	 * ���󣺰�E:\\liuyi\\FileBatchModify_Test������ļ������޸�Ϊ
	 * 		00?_ccc.txt
	 * 
	 * ˼·��
	 * 		A:��װĿ¼
	 * 		B:��ȡ��Ŀ¼�����е��ļ���File����
	 * 		C:������File���飬�õ�ÿһ��File����
	 * 		D:ƴ��һ���µ����ƣ�Ȼ�����������ɡ�
	 */
public class FileBatchModify {
		public static void main(String[] args) {
			// ��װĿ¼
			File srcFolder = new File("E:\\liuyi\\FileBatchModify_Test");

			// ��ȡ��Ŀ¼�����е��ļ���File����
			File[] fileArray = srcFolder.listFiles();

			// ������File���飬�õ�ÿһ��File����
			for (File file : fileArray) {
				// System.out.println(file);
				// E:\liuyi\FileBatchModify_Test\aaa_bbb_001_ccc.txt
				// �ĺ�E:\liuyi\FileBatchModify_Test\001_ccc.txt
				String name = file.getName(); //aaa_bbb_001_ccc.txt

				int index = name.indexOf("_");
				String numberString = name.substring(index + 5, index + 8);
				System.out.println(numberString);

				// int startIndex = name.lastIndexOf('_');
				// int endIndex = name.lastIndexOf('.');
				// String nameString = name.substring(startIndex + 1, endIndex);
				// System.out.println(nameString);
				int endIndex = name.lastIndexOf('_');
				String nameString = name.substring(endIndex);
				//System.out.println(nameString);

				String newName = numberString.concat(nameString); // 001_ccc.txt
				//System.out.println(newName);

				File newFile = new File(srcFolder, newName); //E:\liuyi\FileBatchModify_Test\001_ccc.txt
				// ����������
				file.renameTo(newFile);
			}
		}
	}


