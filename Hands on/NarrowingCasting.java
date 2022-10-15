package casting;
import java.util.Scanner;
public class NarrowingCasting {

	public static void main(String[] args) {
		
		double d=100.04;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		d=sc.nextInt();
		sc.close();
		//explicit type casting required
		long l=(long)d;
		//explicit type casting required
		int i=(int)l;
		System.out.println("Long Value: "+ l);
		System.out.println("int Value: "+ i);
		
	}

}
