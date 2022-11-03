/* Write a java program to get the element in a tree set which is strictly greater than or equal to the given element
 * Name : Vikram Shinde
 * Date : 03-11-22
 */

package practical9;

import java.util.*;
 class Code4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Creating an object of TreeSets class
		TreeSet<Integer> obj = new TreeSet<>();
	      
		   // Add numbers in the Queue
		   obj.add(11);
		   obj.add(22);
		   obj.add(33);
		   obj.add(44);
		   obj.add(55);
		   obj.add(66);
		   obj.add(77);
		   obj.add(88);
		   obj.add(99);
		   System.out.println("Original TreeSet: "+obj);
		   System.out.print("Enter a number: ");
		   int num = sc.nextInt();
		   sc.close();
		   if(num<=90) {
			   System.out.print("Value of TreeSet: " + obj.ceiling(num));
		   }
		   else
		   {
			   System.out.println("There is no number greater than in this TreeSet: " + num);
		   }
	}

	}