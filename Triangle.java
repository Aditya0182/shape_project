package shape_project;

public class Triangle implements TwoDShape{
	double side1;
	double side2;
	double side3;
	
	Triangle(){
		
	}
	
	Triangle(double side1, double side2, double side3){
		if(side1+side2>side3 && side2+side3>side1 && side3+side1>side2) {
			System.out.println("Valid Triangle");
			this.side1=side1;
			this.side2=side2;
			this.side3=side3;
		}else {
			System.out.println("Invlaid Side Entered");
		}
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		double s= (side1+side2+side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("Area of Triangle is: "+area+" Sq. Unit");
		
	}

	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		double perimeter = (side1+side2+side3);
		System.out.println("Perimeter of Triangle is: "+perimeter+" Unit" );
		
	}

}
