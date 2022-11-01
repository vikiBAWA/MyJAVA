package encapsulation;

public class MainEncapsulation {
	
	public static void main(String args[])
	{
				
	Encapsulation e = new Encapsulation();
	
	e.setCompanyName("Audi");
	e.setCarNumber(12);
	e.setModel("A6");
System.out.println(e.getCompanyName());
System.out.println(e.getCarNumber());
System.out.println(e.getModel());
	}
}