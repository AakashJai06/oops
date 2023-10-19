import java.util.*;
class Patient
{
	int idNum,age,bloodData;
Patient()
{
	idNum =0;
	age=0;
	bloodData =0;
}
Patient(int a,int b,int s)
{
	idNum = a;
	age = b;
	bloodData = s;
}
int get_idNumber()
{
	return idNum;
}
int get_age()
{
	return age;
}
int get_bloodData()
{
	return bloodData;
}
}
class TestPatient
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your id Number : ");
	int x = sc.nextInt();
	System.out.print("Enter your age : ");
	int y = sc.nextInt();
	System.out.print("Enter your blood data : ");
	int s = sc.nextInt();
	Patient ob = new Patient(x,y,s);
	System.out.println("id Number : "+ob.get_idNumber());
	System.out.println("Age : "+ob.get_age());
	System.out.println("blood data : "+ob.get_bloodData());
	}
}
