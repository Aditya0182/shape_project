package shape_project;

public class Cube implements ThreeDShape {
	
	double side;
	
	Cube(){
		
	}
	
	Cube(double side){
		this.side=side;
	}

	@Override
	public void getVolume() {
		// TODO Auto-generated method stub
		System.out.println("Volume of Cube is: "+side*side*side+" Cu. Unit");
		
	}

	@Override
	public void getCurvedSurfaceArea() {
		// TODO Auto-generated method stub
		System.out.println("Curved Surface Area of Cube is: "+4*side*side+" Sq. Unit");
		
	}

	@Override
	public void getTotalSurfaceArea() {
		// TODO Auto-generated method stub
		System.out.println("Total Surface Area of Cube is: "+6*side*side+" Sq. Unit");
		
	}
	
	

}
