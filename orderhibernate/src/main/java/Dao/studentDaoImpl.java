package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Model.gradeList;
import Model.student;

public class studentDaoImpl implements studentDao {

	public static void main(String[] args) {
		/*List<gradeList> l= new studentDaoImpl().classGrade("A Class");
		for (gradeList g : l) {
			System.out.print(g.getStudentName());
		}*/
		
		System.out.println(new studentDaoImpl().queryStudent("A001", "0403").getStudentName());
		
	}
	
	@Override
	public void add(student s) {
		EntityManager em = DbConnection.getDb();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
		
	}
	
	@Override
	public List<student> queryAll() {
		EntityManager em = DbConnection.getDb();
		String SQL = "select s from student s";
		Query q = em.createQuery(SQL);
		
		List<student> l = q.getResultList();
		
		return l;
		
	}
	
	@Override
	public List<student> queryBirth(int month) {
		EntityManager em = DbConnection.getDb();
		String JPQL = "select s from student s where DatePart(mm, s.studentBirth) = ?1";
		Query q = em.createQuery(JPQL);
		q.setParameter(1, month);
		
		List<student> l = q.getResultList();
		if (l.size() != 0) {
			return l;
		} else {
			return null;
		}
 		
	}
	
	@Override
	public student queryStudent(String username, String password) {
		Connection conn = DbConnection.getDbCon();
		String SQL = "select * from student where studentNumber = ? and "
				   + "right(replicate('0', 2) + cast(DatePart(mm, studentBirth) as nvarchar),2) + "
				   + "right(replicate('0', 2) + cast(DatePart(dd, studentBirth) as nvarchar),2) = ?";
		
		PreparedStatement ps;
		student s = null;
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				s = new student();
				s.setId(rs.getInt(1));
				s.setStudentNumber(rs.getString(2));
				s.setStudentName(rs.getString(3));
				s.setStudentBirth(rs.getDate(4));
				s.setStudentClass(rs.getString(5));
				s.setBestSubject(rs.getString(6));
				s.setAddress(rs.getString(7));
				s.setPhone(rs.getString(8));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
		
	}
	
	@Override
	public List<student> classInformation(String teacherClass) {
		EntityManager em = DbConnection.getDb();
		String JPQL = "select s from student s "
					+ "where s.studentClass = ?1";
		Query q = em.createQuery(JPQL);
		q.setParameter(1, teacherClass);
		List<student> l = q.getResultList();
				
		return l;
	}	

	@Override
	public List<gradeList> classGrade(String teacherClass) {
		Connection conn = DbConnection.getDbCon();
		String SQL = "select g.studentNumber, s.studentName, " +
				   	  "sum(case when g.subject='chinese' then g.grade else 0 end) as 中文, " +
				      "sum(case when g.subject='english' then g.grade else 0 end) as 英文, " +
				      "sum(case when g.subject='math' then g.grade else 0 end) as 數學, " + 
				      "sum(case when g.subject='physical' then g.grade else 0 end) as 體育, " +
				      "sum(case when g.subject='science' then g.grade else 0 end) as 科學, " +
				      "sum(g.grade) as 總分 from grade g " + 
				      "join student s on s.studentNumber = g.studentNumber " +
				      "where s.studentClass = ? " +
				      "group by g.studentNumber, s.studentName";
		List<gradeList> l = new ArrayList<>();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, teacherClass);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				gradeList g = new gradeList();
				g.setStudentNumber(rs.getString(1));
				g.setStudentName(rs.getString(2));
				g.setChinese(rs.getInt(3));
				g.setEnglish(rs.getInt(4));
				g.setMath(rs.getInt(5));
				g.setPhysical(rs.getInt(6));
				g.setScience(rs.getInt(7));
				g.setTotal(rs.getInt(8));
				l.add(g);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	
	@Override
	public void update(student s) {
		EntityManager em = DbConnection.getDb();
		em.getTransaction().begin();
		em.merge(s);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public void delete(int id) {
		EntityManager em = DbConnection.getDb();
		student s = em.find(student.class, id);
		em.getTransaction().begin();
		em.remove(s);
		em.getTransaction().commit();
		em.close();
		
		
	}


}
