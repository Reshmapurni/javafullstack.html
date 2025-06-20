/* loop1
class BrightIt
{
public static void main(String[] args)
{
int n=10;
for (int i=0;i<10;i++)
{
System.out.println("Bright IT Career");
}
}
}
Output:
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career

*/
---------------------------------------------------------------
/* Loop2

class While1to20
{
public static void main(String[] args)
{
int i=1;
while(i<=20)
{
System.out.println(i);
i++;
}
}
}

Output:
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
*/
------------------------------------------------------------
/* Loop3
import java.util.Scanner;
class EqualOrNot
{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first number:");
      int num1=sc.nextInt();
      System.out.println("enter second number:");
      int num2=sc.nextInt();
      if(num1==num2)
      {
        System.out.println("both numbers are equal");
      }
       if(num1!=num2)
      {
        System.out.println("both numbers are different");
      }
    }
}
OutPut:
enter first number:
3
enter second number:
3
both numbers are equal
*/
--------------------------------------------------------------------
/* Loop4
import java.util.Scanner;
class EvenOdd
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter range:");
int n=sc.nextInt();
int num;
int j=0,k=0;
int a[]=new int[n];
int b[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("enter a number:");
num=sc.nextInt();
if(num%2==0)
{
a[j]=num;
j++;
}
else
{
b[k]=num;
k++;
}
}
System.out.println("even numbers:");
for(int i=0;i<j;i++)
{
System.out.println(a[i]);
}
System.out.println("odd numbers:");
for(int i=0;i<k;i++)
{
System.out.println(b[i]);
}
}
}
Output:
enter range:
4
enter a number:
2
enter a number:
3
enter a number:
5
enter a number:
4
even numbers:
2
4
odd numbers:
3
5
*/
-----------------------------------------------------------------------
/* Loop5
import java.util.Scanner;
class LargestOf3
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first number:");
int num1=sc.nextInt();
System.out.println("enter second number:");
int num2=sc.nextInt();
System.out.println("enter third number:");
int num3=sc.nextInt();
if((num1==num2)&&(num1==num3))
{
System.out.println("three numbers are equal");
}
else if(num1>=num2&&num1>=num3)
{
System.out.println("largest one is %d"+num1);
}
else if(num2>=num1&&num2>=num3)
{
System.out.println("largest one is %d"+num2);
}
else
{
System.out.println("largest one is %d"+num3);
}
}
}
*/
-----------------------------------------------------------------------
/*Loop 6
class Even
{
public static void main(String[] args)
{
System.out.println("even numbers between 10 to 100:");
for( int i=10;i<100;i++)
{
if(i%2==0)
{
System.out.print(i+",");
}
}
System.out.print("100");
}
}
Output:
even numbers between 10 to 100:
10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60,62,64,66,68,70,72,74,76,78,80,82,84,86,88,90,92,94,96,98,100
*/
------------------------------------------------------------------------
/* Loop 7
class DoWhile
{
public static void main(String[] args)
{
int i=1;
do
{
System.out.println(i);
i++;
}while(i<=10);
}
}
Output:
1
2
3
4
5
6
7
8
9
10
*/
------------------------------------------------------------------------
/* Loop 8
import java.util.Scanner;
class Armstrong
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
int num=n;
int arm=0;
int r;
while(n>0)
{
r=n%10;
n=n/10;
arm=arm+(r*r*r);
}
if(arm==num)
{
System.out.println("entered number is armstrong number");
}
else
{
System.out.println("entered number is  not a armstrong number");
}
}
}
Output:
enter a number:
153
entered number is armstrong number


enter a number:
152
entered number is  not a armstrong number
*/

------------------------------------------------------------------
/* Loop 9
import java.util.Scanner;
class Prime
{
public static void main(String[] args)
{
int e=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for(int i=2;i<n;i++)
{
if(n%i==0)
{
e++;
i=n;
}
}
if(e==1)
{
System.out.println("given number is not a prime number");
}
else
{
System.out.println("given number is a prime number");
}
}
}
Output:
enter a number:
11
given number is a prime number


enter a number:
12
given number is not a prime number
*/

-----------------------------------------------------------------
    /*Loop 10
    import java.util.Scanner;
class Palindrome
{
public static void main(String[] args)
{
int r,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
int real=n;
while(n>0)
{
r=(n%10);
sum=sum*10+r;
n=n/10;
}
if(real==sum)
{
System.out.println("given number is palindrome");
}
else
{
System.out.println("given number is not a palindrome");

}
}
}
Output:
enter a number
111
given number is palindrome
*/
---------------------------------------------------------------------
/* Loop11
    import java.util.Scanner;
class Loop4
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n,i,j=0;
     System.out.println(" Enter range ");
    n=s.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    for(i=1;i<=n;i++)
    {
      if(i%2==0)
        { 
         a[j]=i;
          j++;
         }
      
      else
        {
         b[j]=i;
          
        }
     }

    
   for(i=0;i<(n/2);i++)
    {
      System.out.println("Even Number" +(i+1)+" " +a[i]);
    }
    
   for(i=0;i<(n/2);i++)
    {
      System.out.println("odd Number" +(i+1)+" " +b[i]);
    }
  }
}
*/
--------------------------------------------------------------------------------
/* Loop12
    import java.util.Scanner;
class Gender
{
   public static void main(String[] args)
   {
     Scanner s=new Scanner(System.in);
     char gender;
     System.out.println("Enter gender (M/F):");
     gender=s.next().charAt(0);
     switch(gender)
     {
       case 'M':
       case 'm':
        {
           System.out.println("Male");
        }
        case 'F':
        case 'f':
        {
           System.out.println("Female");
        }
     }
   }
}
*/
------------------------------------------------------------------------------------
/*
import java.util.Scanner;
class Largest3Num
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int a,b,c;
    a=10;
    b=20;
    c=30;
    if(a==b && b==c)
     {
        System.out.println(" All are same");
     }
    else if(a>=b && a>=c)
     {
       System.out.println(" The large number is:" +a);
     }
     else if(b>=a && b>=c)
     {
       System.out.println(" The large number is:" +b);
     }
      else
       {
          System.out.println(" The large number is:" +c);
       }
}
}
*/
