package Dao.member;

import java.util.List;

import Model.member;

public interface memberDao {
	//Create
	void add(member m);
	
	
	//Reader
	List<member> queryAll();
	member queryId(int id);
	member queryMember(String username, String password);
	
	
	//update
	void update(member m);
	
	
	//delete
	void delete(int id);

}
