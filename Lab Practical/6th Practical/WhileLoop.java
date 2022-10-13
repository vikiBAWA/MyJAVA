/*
Question - Program to print sum of 10 natural numbers using while loop.
Name - Vikram Shinde
Date - 13/10/2022.
*/

package practical6;

import java.util.Scanner;

public class WhileLoop {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		System.out.print("Enter a number: ");
		int a1 = sc.nextInt();
		System.out.print("Enter a number: ");
		int a2 = sc.nextInt();
		System.out.print("Enter a number: ");
		int a3 = sc.nextInt();
		System.out.print("Enter a number: ");
		int a4 = sc.nextInt();
		System.out.print("Enter a number: ");
		int a5 = sc.nextInt();
		System.out.print("Enter a number: ");
		int a6 = sc.nextInt();
		System.out.print("Enter a number: ");
		int a7 = sc.nextInt();
		System.out.print("Enter a number: ");
		int a8 = sc.nextInt();
		System.out.print("Enter a number: ");
		int a9 = sc.nextInt();
		sc.close();
		int num = a+a1+a2+a3+a4+a5+a6+a7+a8+a9;

		while(i<=num)
		{
			System.out.println(num);
			break;
		}
	}

}