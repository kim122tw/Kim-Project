package Model;

public class gradeList {

	private String studentNumber;
	private String studentName;
	private Integer chinese;
	private Integer english;
	private Integer math;
	private Integer physical;
	private Integer science;
	private Integer total;
	
	public gradeList() {
		
	}
	
	public gradeList(String studentNumber, String studentName, Integer chinese, Integer english, Integer math,
			Integer physical, Integer science, Integer total) {
		super();
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.chinese = chinese;
		this.english = english;
		this.math = math;
		this.physical = physical;
		this.science = science;
		this.total = total;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getChinese() {
		return chinese;
	}

	public void setChinese(Integer chinese) {
		this.chinese = chinese;
	}

	public Integer getEnglish() {
		return english;
	}

	public void setEnglish(Integer english) {
		this.english = english;
	}

	public Integer getMath() {
		return math;
	}

	public void setMath(Integer math) {
		this.math = math;
	}

	public Integer getPhysical() {
		return physical;
	}

	public void setPhysical(Integer physical) {
		this.physical = physical;
	}

	public Integer getScience() {
		return science;
	}

	public void setScience(Integer science) {
		this.science = science;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "gradeList [studentNumber=" + studentNumber + ", studentName=" + studentName + ", chinese=" + chinese
				+ ", english=" + english + ", math=" + math + ", physical=" + physical + ", science=" + science
				+ ", total=" + total + "]";
	}
	
	
	
	
}
