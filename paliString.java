import java.util.*;
class paliString
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string : ");
String s = sc.nextLine();
String rev = "";
int flag =0,i=0,len = s.length();
for(i=0;i<len;i++)
{
char b = s.charAt(i);
rev = b+rev; 
}
if(rev.equals(s))
System.out.println(s+" is a palindrome String.");
else 
System.out.println(s+" is not a palindrome String.");
}
}
