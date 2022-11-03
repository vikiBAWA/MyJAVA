/* Write a java program to replace the second element of a ArrayList with the specified element 
 * Name : Vikram Shinde
 * Date : 03-11-22
 */
package practical9;

import java.util.*;
class Code1 {

		public static void main(String args[]) {
			ArrayList<String>  Brands = new ArrayList<String>();

			Brands.add("BMW");
			Brands.add("Google");
			Brands.add("Facebook");
			Brands.add("Nike");
			Brands.add("Apple");
			Brands.add("Gucci");
			Brands.add("Microsoft");
			Brands.add("Jeep");
			Brands.add("Kawasaki");
			Brands.add("Adidas");
			Brands.add("Pixar");
			Brands.add("Samsung");
			
			  System.out.println("Original array list: " + Brands);
			  
			  String obj1 = "Calvin Klein";
			  
			  Brands.set(1,obj1);
			  System.out.println("New array list: " + Brands);	  

	}
}