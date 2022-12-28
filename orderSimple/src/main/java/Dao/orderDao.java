package Dao;

import java.util.List;

public interface orderDao {
	// 新增
	void add(Object o);
	
	// 查詢
	List<Object> queryall();
	List<Object> querysum(int start, int end);
	List<Object> queryId(int id);
	
	// 修改
	void update(Object o);
	
	// 刪除
	void delete(int id);
}
