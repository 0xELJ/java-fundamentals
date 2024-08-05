package cap02.abstractClass;

/**
 * Una clase abstracta es una clase que tiene métodos que no pueden ser desarrollados por falta de
 * información concreta. Estos métodos se llaman 'métodos abstractos' y se desarrollan en subclases.
 */
public abstract class GeometricShape {
	private String name;
	
	/**
	 * definimos un constructor en la clase abstracta para obligar a las subclases a settear los valores
	 * de los atributos de la clase base
	 * 
	 * @param name
	 */
	public GeometricShape(String name) {
		this.name = name;
	}
	
	/**
	 * metodo abstracto
	 * 
	 * toda clase que herede una clase abstracta tendrá que sobrescribir los métodos abstractos de su padre 
	 * o deberá ser también declarada abstracta
	 * 
	 * @return
	 */
	public abstract double area();
	
	/**
	 * método estático para imprimir el promedio de area de figuras
	 * 
	 * @param shapes
	 * @return
	 */
	public static double areaAvg(GeometricShape[] shapes) {
		int total = 0;
		for(int i = 0; i < shapes.length; i++) {
			total += shapes[i].area();
		}
		return total / shapes.length;
	}
	
	public String toString() {
		return this.name + ", area = " + this.area();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
}
