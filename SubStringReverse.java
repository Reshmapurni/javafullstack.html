class SubStringReverse
{
public static void main(String[] args)
{
String original="Sri Vasavi Institute Of Engineering And Technology";
String sub="Institute";
int start=original.indexOf(sub);
if(start == -1)
{
System.out.println("sub string not present in the original string");
}
else
{
String reversed="";
for(int i=sub.length()-1;i>=0;i--)
{
reversed+=sub.charAt(i);
}
String finalstring=original.substring(0,start)+reversed+original.substring(start+sub.length());
System.out.println("final string is:"+finalstring);
}
}
}
/*
Output:
final string is:Sri Vasavi etutitsnI Of Engineering And Technology
*/
