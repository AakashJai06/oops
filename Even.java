import java.util.*;
class Even
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	String rev="";
	System.out.println("Enter a String : ");
	String s = sc.nextLine();
	int n= s.length();
	for(int i=n-1;i>=0;i--)
	{
		rev = rev+s.charAt(i);
	}
	if(rev.equals(s))
		System.out.println("palindrome ");
	else
		System.out.println(" Not Palindrome ");
}
}
