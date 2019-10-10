package com.ustg.dev.JDBC;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JDBCDeletion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// load driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded...");
			
			// get connection via driver
			
			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db";
			
			String filePath ="C:\\Users\\Simran Goyal\\Desktop\\JDBC.properties";
			FileReader reader = new FileReader(filePath);
			
			Properties prop = new Properties();
			prop.load(reader);
			
			conn =  DriverManager.getConnection(dbUrl, prop);
			System.out.println("Connection estd...");
			System.out.println("***********************");
			
			//issue sql query
			
			String query = "delete from user_info where userid =?";
			pstmt = conn.prepareStatement(query);
			
			System.out.println("enter the userid = ");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			
			int count = pstmt.executeUpdate();
			
			//Process the results
			if(count>0) {
				System.out.println("Query ok  , "+count+" row affected");
			}else {
				System.out.println("Something went wrong...");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}  finally {
			// close all the jdbc objects
			if(conn!= null) {
				try {
					conn.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				} 
			}if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			sc.close();
		}

	}

}
