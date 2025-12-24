package Servlet;

import java.sql.*;
import java.sql.SQLException;

public class DataHandler {

	public static void insertData(String uname, String password) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/servlet";
		String username = "root";
		String pass = "root1234";
		String sql = "insert into customer values(?, ?)";
		
		Connection con = DriverManager.getConnection(url, username, pass);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, uname);
		ps.setString(2, password);
		
		int res = ps.executeUpdate();
		System.out.println(res + " row is added");
		
	}

}
