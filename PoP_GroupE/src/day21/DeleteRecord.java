package day21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) {
		String DRIVER="com.mysql.cj.jdbc.Driver";
		String HOST="localhost";//IP Address/localhost/127.0.0.1
		int PORT=3306; //default port
		String USER="admin"; //root
		String PASS="pcps@123"; //your password
		String DBNAME="GroupE";
		String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		String strSQL="delete from tbl_users where uid=3;";
		//tbl_users
		//uid int not null,
	    //user_name varchar(50) not null,
	    //user_password varchar(50) not null
		//declare
		try {
			//input, process, output
			//1. Loading Driver
			Class.forName(DRIVER);
			System.out.println("Loading driver successfully");
			//2. Connect with database server
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connect with database successfully");
			//3. CRUD Operations
			//3.1 Insert Record
			Statement statement = conn.createStatement(); //3.1
			statement.executeUpdate(strSQL); //executeUpdate - Insert, Update, Delete
			System.out.println("Delete record successfully");
			statement.close(); //Close the Statement
			System.out.println("Close the Statement successfylly");
			//4. Close the connection
			conn.close();
			System.out.println("Close the Connection successfully");
		} catch (Exception e) {
			//error message
			System.out.println("Error : "+e.getMessage());
		}
	}
}










