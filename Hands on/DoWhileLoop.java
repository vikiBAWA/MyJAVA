package loops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		//test Expression
		for(int i = num; i>=1; i--)
		
		do
		{
			//i--;
			System.out.println(i);
			
		}
		
		
		while(num <= 0);
		{
			System.out.println("Here is the reverse of input Number");
			num++;
			//break;
		}
	}

}
