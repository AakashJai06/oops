import java.util.*;
class Employee
	{
		String Name,Address;
		int Age,phoneNo;
		float Salary;

		float printSalary()
		{
			return Salary;
		}
}
class Officer extends Employee
{
	String specialization;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Officer ob = new Officer();
		System.out.print("Name : ");
		ob.Name = sc.nextLine();
		System.out.print("Age : ");
		ob.Age = sc.nextInt();
		sc.nextLine();
		System.out.print("Phone Number :");
		ob.phoneNo = sc.nextInt();
		sc.nextLine();
		System.out.print("Address : ");
		ob.Address = sc.nextLine();
		System.out.print("Salary : \n");
		ob.Salary = sc.nextFloat();
		sc.nextLine();
		System.out.print("\nName : "+ob.Name);
		System.out.print("\nAge : "+ob.Age);
		System.out.print("\nPhone Number : "+ob.phoneNo);
		System.out.print("\nAddress : "+ob.Address);
		System.out.print("\nSalary : "+ob.printSalary());
	}
}
class Manager extends Employee
{
	String department;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Manager ob1 = new Manager();
		System.out.print("Name : ");
		ob1.Name = sc.nextLine();
		System.out.print("Age : ");
		ob1.Age = sc.nextInt();
		sc.nextLine();
		System.out.print("Phone Number :");
		ob1.phoneNo = sc.nextInt();
		sc.nextLine();
		System.out.print("Address : ");
		ob1.Address = sc.nextLine();
		System.out.print("Salary : \n");
		ob1.Salary = sc.nextFloat();
		sc.nextLine();
		System.out.print("\nName : "+ob1.Name);
		System.out.print("\nAge : "+ob1.Age);
		System.out.print("\nPhone Number : "+ob1.phoneNo);
		System.out.print("\nAddress : "+ob1.Address);
		System.out.print("\nSalary : "+ob1.printSalary());
	}
}
