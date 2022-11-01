class MethodOverLoad
{
static void Adress(int code)
{
 System.out.println("pincode is: " + code);
}
static void Adress(int code , String station)
{
 System.out.println("pincode is: " + code + "   police station is : " + station );
}
static void Adress(int code , String station , String assemble)
{
 System.out.println("pincode is: " + code +  "   police station is : " + station + "   assembly : " + assemble);
}
public static void main (String args[])
{
//Adress(421004);
Adress(421004,"Ulhasnagar");
//Adress(421004,"Ulhasnagar","Kalyan");
}
}
