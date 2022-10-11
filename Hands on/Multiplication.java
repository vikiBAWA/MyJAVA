/*
 Print any multiplication table using for loop.
take the input from the user in all the program.

Name: Vikram Shinde
Date: 11.10.21
 */


package multiplication;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number: ");
			int Table = sc.nextInt();
			sc.close();			

	        for(int i = 1; i <= 10; ++i)
	        {
	            System.out.printf("%d * %d = %d \n", Table, i, Table * i);
	        }
	    	}	
	}