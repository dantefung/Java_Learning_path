package com.dantefung.ClassLoader;

public class ClassLoaderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CLASSPATHָ��������jar��Ŀ¼��
		System.out.println(
				ClassLoaderTest.class.getClassLoader().getClass().getName()
				);
		
		//BootStrap �������     JRE/lib/rt.jar  C++д��  ����jvm�ں�
		System.out.println(
				System.class.getClassLoader()
				);
		
		ClassLoader loader = ClassLoaderTest.class.getClassLoader();
		while(loader != null)
		{
			System.out.println(loader.getClass().getName());
			loader = loader.getParent();
		}
		System.out.println(loader);
	}

}
