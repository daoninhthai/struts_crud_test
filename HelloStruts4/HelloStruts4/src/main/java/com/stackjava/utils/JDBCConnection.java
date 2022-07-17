package com.stackjava.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
public static Connection getJDBCConnection() {
	
	final String url="jdbc:mysql://localhost:3306/demo_jdbc?autoReconnect=true&useSSL=false";
	final String username="root";
	final String password="ninhthai123";
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url, username, password);
		
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	return null;
	
}
//public static void main(String[] args) {
//	Connection connection = getJDBCConnection();
//	if(connection != null) {
//		System.out.print("okkkk");
//	}
//	else {
//		System.out.print("huhu");
//	}
//}
}
