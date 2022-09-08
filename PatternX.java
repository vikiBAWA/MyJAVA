import java.util.Scanner;
class PatternX
{
    
 
    public static void main(String[] args)
    {
             
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A Number : ");
	int n=sc.nextInt();	 
              System.out.print("Enter A Symbol : ");
	
              char c = sc.next().charAt(0);
              int i=1;
              int j;
	 int k=n*2-1;
 
	while(i<=k)
               {
                    
	        j=1;
		while(j<=k) 
                
                        {      if(j==i || j==k-i+1)
                               System.out.print(c);
                                System.out.print(" ");
                                 
		 j++;
                    	
                           }
		 
    
	 System.out.println();
	    i++;
               }            
           
	  
    }
}