package Separatemain;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class AddData {
	
	public static void addData(){
		Connection con= ConnectionFactory.createConnection();
		
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
	}


