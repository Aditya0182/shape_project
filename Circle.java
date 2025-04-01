package shape_project;

public class Circle implements TwoDShape{
	double r;
	Circle(){
		
	}
	
	Circle(double r){
		if(r>0) {
			System.out.println("Valid Radius");
			this.r=r;
		}
		else {
			System.out.println("Invalid Radius Entered");
		}
		
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle is: "+Math.PI*r*r+" Sq. Unit" );
		
	}

	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Circle is: "+Math.PI*r+" Unit" );
		
		
	}
	
}
