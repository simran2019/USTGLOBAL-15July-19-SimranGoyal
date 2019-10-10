package com.ustg.dev.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCUpgradation {

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
			System.out.println("Enter the UserName and Password = ");
			String user = sc.nextLine();
			String password = sc.nextLine();
			conn =  DriverManager.getConnection(dbUrl, user, password);
			System.out.println("Connection estd");
			System.out.println("***********************");
			
			// update the sql query
			
			String query = "update user_info set email = ? where userid = ?";
			pstmt = conn.prepareStatement(query);
			
			System.out.println("enter the emailid = ");
			pstmt.setString(1, sc.nextLine());
			System.out.println("enter the userid = ");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			
			int count = pstmt.executeUpdate();
			
			//Process the results
			if(count>0) {
				System.out.println("Query ok  , "+count+" row affected");
			}else {
				System.out.println("Something went wrong...");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
