import java.util.*;
class Frequency
{
public static void main(String args[])
{
int count=0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the String : ");
String s = sc.nextLine();
System.out.println("\nEnter the character of which the frequency should be checked : ");
char c = (sc.nextLine()).charAt(0);
for(int i=0;i<s.length();i++)
{
if(s.charAt(i) == (c))
count++;
}
System.out.println("The frequency of "+c+" in "+s+"is : "+count);
}
}
