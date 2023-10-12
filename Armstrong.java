import java.util.*;
class Armstrong
{
public static void main(String args[])
{
int rem,sum=0,len=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number : ");
int n = sc.nextInt();
int m =n;
int s =n;
while(m>0)
{
len++;
m /= 10;
}
while(n>0)
{
rem = n%10;
sum += Math.pow(rem,len);
n /=10;
}
if(s == sum)
System.out.println(s+" is an Amrstrong Number .");
else
System.out.println(s+" is not an Amrstrong Number .");
}
}
