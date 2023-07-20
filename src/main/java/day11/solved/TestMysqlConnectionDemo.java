package day11.solved;


// import the java package 
import java.sql.*;

public class TestMysqlConnectionDemo {

	public static void main(String[] args) throws SQLException {
		

		String url = "jdbc:mysql://localhost:3306/fssa";
		String userName = "root";
		String password = "root";

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
