package polygon;

interface Polygon {

	void getArea(int lenght, int Breadth, int Height);

	}

class Rectangle implements Polygon{
	
	//implementation of abstract method.
	public void getArea(int lenght, int Breadth, int Height)
	{
		System.out.println("The Whole Area of rectangle is:" + (lenght*Breadth*Height));
	}
}

