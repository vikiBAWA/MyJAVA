/*
 Write a Program to sort ArrayList in Descending Order
 Name: Vikram Shinde
 Date: 01/11/2022
 */
package array;
import java.util.*;
class ArrayListDescendingorder {
	public static void main(String[] args) {
	 // Get the ArrayList
    ArrayList<String>
        list = new ArrayList<String>();

    // Creating the ArrayList
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");

    // Print the unsorted ArrayList
    System.out.println("Unsorted ArrayList: "
                       + list);

    // Sorting ArrayList in descending Order
    // using Collection.sort() method
    // by passing Collections.reverseOrder() as comparator
    Collections.sort(list, Collections.reverseOrder());

    // Print the sorted ArrayList
    System.out.println("Sorted ArrayList "
                       + "in Descending order : "
                       + list);
}
}
