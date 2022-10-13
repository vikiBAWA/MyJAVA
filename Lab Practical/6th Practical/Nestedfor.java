/*
 Write a Program to demonstrate on nested For Loop and print the output.
Name: Vikram Shinde
Date: 13.10.22 
 */
package practical6;
import java.util.Scanner;
public class Nestedfor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		{ 
			for (int i=0;i<=a;++i){
			
				for(int j=1;j<=i;++j){
				
				System.out.print("*");
	}
				System.out.println("*");
	}
	}
	}
	}
