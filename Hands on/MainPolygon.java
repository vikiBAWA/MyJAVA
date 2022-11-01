package polygon;

import java.util.Scanner;

class MainPolygon {

	public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in); 	
    System.out.print("Enter Length  ");
int L =sc.nextInt();

	System.out.print("Enter Breadth  ");
int B =sc.nextInt();

	System.out.print("Enter Height  ");
int H =sc.nextInt();
sc.close();
Rectangle r = new Rectangle();
r.getArea(L, B, H);
}
}
