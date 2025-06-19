import java.util.Scanner;
class LargeSmall
{
public static void main(String[]args)
{
int l,s;
Scanner sc=new Scanner(System.in);
System.out.println("enter first number:");
int num1=sc.nextInt();
System.out.println("enter second number:");
int num2=sc.nextInt();
System.out.println("enter third number:");
int num3=sc.nextInt();
l=num1;
s=num1;
if(l<num2)
{
l=num2;
}
if(l<num3)
{
l=num3;
}
if(s>num2)
{
s=num2;
}
if(s>num3)
{
s=num3;
}
System.out.println("small number is%d"+s);
System.out.println("large number is%d"+l);

}
}
