package casting;
import java.util.Scanner;
public class Casting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int i = sc.nextInt();
		sc.close();
		
		long l = 2;
		float f = 2;
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		
	}

}
