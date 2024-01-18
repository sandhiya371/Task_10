package Task10;
//Qus:3

public class Circle {
	private double radius;

	// Constructor with no arguments, sets a default radius
	public Circle() {
		this.radius = 5.0; // Default radius
	}

	// Constructor with one argument
	public Circle(double radius) {
		this.radius = radius;
	}

	// Method to calculate circumference
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	// Getter for radius
	public double getRadius() {
		return radius;
	}

	// Main method for demonstration
	public static void main(String[] args) {
		Circle defaultCircle = new Circle();
		Circle customCircle = new Circle(10.0);

		System.out.println("Circumference of default circle: " + defaultCircle.getCircumference());
		System.out.println("Circumference of custom circle: " + customCircle.getCircumference());
	}
}