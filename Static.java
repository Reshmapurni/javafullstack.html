class Class3
{
int p=10;
int q=20;
static int x=100;
static int y=200;
{
System.out.println(p+q);
System.out.println("instance block1 of class2");
}
{
System.out.println(q-p);
System.out.println("instance block2 of class2");
}
static{
System.out.println(x);
System.out.println("static block1 of class2");
}
static{
System.out.println(y);
System.out.println("static block2 of class2");
}
void mul()
 {
  System.out.println(p*q);
  System.out.println("instance method1 of class2");
 }
void div()
 {
  System.out.println(p/q);
  System.out.println("instance method2 of class2");
 }
static void mul1()
 {
  System.out.println(x*y);
  System.out.println("static method1 of class1");
 }
static void div1()
 {
  int a=40;
  System.out.println(y/x);
  System.out.println("static method2 of class1");
 }
public static void main(String[] args)
{
Class2 c3=new Class2();
c3.mul();
c3.div();
c3.mul1();
c3.div1();
System.out.println(c2.p);
}
}

