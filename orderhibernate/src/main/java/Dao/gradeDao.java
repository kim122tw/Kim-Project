package Dao;

import java.util.List;

import Model.grade;

public interface gradeDao {

	// 新增
	void add(grade g);
	// 查詢
	List<String> gradePass(String teacherClass);
	
	// 修改
	void update(grade g);
	
	// 刪除
	void delete(int id);
	
}
