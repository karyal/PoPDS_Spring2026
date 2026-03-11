package day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PersonDatabase {
	private String DRIVER="com.mysql.cj.jdbc.Driver";
	private String HOST="localhost";
	private int PORT=3306;
	private String USER="admin";
	private String PASS="pcps@123";
	private String DB="GroupE";
	private String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DB;
	
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
