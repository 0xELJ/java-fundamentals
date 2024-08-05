package cap02.abstractClass;

public class Triangle extends GeometricShape {
	private double base;
	private double height;
	
	public Triangle(double b, double h) {
		super("Triangle");
		this.base = b;
		this.height = h;
	}
	
	public double area() {
		return this.base * this.height / 2;
	}
}
