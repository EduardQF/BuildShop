package BuildShop.Data;

public class Person {
	protected String firstname;
	protected String lastname;
	protected String address;
	protected int age;
	protected String email;

	/**
	 * metodo que da valor a age
	 * 
	 * @param i
	 *            indica nuevo valor de age
	 */
	public void setAge(int i) {
		age = i;
	}

	/**
	 * metodo que devuelve el valor de age
	 * 
	 * @return devuelve el valor de age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * metodo que da valor a firstname
	 * 
	 * @param s
	 *            indica nuevo valor de firstname
	 */
	public void setFirstName(String s) {
		firstname = s;
	}

	/**
	 * metodo que devuelve el valor de firstname
	 * 
	 * @return devuelve el valor de firstname
	 */
	public String getFirstName() {
		return firstname;
	}

	/**
	 * metodo que da valor a lastname
	 * 
	 * @param s
	 *            indica nuevo valor de lastname
	 */
	public void setLastName(String s) {
		lastname = s;
	}

	/**
	 * metodo que devuelve el valor de lastname
	 * 
	 * @return devuelve el valor de lastname
	 */
	public String getLastName() {
		return lastname;
	}

	/**
	 * metodo que da valor a email
	 * 
	 * @param s
	 *            indica nuevo valor de email
	 */
	public void setEmail(String s) {
		email = s;
	}

	/**
	 * metodo que devuelve el valor de email
	 * 
	 * @return devuelve el valor de email
	 */
	public String getEmail() {
		return email;
	}

}
