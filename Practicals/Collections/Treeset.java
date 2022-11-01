package array;
import java.util.*;
class Treeset {

	public static void main(String[] args) {

		SortedSet<String> fruits = new TreeSet<>();
		  
		  fruits.add("Mango");
		  fruits.add("Banana");
		  fruits.add("Apple");
		  fruits.add("Pineapple");
		  
		  System.out.println("Fruits are : " +fruits);
		  
		  //duplicate elements are ignored
		  fruits.add("Grapes");
		  System.out.println();
		  System.out.println("After adding duplicate elements : " +fruits);

		 }
	}