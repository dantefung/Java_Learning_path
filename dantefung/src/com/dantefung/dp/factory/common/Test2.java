package com.dantefung.dp.factory.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test2 {

	public static void main(String[] args) throws Exception {
		    String fileName = "com/dantefung/dp/factory/common/ProductFactory.properties";
			Properties props = new Properties();
			props.load(Test2.class.getClassLoader()
						          .getResourceAsStream(fileName));//��·���µ������ļ�ת��Ϊһ��Properties����
			String vehicleFactoryName = props.getProperty("ProductFactory");//ͨ��key���value
			System.out.println(vehicleFactoryName);
			Object o = Class.forName(vehicleFactoryName).newInstance();
			System.out.println(o);
			VehicleFactory vehicleFactory = (CarFactory)o;
			Moveable m = vehicleFactory.creatVehicle();
			m.run();
			

	}

}
