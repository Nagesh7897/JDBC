package Separatemain;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {
	public static void delete() {
		
		Connection con= ConnectionFactory.createConnection();
		
		try {
			Statement statement = con.createStatement();
			
			Scanner scanner=new Scanner(System.in);
			int del;
			System.out.println("Please Enter the Id which you want to delete");
			del=scanner.nextInt();
			
			statement.executeUpdate("DELETE from calltable where (`Id`='"+del+"')");
		//	statement.executeUpdate("DELETE from calltable where `Id`=`2`)";
			System.out.println(del + "  Id deleted");
			scanner.close();
		  } 
		
		catch (Exception e) {
			
			System.out.println(e);
		}
	}

}
