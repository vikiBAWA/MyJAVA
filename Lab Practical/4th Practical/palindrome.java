import java.util.Scanner;
public class palindrome

{
 
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String");
        String str = sc.nextLine();
	sc.close();
         
        String rev = (new StringBuilder(str)).reverse().toString();
         
        if(str.equals( rev)) 
	{
            System.out.println(str+" is Palindrome.");
         
	}
	    else 
	{
            System.out.println(str+" is not Palindrome.");
        }
    }
}