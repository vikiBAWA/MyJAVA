package bikecode;

public class Rider {
	
	void ride(Bike b)
	{	
		b.startEngine();
		
		b.run();
		
		b.stopEngine();
	}

}