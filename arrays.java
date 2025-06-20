/*
import java.util.Scanner;
class AddValues
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n,i,count=0;
    System.out.println(" Enter size of array : ");
    n=s.nextInt();
    int a[]=new int[n];
    System.out.println(" Enter elements of array : ");
    for(i=0;i<n;i++)
     {
      a[i]=s.nextInt();
      count=count+a[i];
     }
      System.out.println(" Sum of array elements is : "+count); 
  }
}
*/
-----------------------------------------------------------------------------------
/*
import java.util.Scanner;
class AvgOfElements
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n,i,sum=0,Avg;
    System.out.println("Enter array range:");
    n=s.nextInt();
  int a[]=new int[n];
     System.out.println("Enter elements of array :");
     for(i=0;i<n;i++)
     {
      a[i]=s.nextInt();
      sum=sum+a[i];
     }
     Avg=sum/n;
     System.out.println("The Average of array Elements is:"+Avg);
  }
}
*/
--------------------------------------------------------------------------------
/*
import java.util.Scanner;
class FindIndex
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n,i,element;
    System.out.println("Enter array range:");
    n=s.nextInt();
  int a[]=new int[n];
     System.out.println("Enter elements of array :");
     for(i=0;i<n;i++)
     {
      a[i]=s.nextInt();

     }
   
     System.out.println("Enter the element of element");
     element=s.nextInt();
      
      for(i=0;i<n;i++)
     {
      if(a[i]==element)
       {
         System.out.println(+(element)+" Index is:" +i);
       }

     }
     
  }
}
*/
---------------------------------------------------------------------------------
import java.util.Scanner;
class Search
{
  void SearchVal(int se,int a[],int n)
{ int pos=0;
    for(int i=0;i<n;i++)
     {
      if(a[i]==se)
       {
        pos=i;
          
       }
   }
  for(int i=pos;i<n-1;i++)
  {
           a[i]=a[i+1];
  }
 n--;
  }
}

class RemoveSpecificValue
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n,i,se;
    System.out.println("Enter array range:");
    n=s.nextInt();
  int a[]=new int[n];
     System.out.println("Enter elements of array :");
     for(i=0;i<n;i++)
     {
      a[i]=s.nextInt();
     }
     System.out.println("Enter the specific element in the array");
     se=s.nextInt();
      Search obj=new  Search();
      obj.SearchVal(se, a, n); 
    for(i=0;i<n-1;i++)
     {
    System.out.print(a[i] +",");
      
     }

  }
}
*/
---------------------------------------------------------------------------------
/*
import java.util.Scanner;
class Search
{
  int SearchVal(int se,int a[],int n)
{
    for(int i=0;i<n;i++)
     {
      if(a[i]==se)
       {
        return i;
       }
        
       }
        return (-1);
 
     }
  }


class SpecificValue
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n,i,se;
    System.out.println("Enter array range:");
    n=s.nextInt();
  int a[]=new int[n];
     System.out.println("Enter elements of array :");
     for(i=0;i<n;i++)
     {
      a[i]=s.nextInt();
     }
     System.out.println("Enter the specific element in the array");
     se=s.nextInt();
      Search obj=new  Search();
     int index= obj.SearchVal(se, a, n); 
     System.out.println(index);
       if(index!=-1)
       {
              System.out.println("Element is found at:"+index);
       }
      else
        {
         System.out.println("Element isNot found:");
       }

  }
}
*/
------------------------------------------------------------------------------
/*
import java.util.Scanner;
class CpyFun
{
    int j=0,i;
   void CopyFunction(int a[],int n,int b[])
   {
       for(i=0;i<n;i++)
   {
       b[j]=a[i];
       j++;    
   }  
   }   
}
class Copy
{
  public static void main(String[] args)
{
  Scanner s=new Scanner(System.in);
  int n,i,j=0;
  System.out.println("Enter the size of array");
  n=s.nextInt();
  int a[]=new int[n];
   int b[]=new int[n];
   System.out.println("Enter the elements of array");
   for(i=0;i<n;i++)
   {
       a[i]=s.nextInt();
        
   }
   CpyFun c=new CpyFun();
   c.CopyFunction(a,n,b);
    
   System.out.println(" the Copy of array is");
   for(i=0;i<n;i++)
   {
       
   System.out.println(b[i]);
   }
}
}
*/
----------------------------------------------------------------------------------
