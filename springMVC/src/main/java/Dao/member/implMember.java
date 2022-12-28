package Dao.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import Dao.DbConnection;
import Dao.porder.implPorder;
import Model.member;

public class implMember implements memberDao {

	public static void main(String[] args) {
		
		/*List<member> l = new implMember().queryAll();
		for (member m : l) {
			System.out.println(m.getName() + m.getUsername());
		}*/
		
		System.out.println(new implMember().queryMember("haha", "123").getName()) ;

	}

	@Override
	public void add(member m) {
		SqlSession se = DbConnection.getDb_mybatis();
		se.insert("memberMapper.add", m);
		se.commit();
		se.close();
		
	}

	@Override
	public List<member> queryAll() {
		SqlSession se = DbConnection.getDb_mybatis();
		List<member> l = se.selectList("memberMapper.queryAll");
		return l;
	}

	@Override
	public member queryId(int id) {
		SqlSession se = DbConnection.getDb_mybatis();
		List<member> l = se.selectList("memberMapper.queryId", id);
		member[] m = l.toArray(new member[l.size()]);
		
		if (l.size() != 0) {
			return m[0];
		} else {
			return null;
		}
	}
	
	@Override
	public member queryMember(String username, String password) {
		SqlSession se = DbConnection.getDb_mybatis();
		Map<String, String> map = new HashMap();
		map.put("username", username);
		map.put("password", password);
		
		List<member> l = se.selectList("memberMapper.queryMember", map);
		member[] m = l.toArray(new member[l.size()]);
		
		if (l.size() != 0) {
			return m[0];
		} else {
			return null;
		}
	}

	@Override
	public void update(member m) {
		SqlSession se = DbConnection.getDb_mybatis();
		se.update("memberMapper.update", m);
		se.commit();
		se.close();
		
	}

	@Override
	public void delete(int id) {
		SqlSession se = DbConnection.getDb_mybatis();
		se.delete("memberMapper.delete", id);
		se.commit();
		se.close();
	}

	

}
