package shapes;

public class Triangle implements Shapes{
	private double sideA;
	private double sideB;
	private double base;

	//Constructor
	public Triangle(double sideA, double sideB, double base) {
		setSideA(sideA);
		setSideB(sideB);
		setBase(base);
	}

	// Getter
	public double getSideA() {
		return sideA;
	}

	//Setter
	public void setSideA(double sideA) { 
		this.sideA = sideA;
	}
	
	//Getter
	public double getSideB() { 
		return sideB;
	}

	// Setter
	public void setSideB(double sideB) {  
		this.sideB = sideB;
	}
	
	//Getter
	public double getBase() {  
		return base;
	}

	//Setter
	public void setBase(double base) {  
		this.base = base;
	}
	
	// Calculate perimeter
	@Override
	public double perimeter() {
		return (getBase() +  getSideA() + getSideB());
	}
	
	// Print our formatted string 
	@Override
	public String toString() {
		return new String("Triangle {s1=" + getSideA() + ", " +
				                   "s2=" + getSideB() + ", " +
				                   "s3=" + getBase() + "}" +
								   ", perimeter = " + perimeter());
	} 
	
}
