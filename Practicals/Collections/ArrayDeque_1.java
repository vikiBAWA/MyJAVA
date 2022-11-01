package array;
import java.util.ArrayDeque;
class ArrayDeque_1 {
	public static void main(String[] args) {

		ArrayDeque<String> obj1 = new ArrayDeque<>();
		
		obj1.add("Adarsh");
		obj1.add("Gaurav");
		
		//using addFirst() method
		obj1.addFirst("Masud");
		
		//using addLast() method
		obj1.addLast("Manoj");
		
		System.out.println("Array Deque: " + obj1);
	}

}
