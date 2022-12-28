package Dao.customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import Dao.DbConnection;
import Model.customer;

public class implCustomer implements customerDao {

	public static void main(String[] args) {
		System.out.print(new implCustomer().queryCustomer("hhh", "1234").getCustomerName());
	}
	
	@Override
	public void add(customer c) {
		SqlSession se = DbConnection.getDb();
		se.insert("customerMapper.add", c);
		se.commit();
		
	}

	@Override
	public customer queryCustomer(String username, String password) {
		SqlSession se = DbConnection.getDb();
		Map<String, String> map = new HashMap<>();
		map.put("username", username);
		map.put("password", password);
		
		List<customer> l = se.selectList("customerMapper.queryCustomer", map);
		customer[] c = l.toArray(new customer[l.size()]);
		if (l.size() != 0) {
			return c[0];
		} else {
			return null;
		}
	}

	@Override
	public customer queryUsername(String username) {
		SqlSession se = DbConnection.getDb();
		
		List<customer> l = se.selectList("customerMapper.queryUsername", username);
		customer[] c = l.toArray(new customer[l.size()]);
		
		if (l.size() != 0) {
			return c[0];
		} else {
			return null;
		}
	}

}
