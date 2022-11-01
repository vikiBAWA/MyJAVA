package operators;

import java.util.Scanner;

class Uinaryoperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int num1 = sc.nextInt();
		sc.close();
		
		//Performing Pre increment Operation.
		++num1;
		System.out.println("Pre increment value: " + num1);
	
		//Performing Post increment Operation.
		num1++;
		System.out.println("Post increment value: " + num1);
		
		//Performing Pre decrement Operation.
		--num1;
		System.out.println("Pre Decrement value: " + num1);
		
		//Performing Post Decrement Operation.
		num1--;
		System.out.println("Post Decrement value: " + num1);
			
	
	}

}
