/*WAP to demonstrate on Method overloading concept of Arithmetic Addition.Take the input from the user
 Name : Vikram Shinde
 Date : 07-10-22
*/

package addingoverloading;

public class addingoverloading {

	void Addition(int x)
	{
	 System.out.println("\n1st Number: " + (x));
	}
	
	void Addition(int x, int y)
	{
	 System.out.println("Added  1st & 2nd Number: " + (x + y));
	}

	void Addition(int x, int y, int z)
	{
		System.out.println("Added 1st, 2nd & 3rd Number: " + (x + y + z));
	}
}
