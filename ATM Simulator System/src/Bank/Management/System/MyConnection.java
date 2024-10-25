package Bank.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MyConnection {

	Connection connection;
	Statement statement;

	MyConnection() {
		try {
			// Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root",
					"");
			//create statement
			statement = connection.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
