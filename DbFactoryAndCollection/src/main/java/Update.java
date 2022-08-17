import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Update {
	public static void update() {
		Connection con= ConnectionFactory.createConnection();
		Model model=new Model();
		try {
			Statement statement= con.createStatement();
			Scanner scanner=new Scanner(System.in);
			int updt;
			System.out.println("1. Name Update");
			System.out.println("2. Address Update");
			System.out.println("3. Age");
			System.out.println("Please Enter your Operation Number");
			updt=scanner.nextInt();
			
			if(updt==1) {
				System.out.println("Please Enter Id number to update the name");
				int	id=scanner.nextInt();
				System.out.println("Please Enter Name to Update");
				model.setName(scanner.next());
				
				String query="UPDATE `collectiondb`.`collection` SET `Name` = '"+model.getName()+"' WHERE (`Id` = '"+id+"')";
				statement.executeUpdate(query);
			}
			
			else if(updt==2) {
				System.out.println("Please Enter Id number to update the Address");
				int	id=scanner.nextInt();
				System.out.println("Please Enter Name to Update");
				model.setAddress(scanner.next());
				
				String query="UPDATE `collectiondb`.`collection` SET `Address` = '"+model.getAddress()+"' WHERE (`Id` = '"+id+"')";
				statement.executeUpdate(query);
			}
			else if(updt==3) {
				System.out.println("Please Enter Id number to update the Address");
				int	id=scanner.nextInt();
				System.out.println("Please Enter Age to Update");
				model.setAge(scanner.nextInt());
				
				String query="UPDATE `collectiondb`.`collection` SET `Age` = '"+model.getAge()+"' WHERE (`Id` = '"+id+"')";
				statement.executeUpdate(query);
			}
			
			else
			{
				System.out.println("Invalid Option");
			}
			
			ResultSet rs=statement.executeQuery("Select * from collection");         
			while(rs.next())
			{
				System.out.println(rs.getInt("Id")+"   "+rs.getString("Name")+"   "+rs.getString("Address")+rs.getInt("Age"));
			}
			scanner.close();
		} 
		
		catch (Exception e)
		{
		System.out.println(e);
		}
		
	}
}
