package com.dantefung.reflecttest;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
/**
 * @author dantefung 
 * @since 2014-10-31 
 * @version 1.0
 * study by itcast's course
 * take note 
 * 2014-11-1 the first modify(make over/alter)
 * */
public class ReflectTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//��λ�ø����ֽ����Ӧ��ʵ������Class��
		/**
		 *��������ɶ����ƴ������Ӳ�����Ӳ�����������ֽ��뵽�ڴ棨��JVM���У�Ȼ��ͨ���ֽ��븴�Ƴ�һ��һ���Ķ��� 
		 *��֮����Դ�����г��ֵ����ͣ����и��Ե�Classʵ���������磬int[]��void...
		 */
		String str1 = "abc";
		Class cls1 = str1.getClass();//����ֽ���
		Class cls2 = String.class;//��ȡ�ֽ���
		Class cls3 = Class.forName("java.lang.String");//��ȡ�ֽ���
		//�鿴�Ƿ���ͬһ���ֽ���
		System.out.println(cls1 == cls2);
		System.out.println(cls1 == cls3);
		System.out.println(cls1);
		System.out.println(cls2);
		System.out.println(cls3);
		System.out.println(cls1.isPrimitive());//�ж�String�Ƿ�Ϊһ����������
		System.out.println(int.class.isPrimitive());//�ж�int�Ƿ�Ϊһ����������
		System.out.println(int.class == Integer.class);
		System.out.println(int.class == Integer.TYPE);//Integer�а����Ļ�������
		System.out.println(int[].class.isArray());//�κ����Ͷ�������һ��class����ʾ���κ��������ڴ��ﶼ��һ���ֽ��롣���һ�����飬������������ͣ��ǲ���ԭʼ�����أ���һ�����ͣ�������ԭʼ����
	    
		/**���췽���ķ���
		*�൱��new String(new StringBuffer("abc"))
		*�õ�Constructor���Ͷ��󣬴���һ�����췽��
		*String.class--�ֽ��룬String.class.getConstructor����--ͨ���ֽ���õ��Ķ���
		*����getConstrutor��String��ĳɷ�֮һ�����췽������
		*�������е��඼����һ�ɷ֣���˽�����һ�ࡣ ������ɷ��ࣨ�������˴���Ĵ���Ա��Լ���⣩���и��ֲ�����
		*��Ҫ�����Щ����������ʵ��������ɷ��࣬�������ܵ��������еķ�����
		*ע�⣺
		*1.�ڱ�д�����ʱ��Ҫ���֣�����ʱ������ʱ��
		*����ʱ�����������ֽ��෭��ɶ����ƴ������class�ļ��У�����������ϸ����﷨���󡣱�����ֻ������Ķ��壬���������ִ�С�
		*����ʱ��ִ���˴����֪����ʲô���͡�
		*2.�õ�����ʱ��Ҫ���ͣ��ڵ��÷���ʱ��Ҫ����ͬ�����͵Ķ���
		*
		*���裺
		*class-->construtor-->new object
		*
		*����ᵼ�³��������½������ù��췽��ʱ���Ȼ����������ٴε���ʱ��ֱ������ǰ�Ѿ��õ��Ĺ��췽��
		*
		*Class��newInstance();  ���Ҫ�����޲εĹ��췽����ʹ�����������
		*/                                                     //�˴���StringBuffer�Ǳ�ʾѡ���ĸ����췽����
		Constructor constructor1 = String.class.getConstructor(StringBuffer.class/*����������*/);//getConstuctor�п���ָ�����ɸ�class����һ��class�������һ������
	    //�ڱ�дԴ�����ʱ���˼�ֻ֪������һ��Construtor���ܶ���඼��constutor���˼Ҳ�֪������String��constructor����������ʱ����ִ��String��class.getConstrutor��StringBuffer.class�������д��룬��֪����String��
		String str2 = (String) constructor1.newInstance(/*"abc"�������String���ͣ���������ʱ�Ĵ���*/new StringBuffer("abc")/*������ͬ�����͵Ķ���*/);//���Ե��úܶ��,ÿ����һ�ξ��൱��newһ��String��������ֻ��������newһ��ָ����󡣵��Ƕ�ӦString����ĸ����췽�����˼��ǲ�֪���ġ�����ʱ������ʱ��
	                            //�ڶ���StringBuffer��ʾ�ù��췽��ʱ����Ҫ��һ��StringBuffer����
		//public Object newInstance(Object[] initargs),����ֵ��Object���ͣ���Ҫ���߱����������ص���String���ͣ������Ǩ�����ˣ�String��
	    System.out.println(str2.charAt(2));//����ַ����ĵڶ���
	    
	    /**
	     * ��Ա���� ���ֶΣ�
	     * 
	     * */
	    ReflectPoint pt1 = new ReflectPoint(3,5);
	    Field fieldY = pt1.getClass().getField("y");
	   /**FieldY��ֵ�Ƕ��٣�5������ 
	    * FieldYֻ��ʾ�������ֽ������ϵı���������5��û�ж�Ӧ���������ϡ�������һ�������ֵ��
	    * ֻ����һ��(�༶���)���ñ������ɷ֣��ֶΣ��ࣩ�����������ñ���ӳ��Ķ������ϣ����еġ���װ�ģ������ֵ��
	    * ����ɷ���ȥȡReflectPoint��Ķ���pt1���Ϸ�װ�õ�ֵ��
	    * */	
	    System.out.println(fieldY.get(pt1));
	    /*Exception in thread "main" java.lang.NoSuchFieldException: y& ˵�����y��˽�еģ���˿�����*/
	    /*------------�������䣺start----------------*/
	    Field fieldX = pt1.getClass().getDeclaredField("x");
	                                  //ֻҪ�������Ķ�ȡ���������ڿ��ü������������ã����ʣ���
	    fieldX.setAccessible(true);//���ÿ��Է��ʡ�
	    System.out.println(fieldX.get(pt1));
	    /*-------------�������䣺end----------------------*/
	    /**
	     * ����һ������������ֶ�
	     * 
	     * */
	    changStringValue(pt1);
	    System.out.println(pt1);//Ϊ���ܿ�����ӡ��Ч�����б�Ҫ����toString()���� ����д�Ļ��������̨���ӡ��com.dantefung.reflecttest.ReflectPoint@6e1408
	    /*ͨ�����÷����ķ�ʽ��str1.charAt(1);
	     *����ķ�ʽ��charAt.invoke(); 
	     */
	    /**
	     * �÷���ķ�ʽ���õ���String��ģ��ֽ�������ķ�����Method��Ķ��󣩣�
	     * �������������Method��ĵĶ���ȥ������ĳ������String��Ķ���
	     * 
	     * invoke:����
	     *
	     * ��⣺����methodCharAt�����ڵ�һ��������
	     * ���ӣ��г�˾�����г�ͣ���������г�˾��������ô����������������³�����ͣס��ʵ�������г�˾����������������г������źţ����г��Լ�ͣ������
	     * circle.draw();
	     * ����������ƣ�
	     * �˹��ţ�����ʱ˭�Ķ��������ŵĶ�������ֻ������һ���š�
	     * ������󳬼��򵥣�ֻҪ���������˽�еģ����˭�������������������˭�����ϣ���������˭�����ϡ�----ר��ģʽ����˭ӵ�����ݣ�˭���Ǹ�������ݵ�ר�ң�
	     * */
	    Method methodCharAt =String.class.getMethod("charAt",int.class);
	    System.out.println(methodCharAt.invoke(str1/*null,���Method�����Ӧ����һ����̬������*/,1));//�������ʱ���˵��õģ���ֻ�Ƿ����źţ���������ķ���Ҫ����һ�£������õĶ������ٷ����Լ����ϡ�
	    System.out.println(methodCharAt.invoke(str2, new Object[]{2}));//new Object[]{new String("abc"),1/*JDK1.5�������Զ�װ��Ĺ��� ���Զ�����װ�ɶ���*/}
	    
	    
	    
	    /*ΪʲôҪ�÷���ķ�ʽ����*/
	    /**
	     * ��������д���
	     * Ҫ����ĳ�����main���������Դ���������д�ã�Ȼ��args[0]����ֵһ���ַ���������ַ���������һ�����������
	     * ����ʱ������໹û�п�ʼд�ã��ҿ�����Դ��������д�õ��������Ĵ��룻ֻҪ������ʱ�������д���˾���
	     * */
	    //TestAguments.main(new String[]{"123","222","3333"});
	    String startingClassName = args[0];//����һ��������Դ��������û�г������������ã����壩�����ǣ���������A����࣬�������A����ࡣ��Դ�����и�����֪��Ҫִ���ĸ��ࣿ
	    //arg[0]��run configuration�������˴��ݵĲ���Ϊcom.dantefung.reflecttest.TestAguments

	    Method mainMethod = Class.forName(startingClassName).getMethod("main",String[].class);
	    mainMethod.invoke(null/*���ڷ����Ǿ�̬�ģ������null*/, new Object[]{new String[]{"123","222","333"}}/*�ٴ� �����ÿ��ֻ�ܲ�һ�ΰ�*/); /*mainMethod.invoke(null���ڷ����Ǿ�̬�ģ������null, new String[]{"123","222","333"});
	                                                                                                   Exception in thread "main" java.lang.IllegalArgumentException: wrong number of arguments
	                                                                                                                                                                                                                                                                                                                                                            ������ĽǶ���˵��ȷʵ��һ��������������һ�������ĽǶ���˵��jdk1.4������Ϊ�����ÿһ��Ԫ�ض�Ӧһ������������������������Ϊjdk1.5Ҫ����jdk1.4��������ʱ����������в�֣�ֻ�ܲ�һ�ΰ�����*/
	    mainMethod.invoke(null/*���ڷ����Ǿ�̬�ģ������null*/, (Object)new String[]{"123","222","333"}/*Oject����String�ĸ���,���String���͵Ķ�������Ҳ��Oject���͵Ķ������飬���������߱���������һ������Ҫ���--��Т����ʦ����˵*/);//������com.dantefung.reflecttest.TestAguments��main����
	    //invoke(Object obj, Object... args) �ɱ������ ����ֵ���� �������ƣ����͡������������ƣ�{}
	    
	    /*------------------------���������Ƿ���һ�������ࣺstart------------------------------*/
	    byte[] bText = new byte [250];//�������飬ͬʱ�����ڴ�
	    System.out.println(bText.getClass().getName());
	    //���ۣ���������
	    /*------------------------���������Ƿ���һ��������ࣺend------------------------------*/
	    
	    /**
	     * ����ķ���
	     * 1.������ͬά����Ԫ�����͵���������ͬһ�����ͣ���������ͬ��Classʵ������
	     * 2.���������Classʵ�������getSuperclass()�������ظ���ΪObject���Ӧ��class
	     * 3.�����������͵�������Ա�����Object����ʹ�ã����ܵ���Object[]����ʹ�ã��ǻ������͵����飬�ȿ��Ե���Object����ʹ�ã��ֿ��Ե���Object[]����ʹ��
	     * 4.Arrays��asList()��������int[]��String[]�Ĳ���
	     * 5.Array������������ɶ�����ķ������
	     * 6.˼���⣺��ô�õ������е�Ԫ�����ͣ�  ��û�а취�õ�������Ԫ�ص����͡�
	     * int [] a = new int[3];
	     * ��Ϊ��Object[] a = new Object[]{"a",1}//String,int ���͡�
	     * ֻ�ܵõ�����ĳ��Ԫ�ص����ͣ����۵õ�������������͡�
	     * ��[0]��getClass().getName();
	     * �������Ҫ�Լ����ֿ�����ܣ���Ҫ����Щ֪ʶ�����䣩�˽�ú���������˽ⷴ�䣬ȥ�����Ҳ��������
	     * */
	    int [] a1 = new int[]{1,2,3};
	    int [] a2 = new int[4];
	    int [] [] a3 = new int[2][3];
	    String [] a4 = new String[]{"a","b","c"};//�������飬�Զ�װ��
	    //JDK1.6�ĵ�����˵�ˣ�������ͬ��ά������ͬ������
	    System.out.println(a1.getClass() == a2.getClass());
//	    System.out.println(a1.getClass() == a4.getClass());//���ʱflase
//	    System.out.println(a1.getClass() == a3.getClass());//���ʱflase
	    System.out.println(a1.getClass().getName());//����Ľ��Ϊ��[I  ˵����[��ʾ���� I��ʾint����
	    System.out.println(a1.getClass().getSuperclass().getName());//���н����java.lang.Object
	    System.out.println(a4.getClass().getSuperclass().getName());//���н����java.lang.Object
	    
	    //so...
	    Object aobj1 = a1;//����Ķ�̬�ԣ�����ʵ�����������
	    Object aobj2 = a4;
//	    Object[] aobj3 = a1;//��һ����������װ����int ����int�ǻ������������ͣ�����Object������
	    Object[]/*��һ����������װ����Object*/ aobj4 = a3;//a3��ʾ��������飬��һ�����飬����װ����int��������(����Object)
	    Object[] aobj5 = a4;
	    
	    System.out.println(a1);//���н����[I@1f33675   ��ʾ�����������int���͵����飬��hashcode��ֵΪ@1f33675
	    System.out.println(a4);//���н����[Ljava.lang.String;@7c6768 ��ʾ���������ʱString���͵����飬��hashcode��ֵΪ@7c6768 
	    //���ӡ�������е����ݣ�1.��ѭ�������2.Arrays�࣬�����࣬�����д�����������в����ķ�����
	    /**
	     * ע�⣺Arrays��asList()��������int[]��String[]�Ĳ���
	     * */
	    System.out.println(Arrays.asList(a1));//���н����[[I@1f33675]����ʾ��[]ת��Ϊlist��������װ����list��Ψһ��Ԫ�أ�ԭ�����������  JDK1.6��public static <int[]> List<int[]> asList(int[]... a)�����洫�ݵĲ�������һ������
	    System.out.println(Arrays.asList(a4));//���н����[a, b, c]  �����Զ�������ַ��� .JDK1.4���﷨:public static List asList(Object[] a)��JDK1.6����JDK1.4���﷨����ˣ����Դ�ӡ����
	    
	    /*���Ƕ�������з�����Եõ�����class
	     * 
	     * ���鷴�� Class Array
	     * 
	     * int[3]
	     * �õ�
	     * ����ĳ��ȣ� lenght
	     * �����ֵ��int[0]
	     * Ҫ�÷���ķ�ʽ������
	     * */
//	    Object obj = null;
	    printObject(a4);
	    printObject("xyz");
	    
	}

	private static void printObject(Object obj) {
		Class clazz = obj.getClass();
		if(clazz.isArray())
		{
			//����ҵ���һ�����飬�Ҿ�һ��һ���ظ�������
			int len = Array.getLength(obj);
			for(int i=0;i < len;i ++)
			{
				System.out.println(Array.get(obj,i));
			}
		}
		else
		{
			System.out.println(obj);//����������飬�ͽ��㵱������ӡ����
		}
		
	}

	/**
	 *  ��д�������Ļ���˵����ᷴ����
	 * */
	private static void changStringValue(Object obj) throws Exception {
        //ɨ�������������ϵ�String���͵ĵı�������ôɨ�裿�õ����е��ֶΡ�
		Field[] fields = obj.getClass().getFields();
		for(Field field : fields)
		{
		//if(field.getType().equals(String.class))��Ҳ���ԣ����岻��ȷ��equals��춱��^�ɂ���ͬ���ַ�������
		//�ֽ����� == ���Ƚ� ,����@�e��ͬһ���ֹ��a����רҵ��
		    if(field.getType() == String.class)//��������String��͵��ֹ��a���Ҿ�Ҫȡ�����ֵ��
		    {
		    	String oldValue = (String)field.get(obj);
		    	String newValue = oldValue.replace('b','a');
		    	field.set(obj,newValue);
		    }
		}
	}

}
/**
 * дһ��������������ܹ������û��ṩ��������ȥִ�����е�main������������ͨ��ʽ����֮��Ҫ����ΪʲôҪ�÷���ķ�ʽ����
 * 
 * */
class TestAguments
{
    public static void main(String[] args){
    	for(String arg:args)
    	{
    		System.out.println(arg);
    	}
    }
}