/* Test whether the person is eligible to give vote using (if-else)
 	Name: Vikram Shinde
 	Date: 11.10.21
 */

package vote;
import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		
		//System.out.println("  ");
		//String b = sc.next();
		sc.close();
		
		if (age < 18)
		{
			
			System.out.println("You are not Eligible for Voting");
		}
		
		else
		{
			
			System.out.println("You are Eligible for Voting");
		}
	}

}
