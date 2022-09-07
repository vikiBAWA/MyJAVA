import java.util.Scanner;
class Pattern
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
 System.out.println("Enter number:");
  int i = sc.nextInt();
	for(int x=1 ; x<=i ;x++)
		{
		for(int j=1 ; j<=i ;j++)
		    {
			{
				System.out.print("*");
			if (x%2==0)
			break;
			}
		    }
		System.out.println();
		}
  }
}