import java.util.*;
class Employee
{
	int idNum,age;
	double salary;
	String name,address,designation,gender;
	Employee(int id,int a,double sal,String n,String g,String add,String design)
	{
		idNum = id; age = a;
		salary = sal;
		name = n;gender = g;address = add;designation = design;  
	}
}
class employeeDetails
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of employees : ");
	int n = sc.nextInt();
	Employee[] ob = new Employee[n];
	for(int i= 0;i<n;i++)
	{
		System.out.print("Employee id : ");
		int id = sc.nextInt();
		System.out.print("Employee name : ");
		String n = sc.nextLine();
		System.out.print("Age : ");
		int a = sc.nextInt();
		System.out.print("Employee Salary : ");
		double r = sc.nextDouble();
		System.out.print("Gender : ");
		String n = sc.nextLine();
		System.out.print("Address : ");
		String add = sc.nextLine();
		System.out.print("Designation : ");
		String design = sc.nextLine();
		Employee[i] = new Employee(id,a,sal,n,g,add,design);
	}
	}
}
