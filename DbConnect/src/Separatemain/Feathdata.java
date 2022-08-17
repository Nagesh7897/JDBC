package Separatemain;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Feathdata {
public static void  fetchAllData() {
	Connection con= ConnectionFactory.createConnection();
	
	try {
		Statement statement=con.createStatement();
		ResultSet rs=statement.executeQuery("Select * from calltable");         
			while(rs.next())
			{
				System.out.println(rs.getInt("Id")+"   "+rs.getString("Name")+"   "+rs.getString("Address"));
			}

		} 
	catch (Exception e) {
		System.out.println(e);
		}
	
}
}
