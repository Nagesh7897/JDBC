package Separatemain;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Update {
	public static void update() {
		Connection con= ConnectionFactory.createConnection();
		
		try {
			Statement statement= con.createStatement();
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
		
		catch (Exception e)
		{
		System.out.println(e);
		}
		
	}

}
