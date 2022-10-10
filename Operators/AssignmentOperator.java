package operators;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter first Number: ");
		int num2 = sc.nextInt();
		sc.close();
	
		num1+=num2;
		System.out.println("num1=: " + num1);
		num1-=num2;
		System.out.println("num1=: " + num1);
		num1*=num2;
		System.out.println("num1=: " + num1);
		num1/=num2;
		System.out.println("num1=: " + num1);
		num1&=num2;
		System.out.println("num1=: " + num1);
			
	}

}
