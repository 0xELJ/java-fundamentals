package cap02.exception;

public class User {
	private String username;
	private String password;
	private String name;
	private String email;
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString( ) {
		return String.format("%s, %s, %s", this.username, this.name, this.email);
	}
}
