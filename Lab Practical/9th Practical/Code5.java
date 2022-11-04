/* Write a java program to change PriorityQueue to maximum Priorityqueue Using Any loop
 * Name : Vikram Shinde
 * Date : 03-11-22
 */

package practical9;

import java.util.*;
class Code5 {

	public static void main(String[] args) {
		
		// Creating an object of PriorityQueue class
				PriorityQueue<Integer> num = new PriorityQueue<>(Collections.reverseOrder());
				 // use add() method to add values    
				// Add numbers in the Queue
				   num.add(11);
				   num.add(22);
				   num.add(33);
				   num.add(44);
				   num.add(55);
				   num.add(66);
				   num.add(77);
				   num.add(88);
				   num.add(99);
				
					//Printing Original priority queue
				   System.out.println("Original Priority Queue: "+num);
				   
				   //Printing Maximum priority Queue
				System.out.print("Maximum Priority Queue with Addition: ");
				Integer val = 100;
				//using do_while loop
				
				do
				{
				    System.out.print(val+"  ");
			      }
				while( ( val = num.poll()) != null);
	}

}
