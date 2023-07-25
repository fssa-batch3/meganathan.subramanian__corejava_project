package day11.solved;


// import the java package 
import java.sql.*;

public class TestMysqlConnectionDemo {

	public static void main(String[] args) throws SQLException {
		

		String url = "jdbc:mysql://aws.connect.psdb.cloud:3306/core_java";
		String userName = "ss7cmbx7zth3yawzuxli";
		String password = "pscale_pw_e4hGWhr349J6fD6a1WCZ1yMomXBTqxsBb8ocrKUQAlP";

		String query = "SELECT * FROM users";

		Connection con = null;
		try {
			
			con = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("connection created...");

		con.close();
	}
}
