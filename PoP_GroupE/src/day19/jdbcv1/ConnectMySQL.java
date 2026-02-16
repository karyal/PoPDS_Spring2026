package day19.jdbcv1;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectMySQL {

	public static void main(String[] args) {
		//Parameters
		String DRIVER="com.mysql.cj.jdbc.Driver";
		String HOST="localhost";//IP Address of your PC//127.0.0.1
		int PORT = 3306;
		String USER="root";
		String PASSWORD="pcps@123";
		String DBNAME="GroupE";
		String URL ="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		try {
			//Try to connect
			Class.forName(DRIVER); //Loading Driver Class
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Connect with database server successfully");
			conn.close();
			System.out.println("Close database connection successfully");
		} catch (Exception e) {
			//Display message if error
			System.out.println("Error : "+e.getMessage());
		}
		

	}
}