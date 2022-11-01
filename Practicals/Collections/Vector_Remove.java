package collections;

import java.util.Vector;

class Vector_Remove {

	public static void main(String[] args) {
	
		Vector<String> obj1 = new Vector<>();
		//using the add() method
		obj1.add("Vikram");
		obj1.add("Masud");
		
		//using index number
		obj1.add(2, "Sakshi");
		System.out.println("Vector: " + obj1);
		
		//using remove() method
		String s = obj1.remove(2);
		System.out.println("remove element: " + s);
		System.out.println("New Vector: " + obj1);
		
		//using clear() method
		obj1.clear();
		System.out.println("Vector after: "+obj1);
	}
}