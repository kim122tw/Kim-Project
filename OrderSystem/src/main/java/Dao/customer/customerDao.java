package Dao.customer;

import Model.customer;

public interface customerDao {
	// 新增
	void add(customer c);
	
	// 查詢
	customer queryCustomer(String username, String password);
	customer queryUsername(String username);
	// 修改
	// 刪除
	
}
