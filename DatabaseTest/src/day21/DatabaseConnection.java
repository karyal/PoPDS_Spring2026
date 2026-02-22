package day21;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	public static void main(String[] args) {
		String DRIVER="com.mysql.cj.jdbc.Driver";
		String HOST="localhost";//IP Address/localhost/127.0.0.1
		int PORT=3306; //default port
		String USER="admin"; //root
		String PASS="pcps@123"; //your password
		String DBNAME="GroupE";
		String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		
		//declare
		try {
			//input, process, output
			//1. Loading Driver
			Class.forName(DRIVER);
			System.out.println("Loading driver successfully");
			
			//2. Connect with database server
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connect with database successfully");
			
			//3. Close the connection
			conn.close();
			System.out.println("Close the Connection successfully");
		} catch (Exception e) {
			//error message
			System.out.println("Error : "+e.getMessage());
		}
	}
}










