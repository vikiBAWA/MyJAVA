/*
Question - Program to print sum of only positive numbers using do_while loop.
Take the input from the user. 
If the user enters any negative number than that number should not be added in sum.
Name - Vikram Shinde
Date - 13/10/2022.
*/
package practical6;

import java.util.Scanner;

public class DoWhileLoop{

	public static void main(String args[])
	{
	
		    int sum = 0;
		    int number = 0;

		    // create an object of Scanner class
		    Scanner sc = new Scanner(System.in);
		    
		    // do...while loop continues 
		    // until entered number is positive
		    do {
		      // add only positive numbers
		      sum += number;
		      System.out.print("Enter number: ");
		      number = sc.nextInt();
		      
		    } while(number >= 0); 
		    
		    System.out.println("Sum = " + sum);
		    sc.close();
		  }
}