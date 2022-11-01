package bikecode;

class Bike_Main {

	public static void main(String args[])
	{
	 Bike b = new BikeFactory().factory();
	 
	 Rider r = new Rider();
	 
	 if(b != null)
	 {
		 r.ride(b);
	 }
	 else
	 {
		 System.out.println("Bike is not available");
	 }
	}
}