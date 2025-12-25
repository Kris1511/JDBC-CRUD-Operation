package Servlet;

import java.sql.*;
import java.sql.SQLException;

public class DataHandler {

	public static void insertData(String uname, String password) throws SQLException {
		String url = "jdbc:mysql://locallhost:3306/servlet";
		String username = "root";
		String pass1 = "root1234";
		String sql = "insert into customer values(?, ?)";
		
		Connection con = DriverManager.getConnection(url, username, pass1);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, uname);
		ps.setString(2, password);
		
		int res = ps.executeUpdate();
		System.out.println(res + " row is added");		
	}

	public static String fetchData(String uname) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://locallhost:3306/servlet";
		String username = "root";
		String password = "root1234";
		String sql = "select password from customer where uname = ?";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, uname);
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		String res = rs.getString(1);
		
		return res;
	}

}
