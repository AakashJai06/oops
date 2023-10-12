import java.util.*;
class sum
{
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limiter");
		int n = sc.nextInt();
		System.out.println("List : ");
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
			sum += i;
		}
		System.out.println("Sum : "+sum);
	}
}
