package com.ustg.dev.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class User {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		// load the driver

		try {
			java.sql.Driver div = new Driver();
			DriverManager.registerDriver(div);
			System.out.println("Driver loaded...");

			// get connection via a driver

			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(dbUrl);
			System.out.println("connection estd...");
			System.out.println("***********************");

			// issue the sql query
			String query = "select * from user_info where passsword ='fyt7fs'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			// process the query

			while (rs.next()) {
				int userid = rs.getInt("userid");
				String name = rs.getString("useranme");
				String email = rs.getString("email");

				System.out.println("user id = " + userid);
				System.out.println("name of user = " + name);
				System.out.println("email of the user = " + email);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {

					e.printStackTrace();
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
}
