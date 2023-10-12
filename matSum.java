import java.util.*;
class matSum
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows and columns of 1st array: ");
int r = sc.nextInt();
int c = sc.nextInt();
System.out.println("Enter the number of rows and columns of 2st array: ");
int r1 = sc.nextInt();
int c1 = sc.nextInt();
if(r1 == r && c1 == c)
{
int a[][] = new int[r][c],b[][] = new int[r][c],s[][] = new int[r][c];
System.out.println("Enter the elements of 1st array : ");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
a[i][j] = sc.nextInt();
}
}
System.out.println("Enter the elements of 2nd array : ");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
b[i][j] = sc.nextInt();
}
}
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
s[i][j] = a[i][j]+b[i][j];
}
}
System.out.println("Added Array : ");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(s[i][j]+" ");
}
System.out.println("");
}
}
else
{
System.out.println("Matrix cannot be added .");
}
}
}
