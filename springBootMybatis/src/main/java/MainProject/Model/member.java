package MainProject.Model;

public class member {
	
	private Integer id;
	private String memberName;
	private String username;
	private String password;
	private String address; 
	private String phone;
	
	public member() {
		
	}

	public member(String memberName, String username, String password, String address, String phone) {
		super();
		this.memberName = memberName;
		this.username = username;
		this.password = password;
		this.address = address;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
