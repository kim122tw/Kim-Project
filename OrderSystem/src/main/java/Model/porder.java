package Model;

import java.util.Date;


public class porder {
	private Integer id;
	private String orderId;
	private String customerName;
	private Date orderDate;
	private String address;
	private String phone;
	private Integer totalPrice;
	private String orderDetailsId;
	
	public porder() {
		
	}

	public porder(String customerName, Date orderDate, String address, String phone, Integer totalPrice) {
		super();
		this.customerName = customerName;
		this.orderDate = orderDate;
		this.address = address;
		this.phone = phone;
		this.totalPrice = totalPrice;
		orderId = "or" + Math.round(Math.random()*10000);
		orderDetailsId = "de" + Math.round(Math.random()*10000);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
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

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(String orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}
	
	
	
}
