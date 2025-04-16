package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		try {
			
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");

		Statement statement=connection.createStatement();
		String sql="select * from Employee where eSal<20000";
		ResultSet resultSet =statement.executeQuery(sql);
		while(resultSet.next())
		{
			String eId=resultSet.getString("eId");
			String eName=resultSet.getString("eName");
			String eSal=resultSet.getString("eSal");
			System.out.println("Employee Id:"+eId+"Employee name:"+eName+"Employee Sal:"+eSal);
		}
		statement.close();
		connection.close();
		
	
	} catch (Exception e) {
		e.printStackTrace();
	}

	}
	}
