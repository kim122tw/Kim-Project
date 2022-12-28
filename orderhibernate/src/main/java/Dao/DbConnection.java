package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;


public class DbConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

			/*Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://DESKTOP-AO33U47;Database=school;";
			String user = "sa";
			String password = "12345670";
			Connection conn = DriverManager.getConnection(url, user, password);
			*/
			DbConnection.getDbCon();
			JOptionPane.showMessageDialog(null, "Connection");
			
	}
	
	public static EntityManager getDb() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("school");
		EntityManager em = emf.createEntityManager();
		return em;
	}
	
	public static Connection getDbCon() {
		Connection conn = null;
		String url = "jdbc:sqlserver://localhost:1433;Database=school";
		String user = "sa";
		String password = "12345670";
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("no Driver");
			e.printStackTrace();
		}
		return conn;
		
	}

}
