package threads_1;

class Thread_8 extends Thread{
	public void run()
	{ 
		System.out.println ("running thread priority is:" + Thread.currentThread ().getPriority ());
	}
	public static void main (String args[]) {
		
		Thread_8 m1 = new Thread_8 (); 
		Thread_8 m2 = new Thread_8 (); 
	m1.setPriority (Thread.MIN_PRIORITY); 
	m2.setPriority (Thread.MAX_PRIORITY);
	m1.start(); 
	m2.start();

}
}