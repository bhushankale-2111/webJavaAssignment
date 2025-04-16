package entity;

public class Student {
	private int rollNo;
	private String name;
	private String City;
	public Student() {

	}
	public Student(int rollNo, String name, String city) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		City = city;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", City=" + City + "]";
	}

}
