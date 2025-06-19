/*
import java.util.Scanner;
class SquarePattern
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for( int i=0;i<=n;i++)
{
for(int j=0;j<=n;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}

Output:enter a number:
5
******
******
******
******
******
******

*/
---------------------------------------------------------
/*

import java.util.Scanner;
class NumberPattern1
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for( int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(i);
}
System.out.println();
}
}
}

Output:
enter a number:
5
00000
11111
22222
33333
44444

*/
-----------------------------------------------------------
/*
import java.util.Scanner;
class NumberPattern2
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for( int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(j);
}
System.out.println();
}
}
}

Output:
enter a number:
5
12345
12345
12345
12345
12345

*/
---------------------------------------------------------------
/*

import java.util.Scanner;
class NumberPattern3
{
public static void main(String[]args)
{
int z=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for( int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(z+" ");
z=z+1;
}
System.out.println();
}
}
}

Output:
enter a number:
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/
---------------------------------------------------------
/*

import java.util.Scanner;
class NumberPattern4
{
public static void main(String[]args)
{
int z=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for( int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(z==10)
{
z=1;
}
System.out.print(z+" ");
z=z+1;
}
System.out.println();
}
}
}

Output:
enter a number:
5
1 2 3 4 5
6 7 8 9 1
2 3 4 5 6
7 8 9 1 2
3 4 5 6 7

*/
--------------------------------------------------------------
/*

import java.util.Scanner;
class NumberPattern5
{
public static void main(String[]args)
{
int z=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for( int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
 System.out.print(z+" ");
z=z+2;
}
System.out.println();
}
}
}

Output:
enter a number:
5
1 3 5 7 9
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 47 49

*/

--------------------------------------------------------------------
/*

import java.util.Scanner;
class Pyramid
{
public static void main(String[]args)
{
int z=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for( int i=1;i<=n;i++)
{
for(int j=1;j<=(n-i);j++)
{
 System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print("* ");
}
System.out.println();
}
}
}

Output:
enter a number:
5
    *
   * *
  * * *
 * * * *
* * * * *

*/
----------------------------------------------------------
/*

import java.util.Scanner;
class BinaryNumber
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for( int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j%2==0)
{
System.out.print(0);
}
else
{
System.out.print(1);
}
}
System.out.println();
}
}
}

Output:
enter a number:
5
10101
10101
10101
10101
10101

*/

------------------------------------------------------------------
/*

import java.util.Scanner;
class NumberPyramid
{
public static void main(String[]args)
{
int z=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for( int i=1;i<=n;i++)
{
for(int j=1;j<=(n-i);j++)
{
 System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print((k*2)+" ");
}
System.out.println();
}
}
}

Output:
enter a number:
5
    2
   2 4
  2 4 6
 2 4 6 8
2 4 6 8 10

*/

-------------------------------------------------------------
 /*

import java.util.Scanner;
class India
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a String:");
String n=sc.next();
for( int i=0;i<n.length();i++)
{
for(int j=0;j<=i;j++)
{
 System.out.print(n.charAt(j));
}
System.out.println();
}
}
} 

Output:
 enter a String:
INDIA
I
IN
IND
INDI
INDIA

*/

--------------------------------------------------------------

/*
class Pattern11
{
public static void main(String[]args)
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<(6-i);j++)
{
System.out.print(" ");
}
for(int k=1;k<(i*2);k++)
{
System.out.print("*");
}
System.out.println();
}
}
}

Output:
    *
   ***
  *****
 *******
*********

*/

-----------------------------------------------------------

/*


class Pattern12
{
public static void main(String[]args)
{
int p=1;
for(int i=1;i<=7;i++)
{
if(p<=4)
{
for(int j=1;j<(5-i);j++)
{
System.out.print(" ");
}
for(int k=1;k<(i*2);k++)
{
System.out.print("*");
}
p++;
}
else
{
for(int j=1;j<(i-3);j++)
{
System.out.print(" ");
}
for(int k=(2*(7-i)+1) ;k>0;k--)
{
System.out.print("*");
}
p++;
}
System.out.println();
}
}
}

Output:
   *
  ***
 *****
*******
 *****
  ***
   *

*/
-----------------------------------------------------------------
 //Pattern-13         
  /*class Patterns
 {
 public static void main(String[] args)
 {
   int n = 4;
for (int i = 0; i < n; i++)
 {
    for (int j = 0; j < n - i - 1; j++)
     System.out.print(" ");
    System.out.print("*");
     if (i != 0) 
{
    for (int j = 0; j < 2 * i - 1; j++)
   System.out.print(" ");
   System.out.print("*");
   }
   System.out.println();
  }
for (int i = n - 2; i >= 0; i--) 
{
 for (int j = 0; j < n - i - 1; j++)
   System.out.print(" ");
   System.out.print("*");
    if (i != 0)
 {
    for (int j = 0; j < 2 * i - 1; j++)
    System.out.print(" ");
    System.out.print("*");
 }
  System.out.println();
        }
    }
}
Output:
   *
  * *
 *   *
*     *
 *   *
  * *
   *   
   
 */

--------------------------------------------------------------
 //Pattern-14                 
/* class Patterns
{
public static void main(String[] args) 
{
int n = 5;
 for (int i = 1; i <= n; i++) 
{
for (int j = 1; j <= n; j++) 
{
 if (i == 1 || i == n || j == 1 || j == n)
System.out.print("*  ");
 else
 System.out.print("   ");
}
System.out.println();
}
}
}
 Output:
*  *  *  *  *
*           *
*           *
*           *
*  *  *  *  *  


*/
 ---------------------------------------------------------------

 //Pattern-15
/*class Patterns
{
public static void main(String[] args)
 {
 int n = 7;
 int mid = n / 2;
 for (int i = 0; i < n; i++)  
{
  for (int j = 0; j < n; j++)
 {
  if (i == mid || j == mid)
 {
  System.out.print("*");
  } 
else
 {
 System.out.print(" ");
 }
 }
System.out.println();
 }
}
}
 Output:
   *
   *
   *
*******
   *
   *
   *  
   
   
   */
 ----------------------------------------------------------------------
  //Pattern-16
 /*class Patterns
{
 public static void main(String[] args)
{
 int n = 7;
 for (int i = 1; i <= n; i++)
 {
 for (int j = 1; j <= n; j++)
{
 if (j == i || j == n - i + 1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
 }
}
}
Output:

*     *
 *   *
  * *
   *
  * *
 *   *
*     * 


*/
 -----------------------------------------------------------------
 //Pattern-17
/*class Patterns 
{
public static void main(String[] args)
 {
int n = 7;
for (int i = 1; i <= n; i++)
 {
for (int j = 1; j <= n; j++)
 {
if (i == 1||i == n||i==(n+1)/2 ||j ==1||j==n||j==(n + 1)/2)
System.out.print("*  ");
else
System.out.print("   ");
}
System.out.println();
}
}
}
Output:
*  *  *  *  *  *  *
*        *        *
*        *        *
*  *  *  *  *  *  *
*        *        *
*        *        *
*  *  *  *  *  *  *   

*/
 ---------------------------------------------------------------
 //Pattern-18
/*class Patterns
 {
 public static void main(String[] args) 
{
int n = 7;
for (int i = n; i >= 1; i--)
 {
 for (int j = 1; j <= i; j++) 
{
 if (j == 1 || j == i || i == n) 
{
System.out.print("*");
} else {
System.out.print(" ");
 }
}
System.out.println();
}
}
}       
Output:
*******
*    *
*   *
*  *
* *
**
*    


*/
 -----------------------------------------------------
 //Pattern-19
/*class Patterns
{
public static void main(String[] args)
 {
int n = 5;
for (int i = 0; i <= n; i++)
 {
for (int j = 0; j < i; j++)
System.out.print("*");
System.out.println(i);
}
}
}
Output:
0
*1
**2
***3
****4
*****5  

*/
-----------------------------------------------------------------
 //Pattern-20
/* class Patterns 
{
 public static void main(String[] args)
 {
 int n = 7;
for (int i = 1; i <= n; i++)
 {
for (int j = 1; j <= n; j++)
{
if (i == 1)
 {
System.out.print("* ");
}
else if (j == 1 || j == i) 
{
System.out.print("* ");
}
else 
{
 System.out.print(" ");
}
 }
System.out.println();
}
}
}
Output:

* * * * * * *
* *
*  *
*   *
*    *
*     *
*      *  


*/
------------------------------------------------------------------------  
