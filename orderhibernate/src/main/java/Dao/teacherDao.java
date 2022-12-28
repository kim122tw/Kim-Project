package Dao;

import java.util.List;


import Model.teacher;

public interface teacherDao {

	// 新增
	void add(teacher t);
	// 查詢
	teacher queryTeacher(String username, String password);

	
	// 修改
	void update(teacher t);
	
	// 刪除
	void delete(int id);
	
}
