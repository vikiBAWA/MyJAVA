package bankOverriding;

public class MainBankingInfo extends BankInfo {
	public static void main(String args[])
	{
		BankInfo bi = new BankInfo();
		bi.clientId();
		bi.clientName();
	}

}