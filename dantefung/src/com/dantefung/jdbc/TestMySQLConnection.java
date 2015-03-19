package com.dantefung.jdbc;

import java.sql.*;
/**
 * JDBC Test!
 * ������ģʽ��˼����������Ϊ��Ҫ��������д��
 * վ������ߵĽǶ���˼����
 * ���µ�ע�����Ҹ�����ӵģ�Ŀ����Ϊ���������磬������д�����˼·��
 * @author DanteFung
 * @since 2015.2.19
 * @version 0.1
 * */
public class TestMySQLConnection {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try
		{
			//�������ݿ�������
			Class.forName("com.mysql.jdbc.Driver");
			//ͨ�����ݿ���������ȡ�����ݿ����ӡ�
			conn = DriverManager
					.getConnection("jdbc:mysql://localhost/dantefung?user=root&password=");
			//���һ���ֶεĶ���
			stmt = conn.createStatement();
			//ͨ��sql���ȡ�ò�ѯ�����װ��һ��������������档
			rs = stmt.executeQuery("select * from dept");
			//�����˵�������˼�롣
			while(rs.next())
			{
				System.out.println(rs.getString("deptno"));
			}
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException ex)
		{
			//handle any errors
			System.out.println("SQLException:" + ex.getMessage());
			System.out.println("SQLState:" + ex.getSQLState());
			System.out.println("VendorError:" + ex.getErrorCode());
		}
		finally
		{//���Ȼ��Ҫ�ر����ݿ�ĸ�����Դ��
			try
			{
				if(rs != null)
				{
					rs.close();
					rs = null;
				}
				if(stmt != null)
				{
					stmt.close();
					stmt = null;
				}
				if(rs != null)
				{
					rs.close();
					rs = null;
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
	}

}


