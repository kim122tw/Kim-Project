package Model;

public class customer {

	private Integer customerId;
	private String customerName;
	private String username;
	private String password;
	private String address;
	private String phone;
	
	public customer() {
		
	}

	public customer(String customerName, String username, String password, String address, String phone) {
		super();
		this.customerName = customerName;
		this.username = username;
		this.password = password;
		this.address = address;
		this.phone = phone;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
