import java.util.*;
class pattern
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a integer : ");
	int n = sc.nextInt();
	for(int i=1;i<n+1;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print((int)(Math.pow(j,i))+" ");
}
		System.out.println();
}
}
}
