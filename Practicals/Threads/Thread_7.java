package threads_1;

class Thread_7 extends Thread{

	public static void main(String[] args) {
		Thread_7 ti = new Thread_7();
		ti.start();
		System.out.println("Thread has been created with name"+ti.getName());
}
}