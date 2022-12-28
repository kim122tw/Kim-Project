package MainProject.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import MainProject.Model.member;

@Mapper
public interface memberDao {

	// Create
	@Insert("insert into member(memberName, username, password, address, phone)"
		  + "values(#{memberName}, #{username}, #{password}, #{address}, #{phone})")
	void add(member m);
	
	// Read
	@Select("select * from member")
	List<member> queryAll();
	
	@Select("select * from member where username=#{username}")
	List<member> queryUsername(String username);
	
	@Select("select * from member where username=#{username} and password=#{password}")
	member queryMember(String username, String password);
	
	// Update
	@Update("update member set memberName=#{memberName}, username={username}, password=#{password},"
		  + "address=#{address}, phone=#{phone}, mobile=#{mobile} where id = #{id}")
	void update(member m);
	
	// Delete
	@Delete("delete from member where id = #{id}")
	void delete(int id);
	
}
