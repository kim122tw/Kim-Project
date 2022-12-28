package Model;

public class book {

	private Integer id;
	private String bookId;
	private String bookName;
	private Integer bookPrice;
	private Integer bookInventory;
	
	public book() {
		
	}
	
	public book(String bookId, String bookName, Integer bookPrice, Integer bookInventory) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookInventory = bookInventory;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Integer bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Integer getBookInventory() {
		return bookInventory;
	}
	public void setBookInventory(Integer bookInventory) {
		this.bookInventory = bookInventory;
	}
	
	
}
