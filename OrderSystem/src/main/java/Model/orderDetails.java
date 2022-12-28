package Model;

public class orderDetails {
	
	private Integer id;
	private String orderDetailsId;
	private String bookId;
	private String bookName;
	private Integer bookQuantity;
	private Integer bookPrice;
	
	public orderDetails() {
		
	}

	public orderDetails(String orderDetailsId, String bookId, String bookName, Integer bookQuantity, Integer bookPrice) {
		super();
		this.orderDetailsId = orderDetailsId;
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookQuantity = bookQuantity;
		this.bookPrice = bookPrice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(String orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Integer getBookQuantity() {
		return bookQuantity;
	}

	public void setBookQuantity(Integer bookQuantity) {
		this.bookQuantity = bookQuantity;
	}

	public Integer getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Integer bookPrice) {
		this.bookPrice = bookPrice;
	}

	
	
	
}
