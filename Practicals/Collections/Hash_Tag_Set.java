/* 
  HashSet class implements the set interface,
  it uses hash table to store the elements and contains only unique elements.
*/
package array;

import java.util.*;

class Hash_Tag_Set {

	public static void main(String[] args) {
		
		HashSet<Integer> obj = new HashSet<>();
		
		//using add method
		obj.add(52);
		obj.add(54);
		obj.add(21);
		obj.add(13);
		obj.add(05);
		
		System.out.println("HashSet is:" + obj);
		
		//calling Iterator() method.
		Iterator<Integer> obj1 = obj.iterator();
		
		System.out.print("HashSet using iterator: ");
		
		//hasNext is method to check next value in  the array 
		while(obj1.hasNext())
		{
			System.out.print(obj1.next());
			System.out.print(",");
		}
	}

}