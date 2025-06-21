class StringMethods
{
public static void main(String[] args)
{
String s1="Reshma Purni Akula";
String s2="  akula  ";
String s3=new String("Reshma Purni");
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);


System.out.println((s1+s2)+" -->concate with +");
System.out.println(s1.length()+" --> length");
System.out.println(s1.substring(0,8)+" --> sub string");
System.out.println(s2.indexOf('a')+" -->search with index of");
System.out.println(s1.matches("[A-Za-z ]+")+" --> matches");
System.out.println(s1.matches("[a-z]+[A-Z]+")+" --> matches");
System.out.println(s1.equals(s2)+" --> method equals");

System.out.println(s1.equalsIgnoreCase("Purni")+" --> equalsIgnoreCase");
System.out.println(s1.startsWith("res")+" --> startsWith");
System.out.println(s1.endsWith("ni")+" --> endsWith");
System.out.println(s1.compareTo(s2)+" --> compareTo");

System.out.println(s2.trim()+" --> trim");
System.out.println(s1.replace('R','r')+" --> replace");

/*split*/
String parts[]=s1.split(" ");
for( String part:parts)
{
System.out.println(part);
}
/*split*/

System.out.println(String.valueOf(97)+"  --> converting number to string");
Integer i=100;
String s=i.toString();
System.out.println(s+" -->  integer to string");
System.out.println(s2.toUpperCase()+" -->  upper case");
System.out.println(s2.toLowerCase()+" -->  Lower case");
}
}

/*
Output:
Reshma Purni Akula
  akula
Reshma Purni
Reshma Purni Akula  akula   -->concate with +
18 --> length
Reshma P --> sub string
2 -->search with index of
true --> matches
false --> matches
false --> method equals
false --> equalsIgnoreCase
false --> startsWith
false --> endsWith
50 --> compareTo
akula --> trim
reshma Purni Akula --> replace
Reshma
Purni
Akula
97  --> converting number to string
100 -->  integer to string
  AKULA   -->  upper case
  akula   -->  Lower case
*/
