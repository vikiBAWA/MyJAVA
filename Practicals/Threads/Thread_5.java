package threads_1;

public class Thread_5{
	private final String name;

	public Thread_5(String name) {
	this.name = name;
	} 
	
	public String getName() {
		return this.name; 
		}
	
	public synchronized void call (Thread_5 caller){
	System.out.println(this.getName()+" has asked to call me"+caller.getName());
	
	try {
	Thread.sleep(100);
	} 
	
	catch (InterruptedException e) {
	e.printStackTrace();
	}
	caller.callMe(this);
	}
	public synchronized void callMe (Thread_5 caller) {
		System.out.println(this.getName() + " has called me "+ caller.getName());
	}
	
	public static void main(String[] args) {
	Thread_5 caller1 = new Thread_5("caller-1"); 
	Thread_5 caller2 = new Thread_5("caller-2");
	
	new Thread(new Runnable() {
		public void run() { caller1.call(caller2); 
		}
	}).start();
	
	new Thread(new Runnable() {
	    public void run() { caller2.call(caller1); }
	}).start();
}
	}