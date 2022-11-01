package addingoverloading;

import java.util.Scanner;
public class Mainaddingoverloading {
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		addingoverloading a = new addingoverloading();
		System.out.println("Enter 1st Number:");
		int x = sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int y = sc.nextInt();
		System.out.println("Enter 3rd Number:");
		int z = sc.nextInt();
		
		sc.close();
		a.Addition(x);
		a.Addition(x, y);
		a.Addition(x, y, z);
		
	}
	}
