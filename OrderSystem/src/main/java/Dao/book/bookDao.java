package Dao.book;

import java.util.List;

import Model.book;

public interface bookDao {
	// 新增
	void add(book b);
	
	// 查詢
	book query(String bookName);
	List<book> query();
	
	// 修改
	void updateInventory(book b);
	
	// 刪除
}
