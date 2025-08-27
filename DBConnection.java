package com.inventorymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
public class DBConnection {
 
	  private static  final String url="jdbc:mysql://localhost:3306/FSJ";
	  private static final String userName="root";
	  private static final String password="8978";

		public static Connection getConnection() throws Exception{
			return DriverManager.getConnection(url, userName, password);
		}

	

}
