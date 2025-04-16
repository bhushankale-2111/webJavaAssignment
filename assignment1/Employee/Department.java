package Employee;

public class Department {
	private int deptno;
	private String name;
	private String location;
	
	public Department(int deptno, String name, String location) {
		super();
		this.deptno = deptno;
		this.name = name;
		this.location = location;
	}

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", name=" + name + ", location=" + location + "]";
	}

	
}
