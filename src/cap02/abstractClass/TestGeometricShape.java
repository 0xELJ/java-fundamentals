package cap02.abstractClass;

public class TestGeometricShape {
	public static void main(String[] args) {
		GeometricShape[] shapes = {
			new Circle(23),
			new Rectangle(12, 4),
			new Triangle(2, 5)
		};
		
		double avg = GeometricShape.areaAvg(shapes);
		
		for (GeometricShape gs: shapes) {
			System.out.println(gs);
		}
		System.out.println("Promedio = " + avg);
	}	
}
