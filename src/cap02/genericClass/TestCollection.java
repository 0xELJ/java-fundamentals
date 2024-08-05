package cap02.genericClass;
import java.util.Scanner;

public class TestCollection {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese Nombre: ");
		String name = scanner.next();
		
		Collection<String> names = new Collection<String>(5);
		
		while(!name.equals("FIN")) {
			names.insert(name, 0);
			System.out.print("Ingrese Nombre: ");
			name = scanner.next();
		}
		
		String aux;
		for(int i = 0; i < names.size(); i ++) {
			aux = names.get(i);
			System.out.printf("%s - %s caracteres\n", aux, aux.length());
		}
		scanner.close();
	}
}
