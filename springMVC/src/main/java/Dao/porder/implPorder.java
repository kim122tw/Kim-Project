package Dao.porder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import Dao.DbConnection;
import Model.member;
import Model.porder;

public class implPorder implements porderDao {
	
	public static void main(String[] args) {
		
		

	}

	@Override
	public void add(porder p) {
		SqlSession se = DbConnection.getDb_mybatis();
		se.insert("porderMapper.add", p);
		se.commit();
		se.close();
		
	}

	@Override
	public List<porder> queryAll() {
		SqlSession se = DbConnection.getDb_mybatis();
		List<porder> l = se.selectList("porderMapper.queryAll");
		return l;
	}

	@Override
	public porder queryId(int id) {
		SqlSession se = DbConnection.getDb_mybatis();
		List<porder> l = se.selectList("porderMapper.queryId", id);
		porder[] p = l.toArray(new porder[l.size()]);
		
		if (l.size() != 0) {
			return p[0];
		} else {
			return null;
		}
	}

	@Override
	public List<porder> querySum(int start, int end) {
		SqlSession se = DbConnection.getDb_mybatis();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", start);
		map.put("end", end);
		List<porder> l = se.selectList("porderMapper.querySum", map);
		return l;
	}

	@Override
	public void update(porder p) {
		SqlSession se = DbConnection.getDb_mybatis();
		se.update("porderMapper.update", p);
		se.commit();
		se.close();
	}

	@Override
	public void delete(int id) {
		SqlSession se = DbConnection.getDb_mybatis();
		se.delete("porderMapper.delete", id);
		se.commit();
		se.close();
	}
	
}
