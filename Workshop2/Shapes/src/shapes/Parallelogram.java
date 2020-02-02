package shapes;

public class Parallelogram implements Shapes{
	private double length;
	private double width;
	
	//Constructor
	public Parallelogram(double length, double width) {
		setLength(length);
		setWidth(width);
	}
	
	//Setter
	public void setLength(double length) {
		this.length = length;
	}
	
	//Getter
	public double getLength() {
		return length;
	}
	
	//Setter
	public void setWidth(double width) {
		this.width = width;
	}
	
	//Getter
	public double getWidth() {
		return width;
	}
	
	//Calculate perimeter
	@Override
	public double perimeter() {
		return (2 * (getLength() + getWidth()));
	}
	
	//Print out formatted string 
	@Override
	public String toString() {
		return new String("Parallelogram {w=" + getWidth() + ", h=" + getLength() + "} perimeter = " + perimeter());
	}

}
