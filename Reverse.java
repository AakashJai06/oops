import java.util.*;
class Reverse
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
System.out.println("The reverse of "+m+" is "+rev);
}
}
