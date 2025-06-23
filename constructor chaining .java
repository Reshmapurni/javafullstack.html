class Vasavi
{
Vasavi()
{
this(10);
System.out.println(0);
}
Vasavi(int a)
{
this(1.0f,2.0f);
System.out.println(1);
}
Vasavi(int a,int b)
{
this(1.0f,2.0f,3.0f);
System.out.println(2);
}
Vasavi(int a,int b,int c)
{
this(10,20);
System.out.println(3);
}
Vasavi(float a)
{
this();
System.out.println(4);
}
Vasavi(float a,float b)
{
this(10,2.0f,"arp");
System.out.println(5);
}
Vasavi(float a,float b,float c)
{
this(1.0f,20);
System.out.println(6);
}
Vasavi(int a,float b)
{
this(1.0f);
System.out.println(7);
}
Vasavi(float a,int b)
{
this(10,2.0f);
System.out.println(8);
}
Vasavi(int a,float b,String c )
{
System.out.println(9);
}
}
class Jntuk
{
public static void main(String[] args)
{
Vasavi v=new Vasavi(10,20,30);
}
}
/*
9
5
1
0
4
7
8
6
2
3
*/
