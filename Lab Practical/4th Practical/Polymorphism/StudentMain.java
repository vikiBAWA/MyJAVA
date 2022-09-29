package polymorphism;

public class StudentMain {

	public static void main(String args[])
	{
	Student s = new ClassRepresent().name();
    Teacher t = new Teacher();
    
    if (s != null)
    {
    	t.teacher(s);
    }
    else
    {
    	System.out.println("No such student is present");
    }
	
}
}