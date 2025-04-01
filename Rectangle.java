package shape_project;

public class Rectangle implements TwoDShape {
	double length;
	double width;
				
	Rectangle(){
		
	}
	
	Rectangle(double length, double width){
		if(length != width && length>0 && width >0) {
			System.out.println("Valid Reactangle");
			this.length=length;
			this.width=width;
			
		}else
			System.out.println("Not a Valid Rectangle!");
	}
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		double area = length*width;
		System.out.println("Area of Rectangle is: "+area+" Sq. Unit");
		
	}

	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		double perimeter= 2*(length+width);
		System.out.println("Perimeter of Triangle is: "+perimeter+" Units");
		
	}
	

	
}
