package threads_1;

public class Thread_3 extends Thread{

	public static int amount=0;
	public static void main(String[] args) 
	{
	Thread_3 te=new Thread_3();
	te.start();
	System.out.println(amount); 
	amount++;   
	System.out.println(amount);

	}
	public void run()
	{
	amount++; 
	}
}
