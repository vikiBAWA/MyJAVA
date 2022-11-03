/* Write a java program to check if a particular element exist in a Linked List 
 * Name : Vikram Shinde
 * Date : 03-11-22
 */

package practical9;
import java.util.*;
class Code2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList <String> Name = new LinkedList <String> ();
		Name.add("SANJEET");
		Name.add("SHREEYASH");
		Name.add("LOKESH");
		Name.add("ROSHAN");
		Name.add("VAIBHAV");
		Name.add("HITESH");
		
		
        System.out.print("Enter a Student name :");
        String Group = sc.nextLine();
        sc.close();
      		// Checks whether the Name  exists or not.
      	if (Name.contains(Group.toUpperCase()))
      	{
    	  System.out.println(Group.toUpperCase()+" is present in the linked list.");
      } 
      	else
      	{
    	  System.out.println(Group.toUpperCase()+" is not present in the linked list.");
      }
	}

}