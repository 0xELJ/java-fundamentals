package cap02.exception;

public class TestAuthenticator {
	public static void main(String[] args) {
		try {
			Authenticator auth = new Authenticator();
			User user = auth.login("juan", "juan123sito");
			System.out.println("Autenticación exitosa " + user);
		} catch (Exception ex) {
			System.out.println("Servicio temporalment interrumpido: ");
			System.out.println(ex.getMessage());
		}
	}
}
