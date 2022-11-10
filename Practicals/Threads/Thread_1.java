package threads_1;
/*
 * If a class extends the Thread class,
 *  the thread can be run by creating an instance of the class
 *  and call its start() method.
  */
class Thread_1 extends Thread {
	
		public static void main(String[] args)
		{
		Thread_1 thread =new Thread_1(); // creating object of class Main
		thread.start();
		System.out.println("This code is outside of the thread");

		}
		public void run()
		{
			System.out.println("This code is running in the thread");
		}

	}


