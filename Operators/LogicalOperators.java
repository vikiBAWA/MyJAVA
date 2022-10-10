package operators;
import java.util.Scanner;
public class LogicalOperators {

	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter 1st number: ");
		    int num1 = sc.nextInt();
		    
		    System.out.print("Enter 2nd number: ");
		    int num2 = sc.nextInt();

		    System.out.print("Enter 3rd number: ");
		    int num3 = sc.nextInt();
		    
		    sc.close();
		    
		    System.out.println("Performing AND Operation: ");
		    //using logical AND to verify 2 constraint.
		    
		    if((num1<num2)&&(num2==num3))
		    {
		      int sum = num1+num2+num3;
		      System.out.println("sum is: " + sum);
		    }
		    
		    else
		    {
		      System.out.println("False condition.");
		    }
		    
		    System.out.println("Performing OR Operation");
		    
		    //using logical OR to verify 2 constraint.
		    if((num1<num2)||(num2==num3))
		    {
		      int sum = num1+num2+num3;
		      System.out.println("sum is: " + sum);
		    }
		    
		    else
		    {
		      System.out.println("False condition.");
		    }
		    
		    System.out.println("Performing NOT Operation");
		    
		    System.out.println("!(num1<num2)" + !(num1<num2));
		    System.out.println("!(num2==num3)" + !(num2==num3));
		  }
}
