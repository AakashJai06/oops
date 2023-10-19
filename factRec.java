import java.util.*;
class cal
{
	int calFact(int n)
	{
		if(n==0)
			return 1;
		else
			return n*calFact(n-1);
	}
}
class factRec
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		cal ob = new cal();
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		System.out.println(ob.calFact(n));
	}
}
