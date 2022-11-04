package nullpointer;
import  java.util.*;

class NullPointerException
{
	public static void main (String[] args)
	{
		// Initializing String variable with null value
		String NPE = null;

		// Checking if NPE.equals null or works fine.
		try
		{
			// This line of code throws NullPointerException
			// because NPE is null
			if (NPE.equals("Vik"))
				System.out.print("Same");
			else
				System.out.print("Not Same");
		}
		catch(NullPointerException a)
		{
			System.out.print("Null Pointer Exception Caught");
		}
	}
}
