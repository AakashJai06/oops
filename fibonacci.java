import java.util.*;
class fibonacci
{
	public static void main(String args[])
	{
		int firstTerm =0,secondTerm=1,nextTerm = 0;
		for(int i=0;i<10;i++)
		{
			System.out.print(firstTerm+" ");
			nextTerm = firstTerm+secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
	}
	}
}
