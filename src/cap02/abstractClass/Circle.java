package cap02.abstractClass;

public class Circle extends GeometricShape {
	public double radius;
	
	public Circle(double r) {
		super("Circle");
		this.radius = r;
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
}
