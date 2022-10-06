/*
 Create a class parent with default constructor and void sing method.print something inside the constructor and method
 Create child class which will inherit the property of parent and has methods void speak and void dance.print something inside the two methods.
 Create another class inheritance and object of class and call all the methods.also mention the type of inheritance on the top of the program.
 
 Name : Vikram Shinde
 Date : 06-10-2022
*/

package Constructor;

public class Inheritance {
	public static void main(String args[]) {
Child c = new Child();
c.Sing();
c.Speak();
c.Dance();
}
}