package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String teacherNumber;
	private String password;
	private String teacherName;
	private String teacherPosition;
	private String teacherClass;
	private String phone;
	
	public teacher() {
		super();
	}

	public teacher(String teacherNumber, String password, String teacherName, String teacherPosition,
			String teacherClass, String phone) {
		super();
		this.teacherNumber = teacherNumber;
		this.password = password;
		this.teacherName = teacherName;
		this.teacherPosition = teacherPosition;
		this.teacherClass = teacherClass;
		this.phone = phone;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherPosition() {
		return teacherPosition;
	}

	public void setTeacherPosition(String teacherPosition) {
		this.teacherPosition = teacherPosition;
	}

	public String getTeacherClass() {
		return teacherClass;
	}

	public void setTeacherClass(String teacherClass) {
		this.teacherClass = teacherClass;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "teacher [id=" + id + ", teacherNumber=" + teacherNumber + ", password=" + password + ", teacherName="
				+ teacherName + ", teacherPosition=" + teacherPosition + ", teacherClass=" + teacherClass + ", phone="
				+ phone + "]";
	}

	
}
