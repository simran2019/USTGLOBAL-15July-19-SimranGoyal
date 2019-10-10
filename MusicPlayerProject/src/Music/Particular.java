package Music;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class Particular {
	
	public static void particular() {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; 

		try {

			// load the driver

			java.sql.Driver div = new Driver() ;
			DriverManager.registerDriver(div);
			System.out.println("Driver loaded...");

			// get connection via Driver

			String dbUrl = "jdbc:mysql://localhost:3306/musicplayer";
			String filePath = "C:\\\\Users\\\\Simran Goyal\\\\Desktop\\\\JDBC.properties";
			FileReader reader = new FileReader(filePath);

			Properties prop = new Properties();
			prop.load(reader);

			conn =  DriverManager.getConnection(dbUrl, prop);
			System.out.println("Connection estd...");

			//Issue the query
			
			String query = "select * from MusicFiles where Song_ID =?";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter the song id = ");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			rs = pstmt.executeQuery();
			
			
			
			// process result
			
			while(rs.next()) {
				String song = rs.getString("Song_Title");
				System.out.println(" Play a particular song= "+song);
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			} if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
