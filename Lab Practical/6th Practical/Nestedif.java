/*
Write a Program to demonstrate on nested if. Take the input from the user 
Name: Vikram Shinde
Date: 13.10.22 
 */

package practical6;
import java.util.Scanner;
class Nestedif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		{ 
			

					if(a<=35){ 
						System.out.println("Grade: E"); 
					} 
					
					else if(a<=55){ 
						System.out.println("Grade: D"); 
					}
					
					else if(a<=65){ 
						System.out.println("Grade: C"); 
					} 
					
					else if(a<=75){ 
						System.out.println("Grade: B"); 
					} 
					
					else if(a<=85){ 
						System.out.println("Grade: A"); 
					} 
					else if(a>=85){ 
						System.out.println("Grade: O"); 
					}
				} 
			} 
		}
	

