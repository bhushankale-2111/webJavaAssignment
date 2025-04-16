package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleSelectQyery {

	public static void main (String[] args) throws ClassNotFoundException, SQLException {
		String DriverName="com.mysql.cj.jdbc.Driver";
		Connection dbconnection=null;	
		Statement stmt=null;
		ResultSet rest=null;
		try {
		//load driver
		
		//Every jdbc driver is driver implementation specific java class;
		
			Class.forName(DriverName);
			System.out.println("driver loaded");
			
		
		//Establish connection
		String connectionUrl="jdbc:mysql://localhost:3306/cdac";
		String username="root";
		String password="password";
		
			
			dbconnection=	DriverManager.getConnection(connectionUrl,username,password);
			System.out.println("connection Established");
			
			//step3 obtain statement
			stmt=dbconnection.createStatement();
			
			//step 4 exicute qyery
			String sql= "select empno,ename,sal from emp";
			rest=stmt.executeQuery(sql);
			// perform Nevigation
			System.out.println("empno "+"ename "+"sal " );
			while(rest.next())
			{
				String ename=rest.getString(2);
				float sal=rest.getFloat(3);
				  float empno= rest.getFloat(1);
				System.out.println(empno+" "+ename+" "+sal);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			rest.close();
			stmt.close();
			dbconnection.close();
			
		}
	

	}

}
