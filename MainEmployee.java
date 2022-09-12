class MainEmployee
{
public static void main(String args[])
{
Employee e1 = new Employee();
Employee e2 = new Employee();
Employee e3 = new Employee();

e1.id = 1;
e1.name = "Maksud";

e2.id = 2;
e2.name = "Adarsh";

e3.id = 3;
e3.name = "Monoj";

e1.employeeInfo();
e2.employeeInfo();
e3.employeeInfo();
}
}