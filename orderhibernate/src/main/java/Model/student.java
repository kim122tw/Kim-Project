package Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String studentNumber;
	private String studentName;
	private Date studentBirth;
	private String studentClass;
	private String bestSubject;
	private String address;
	private String phone;
	
	public student() {
		super();
	}

	public student(String studentNumber, String studentName, Date studentBirth, String studentClass,
			String bestSubject, String address, String phone) {
		super();
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentBirth = studentBirth;
		this.studentClass = studentClass;
		this.bestSubject = bestSubject;
		this.address = address;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Date getStudentBirth() {
		return studentBirth;
	}

	public void setStudentBirth(Date studentBirth) {
		this.studentBirth = studentBirth;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getBestSubject() {
		return bestSubject;
	}

	public void setBestSubject(String bestSubject) {
		this.bestSubject = bestSubject;
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

	@Override
	public String toString() {
		return "student [id=" + id + ", studentNumber=" + studentNumber + ", studentName=" + studentName
				+ ", studentBirth=" + studentBirth + ", studentClass=" + studentClass + ", bestSubject=" + bestSubject
				+ ", address=" + address + ", phone=" + phone + "]";
	}
	
	
}
