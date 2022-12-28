package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConDB {
	
	public static void main(String[] args) {
		getDb();
	}
	
	static Connection getDb() {
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/order?useUnicode=true&characterEncoding=utf-8";
		String user = "root";
		String password = "12345670";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("no driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		}
		return conn;
		
	}
}
