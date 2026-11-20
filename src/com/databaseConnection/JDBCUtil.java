package com.databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
	
	
	private static final String url ="jdbc:mysql://localhost:3306/Bank";
	
	private static final String UserName ="root";
	
	private static final String PassWord = "12345";
	
	
	public static Connection createConnection()
	{
		
		Connection con = null;
		
		try
		{
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	     con =	DriverManager.getConnection(url,UserName,PassWord);
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}

}
