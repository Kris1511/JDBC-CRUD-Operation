package jdbcDemo;

import java.util.*;
//step - 1
import java.sql.*;

public class jdbcDemo {
	
	static String url = "jdbc:mysql://localhost:3306/j2ee";
	static String uname = "root";
	static String password = "root1234";

	public static void main(String[] args) throws Exception {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Insert the data");
		System.out.println("2. Update the data");
		System.out.println("3. Fetch the data");
		System.out.println("4. Delete the data");
		System.out.println("5. Exist");
		
		int choice = sc.nextInt();
		
		switch (choice) {
			case 1:
				insertData();
				break;
			case 2:
				updateData();
				break;
			case 3:
				fetchData();
				break;
			case 4:
				deleteData();
				break;
			case 5:
				System.out.println("Statement is exited");
				System.exit(0);
			default:
				System.out.println("Invalid to choice.");
				break;
		}
		
	}	
	
	public static void insertData() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		Connection con = DriverManager.getConnection(url, uname, password);
		
		System.out.print("Enter your roll: ");
		int roll = sc.nextInt();
		
		System.out.print("Enter your name: ");
		String name = sc.next();
		
		String sql = "insert into student values(?, ?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, roll);
		st.setString(2, name);
		
		int res = st.executeUpdate();
		System.out.println(res + " row has added.");
	}
	
	public static void updateData() throws Exception {
		Scanner sc = new Scanner(System.in);
		
		Connection con = DriverManager.getConnection(url, uname, password);
		
		System.out.print("Enter your roll: ");
		int roll = sc.nextInt();
		
		System.out.print("Enter your name: ");
		String name = sc.next();
		
		String sql = "update student set name = ? where roll = ?";
		
		PreparedStatement pt = con.prepareStatement(sql);
		pt.setString(1, name);
		pt.setInt(2, roll);
		
		int res = pt.executeUpdate();
		System.out.println(res + " has been updated.");
		
	}
	
	public static void fetchData() throws Exception {
		
		Connection con = DriverManager.getConnection(url, uname, password);
		
		String sql = "select * from student";
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		rs.next();
		
		while (rs.next()) {
			System.out.println(rs.getInt(1) + ", " + rs.getString(2));
		}
	}
	
	public static void deleteData() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		Connection con = DriverManager.getConnection(url, uname, password);
		
		System.out.print("Enter your roll: ");
		int roll = sc.nextInt();
		
		String sql = "delete from student where roll = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, roll);
		
		int res = ps.executeUpdate();
		System.out.println(res + " row has been deleted.");
	}
	
			
//	public static void fetchData() throws Exception {
//		
//		// step - 2 loading driver -- automatically loaded by the sql driver no need to write the driver**
//				Class.forName("com.mysql.jdbc.Driver");
//				// step - 3 establish connection
//				String url = "jdbc:mysql://localhost:3306/j2ee";
//				String uname = "root";
//				String password = "root1234";
//				 String sql = "insert into student values(1, 'Arun')";
////				String sql = "select * from student";
//				Connection con = DriverManager.getConnection(url, uname, password);
//				System.out.println("connection to DBMS");
//				
//				Statement st = con.createStatement();
//				// insert for the query
//				int res = st.executeUpdate(sql);
//				// update the query
////				ResultSet res = st.executeQuery(sql);
//				System.out.println("Data Received.");
//				System.out.println(res + " row is updated");
//				
//				// this one is executeQuery() 
////				res.next();
////				while (res.next()) {
////					System.out.println("Row: " + res.getInt(1) + ", Column: " + res.getString(2));
////				}
//	}

}
