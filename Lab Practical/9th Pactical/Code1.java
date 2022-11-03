/* Write a java program to replace the second element of a ArrayList with the specified element 
 * Name : Vikram Shinde
 * Date : 03-11-22
 */
package practical9;

import java.util.*;
class Code1 {

		public static void main(String args[]) {
			ArrayList<String>  Name = new ArrayList<String>();

			Name.add("Masud");
			Name.add("Aditiya");
			Name.add("Shivam");
			Name.add("Vishal");
			Name.add("Gaurav");
			Name.add("Manoj");
			Name.add("Adarsh");
			  System.out.println("Original array list: " + Name);
			  
			  String obj1 = "Roshan";
			  
			  Name.set(1,obj1);
			  System.out.println("New array list: " + Name);	  

	}
}