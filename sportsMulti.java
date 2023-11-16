import java.util.*;
interface Sports{
	final float sportwt = 6.0F;
	abstract void putwt();
}
class Student{
	int rollNumber;
	Scanner sc = new Scanner(System.in);
	void getNumber(){
		System.out.println("Roll number....");
		rollNumber = sc.nextInt();
	}
	void putNumber(){
		System.out.println("Roll Number: "+rollNumber);
	}
}
class Test extends Student{
	float term1,term2;
	Scanner sc = new Scanner(System.in);
	void getMarks(){
		System.out.println("Enter Marks of 1st and 2nd Term : ");
		term1 = sc.nextFloat();
		term2 = sc.nextFloat();
	}
	void putMarks(){
		System.out.println("Term 1="+term1+"\nTerm 2="+term2);
	}
}
class Results extends Test implements Sports{
	public void putwt(){
		System.out.println("Sports Weigtage="+sportwt);
		System.out.println("Total Score="+(term1+term2+sportwt));
	}
	public static void main(String args[]){
		Results ob = new Results();
		ob.getNumber();
		ob.getMarks();
		ob.putNumber();
		System.out.println("Marks Obtained");
		ob.putMarks();
		ob.putwt();	
	}	
}
	
