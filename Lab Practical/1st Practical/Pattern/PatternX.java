import java.util.*;
class PatternX
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.print("enter number how large x should be ");
int i = sc.nextInt();
for (int j = 1; j<=i;j++)
{
for (int h = 1; h<=i;h++)
{
if(j==h || j+h==i+1)
System.out.print("*");
else
System.out.print(" ");

}
System.out.println();
}
}
}