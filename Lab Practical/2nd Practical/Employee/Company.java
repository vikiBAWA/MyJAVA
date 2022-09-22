class Company
{
void salary()
{
int i = 10000;
int e1 = 11000;
int e2 = 5000;
int a = i+i+i;
int e3 = a-e1-e2;
System.out.println("Average salary of each employee: " + i);
System.out.println("Total Average salary of three employees: " + a);
System.out.println("Salary of first employee: " + e1);
System.out.println("Salary of second employees: " + e2);
System.out.println("Salary of third employee: " + e3);
}
public static void main(String args[])
{
Company sa = new Company();
sa.salary();
}
}