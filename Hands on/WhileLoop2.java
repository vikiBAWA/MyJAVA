package loops;

import java.util.Scanner;

public class WhileLoop2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		//test Expression
		while(num < 0);
		{
			System.out.println("Welcome to the My World");
			num++;
			//break;
		}
		
	}

}
