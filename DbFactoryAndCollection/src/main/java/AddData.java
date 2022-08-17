import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class AddData {
	public static void addData(){
		Connection con= ConnectionFactory.createConnection();
		Model model=new Model();
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Please Enter your Name");
		model.setName(scanner.next());
		System.out.println("Please Enter your Address");
		model.setAddress(scanner.next());
		System.out.println("Please Enter your Age");
		model.setAge(scanner.nextInt());
		  try
		  {
		      Statement statement =con.createStatement();
			  String quary=  "INSERT INTO `collectiondb`.`collection` ( `Name`, `Address`, `Age`) VALUES ('"+model.getName()+"', '"+model.getAddress()+"','"+model.getAge()+"')";
		      statement.executeUpdate(quary);
		      System.out.println("Data Entered!");
		  }
		  catch(Exception e) {
			  System.out.println(e);
		  }
		  scanner.close();
}
}
