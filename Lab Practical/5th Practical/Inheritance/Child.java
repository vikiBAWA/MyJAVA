package Constructor;

public class Child extends Parent
{
void Speak()	
{	
System.out.println("I know Speaking");
}
void Sing()
{
super.Sing();
System.out.println("I Don't know Singing");
}
void Dance()	
{
System.out.println("I know Dancing");
}
}