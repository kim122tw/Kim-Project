package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Model.student;
import Model.teacher;

public class teacherDaoImpl implements teacherDao {
	
	public static void main(String[] args) {
		
	}
	
	@Override
	public void add(teacher t) {
		EntityManager em = DbConnection.getDb();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();  
		em.close();
		
	}
	
	@Override
	public teacher queryTeacher(String username, String password) {
		EntityManager em = DbConnection.getDb();
		String JPQL = "select t from teacher t where t.teacherNumber = ?1 and t.password = ?2";
		Query q = em.createQuery(JPQL);
		q.setParameter(1, username);
		q.setParameter(2, password);
		List<teacher> l = q.getResultList();
		teacher[] t = l.toArray(new teacher[l.size()]);
		
		if (l.size() != 0) {
			return t[0];
		} else {
			return null;
		}
		
	}

	@Override
	public void update(teacher t) {
		EntityManager em = DbConnection.getDb();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public void delete(int id) {
		EntityManager em = DbConnection.getDb();
		teacher t = em.find(teacher.class, id);
		em.getTransaction().begin();
		em.remove(t);;
		em.getTransaction().commit();
		em.close();
		
	}

}
