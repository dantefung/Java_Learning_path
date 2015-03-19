package com.dantefung.dp.proxy;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class Proxy {
	public static Object newProxyInstance(Class infce,InvocationHandler h) throws Exception
	{
		String methodStr = "";
		String rt = "\r\n";//��windowsϵͳ�£��س����з��š�\n newline \r return
		
		/* \" ת���ַ� ������ʾ ˫���� " �����������Ϊ���ַ���*/
		Method[] methods = infce.getMethods();
		for(Method m : methods)
		{
			methodStr += "@Override" + rt +
						 "public void " + m.getName()/*�û��Զ���ӿ��еķ���������*/ + "(){" + rt +
						 "	  try {" + rt +
						 "    Method md = " + infce.getName() + ".class.getMethod(\"" + m.getName() +"\");" + rt +
						 "    h.invoke(this, md);" + rt + //h.invoke(this,md)�ľ���ʵ�����û��Լ���д��InvocationHadnler�е�invoke()������
						 "    }catch(Exception e) {e.printStackTrace();}" + rt +
						 "}";
		}
		
		String src = 
				"package com.dantefung.dp.proxy;" +  rt +
				"import java.lang.reflect.Method;" + rt +
				"public class $Proxy1 implements " + infce.getName() + "{" + rt +
				"    public $Proxy1(InvocationHandler h) {" + rt +
				"        this.h = h;" + rt +
				"    }" + rt +
				
				
				"    com.dantefung.dp.proxy.InvocationHandler h;" + rt +
								
				methodStr + rt +
				"}";
		
		/**Step1:���ļ�д��ָ����·��**/
		String fileName = //�ļ����ɵ�·����
				"f:/src/com/dantefung/dp/proxy/$Proxy1.java";//�˴�������$Proxy1.java д�� $Procy.java  ���º���������  $Proxy1.java �� $Procy1.java���ֶԲ��ϣ����벻�ˡ���ˣ���ע���Լ����ʵ�ƴд��
		File f = new File(fileName);//ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ����
		FileWriter fw = new FileWriter(f);//FileWriter ����д���ַ�����
		fw.write(src);//д���ַ����� 
		fw.flush();//ˢ�¸����Ļ��塣 
		fw.close();//�رմ�������Ҫ��ˢ�������ڹرո���֮���ٵ��� write() �� flush() �������׳� IOException���ر���ǰ�رյ�����Ч�� 
		
		/**Step2:compile**/
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileMgr.getJavaFileObjects(fileName);
		CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
		t.call();
		fileMgr.close();
		
		/**Step3:���ļ��е�Դ�������ڴ沢�Ҹ����ڴ��е��ֽ��봴����Ķ���**/
		URL[] urls = new URL[] {new URL("file:/"/*�������д��*/ + "f:/src/")};
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("com.dantefung.dp.proxy.$Proxy1");
		System.out.println(c);
		
		Constructor ctr = c.getConstructor(InvocationHandler.class);//ָ�����캯�����������͡�
		Object m = ctr.newInstance(h);//ͨ�����췽��ʵ����һЩ��Ҫ�Ĳ�����
		
		return m;
	}

}
