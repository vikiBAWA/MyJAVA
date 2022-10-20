/*
  Question - Array Ascending Descending Order.
  Name - Vikram Shinde
  Date - 20/10/2022.
 */
package casting;

import java.util.*;

public class AscendingDescendingOrder {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for array elements: ");
		int a = sc.nextInt();
		Integer array[]=new Integer[a];
//		sc.close();
		System.out.println("Enter the elements: ");
		
		for(int i=0;i<a;i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Original array" + Arrays.toString(array));
		
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println("Descending array is" + Arrays.toString(array));
		
		for(int i=0;i>a;i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Original array" + Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("Descending array is" + Arrays.toString(array));
	}
}