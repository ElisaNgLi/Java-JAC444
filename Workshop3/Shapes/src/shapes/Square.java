package shapes;

//Subclass for Parallelogram
public class Square extends Parallelogram{

	//Constructor
	public Square(double length) {
		//Super class constructor
		super(length, length);

	}
	
	public boolean validation() {
		if (getLength() < 0) {
			throw new IllegalArgumentException("Invalid side(s)");
		}else{
			return true;
		}
	}
	
	//Print out formatted string
	@Override
	public String toString() {    
		return new String("Square {s=" + getWidth() + "}" + ", perimeter = " + perimeter());
	} 

}
