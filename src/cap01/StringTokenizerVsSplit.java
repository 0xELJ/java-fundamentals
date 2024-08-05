package cap01;

import java.util.StringTokenizer;

public class StringTokenizerVsSplit {
	// Separa una cadena en tokens y los imprime en pantalla
	public static void useStringTokenizer(String str, String separator) {
		// Esta clase permite dividir una cadena (str) en tokens usando un separador (separator)
		StringTokenizer st = new StringTokenizer(str, separator);
		String token;
		
		while(st.hasMoreTokens()) {
			token = st.nextToken();
			System.out.println("useStringTokenizer: token: " + token);
		}
	}
	
	// Implementa split() para separ una cadena en tokens e imprimir los mismos
	public static void useSplit(String str, String regex) {
		// split() permite particionar una cadena a partir de una expresión regular
		String[] tokens = str.split(regex);
		for (String token: tokens) {
			System.out.println("useSplit: token: " + token);
		}
	}
	
	public static void main(String[] args) {
		String s = "Juan|Marcos|Carlos|Matias";
		useStringTokenizer(s, "|");
		useSplit(s, "[|]");
	}
}
