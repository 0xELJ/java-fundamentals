package cap02.abstractClass;

public class Rectangle extends GeometricShape {
	private double base;
	private double height;
	
	public Rectangle(double b, double h) {
		super("Rectangle");
		this.base = b;
		this.height = h;
	}
	
	public double area() {
		return this.base * this.height;
	}
}
