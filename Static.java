/*we can access instance variables and instance methods when we create object locally or passing object as parameter to the static method */



class Class3
{
int p=10;
int q=20;
static int x=100;
static int y=200;
void Print()
 {
  System.out.println("instance method1 of class3");
  System.out.println(x);
  System.out.println(y);
 }
void Display()
 {
  System.out.println("instance method2 of class3");
  System.out.println(x);
  System.out.println(y);
  Display1();
 }
static void Print1(Class3 obj)  //passing object as parameter
 {
  System.out.println("static method1 of class3");
  System.out.println(obj.p);
  System.out.println(obj.q);
  obj.Print();

 }
static void Display1()
 {
  Class3 obj=new Class3();   //creating object locally
  System.out.println("static method2 of class3");
  System.out.println(obj.p);
  System.out.println(obj.q);
 }
public static void main(String[] args)
{
Class3 c3=new Class3();
Print1(c3);     //passing object as parameter
Display1();
c3.Display();
c3.Print();
System.out.println(c3.p);
System.out.println(c3.q);
System.out.println(c3.x);
System.out.println(c3.y);

}
}


/*
Output:
static method1 of class3
10
20
instance method1 of class3
100
200
static method2 of class3
10
20
instance method2 of class3
100
200
static method2 of class3
10
20
instance method1 of class3
100
200
10
20
100
200
 */
