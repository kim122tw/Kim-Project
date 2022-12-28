package Model;

public class Order {
	
	private Integer id;
	private String Desk;
	private Integer A;
	private Integer B;
	private Integer C;
	private Integer sum;
	
	public Order(String desk, Integer a, Integer b, Integer c) {
		super();
		Desk = desk;
		A = a;
		B = b;
		C = c;
		sum = 120 * A + 140 * B + 115 * C;	
	}
	
	public Order() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesk() {
		return Desk;
	}

	public void setDesk(String desk) {
		Desk = desk;
	}

	public Integer getA() {
		return A;
	}

	public void setA(Integer a) {
		A = a;
	}

	public Integer getB() {
		return B;
	}

	public void setB(Integer b) {
		B = b;
	}

	public Integer getC() {
		return C;
	}

	public void setC(Integer c) {
		C = c;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "order [id=" + id + ", Desk=" + Desk + ", A=" + A + ", B=" + B + ", C=" + C + ", sum=" + sum + "]";
	}
	
	
}
