package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import Employee.Department;
import Employee.JdbcUtills;
import entity.Student;
import utill.StudentInterfac;
import utill.StudentUtil;

public class StudentDao implements StudentInterfac<Student,Integer>{
	
	public StudentDao() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public Collection<Student> getAll() {
		Collection<Student>allStudent=new ArrayList<Student>();
		try (
			Connection connection=StudentUtil.connection();
			Statement statement=connection.createStatement();
		    ResultSet resultSet=statement.executeQuery("select * from Student");
		    ){
		    	while(resultSet.next()) {
		    		int rollNo=resultSet.getInt("rollNo");
		    		String name=resultSet.getString("name");
		    		String city=resultSet.getString("city");
		    		Student  student= new Student(rollNo,name,city);
		    		allStudent.add(student);
		    	}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return allStudent;
		    	
		    	
	}

	@Override
	public Student getOne(Integer rollNo) {
		Student foundStudent= null;
		String sqlQuery="select * from Student where rollNo=?";
try(
		Connection connection=StudentUtil.connection();
		PreparedStatement statement=connection.prepareStatement(sqlQuery);)
{
	statement.setInt(1, rollNo);
	statement.executeQuery();
	
	ResultSet rest=statement.executeQuery();
	
	if(rest.next()) {
		int rollNo1=rest.getInt(2);
		String name=rest.getString("nikhil");
		String city=rest.getString("mulawa");
		Student  dept= new Student(rollNo1,name,city);
		
	}
	
} catch (Exception e) {
	
		
		
	}
return foundStudent;
	}
	@Override
	public void add(Student student) {
		String sqlQuery = "insert into stud values (?,?,?)";
		try(
				Connection connection = JdbcUtilsStudent.buildConnection();
				PreparedStatement pstmt = connection.prepareStatement(sqlQuery);
				)
		{
			int rno = stud.getRollNo();
			String name = stud.getName();
			String city = stud.getCity();
			
			pstmt.setInt(1, rno);
			pstmt.setString(2, name);
			pstmt.setString(3, city);
			int updateCount = pstmt.executeUpdate();
			System.out.println(updateCount + " Record inserted ");
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
