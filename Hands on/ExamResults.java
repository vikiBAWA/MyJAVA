/*
 demonstrate if-else statement of 5 subjects.the person who gets above 60% will be 
 passed otherwise failed.output should be like:Enter your name,Enter marks for the 5 
 subjects.
 
 Name: Vikram Shinde
 Date: 11.10.21
 */

package examresults;
import java.util.Scanner;
public class ExamResults {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String Name = sc.nextLine();
		
		System.out.println("Enter your total Marks for all Subjects: ");
		double Mark = sc.nextInt();
		
		sc.close();
		double TotalMarks = 500;
		
		double Percentage = Mark/TotalMarks*100;
		
		{
			System.out.println("You got: " + Percentage + "%" );
		}
		
		if (Mark < 300)
		{
			System.out.println("Sorry you Failed");			
		}
	
		else
		{
			System.out.println("Congratulations you Passed");
		}
		
	}

}
