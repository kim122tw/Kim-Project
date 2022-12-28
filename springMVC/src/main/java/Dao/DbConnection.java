package Dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DbConnection {

	public static void main(String[] args) {
		//System.out.println(DbConnection.getDB_jdbc());
		System.out.println(DbConnection.getDb_mybatis());

	}
	
	public static SqlSession getDb_mybatis() {
		SqlSession se = null;
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sef = new SqlSessionFactoryBuilder().build(is);
			se = sef.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return se;
	}
	
	public static Connection getDB_jdbc() {
		String url="jdbc:sqlserver://localhost:1433;Database=db01;trustServerCertificate=true";
		String user="sa";
		String password="12345670";
		Connection conn=null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
