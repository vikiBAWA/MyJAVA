class MainCompanyLogic
{
static public void main(String[] args)
{
CompanyLogic y = new CompanyLogic();
CompanyLogic z = new CompanyLogic("Anudip");
String e = "masud";
int f = 45365;
String g = "Java";
z.Tell(f);
z.Tell(e, f);
z.Tell(e, f, g);
y.Tell(f);
y.Tell(e, f);
y.Tell(e, f, g);
}
}