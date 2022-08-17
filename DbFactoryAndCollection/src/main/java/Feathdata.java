import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Feathdata {

	public static void  fetchAllData() {
		Connection con= ConnectionFactory.createConnection();
		
		try {
			Statement statement=con.createStatement();
			ResultSet rs=statement.executeQuery("Select * from collection");         
				while(rs.next())
				{
					System.out.println(rs.getInt("Id")+"   "+rs.getString("Name")+"   "+rs.getString("Address")+rs.getInt("Age"));
				}

			} 
		catch (Exception e) {
			System.out.println(e);
			}
		
	}
	
}
