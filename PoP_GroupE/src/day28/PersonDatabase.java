package day28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonDatabase {
	private String DRIVER="com.mysql.cj.jdbc.Driver";
	private String HOST="localhost";
	private int PORT=3306;
	private String USER="admin";
	private String PASS="pcps@123";
	private String DB="GroupE";
	private String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DB;

	//Search person
	public Person search(int pid) {//receive value 1
		Connection conn;
		String strSql ="SELECT * FROM tbl_persons WHERE pid=?";
		PreparedStatement pstat;
		ResultSet rs;//Receive result from mysql
		String name="";
		Person person=null;
		try {
			Class.forName(DRIVER); //Load driver
			conn = DriverManager.getConnection(URL, USER, PASS);
			pstat=conn.prepareStatement(strSql);
			pstat.setInt(1, pid);
			rs=pstat.executeQuery(); //run sql statement on mysql 
			
			while(rs.next()) {
				person=new Person();
				person.setFullName(rs.getString("full_name"));
			}
			conn.close();
			System.out.println("Connection Close Successfully");
		} catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
			//Display error
		}
		return person;
	}
	
	public boolean save(Person person) {
		//Declare
		Connection conn;
		PreparedStatement pstat;
		String strSql="INSERT INTO tbl_persons VALUES(?, ?, ?, ?, ?,?,?,?)";
		boolean result;
		try {
			//Initialize
			//Input, Process, Output
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASS);
			pstat = conn.prepareStatement(strSql);
			pstat.setInt(1, person.getPid());
			pstat.setString(2, person.getFullName());
			pstat.setString(3, person.getAddress());
			pstat.setString(4, person.getEmail());
			pstat.setString(5, person.getPhone());
			pstat.setString(6, person.getGender());
			pstat.setString(7, person.getDob());
			pstat.setString(8, person.getQualification());
			pstat.executeUpdate();
			pstat.close();
			conn.close();
			System.out.println("Insert Record Successfully");
			result=true;
		} catch (Exception e) {
			System.err.print("Error : "+e.getMessage());
			result=false;
		}
		return result;
	}
}