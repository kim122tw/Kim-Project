package Dao.orderDetails;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import Dao.DbConnection;
import Model.orderDetails;
import Model.porder;

public class implOrderDetails implements orderDetailsDao {

	public static void main(String[] args) {
		orderDetails orderDetails  = new orderDetails("hah", "123", "12", 5, 5);
		new implOrderDetails().add(orderDetails);

	}

	@Override
	public void add(orderDetails o) {
		SqlSession se = DbConnection.getDb();
		se.insert("orderDetailsMapper.add", o);
		se.commit();
		
	}

	@Override
	public List<orderDetails> queryId(String orderId) {
		SqlSession se = DbConnection.getDb();
		List<orderDetails> l = se.selectList("orderDetailsMapper.queryId", orderId);
		return l;
	}
	

	@Override
	public void delete(String orderDetailsId) {
		SqlSession se = DbConnection.getDb();
		se.delete("orderDetailsMapper.delete", orderDetailsId);
		se.commit();
		
	}

}
