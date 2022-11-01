package array;
import java.util.*;
class Hashset {

	public static void main(String[] args) {

		HashSet<String> obj1 = new HashSet<>();
		  //using add() method
		  
		  obj1.add("Maksud");
		  obj1.add("Gaurav");
		  obj1.add("Manoj");
		  
		  System.out.println("Hashset is : " +obj1);
		  //calling iterator method()
		  Iterator<String> obj2 = obj1.iterator();
		  
		  System.out.println("Hashset using iterator");
		  while(obj2.hasNext()) 
		  //hashnext is method to check next value in the array 
		   {
		   
		   System.out.print(obj2.next());
		   
		   System.out.print(",");
		  } 
		 }
	}
