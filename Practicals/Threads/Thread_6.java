package threads_1;

class Thread_6 implements Runnable{

	public static void main(String[] args) {
		
		Thread Thread_6 = new Thread("Demo1"); 
		Thread Thread1_6 = new Thread("Demo2");
		Thread_6.start(); 
		Thread1_6.start();
		System.out.println("Thread names are following: "); 
		System.out.println(Thread_6.getName());
		System.out.println(Thread1_6.getName());
	}
		@Override
		public void run() {
	}
}