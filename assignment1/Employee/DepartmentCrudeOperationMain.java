package Employee;

import java.util.Collection;


public class DepartmentCrudeOperationMain {
	

public static void showAllDept() {
	JdbcDao<Department, Integer> dao=new DepartmentDao();
	Collection<Department>deptlist=dao.getAll();
	
 /*  
   for(Department dept :deptlist)
		System.out.println(dept);
 */
	deptlist.stream().forEach(dept-> System.out.println(dept));
	
}
	public static void  showOneDepartmentt() {
   JdbcDao<Department, Integer> dao=new DepartmentDao();
    Department dept=dao.getOne(20);
		
	if (dept!=null)
	{
		System.out.println(dept);
	}
		
	}
	public static void addNewDepartment() {
		JdbcDao<Department, Integer> dao=new DepartmentDao();
	    Department dept=new Department(50,"printing","new Delhi");
	    dao.add(dept);
		
	}
	

	public static void main(String[] args) {
		
		//showOneDepartmentt();
		showAllDept();
		addNewDepartment();
		
	}

}

