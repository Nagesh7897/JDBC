package Separatemain;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
public static Connection createConnection()
{
	Connection con=null;
	try
	{
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   con = DriverManager.getConnection("jdbc:mysql://localhost:3307/connectjava", "root", "root");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return con;
}
}
