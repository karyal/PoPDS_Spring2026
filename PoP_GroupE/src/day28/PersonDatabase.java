package day28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class PersonDatabase {
	private String DRIVER="com.mysql.cj.jdbc.Driver";
	private String HOST="localhost";
	private int PORT=3306;
	private String USER="admin";
	private String PASS="pcps@123";
	private String DB="GroupE";
	private String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DB;

	public List<Person> all() {//receive value 1
		Connection conn;
		String strSql ="SELECT * FROM tbl_persons";
		PreparedStatement pstat;
		ResultSet rs;//Receive result from mysql
		String name="";
		List<Person> persons=null;
		try {
			Class.forName(DRIVER); //Load driver
			conn = DriverManager.getConnection(URL, USER, PASS);
			pstat=conn.prepareStatement(strSql);
			rs=pstat.executeQuery(); //run sql statement on mysql 
			
			while(rs.next()) {
				Person person=new Person();
				person.setPid(rs.getInt("pid"));
				person.setFullName(rs.getString("full_name"));
				person.setAddress(rs.getString("address"));
				person.setEmail(rs.getString("email"));
				person.setPhone(rs.getString("phone"));
				person.setGender(rs.getString("gender"));
				person.setDob(rs.getString("dateof_birth"));
				person.setQualification(rs.getString("qualification"));
				persons.add(person);
			}
			conn.close();
			System.out.println("Connection Close Successfully");
		} catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
			//Display error
		}
		return persons;
	}
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
				person.setPid(pid);
				person.setFullName(rs.getString("full_name"));
				person.setAddress(rs.getString("address"));
				person.setEmail(rs.getString("email"));
				person.setPhone(rs.getString("phone"));
				person.setGender(rs.getString("gender"));
				person.setDob(rs.getString("dateof_birth"));
				person.setQualification(rs.getString("qualification"));
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
	/*
	pid int not null,
	full_name varchar(50) not null,
	address varchar(50) not null,
	email varchar(50) not null,
	phone varchar(50) not null,
	gender varchar(50) not null,
	dateof_birth varchar(50) not null,
	qualification varchar(50)
	*/
	public boolean update(Person person) {
		//Declare
		Connection conn;
		PreparedStatement pstat;
		String strSql="UPDATE tbl_persons SET full_name=?, address=?, email=?, phone=?, gender=?, dateof_birth=?, qualification=? WHERE pid=?";
		boolean result;
		try {
			//Initialize
			//Input, Process, Output
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASS);
			pstat = conn.prepareStatement(strSql);
			pstat.setInt(8, person.getPid());
			pstat.setString(1, person.getFullName());
			pstat.setString(2, person.getAddress());
			pstat.setString(3, person.getEmail());
			pstat.setString(4, person.getPhone());
			pstat.setString(5, person.getGender());
			pstat.setString(6, person.getDob());
			pstat.setString(7, person.getQualification());
			pstat.executeUpdate(); //Update Record
			pstat.close();
			conn.close();
			System.out.println("Update Record Successfully");
			result=true;
		} catch (Exception e) {
			System.err.print("Error : "+e.getMessage());
			result=false;
		}
		return result;
	}
	public boolean delete(int pid) {
		//Declare
		Connection conn;
		PreparedStatement pstat;
		String strSql="DELETE FROM tbl_persons WHERE pid=?";
		boolean result;
		try {
			//Initialize
			//Input, Process, Output
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASS);
			pstat = conn.prepareStatement(strSql);
			pstat.setInt(1, pid);
			pstat.executeUpdate(); //Delete Record
			pstat.close();
			conn.close();
			System.out.println("Delete Record Successfully");
			result=true;
		} catch (Exception e) {
			System.err.print("Error : "+e.getMessage());
			result=false;
		}
		return result;
	}
}