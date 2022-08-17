package test;
import java.sql.*;
public class SqlConnection {

	public static void main(String[] args) {

				try {
					  Class.forName("com.mysql.cj.jdbc.Driver");
					  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/movie", "root", "root");
				      Statement statement =con.createStatement();
					 
	
				      ResultSet rs=statement.executeQuery("Select * from movies");         
						while(rs.next())
						{
							System.out.println(rs.getString("M_name")+"   "+rs.getInt("release_year")+"   "+rs.getDouble("budget"));
						}
					con.close();
				}    
				catch (Exception e)
				{
					System.out.println(e);
				}
			

	}
}
