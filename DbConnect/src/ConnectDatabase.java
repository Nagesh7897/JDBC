import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectDatabase {

	public static void main(String[] args) {
	
		ConnectDatabase cdb = new ConnectDatabase();
			int choice;
			System.out.println("1. Add Data");
			System.out.println("2. Show Table");
			System.out.println("3. Delete");
			System.out.println("4. Update");
			
			System.out.println("Please Enter your Operation Number");
			Scanner scanner=new Scanner(System.in);
			choice= scanner.nextInt();
			
			if(choice==1)
			{
			cdb.adddata();
			}
			else if(choice==2)
			{
			cdb.showtable();
			}
			else if(choice==3)
			{
			cdb.delete();
			}
			else if(choice==4)
			{
			cdb.update();
			}
			else
			{
			System.out.println("Invalid Option");
			}
			 scanner.close();
	}

		
	public void adddata() {
	    	Scanner scanner=new Scanner(System.in);
			int idv;
			String namev , addv;
			System.out.println("Please Enter your ID");
			idv=scanner.nextInt(); 
			System.out.println("Please Enter your Name");
			namev=scanner.next();
			System.out.println("Please Enter your Address");
			addv=scanner.next();
	  try
	  {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/connectjava", "root", "root");
	      Statement statement =con.createStatement();
		  String quary=  "INSERT INTO `connectjava`.`calltable` (`Id`, `Name`, `Address`) VALUES ('"+idv+"', '"+namev+"', '"+addv+"')";
	      statement.executeUpdate(quary);
	      System.out.println("Data Entered!");
	  }
	  catch(Exception e) {
		  System.out.println(e);
	  }
	  scanner.close();
	}
	
	
	public void showtable() {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/connectjava", "root", "root");
			Statement statement =con.createStatement();
	
			ResultSet rs=statement.executeQuery("Select * from calltable");         
			while(rs.next())
			{
				System.out.println(rs.getInt("Id")+"   "+rs.getString("Name")+"   "+rs.getString("Address"));
				//	System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3));         //we can provide row number also to get the data
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	
	public void delete() {
		try
		{
			Scanner scanner=new Scanner(System.in);
			int del;
			System.out.println("Please Enter the Id which you want to delete");
			del=scanner.nextInt();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/connectjava", "root", "root");
			Statement statement =con.createStatement();
			statement.executeUpdate("DELETE from calltable where (`Id`='"+del+"')");
		//	statement.executeUpdate("DELETE from calltable where `Id`=`2`)";
			System.out.println(del + "  Id deleted");
			scanner.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void update() {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/connectjava", "root", "root");
			Statement statement =con.createStatement();
			
			Scanner scanner=new Scanner(System.in);
			int updt;
			System.out.println("1. Name Update");
			System.out.println("2. Address Update");
			System.out.println("Please Enter your Operation Number");
			updt=scanner.nextInt();
			
			if(updt==1) {
				System.out.println("Please Enter Id number to update the name");
				int	id=scanner.nextInt();
				System.out.println("Please Enter Name to Update");
				String name=scanner.next();
				
				String query="UPDATE `connectjava`.`calltable` SET `Name` = '"+name+"' WHERE (`Id` = '"+id+"')";
				statement.executeUpdate(query);
			}
			
			else if(updt==2) {
				System.out.println("Please Enter Id number to update the Address");
				int	id=scanner.nextInt();
				System.out.println("Please Enter Name to Update");
				String add=scanner.next();
				
				String query="UPDATE `connectjava`.`calltable` SET `Address` = '"+add+"' WHERE (`Id` = '"+id+"')";
				statement.executeUpdate(query);
			}
			else
			{
				System.out.println("Invalid Option");
			}
			
			ResultSet rs=statement.executeQuery("Select * from calltable");         
			while(rs.next())
			{
				System.out.println(rs.getInt("Id")+"   "+rs.getString("Name")+"   "+rs.getString("Address"));
			}
			scanner.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
}


	
	
	      
//	      ResultSet rs=statement.executeQuery("Select * from calltable");         
//		while(rs.next())
//		{
//			System.out.println(rs.getInt("Id")+"   "+rs.getString("Name")+"   "+rs.getString("Address"));
//		//	System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3));         //we can provide row number also to get the data
//		}
//			
//	  }
//	  catch(Exception e) {
//		  System.out.println(e);
//		  //e.printStackTrace                    //It is the method which can provide all error related massage
//	  }
//	
//		}
//
//	}

