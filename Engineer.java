import java.util.*;
class Employee
{
	void display(){
		System.out.println("Name of the class is Employee.");
	}
	void calcSalary(){
		System.out.println("Salary of employee is 10000");
	}
}
class Engineer extends Employee
{
	
	
	void display(){
		super.display();
		super.calcSalary();
		System.out.println("Name of the class is Engineer.");
		
	}
	void calcSalary(){
		System.out.println("Salary of Engineer is 20000.");
		
	}
public static void main(String args[]){
	Engineer ob = new Engineer();
	ob.display();
	ob.calcSalary();
}
}
