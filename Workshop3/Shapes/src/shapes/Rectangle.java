package shapes;

//Subclass for Parallelogram
public class Rectangle extends Parallelogram{
	
	//Constructor
	public Rectangle(double length, double width) {
		//Super class constructor
		super (length, width);
	}
	
	public boolean validation() {
		if (getLength() < 0 || getWidth() < 0) {
			throw new IllegalArgumentException("Invalid side!");
		}else{
			return true;
		}
	}
	
	//Print out formatted string
	@Override
	public String toString() {
		return new String("Rectangle {w=" + getWidth() + ", h=" + getLength() + "} perimeter = " + perimeter());
	}

}
