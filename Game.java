package shape_project;
import java.util.Scanner;
public class Game {
	Game(){
		System.out.println("====Game Has Started====");
	}
	public int selectShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for 2DShape");
		System.out.println("Press 2 for 3DShape");
		int choice=sc.nextInt();
		if(choice==1)
			return 1;
		else if(choice==2)
			return 2;
		else {
			System.out.println("Invalid Choice!");
				return selectShape();
		}
		
	}
	public  TwoDShape selectTwoDShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Circle");
		System.out.println("Press 2 for Triangle");
		System.out.println("Press 3 for Rectangle");
		System.out.println("Press 4 for Square");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected Circle");
			System.out.println("Enter Radius: ");
			double r=sc.nextDouble();
			Circle c1=new Circle(r);
		return c1;
		}
		else if(choice==2) {
			System.out.println("You have selected Triangle");
			System.out.println("ENter side1: ");
			double side1=sc.nextDouble();
			System.out.println("ENter side2: ");
			double side2=sc.nextDouble();
			System.out.println("ENter side3: ");
			double side3=sc.nextDouble();
		return new Triangle(side1, side2, side3);
		}else if(choice ==3) {
			System.out.println("You have selected Rectangle");
			System.out.println("Enter Length: ");
			double length = sc.nextDouble();
			System.out.println("Enter width: ");
			double width=sc.nextDouble();
			return new Rectangle(length,width);
		}else if(choice ==4) {
			System.out.println("You have selected Square");
			System.out.println("Enter side1: ");
			double side1 =sc.nextDouble();
			System.out.println("Enter side2: ");
			double side2 = sc.nextDouble();
			return new Square(side1,side2);
		}
		else {
			System.out.println("Invalid choice!");
			return selectTwoDShape();
		}
	}
	public  ThreeDShape selectThreeDShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Cylinder");
		System.out.println("Press 2 for Cube");
		System.out.println("Press 3 for Cone");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected Cylinder");
			System.out.println("ENter Radius: ");
			double r=sc.nextDouble();
			System.out.println("ENter Height: ");
			double h=sc.nextDouble();
		return new Cylinder(r,h);
		}
		else if(choice==2) {
			System.out.println("You have selected Cube");
			System.out.println("ENter side: ");
			double side=sc.nextDouble();
		return new Cube(side);
		}else if(choice ==3) {
			System.out.println("You have selected Cone");
			System.out.println("Enter radius: ");
			double radius =sc.nextDouble();
			System.out.println("Enter height: ");
			double height = sc.nextDouble();
			return new Cone(radius,height);
		}
		else {
			System.out.println("Invalid choice!");
			return selectThreeDShape();
		}
	}
}





