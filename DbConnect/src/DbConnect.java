import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class DbConnect {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter your ID");
		int idv;
		idv=scanner.nextInt();
		String namev , passv, mobv, emailv; 
		System.out.println("Please Enter your Name");
		namev=scanner.next();
		System.out.println("Please Enter your Password");
		passv=scanner.next();
		System.out.println("Please Enter your Mobile No.");
		mobv=scanner.next();
		System.out.println("Please Enter your email Id");
		emailv=scanner.next();
  try
  {
	 System.out.println("2");
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  System.out.println("Driver Found");
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/connectjava", "root", "root");
	//  Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/connectjava", "root", "root");
	                                                               //localhost and url we can provide any of one
	  Statement statement =con.createStatement();
	  statement.executeUpdate("insert into userdetails(`Id`,`Name`,`Password`,`MobileNo`,`E-mail`) values('"+idv+"','"+namev+"','"+passv+"','"+mobv+"','"+emailv+"')");
  }
  catch(Exception e) {
	  System.out.println(e);
	  //e.printStackTrace                    //It is the method which can provide all error related massage
  }
  scanner.close();
	}

}