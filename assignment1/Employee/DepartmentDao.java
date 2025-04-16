package Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class DepartmentDao implements JdbcDao<Department, Integer> {

	private int deptno;

	@Override
	public Collection<Department> getAll() {
		Collection<Department>allDepartment=new ArrayList<Department>();
		try (
			Connection dbConnection=JdbcUtills.buildConnection();
			Statement stmt=dbConnection.createStatement();
		    ResultSet rest=stmt.executeQuery("select * from dept");
		    ){
		    	while(rest.next()) {
		    		int deptno=rest.getInt(1);
		    		String dname=rest.toString();
		    		String dloce=rest.toString();
		    		Department  dept= new Department(deptno,dname,dloce);
		    		allDepartment.add(dept);
		    	}
		    
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return allDepartment;
	}

	@Override
	public Department getOne(Integer  deptno) {
		Department foundDepartment= null;
				String sqlQuery="select * from emp where deptno=?";
		try(
				Connection dbConnection=JdbcUtills.buildConnection();
				PreparedStatement pstmt=dbConnection.prepareStatement(sqlQuery);)
		{
			pstmt.setInt(1, deptno);
			pstmt.executeQuery();
			
			ResultSet rest=pstmt.executeQuery();
			
			if(rest.next()) {
				int rollNo=rest.getInt(1);
	    		String name=rest.toString();
	    		String city=rest.toString();
	    		Department  dept= new Department();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return foundDepartment;
	}

	@Override
	public void add(Department dept) {
		String sqlQuery="insert into dept values(?,?,?)";
		try (
				Connection dbConnection=JdbcUtills.buildConnection();
				PreparedStatement pstmt=dbConnection.prepareStatement(sqlQuery); )
	{
			int deptno1=dept.getDeptno();
    		String dname=dept.getName();
    		String dloce=dept.getLocation();
    		
    		pstmt.setInt(1, deptno);
    		pstmt.setString(2, dname);
    		pstmt.setString(3, dloce);
			
    		int updatecount=pstmt.executeUpdate();
    		System.out.println(updatecount+"record Updated");
    		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		}

	@Override
	public void update(Department dept) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer deptno) {
		// TODO Auto-generated method stub
		
	}

}
