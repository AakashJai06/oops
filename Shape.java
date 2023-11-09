import java.util.*;
abstract class Shape
{
	abstract void numberOfSides();
}
class  Rectangle extends Shape{
	void numberOfSides(){
		System.out.println("Number of Sides : 4.");
	}
}
class  Triangle extends Shape{
	void numberOfSides(){
		System.out.println("Number of Sides : 3.");
	}
}
class  Hexagon extends Shape{
	void numberOfSides(){
		System.out.println("Number of Sides : 6.");
	}
}
class Abstract{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int ch=0;
	do{
	System.out.println("Choice........");
	System.out.println("1)Rectangle\n2)Triangle\n3)Hexagon\n4)Exit");
	ch = sc.nextInt();	
	switch(ch){
		case 1:
			Rectangle ob1 = new Rectangle();
			ob1.numberOfSides();
			break;
		case 2:
			Triangle ob2 = new Triangle();
			ob2.numberOfSides();
			break;
		case 3:
			Hexagon ob3 = new Hexagon();
			ob3.numberOfSides();
			break;
	}
	}while(ch!=4);
	}
	

}
