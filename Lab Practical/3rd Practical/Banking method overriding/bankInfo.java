package bankOverriding;

public class BankInfo extends Banking {
	void clientId()
	{
		super.clientId();
		int a=10094;
		System.out.println("Forth Client Id is : " + a);
	}
	void clientName()
	{
		super.clientName();
		String a = "Pranay";
		System.out.println("Forth Client Id is : " + a);
	}

