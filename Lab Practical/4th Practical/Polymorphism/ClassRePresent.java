package polymorphism;

import java.util.Scanner;
public class ClassRepresent {

	Student name()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
		sc.close();
		
		if (name.equals("Masud"))
		{
			return new Masud();
		}
		
		else if (name.equals("Adarsh"))
		{
			return new Adarsh();
		}
		
		else if (name.equals("Vikram"))
		{
			return new Vikram();
		}
		
		return null;
	}
}