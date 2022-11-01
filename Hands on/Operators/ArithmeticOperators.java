package operators;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {

					//creating Scanner class object to take the input from the user.
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter 1st number: ");
					int i = sc.nextInt();
					
					System.out.println("Enter 2nd number: ");
					int j = sc.nextInt();

					sc.close();
					
					//writing operation 
					int add, sub, mul, mod;
					double div;
					add = i+j;
					sub = i-j;
					mul = i*j;
					div = i/j;
					mod = i%j;
			//Printing values
					System.out.println("Addition: " + add);
					System.out.println("Substraction: " + sub);
					System.out.println("Multiplication: " + mul);
					System.out.println("Division: " + div);
					System.out.println("Modules: " + mod);
				

			}

	}
