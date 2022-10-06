/* 
Q. Create a program to find largest of two numbers.
Name : Vikram Shinde
Date : 06-10-22
*/

package largestnumber;
import java.util.Scanner;

class Largestnumberoftwonumbers
{
	public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);

	//taking 1st value from user
	System.out.println("Enter 1st Number");
	int num1 = sc.nextInt();
	
	//taking 2nd value from user
	System.out.println("Enter 2nd Number");
	int num2 = sc.nextInt();
	sc.close();
	// using a conditions
	// Creating if else Statements
	if(num1>num2)
	{
	System.out.print(num1 + " is larger than " + num2);
	}
	
	else if(num2>num1)
	{
		System.out.print(num2 + " is larger " + num1);
	}
	//Creating a another else Statement for equal number
	else
	{
		System.out.print(num2 + " is equal to " + num1);
	}
}
}

