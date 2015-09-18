package com.dantefung.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestJDBC {
	private static String URL = "jdbc:mysql://localhost:3306/test";
	private static String USER = "root";
	private static String PASSWORD = "root";
	
	public static void main(String[] args) throws Exception {
		 	
		// ע�����ݿ�
		Class.forName("com.mysql.jdbc.Driver");
		
		// ��ȡ���ݿ�����
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		
		Statement stmt = conn.createStatement();
		
		// ����hero��
		int count = stmt.executeUpdate("create table hero(" +
							"hero_id int primary key auto_increment, " +
							"hero name vachar(10), " +
							"hero_nick varchar(10)," +
							"hero_age varchar(10)," +
							"hero_repute varchar(10)," +
							"hero_wealth int, " +
							"hero_weapon varchar(10)," +
							"hero_deadreason varchar(30))");
		
		System.out.println(count);
		
		//��������.
		stmt.executeUpdate("insert into hero(hero_weapon) values('')");
		
		
	}
}
