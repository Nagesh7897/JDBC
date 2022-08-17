package WithoutDB;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainCall {

	public static void main(String[] args) {
		for(int i=0; i<10;i++) {
		int option;
		System.out.println("1. Show Data");
		System.out.println("2. Add Data");
		System.out.println("3. Delete");
		System.out.println("4. Update");
		
		System.out.println("Please Enter your Operation Number");
		Scanner scanner=new Scanner(System.in);
		option= scanner.nextInt();
		
		switch(option) {
		
		case 1 : Controller.showData();
		         break;
		          
		case 2 : Controller.addData();
		         break;
		
		case 3 : Controller.deleteData();
		         break;
		         
		case 4 :Controller.updateData();
		        break;
		        
	    default: System.out.println("Invalid Option");
		}	 
				
		 scanner.close();
		}
	}

	}

