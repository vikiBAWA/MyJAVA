class PrimeNo

{
  
static void RecogPrime()
 
{
	
java.util.Scanner sc = new java.util.Scanner(System.in);

 	 
System.out.print("Enter number");
  	
int i = sc.nextInt();
  	
boolean flag = false;
 	  
for (int j = 2; j<=i/2;j++)
 	 
{
 	  
if (i % 2 == 0)
 	
{
  	  
flag=true;
 	
break;
 	
}
 	
}
 	 
if (!flag)
 	
{
	 
System.out.print("it is a Prime Number");
 	
}
 	
else
 	
{
 	
System.out.print("it is not a Prime Number");
 	
}
 
}



public static void main(String args[])
{
PrimeNo.RecogPrime();  

}

}

