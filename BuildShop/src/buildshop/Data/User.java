package BuildShop.Data;

public class User extends Person {
	private String id;
	private String password;
	private String access;
	private boolean status;

	/**
	 * Constructor para lectura de archivo
	 * 
	 * @param id
	 *            rut del usuario
	 * 
	 * @param password
	 *            contraseña del usuario
	 * 
	 * @param access
	 *            nivel de acceso del usuario
	 * 
	 * @param firstname
	 *            nombre del usuario
	 * 
	 * @param lastname
	 *            apellido del usuario
	 * 
	 * @param email
	 *            email del usuario
	 * 
	 * @param status
	 *            indica estado del usuario
	 */
	public User(String id, String password, String access, String firstname, String lastname, String email,
			boolean status) {
		this.id = id;
		this.password = password;
		this.access = access;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.status = status;
	}

	/**
	 * Constructor para nuevos usuarios
	 * 
	 * @param id
	 *            rut del usuario
	 * 
	 * @param password
	 *            contraseña del usuario
	 * 
	 * @param access
	 *            nivel de acceso del usuario
	 * 
	 * @param firstname
	 *            nombre del usuario
	 * 
	 * @param lastname
	 *            apellido del usuario
	 * 
	 * @param email
	 *            email del usuario
	 */
	public User(String id, String password, String access, String firstname, String lastname, String email) {
		this.id = id;
		this.password = password;
		this.access = access;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.status = true;
	}

	public void setID(String s) {
		id = s;
	}

	public String getID() {
		return id;
	}

	public void setPassword(String s) {
		password = s;
	}

	public String getPassword() {
		return password;
	}

	public void setAccess(String s) {
		access = s;
	}

	public String getAccess() {
		return access;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
