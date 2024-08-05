package cap02.exception;

public class AuthError extends Exception {
	public AuthError(Exception ex) {
		super("Ocurrió un error de authenticación", ex);
	}
}
