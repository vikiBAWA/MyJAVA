package bikecode;

import java.util.Scanner;
public class BikeFactory {
	
	Bike factory()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Which Bike you want to ride: ");
	String name = sc.nextLine();
    sc.close();
	
	
    if (name.equalsIgnoreCase("Pulsar"))
    {
    	return new Pulsar();
    }
    else if (name.equalsIgnoreCase("Shine"))
    {
    	return new Shine();
    }
    
    return null;
   }
}