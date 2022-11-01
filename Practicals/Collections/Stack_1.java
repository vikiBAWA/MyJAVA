package collections;

import java.util.Stack;

class Stack_1 {

	public static void main(String[] args) {

		Stack<String> obj1= new Stack<>();
		obj1.push("Masud");
		obj1.push("Manoj");
		
		System.out.println("Stack value: " + obj1);
		
		//pop elements from the top
		obj1.pop();
		System.out.println("stack after pop: " + obj1);
	}

}