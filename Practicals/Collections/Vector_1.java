package collections;

import java.util.Vector;

class Vector_1 {

	public static void main(String[] args) {

		Vector<String> obj1 = new Vector<>();
		//using the add() method
		obj1.add("Vikram");
		obj1.add("Gaurav");
		
		//using index number
		obj1.add(1, "Masud");
		System.out.println("Vector: " + obj1);
		
		//using addAll() method
		Vector<String> obj2 = new Vector<>();
		obj2.add("Adarsh");
		obj2.add("Sakshi");
		obj2.addAll(obj1);
		System.out.println("New Vector: "+obj2);
	}
}