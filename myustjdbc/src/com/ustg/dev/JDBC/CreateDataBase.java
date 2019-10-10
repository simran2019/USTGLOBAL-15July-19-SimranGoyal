package com.ustg.dev.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;


import com.mysql.jdbc.Driver;

public class CreateDataBase {

	public static void main(String[] args) {
		
		Connection conn = null;
	    PreparedStatement pstmt = null;
		
		try {
			
			// load the Driver
			java.sql.Driver div = new Driver();
			DriverManager.registerDriver(div);
			System.out.println("Driver Loaded..");
			
			// get the connection via a driver
			
			String bdUrl = "jdbc:mysql://localhost:3306/JavaCreation?user=root&password=root";
			conn = DriverManager.getConnection(bdUrl);
			System.out.println("connection estd...");
			
			// Issue the query
			
			// for create the database
			
			/*
			 * String query = "create database JavaCreation";
			 *  pstmt = conn.prepareStatement(query);
			 */
			
			// for creating the table
			
			/*
			 * String query1 =
			 * "create table newtable(name varchar(150), rollno int(20) primary key , section varchar(20))"
			 * ; pstmt = conn.prepareStatement(query1);
			 */
			
			// for insert the data
			
			String query2 = "insert into newtable values('simran' , 1 , 'A') ,('ranu' , 2 , 'A')";
			pstmt = conn.prepareStatement(query2);
			
			int count = pstmt.executeUpdate();
			
			
			
			// process the result
			if(count>0) {
				System.out.println(count);
			}else {
				System.out.println("something went wrong");
			}
			
			
			
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}	
		}
}
