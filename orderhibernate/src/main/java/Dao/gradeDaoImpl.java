package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Model.grade;

public class gradeDaoImpl implements gradeDao {
	
	public static void main(String[] args) {
		List<String> l = new gradeDaoImpl().gradePass("A Class");
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i));
		}
	
		
	}
	
	@Override
	public void add(grade g) {
		EntityManager em = DbConnection.getDb();
		em.getTransaction().begin();
		em.persist(g);
		em.getTransaction().commit();
		em.close();
		
	}
	

	@Override
	public List<String> gradePass(String teacherClass) {
		Connection conn = DbConnection.getDbCon();
		String SQL = "select (case when count(g.grade) >= 3 then '否' else '是' end) as pass "
				   + "from grade g join student s "
				   + "on g.studentNumber = s.studentNumber "
				   + "where s.studentClass = ? and g.grade >= 60 " 
				   + "group by g.studentNumber";
		List<String> l = new ArrayList<>();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, teacherClass);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				l.add(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}

	@Override
	public void update(grade g) {
		EntityManager em = DbConnection.getDb();
		em.getTransaction().begin();
		em.merge(g);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void delete(int id) {
		EntityManager em = DbConnection.getDb();
		grade g = em.find(grade.class, id);
		em.getTransaction().begin();
		em.remove(g);
		em.getTransaction().commit();
		em.close();
		
	}


}
