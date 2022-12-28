package Dao.book;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import Dao.DbConnection;
import Model.book;

public class implBook implements bookDao {

	public static void main(String[] args) {
		
		book book = new implBook().query("國語字典");
		System.out.print(book.getBookName());
	}

	@Override
	public void add(book b) {
		SqlSession se = DbConnection.getDb();
		se.insert("bookMapper.add", b);
		se.commit();

	}
	

	@Override
	public book query(String bookName) {
		SqlSession se = DbConnection.getDb();
		List<book> l = se.selectList("bookMapper.queryName", bookName);
		book[] b = l.toArray(new book[l.size()]);
		if (l.size() != 0) {
			return b[0];
		} else {
			return null;
		}
		
	}
	
	@Override
	public List<book> query() {
		SqlSession se = DbConnection.getDb();
		List<book> l = se.selectList("bookMapper.query");
		
		return l;
	}


	@Override
	public void updateInventory(book b) {
		SqlSession se = DbConnection.getDb();
		se.update("bookMapper.updateInventory", b);
		se.commit();
		
	
		
		
		
	}

	

}
