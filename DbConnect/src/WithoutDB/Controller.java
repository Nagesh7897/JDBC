package WithoutDB;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Separatemain.AddData;
import Separatemain.Delete;
import Separatemain.Feathdata;
import Separatemain.Update;

public class Controller {
	
	static List<Model> list= new LinkedList<>(); 
	
	public static void showData()
	{
		list= Controller.addData();
		for(Model user:list)
		{
			System.out.println(user.getName()+"  "+user.getAge()+"   "+ user.getAddress());
		}
		
	}
	
	
	public static List<Model> addData()
	{	
	Model model=new Model();
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Please Enter Age");
	model.setAge(scanner.nextInt());
	System.out.println("Please Enter Name");
	model.setName(scanner.next());
	System.out.println("Please Enter Address");
	model.setAddress(scanner.next());
	list.add(model);
	return list;
	}
	
	public static void deleteData()
	{
		
		
	}
	
	public static void updateData()
	{
	
		
	}

}
