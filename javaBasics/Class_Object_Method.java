class ArpClass
{
void ArpMethod()
{
System.out.println("This is base class method");
}
}
class Sviet extends ArpClass
{
void SvietMethod()
{
System.out.println("This is child class method");
}
public static void main(String[]args)
{
Sviet sv=new Sviet();
sv.ArpMethod();
sv.SvietMethod();
}
}