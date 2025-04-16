package utill;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudentUtil {
public StudentUtil() {
	// TODO Auto-generated constructor stub
}
public static Connection connection() throws Exception {
	//Establish connection
			String connectionUrl="jdbc:mysql://localhost:3306/test";
			String username="root";
			String password="password";
			Connection connection=DriverManager.getConnection(connectionUrl,username,password);
			System.out.println("test connection Established");
	return connection;
} 

}

