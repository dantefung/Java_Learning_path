package com.dantefung.dp.factory.springsim;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.XPath;
/*
 * JDOM is designed only for Java and uses the natural 
 * Java-specific features that the DOM model avoids.
 * 
 * SAX:Simple APIfor Xml 
 * */
public class ClassPathApplicationXmlContext implements BeanFactory {
	private Map<String, Object> container = new HashMap<String, Object>();

	public ClassPathApplicationXmlContext(String fileName) throws Exception
	{
		  SAXBuilder sb = new SAXBuilder();
		  Document doc = sb.build(this.getClass().getClassLoader()//���ļ������н���������JDOMģ�͵�XML��.
				  .getResourceAsStream(fileName));
		  Element root = doc.getRootElement();//ͨ��Document����ȡ�ø��ڵ㡣
		  List list = XPath.selectNodes(root, "/beans/bean");//����һ��xpath��䷵��һ��ڵ㡣
		  System.out.println(list.size());
		  
		  //�������еĽڵ㣬ȡ��key��value
		  for (int i = 0; i < list.size(); i++) { 
		   Element bean = (Element) list.get(i);
		   String id = bean.getAttributeValue("id");
		   String clazz = bean.getAttributeValue("class");
		   Object o = Class.forName(clazz).newInstance();
		   container.put(id, o);
		   System.out.println(id + " " + clazz);
		  }
	}
	
	@Override
	public Object getBean(String id) 
	{
		return container.get(id);
	}

}
