/* write a java program to compare two sets and retain elements which are same on both sets.(Using retainAll method)
 * Name : Vikram Shinde
 * Date : 03-11-22
 */

package practical9;

import java.util.*;

public class Code3 {

	public static void main(String[] args) {
		HashSet<String> Cars_1 = new HashSet<String>();
	     // use add() method to add values in the hash set
		Cars_1.add("BMW");
		Cars_1.add("AUDI");
		Cars_1.add("MERCEDES");
		Cars_1.add("ROLLS ROYCE");
	    System.out.println("First Cars Set content: "+Cars_1);
	          
	          HashSet<String>Cars_2 = new HashSet<String>();
	          Cars_2.add("AUDI");
	          Cars_2.add("MCLAREN");
	          Cars_2.add("MUSTANG");
	          Cars_2.add("LINCOLN");
	  		  
	          System.out.println("Second Cars Set content: "+Cars_2);
	          Cars_1.retainAll(Cars_2);
	          System.out.print("Common Elements : ");
	          System.out.println(Cars_2);

	}

}
