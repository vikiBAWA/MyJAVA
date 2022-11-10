package threads_1;
/*
 * If the class implements the Runnable interface
 * the thread can be run by passing an instance 
 * of the class to a Thread object's constructor
 * and then calling the thread's start() method.
  */
 class Thread_2 implements Runnable{

		public static void main(String[] args)
		{
			Thread_2 m=new Thread_2();
			Thread t=new Thread(m);
			t.start();
			System.out.println("This code is outside the thread");
		}
		public void run()
		{
			System.out.println("This code is running in the thread");
		}

	}
