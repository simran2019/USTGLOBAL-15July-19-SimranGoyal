package com.ustg.dev.JDBC;
                                                        
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// Load the driver
			java.sql.Driver div = new Driver();
			DriverManager.registerDriver(div);
			System.out.println("Driver Loaded...");

			// Get connection via driver

			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";

			conn = DriverManager.getConnection(dbUrl);
			System.out.println("Connection Estd...");
			System.out.println("********************************************");

			// Issue SQL Query via Connection

			String query = "select * from user_info";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			// Process the result return by the sql query
			while (rs.next()) {
				int userid = rs.getInt("userid");
				String username = rs.getString("useranme");
				String email  = rs.getString("email");

				System.out.println("user id = " + userid);
				System.out.println("user name = " + username);
				System.out.println("user email = " + email);
				System.out.println("**************************");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			// closing of all the operation

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}

				if (rs != null) {
					try {
						rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

		}

	}

}