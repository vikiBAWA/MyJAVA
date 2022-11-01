package operators;

import java.util.Scanner;
class RelationOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter first Number: ");
		int num2 = sc.nextInt();
		sc.close();
		
		//Performing equal to Operation.
		System.out.println("num==num2: " + (num1 == num2));
		
		//Performing is not equal to Operation.
		System.out.println("num1=num: " + (num1!=num2));
		
		//Performing Greater than Operation.
		System.out.println("num1>num2: " + (num1>num2));
		
		//Performing less than Operation.
		System.out.println("num1<num2: " + (num1<num2));
		
	
		//Performing greater than equal to operation.
		System.out.println("num1>=num2: " + (num1>=num2));

		//Performing less than equal to operation.
		System.out.println("num1<=num2: " + (num1<=num2));
				
	}
	
}
