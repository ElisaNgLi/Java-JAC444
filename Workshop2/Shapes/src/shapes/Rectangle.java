package shapes;

//Subclass for Parallelogram
public class Rectangle extends Parallelogram{
	
	//Constructor
	public Rectangle(double length, double width) {
		//Super class constructor
		super (length, width);
	}
	
//	//Calculate perimeter
//	@Override
//	public double perimeter(){
//		 return( 2 * (super.getWidth() + super.getLength()));
//	}
	
	//Print out formatted string
	@Override
	public String toString() {
		return new String("Rectangle {w=" + getWidth() + ", h=" + getLength() + "} perimeter = " + perimeter());
	}

}