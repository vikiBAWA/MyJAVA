/*
Create a program for calculation.read three values from the user for operation
first and second values as operands. third value as operator.
if user press1 => print addition of first and second
if user press2 => print subtraction of first and second
if user press3 => print multiplication of first and second
if user press4 => print division of first and second

Name : Vikram Shinde
Date : 06-10-22
*/

package Calculate;
import java.util.Scanner;
class Calculate
{
public static void main(String args[])
{
	
// Assigning a Integer
int x, y, z;
int addition;
int substraction;
int multiplication;
int division;

// creating a Scanner for user input
Scanner sc = new Scanner(System.in);

// taking a value from a 1st User
System.out.println("Enter your First Number : ");
x= sc.nextInt();

// taking a value from a 2nd Userr
System.out.println("Enter your Second Number :");
y= sc.nextInt();

// Options for choosing Solution Method for User
System.out.println("Press 1 => If you want to add Numbers ");
System.out.println("Press 2 => If you want to subtract Numbers");
System.out.println("Press 3 => If you want to multiply Numbers");
System.out.println("Press 4 => If you want to divide Numbers");
z= sc.nextInt();

// using if else 
if(z==1)
{
	addition= x+y;
System.out.println("Adding the variable x and y \n" +addition);
}
else if(z==2)
{
	substraction=x-y;
System.out.println("Substracting the variable x and y \n" +substraction);
}
else if(z==3)
{
multiplication= x*y;
System.out.println("Multiplying the variable x and y \n" +multiplication);
}

else if(z==4)
{
division= x/y;
System.out.println("Dividing the variable x and y \n" + division);
}

else 
{
System.out.println("Please check your input value");
}
}
}