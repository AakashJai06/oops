import java.util.*;
class matMulti
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows and columns of 1st array: ");
int m = sc.nextInt();
int n = sc.nextInt();
System.out.println("Enter the number of rows and columns of 2nd array: ");
int p = sc.nextInt();
int q = sc.nextInt();
if(n != p)
{
System.out.println("Matrix cannot be multiplied.");
}
else
{
int a[][] = new int[m][n],b[][] = new int[p][q],s[][] = new int[m][q];
System.out.println("Enter the elements of 1st array : ");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
a[i][j] = sc.nextInt();
}
}
System.out.println("Enter the elements of 2nd array : ");
for(int i=0;i<p;i++)
{
for(int j=0;j<q;j++)
{
b[i][j] = sc.nextInt();
}
}
for(int i=0;i<m;i++)
{
for(int j=0;j<q;j++)
{
s[i][j] =0;
for(int k=0;k<n;k++)
s[i][j] += (a[i][k]*b[k][j]);
}
}
System.out.println("Multiplied Array : ");
for(int i=0;i<m;i++)
{
for(int j=0;j<q;j++)
{
System.out.print(s[i][j]+" ");
}
System.out.println("");
}
}
}
}

