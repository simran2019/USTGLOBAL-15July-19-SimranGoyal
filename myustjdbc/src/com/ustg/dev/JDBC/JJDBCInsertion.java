package com.ustg.dev.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JJDBCInsertion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			//Get connection via Driver
			
			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db";
			System.out.println("Enter the UserName and Password = ");
			String user = sc.nextLine();
			String password = sc.nextLine();
			conn =  DriverManager.getConnection(dbUrl, user, password);
			System.out.println("Connection estd");
			System.out.println("***********************");
			
			// Issue the Sql query
			String query = "insert into user_info values(?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			
			System.out.println("enter the user id = ");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));  // this parse int take the input as string and return an integer
			System.out.println("enter the user name=");
			pstmt.setString(2, sc.nextLine());
			System.out.println("enter the email = ");
			pstmt.setString(3, sc.nextLine());
			System.out.println("enter the password = ");
			pstmt.setString(4, sc.nextLine());
			
			int count = pstmt.executeUpdate();
			
			//Process the results
			if(count>0) {
				System.out.println("Query ok  , "+count+" row affected");
			}else {
				System.out.println("Something went wrong...");
			}
			
		
			//DriverManager.getConnection(dbUrl , "root" , "root");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
