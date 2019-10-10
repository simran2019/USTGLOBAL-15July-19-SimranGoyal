package Music;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class Play{

	public static void play() {

		Connection conn = null;
		Statement stmt = null;
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
			
			//String query = prop.getProperty("my.play");

			String query = "select Song_Title from MusicFiles";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			// process result
			
			while(rs.next()) {
				String song = rs.getString("Song_Title");
				System.out.println(" Play a song"+song);
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
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			} if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}

	}
	
	
	

}
