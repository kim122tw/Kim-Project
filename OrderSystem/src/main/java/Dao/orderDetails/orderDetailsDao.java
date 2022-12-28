package Dao.orderDetails;

import java.util.List;

import Model.orderDetails;
import Model.porder;

public interface orderDetailsDao {
	// 新增
	void add(orderDetails o);
	
	// 查詢
	List<orderDetails> queryId(String orderId);
	
	// 修改
	// 刪除
	void delete(String orderDetailsId);
	
}
