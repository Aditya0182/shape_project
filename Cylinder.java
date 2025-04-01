package shape_project;

public class Cylinder implements ThreeDShape {
	double r;
	double h;
	public Cylinder() {
		
	}
	Cylinder(double r, double h){
		this.r=r;
		this.h=h;
	}
	@Override
	public void getVolume() {
		// TODO Auto-generated method stub
		System.out.println("Volume of Cylinder is: "+Math.PI*r*r*h+" Cu. Unit");
		
	}
	@Override
	public void getCurvedSurfaceArea() {
		// TODO Auto-generated method stub
		System.out.println("Curved Surface Area of Cylinder is: "+2*Math.PI*r*h+" Sq. Unit");
		
	}
	@Override
	public void getTotalSurfaceArea() {
		// TODO Auto-generated method stub
		System.out.println("Total Surface Area of Cylinder is: "+2*Math.PI*r*(r+h)+" Sq. Unit");
		
	}
	
	

}
