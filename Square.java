package shape_project;

public class Square implements TwoDShape {
	double side1;
	double side2;
	
	Square(){
		
	}
	
	Square(double side1,double side2){
		if(side1>0 && side2>0 && side1==side2) {
			System.out.println("Valid Square");
			this.side1=side1;
			this.side2=side2;
		}else
			System.out.println("Not a Valid Square!");
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		double area = side1*side2;
		System.out.println("Area of Square is: "+area+" Sq. Unit");
		
	}

	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Square is: "+(4*side1)+ " Units");
		
	}

}
