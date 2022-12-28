package Dao.order;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import Dao.DbConnection;
import Model.porder;

public class implOrder implements orderDao{

	public static void main(String[] args) {
		System.out.println(new implOrder().queryAll());
	}

	@Override
	public void add(porder o) {
		SqlSession se = DbConnection.getDb();
		se.insert("orderMapper.add", o);
		se.commit();
	}

	@Override
	public List<porder> queryAll() {
		SqlSession se = DbConnection.getDb();
		List<porder> l = se.selectList("orderMapper.queryAll");
		return l;
	}
	
	@Override
	public porder queryId(String orderId) {
		SqlSession se = DbConnection.getDb();
		List<porder> l = se.selectList("orderMapper.queryId", orderId);
		porder[] p = l.toArray(new porder[l.size()]);
		if (l.size() != 0) {
			return p[0];
		} else {
			return null;
		}
		
	}

	@Override
	public void delete(int id) {
		SqlSession se = DbConnection.getDb();
		se.delete("orderMapper.delete", id);
		se.commit();
		
	}

}
