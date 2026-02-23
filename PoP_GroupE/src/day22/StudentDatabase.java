package day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDatabase implements StudentCRUD {
	private String DRIVER = "com.mysql.cj.jdbc.Driver";
	private String HOST = "localhost";// 127.0.0.1 //IP Address of Your PC
	private int PORT = 3306; // default port
	private String USER = "admin"; // your user
	private String PASS = "pcps@123"; // your password
	private String DB = "GroupE";
	private String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB;

	@Override
	public void save(Student student) {
		// tbl_students sid*, full_name, pop, cn, db, total, average, result
		// int-int (length)
		// String - varchar (length)
		// double - decimal (length)
		String strSql = "insert into tbl_student values(" + student.getSid() + ", '" + student.getFullName() + "',"
				+ student.getPop() + ", " + student.getCn() + ", " + student.getDb() + ", " + student.getTotal() + ", "
				+ student.getAverage() + ", '" + student.getResult() + "');";
		try {
			// Load the driver
			Class.forName(DRIVER);
			// Connect with database
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			// Execute insert statement
			Statement statement = conn.createStatement();
			statement.executeUpdate(strSql);
			statement.close();
			// Close connection
			conn.close();
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

	@Override
	public Student search(int sid) {
		// tbl_students sid*, full_name, pop, cn, db, total, average, result
		// int-int (length)
		// String - varchar (length)
		// double - decimal (length)
		Student student = null;
		String strSql = "SELECT * FROM tbl_student WHERE sid=" + sid;
		try {
			// Load the driver
			Class.forName(DRIVER);
			// Connect with database
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			// Execute insert statement
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(strSql);
			while (rs.next()) {
				student = new Student();
				student.setSid(rs.getInt("sid"));
				student.setFullName(rs.getString("full_name"));
				student.setPop(rs.getDouble("pop"));
				student.setCn(rs.getDouble("cn"));
				student.setDb(rs.getDouble("db"));
				student.setTotal(rs.getDouble("total"));
				student.setAverage(rs.getDouble("average"));
				student.setResult(rs.getString("result"));
			}
			statement.close();
			// Close connection
			conn.close();
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		return student;
	}

	@Override
	public List<Student> all() {
		// tbl_students sid*, full_name, pop, cn, db, total, average, result
		// int-int (length)
		// String - varchar (length)
		// double - decimal (length)
		List<Student> students = new ArrayList<Student>();
		String strSql = "SELECT * FROM tbl_student";
		try {
			// Load the driver
			Class.forName(DRIVER);
			// Connect with database
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			// Execute insert statement
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(strSql);
			while (rs.next()) {
				Student student = new Student();
				student.setSid(rs.getInt("sid"));
				student.setFullName(rs.getString("full_name"));
				student.setPop(rs.getDouble("pop"));
				student.setCn(rs.getDouble("cn"));
				student.setDb(rs.getDouble("db"));
				student.setTotal(rs.getDouble("total"));
				student.setAverage(rs.getDouble("average"));
				student.setResult(rs.getString("result"));
				students.add(student);
			}
			statement.close();
			// Close connection
			conn.close();
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		return students;
	}

}
