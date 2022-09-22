class CompanyLogic
{
int Id;
String name;
String Course;
String foundation;

CompanyLogic()
{
System.out.println("Default Contructor");
}

CompanyLogic(String f)
{
foundation = f;
}

void Tell(int Id)
{
System.out.println(Id + " " + foundation);
}

void Tell(String name, int Id)
{
System.out.println(name + " " + Id + " " + foundation);
}

void Tell(String name, int Id, String Course)
{
System.out.println(name + " " + Id + " " + Course + " " + foundation);
}
}