package Employee;

import java.lang.module.ModuleDescriptor.Builder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtills {
	
	
	public JdbcUtills() {
		
	}

	public static Connection buildConnection() throws Exception {
		//Establish connection
				String connectionUrl="jdbc:mysql://localhost:3306/cdac";
				String username="root";
				String password="password";
				Connection connection=DriverManager.getConnection(connectionUrl,username,password);
				//System.out.println("connection Established");
		return connection;
	}
}
