package com.dantefung.reflecttest;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Properties;

public class ReflectTest2 {

	/**
	 * @param args
	 *     
	    /**
	     * ���������---->ʵ�ֿ�ܹ��ܡ�
	     * ArrayList_HashSet�ıȽϼ�Hashcode����
	     * 1.�������Ҫ����ĺ�������
	     *   �������������û�ס�����û��Լ���װ�Ŵ��Ϳյ��������÷��Ӿ��ǿ�ܣ�
	     *   �û���Ҫʹ���ҵĿ�ܣ����Ŵ��������ṩ�ĹҼ��С�
	     *   ����빤���������𣬹����౻�û�������ã���������ǵ����û��ṩ���ࡣ
	     * 
	     * 2.���Ҫ����ĺ�������
	     *   ����д��ܣ����ӣ�ʱ��������û�����������Сѧ��������д�����أ���д�Ŀ�ܳ��������ܵ��õ����Ժ�д���ࣨ�Ŵ����أ�
	     *   ��Ϊ��д�����ʱ���޷�֪��Ҫ�����õ�������������ԣ��ڳ������޷�ֱ��newĳ�����ʵ�������ˣ���Ҫ�÷���ķ�ʽ������
	     *   
	     *   ����ֻ����class.forName(�ַ���);�ַ�����������ʱ���ٸ��Ҿ����ˡ�
	     *   
	     * 3.�ۺ�ʵ��
	     *   ��ֱ����new��䴴��ArrayList��HashSet��ʵ��������ʾ��eclipse�Զ����ɵ�ReflectPoint���equalshashcode������
	     *   �Ƚ��������ϵ����н���Ĳ��졣
	     *   Ȼ���Ϊ���������ļ��ӷ���ķ�ʽ����ArrayList��HashSetd��ʵ�����󡣱ȽϹ۲����н���Ĳ��졣
	     *   ������eclipse����Դ�ļ�����ʽ�Ľ��⡣
	     * 
	     *   �����ÿ�ܣ�ʵ�����ǿ���ڵ��������
	     *   �����࣬���Լ�д�õ�������˼ҵ��ࡣ��
	     *   
	     *   ����������ǰд�ĳ������Ϊ�˵������������Ժ�д��
	     * */
	
	public static void main(String[] args) throws Exception {
		// ����ӿڱ�̣��������̡�
//		Collection collections = new ArrayList();//��ӡ���ļ��ϳ�����4
//		Collection collections = new HashSet();//��ӡ���ļ��ϳ�����3
//		collections.add(new ReflectPoint(3,3));
//		ReflectPoint pt1 = new ReflectPoint(3,3);//��
//		ReflectPoint pt2 = new ReflectPoint(5,5);
//		ReflectPoint pt3 = new ReflectPoint(3,3);//��
		/**�١��ڵ�ֵ�Ƿ�����أ� ���Ҫ��������ȣ���Ҫ�Լ�ȥдequlas������
		 * ����Ĭ�ϵ�equals����ʱ�Ƚ�hashcode��hashcode��ֵͨ����ͨ���ڴ���ƻ��������
		 * pt1�� pt3�����������Ķ���==�϶����Ȱɣ�equals()��������û�и��ǣ�����Ҳ���ȡ�
		 * ��ˣ�����Ҫ����equals()������
		 */
		 
//		collections.add(pt1);
//		collections.add(pt2);
//		collections.add(pt3);
//		collections.add(pt1);
		
		/**
		 * 1.�����hashCode()����ȥ����equals������ȣ������н������Ϊ2��3��
		 * �٢ڷֱ��Լ����ڴ�������HashCode��ֵ������������Ӧ����ͬ�Ķ��󣬱��ֱ����ڲ�ͬ������
		 * ����Ҫ���������ʱ�������ҵ�����������ң���ȥ�Ǹ��������ң���Ȼ�Ǹ���������һ��������ͬ�Ķ���
		 * ֻҪ�����ҵ������������������ͬ�Ķ����ҾͿ��ԷŽ�ȥ�ˡ�
		 * 
		 * 
		 * 2.��һ�������´洢��HashSet�������Ժ󣬾Ͳ����޸���������е���Щ��������ϣֵ���ֶ��ˣ�
		 * ���򣬶����޸ĺ�Ĺ�ϣֵ������洢��HashSet�����еĹ�ϣֵ�Ͳ�ͬ�ˣ�
		 * ����������£���ʱ��Contains����ʹ�øö���ĵ�ǰ������Ϊ�Ĳ���ȥHashSet�����м�������
		 * Ҳ�������Ҳ�������Ľ������Ҳ�ᵼ���޷���HashSet�����е���ɾ����ǰ��������ڴ�й¶��
		 * 
		 * ��ν�ڴ�й¶������˵����������Ҳ����ˣ�����㻹һ��ռ���ڴ�ռ䣬δ���ͷš�
		 * */
//		pt1.y = 7;//�洢��ȥ֮���޸��ֶ�y��ֵ��
//		collections.remove(pt1);//��ʱ��ɾ�����˸ö���
		
//		System.out.println(collections.size());
		
		/**
		 * ������÷���ķ�ʽ���������ٳ��־����������֣����Ǵ�һ�������ļ������ȡ������
		 * ˵����
		 * ��config.properties�ļ��У�
		 * 1.className = java.util.ArrayList  ���н����4
		 * 2.className = java.util.HashSet    ���н����2
		 * 
		 * ������ǿ���һ����С�Ŀ�ܣ������ǳ���Ҫ���õ�����������ļ������䣬��Դ�������治Ҫ�������������֡�
		 * */
		
		//�����������ӿڱ�̡�
		/**����Properties�ļ�
		 * 
		 * ��WEB�У�getRealPath();�õ���Ŀ���̵��ܵ�Ŀ¼��  ��������ļ�ʱ������Ŀ�������棬ֻ��Ҫ��getRealPath() +���ڲ���·��
		 * 
		 * һ��Ҫ��������·������������·������Ӳ���룬������������ġ�
		 * 
		 * */
//		InputStream ips = new FileInputStream("config.properties");//�˴��õ������·��
		/**Properties���൱��HashMap,�ڴ�����װ����key-value����ֵ�ԣ���
		 * ����HashMap�Ļ�������չ��һЩ���ܣ�
		 * 1.�����Խ��Լ��ڴ������key-value�洢��Ӳ�̵��ļ�����ȥ
		 * 2.�������ٳ�ʼ����ʱ���һ���ļ����潫�Լ���key-value���ؽ���
		 * һ���յ�HashMap����Ҫ�ֶ���һ��һ�Եؼ���key-value
		 * ��Properties һ�����Ϳ��ԣ����ļ�������غܶ��key-value
		 * 
		 * ��һ����õĻ����Դ�����ļ��ķ�ʽ�������޷�������ϵ����ַ�ʽ��
		 * ������������������ļ����ص��ڴ��С���ˣ�Ҳ�������������������ͨ�ļ���
		 * 
		 * �����ļ��ļ��أ������õ�������������ء�classpathָ����Ŀ¼�¡������eclipse�����»�������srcĿ¼����src����Ŀ¼(���ǰ������)�����Զ�������classpathָ����Ŀ¼�±�ȥ��
		 * */
		//ֻҪ����ReflectTest2����࣬���ֽ���ͱ����ص��ڴ浱�С�
		/*����Ӧ��������ѧϰ��ܵ�ʱ��Ӧ�õúܶ࣬����д�������ļ��������������ļ��������һ�𡣾��ޣ�ֻ����strut�ȿ�ܵ������ļ�����ͨ������������صģ���������ļ�Ӧ�÷���classpathָ����Ŀ¼��*/
//		InputStream ips = ReflectTest2.class.getClassLoader().getResourceAsStream("com/dantefung/reflecttest/config2.properties");//getResourceAsStream("config2.properties")��ʾ���ǽ���classpathָ���ĸ�Ŀ¼����һ��ȥ���ļ����ؽ���
        /**���������·�������Ǿ���·�����ڲ��õĶ���classloader**/
//		InputStream ips = ReflectTest2.class.getResourceAsStream("config2.properties");//���·��,�����com/dantefung/reflecttest������µ�һ�������ļ�
//		InputStream ips = ReflectTest2.class.getResourceAsStream("resource/config3.properties");//���·������
		InputStream ips = ReflectTest2.class.getResourceAsStream("/com/dantefung/reflecttest/resource/config3.properties");//�����ṩ�ļ�㷽��ȥ����ʱ�������þ���·��.�Ӹ�Ŀ¼��ʼ�������ҡ���������й�ϵ���Ҳ���������ǲ����в�����������Ҫ���ص�ȴ�Ǹ�XXû��ϵ���Ǿ��þ���·��
		Properties props = new Properties();
		props.load(ips);
		/**���õ�ϰ�ߣ����Ϲ���,������һ��СС���ڴ�й¶�����ips���������ϵͳ��Դû���ͷš���
		 * ��ips�Լ���java���������ջ��Ƹɵ�ǰ�������Լ��������һЩ������Դ���ɵ�������ips����û�ˣ���ips��ָ��Ĳ���ϵͳ��Դ���ڡ���
		 * */
		ips.close();
		String className = props.getProperty("className");
		/**����ʱ�����������ֽ��෭��ɶ����ƴ������class�ļ��У�����������ϸ����﷨���󡣱�����ֻ������Ķ��壬���������ִ�С���֪��������ʲô���ͣ�ֻ֪���Ƕ���*/
		Collection collections = (Collection)Class.forName(className).newInstance();
		
		ReflectPoint pt1 = new ReflectPoint(3,3);
		ReflectPoint pt2 = new ReflectPoint(5,5);
		ReflectPoint pt3 = new ReflectPoint(3,3);
		 
		collections.add(pt1);
		collections.add(pt2);
		collections.add(pt3);
		collections.add(pt1);
		
		System.out.println(collections.size());
		
				

	}

}
