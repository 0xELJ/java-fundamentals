package cap02.exception;

import java.util.ResourceBundle;

public class Authenticator {
	/**
	 * Se especifica en el prototipo del metodo login que este podría arrojar una excepción del tipo Auth Error
	 * Esto obliga a encerrar la llamada del metodo login en un bloque try-catch
	 * 
	 * 
	 * @param username
	 * @param password
	 * @return
	 * @throws AuthError
	 */
	public User login(String username, String password) throws AuthError {
		try {			
			// leemos el archivo de propiedades que está ubicado en la raíz del paquete exception
			ResourceBundle rb = ResourceBundle.getBundle("user");
			
			// leemos el valor de la propiedad username
			String user = rb.getString("username");
			
			// leemos el valor de la propiedad password
			String pwd = rb.getString("password");
			
			// definimos la variable de retorno
			User authUser = null;
			
			// si coinciden el usuario y contraseña se instancia User
			if (username.equals(user) && password.equals(pwd)) {
				authUser = new User();
				authUser.setUsername(username);
				authUser.setName(rb.getString("name"));
				authUser.setEmail(rb.getString("email"));
			}
			
			return authUser;
		} catch (Exception ex) {
			//throw new RuntimeException("Error verificando credenciales ", ex);
			throw ex;
		}
	}
}
