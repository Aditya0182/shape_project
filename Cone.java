package shape_project;

public class Cone implements ThreeDShape {
	double radius;
	double height;
	
	Cone(){
		
	}
	Cone(double radius,double height){
		if(radius>0 && height>0) {
			System.out.println("Valid Cone");
			this.radius=radius;
			this.height=height;
		}else
			System.out.println("Invalid Cone!");
		
	}

	@Override
	public void getVolume() {
		// TODO Auto-generated method stub
		double volume = (1.0/3)*Math.PI*(radius*radius)*height;
		System.out.println("Volume of Cone is: "+volume+" Cubic Units");
		
	}

	@Override
	public void getCurvedSurfaceArea() {
		// TODO Auto-generated method stub
		double l = Math.sqrt((radius*radius)+(height*height));  
		System.out.println("Curved Surface Area of Cone is: "+Math.PI*radius*l+ "Square Units");
		
	}

	@Override
	public void getTotalSurfaceArea() {
		// TODO Auto-generated method stub
		double l = Math.sqrt((radius*radius)+(height*height));
		double tsa= Math.PI*radius*(radius+l);
		System.out.println("Total Surface Area of Cone is: "+ tsa+ " Square Units" );
		
	}
	

}
