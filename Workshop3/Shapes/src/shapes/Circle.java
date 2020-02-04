package shapes;

public class Circle implements Shapes{
	private double radius;

	//Constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//Setter
	public void setRadius(double radius) {     
		this.radius = radius;
	}
	
	//Getter
	public double getRadius(){	
		return radius;
	}
	
	public boolean validation(){
			if (getRadius() < 0){
				throw new IllegalArgumentException("Invalid radius!");
			}else{
				return true;
			}
	}
	// Calculate perimeter
	@Override
	public double perimeter(){
		return (2 * getRadius() * Math.PI);
	}
	
	// Print out formatted string
	@Override
	public String toString() {
		return new String("Circle {r=" + getRadius() + "}" + ", perimeter = " + perimeter());
	}

}
