package Dao;

import java.util.List;

import Model.gradeList;
import Model.student;

public interface studentDao {

	// 新增
	void add(student s);
	
	// 查詢
	List<student> queryAll();
	List<student> queryBirth(int month);
	student queryStudent(String username, String password);
	List<student> classInformation(String teacherClass);
	List<gradeList> classGrade(String teacherClass);
	
	// 修改
	void update(student s);
	
	// 刪除
	void delete(int id);
	
}
