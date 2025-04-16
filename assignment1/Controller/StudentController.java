package Controller;


import java.util.Collection;

import Employee.Department;
import Employee.DepartmentDao;
import Employee.JdbcDao;
import dao.StudentDao;
import entity.Student;
import utill.StudentInterfac;

public class StudentController {
	
	
	
public static void allStudentDetails()
{
	StudentInterfac<Student, Integer> dao=new StudentDao();
	Collection<Student>studentlist=dao.getAll();
	studentlist.stream().forEach(student-> System.out.println(student));
}
public static void oneStudent()
{    StudentInterfac<Student, Integer> dao=new StudentDao();
	 StudentDao dao=new StudentDao();
	 Student student=dao.getOne(rollNo);
	}
private static void addNewStudent(int rno,String name,String city)
	{
		StudDaoJdbc<Student, Integer> dao = new studentDao();
		Student student = new Student(rno,name,city);
		dao.add(student);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		int rno = 0;
		String name = null;
		String city = null;
		boolean exit = true;
		
		while(exit)
		{
			System.out.println("1.Show All Students");
			System.out.println("2.Get Student By roll No ");
			System.out.println("3.Add New Student ");
			System.out.println("0.Exit");
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("----- All Students ----");
				showAllStudents();
				break;
				
			case 2:
				System.out.println("---- Student ---- ");
				System.out.println("Enter Roll no : ");
				rno = sc.nextInt();
				showOneStudent(rno);
				break;
				
			case 3:
				System.out.println("--- Add new Student ----");
				System.out.println("Enter Roll no : ");
				rno = sc.nextInt();
				System.out.println("Enter Name : ");
				name =sc.next();
				System.out.println("Enter city : ");
				city = sc.next();
				addNewStudent(rno, name, city);
				break;
				
			case 0:
				exit = false;
				break;
			}
		}

		
	}

}
