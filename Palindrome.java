import java.util.*;
class Palindrome
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number : ");
int n = sc.nextInt();
int rev=0;
int rem,m=n;
while(n>0)
{
rem = n%10;
rev = rev*10+rem;
n /= 10;
}
if(m == rev)
System.out.println(m+" is a palindrome Number.");
else
System.out.println(m+" is not a palindrome Number.");
}
}
