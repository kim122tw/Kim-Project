package Dao.order;

import java.util.List;

import Model.porder;

public interface orderDao {
	// 新增
	void add(porder o);
	
	// 查詢
	List<porder> queryAll();
	porder queryId(String orderId);
	
	// 修改
	// 刪除
	void delete(int id);
}
