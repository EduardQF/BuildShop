package BuildShop.Data;

import java.util.ArrayList;

import BuildShop.Windows.LoadingScreen;

public class DataManager {
	private static LoadingScreen ls = new LoadingScreen();
	private static ArrayList<User> db_user = new ArrayList<User>();
	private static ArrayList<Client> db_client = new ArrayList<Client>();
	private static ArrayList<Product> db_product = new ArrayList<Product>();
	private static ArrayList<Ventas> db_ventas = new ArrayList<Ventas>();
	private static int user_id = -1;
        private static String user_actived;
	private static boolean[] user_access = new boolean[] { false, false, false };

    public static String getUser_actived() {
        return user_actived;
    }

	/**
	 * metodo que muestra la pantalla de carga
	 */
	public static void showLS() {
		ls.setVisible(true);
	}

	/**
	 * metodo que oculta la pantalla de carga
	 */
	public static void hideLS() {
		ls.setVisible(false);
	}

	/**
	 * metodo que genera un nuevo producto
	 * 
	 * @param id
	 *            numero de identificacion del producto
	 * 
	 * @param code
	 *            codigo de busqueda del producto
	 * 
	 * @param name
	 *            nombre del producto
	 * 
	 * @param cost
	 *            costo del producto
	 * 
	 * @param price
	 *            precio de venta del producto
	 * 
	 * @param stock
	 *            la cantidad en stock del producto
	 * 
	 * @param unit
	 *            unidad de medida del producto
	 */
	public static void newProduct(String id, String code, String name, int cost, int price, int stock, String unit) {
		db_product.add(new Product(id, code, name, cost, price, stock, unit));
	}

	/**
	 * metodo que genera un nuevo usuario
	 * 
	 * @param id
	 *            rut del usuario
	 * 
	 * @param password
	 *            contrase�a del usuario
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
	public static void newUser(String id, String password, String access, String firstname, String lastname,
			String email) {
		db_user.add(new User(id, password, access, firstname, lastname, email));
	}

	public static void newVenta(String data[]) {
            System.out.println("user_actived:"+user_actived);
		for (int i = 0; i < data.length; i++)
			if (i == 0 || i % 2 == 0) {
				try {
					Product n = findProduct(data[i]);
					System.out.println("id:"+n.getID()+"\nname:"+n.getName()+"\ncant:"+data[i+1]+"\nprice:"+n.getPrice());
					db_ventas.add(new Ventas(n.getID(), n.getName(), data[i + 1], String.valueOf(n.getPrice()),
							String.valueOf(Integer.valueOf(n.getPrice()) * Integer.valueOf(data[i + 1])),
							data[data.length - 1],
							String.valueOf(Integer.valueOf(n.getStock()) - Integer.valueOf(data[i + 1])),
							String.valueOf(user_actived), findUserName()));
					n.setStock(Integer.valueOf(n.getStock())-Integer.valueOf(data[i+1]));
					System.out.println("Venta añdida " + db_ventas.size());
				} catch (Exception e) {
                                    System.out.println("no se pudo almacenar\n");
				}
			}
		writeVentas();
	}

	private static Product findProduct(String code) {
            System.out.println("product:"+code+"\n");
		for (int i = 0; i < db_product.size(); i++) {
			if (db_product.get(i).getName().equals(code)) {
				return db_product.get(i);
			}
		}
		return null;
	}

	private static String findUserName() {
		for (int i = 0; i < db_user.size(); i++) {
			if (db_user.get(i).getID().equals(user_actived)) {
				return db_user.get(i).getFirstName();
			}
		}
		return "";
	}

	public static void newClient() {
		db_client.add(new Client());
	}

	/**
	 * metodo encargado de ingresar los usuarios leidos desde el archivo users
	 */
	public static void readUsers() {
		System.out.println("Reading DB");
		String temp_db[] = DataReader.readData("C:/BuildShop/DB/users.buildshop");
		if (temp_db.length > 5) {
			System.out.println("UsersDB Size: " + temp_db.length + "\n" + (temp_db.length / 7) + " Users Detected");
			for (int i = 0; i < temp_db.length; i += 7) {
				db_user.add(new User(temp_db[i], temp_db[i + 1], temp_db[i + 2], temp_db[i + 3], temp_db[i + 4],
						temp_db[i + 5], Boolean.valueOf(temp_db[i + 6])));
				System.out.println("Reading ID: " + temp_db[i]);
			}
		}
	}

	/**
	 * metodo encargado de ingresar los productos leidos desde el archivo
	 * products
	 */
	public static void readProducts() {
		System.out.println("Reading Products");
		String temp_db[] = DataReader.readData("C:/BuildShop/DB/products.buildshop");
		if (temp_db.length > 6) {
			System.out
					.println("ProductsDB Size: " + temp_db.length + "\n" + (temp_db.length / 8) + " Products Detected");
			for (int i = 0; i < temp_db.length; i += 8) {
				db_product.add(new Product(temp_db[i], temp_db[i + 1], temp_db[i + 2], Integer.valueOf(temp_db[i + 3]),
						Integer.valueOf(temp_db[i + 4]), Integer.valueOf(temp_db[i + 5]), temp_db[i + 6],
						Boolean.valueOf(temp_db[i + 7])));
				System.out.println("Reading ID: " + temp_db[i]);
			}
		}
	}

	/**
	 * unused
	 */
	public static void readClients() {
		System.out.println("Reading Clients");
		String temp_db[] = DataReader.readData("C:/BuildShop/DB/clients.buildshop");
		if (temp_db.length > 5) {
			System.out.println("ClientsDB Size: " + temp_db.length + "\n" + (temp_db.length / 1) + " Clients Detected");
			for (int i = 0; i < temp_db.length; i += 1) {
				db_client.add(new Client());
				System.out.println("Reading ID: " + "null");
			}
		}
	}

	/**
	 * metodo encargado de transformar los datos para la creacion del archivo
	 * users
	 */
	public static void writeUsers() {
		String data = "";
		for (int i = 0; i < db_user.size(); i++) {
			if (i != 0) {
				data += "-----";
			}
			data += db_user.get(i).getID();
			data += "-----";
			data += db_user.get(i).getPassword();
			data += "-----";
			data += db_user.get(i).getAccess();
			data += "-----";
			data += db_user.get(i).getFirstName();
			data += "-----";
			data += db_user.get(i).getLastName();
			data += "-----";
			data += db_user.get(i).getEmail();
			data += "-----";
			data += String.valueOf(db_user.get(i).getStatus());
		}
		DataReader.writeData("C:/BuildShop/DB/users.buildshop", data);
	}

	/**
	 * metodo encargado de transformar los datos para la creacion del archivo
	 * products
	 */
	public static void writeProducts() {
		String data = "";
		for (int i = 0; i < db_product.size(); i++) {
			if (i != 0) {
				data += "-----";
			}
			data += db_product.get(i).getID();
			data += "-----";
			data += db_product.get(i).getCode();
			data += "-----";
			data += db_product.get(i).getName();
			data += "-----";
			data += String.valueOf(db_product.get(i).getCost());
			data += "-----";
			data += String.valueOf(db_product.get(i).getPrice());
			data += "-----";
			data += String.valueOf(db_product.get(i).getStock());
			data += "-----";
			data += db_product.get(i).getUnit();
			data += "-----";
			data += String.valueOf(db_product.get(i).getStatus());
		}
		DataReader.writeData("C:/BuildShop/DB/products.buildshop", data);
	}

	/**
	 * unused
	 */
	public static void writeClients() {
		String data = "";
		for (int i = 0; i < db_client.size(); i++) {
			if (i != 0) {
				data += "-----";
			}
		}
		DataReader.writeData("C:/BuildShop/DB/clients.buildshop", data);
	}

	/**
	 * metodo encargado de transformar los datos para la creacion del archivo
	 * ventas
	 */
	public static void writeVentas() {
		String data = "";
		for (int i = 0; i < db_ventas.size(); i++) {
			if (i != 0) {
				data += "-----";
			}
			data += db_ventas.get(i).getDate();
			data += "-----";
			data += db_ventas.get(i).getTime();
			data += "-----";
			data += db_ventas.get(i).getId();
			data += "-----";
			data += db_ventas.get(i).getProductID();
			data += "-----";
			data += db_ventas.get(i).getProductName();
			data += "-----";
			data += db_ventas.get(i).getProductAmmo();// cantidad
			data += "-----";
			data += db_ventas.get(i).getProductPrice();
			data += "-----";
			data += db_ventas.get(i).getProductTotal();
			data += "-----";
			data += db_ventas.get(i).getTotal();
			data += "-----";
			data += db_ventas.get(i).getProductStock();
			data += "-----";
			data += db_ventas.get(i).getUserID();
			data += "-----";
			data += db_ventas.get(i).getUserName();
		}
		System.out.println("Archivo de Ventas actualizado");
		DataReader.writeData("C:/BuildShop/DB/ventas.buildshop", data);
	}

	/**
	 * metodo encargado de ingresar las ventas leidos desde el archivo ventas
	 */
	public static void readVentas() {
		System.out.println("Reading Ventas");
		String temp_db[] = DataReader.readData("C:/BuildShop/DB/ventas.buildshop");
		if (temp_db.length > 6) {
			System.out.println("VentasDB Size: " + temp_db.length + "\n" + (temp_db.length / 12) + " Ventas Detected");
			for (int i = 0; i < temp_db.length; i += 12) {
				db_ventas.add(new Ventas(temp_db[i], temp_db[i + 1], temp_db[i + 2], temp_db[i + 3], temp_db[i + 4],
						temp_db[i + 5], temp_db[i + 6], temp_db[i + 7], temp_db[i + 8], temp_db[i + 9], temp_db[i + 10],
						temp_db[i + 11]));
				System.out.println("Reading ID: " + temp_db[i]);
			}
		}
	}

	/**
	 * metodo encargado de verificar la informacion de usuario al momento de
	 * iniciar sesion
	 * 
	 * @param user
	 *            id del usuario
	 * 
	 * @param pass
	 *            contrase�a del usuario
	 * 
	 * @return devuelve true en caso de coincidir los datos, en caso contrario
	 *         false
	 */
	public static boolean findUser(String user, String pass) {
		for (int i = 0; i < db_user.size(); i++) {
			if (user.equalsIgnoreCase(db_user.get(i).getID()) && pass.equals(db_user.get(i).getPassword())
					&& db_user.get(i).getStatus() == true) {
				user_id = i;
                                user_actived=db_user.get(i).getID();
				if (db_user.get(i).getAccess().equals("admin")) {
					user_access[0] = true;
					user_access[1] = true;
					user_access[2] = true;
				} else if (db_user.get(i).getAccess().equals("fulluser")) {
					user_access[0] = false;
					user_access[1] = true;
					user_access[2] = true;
				} else if (db_user.get(i).getAccess().equals("inventory")) {
					user_access[0] = false;
					user_access[1] = true;
					user_access[2] = false;
				} else if (db_user.get(i).getAccess().equals("seller")) {
					user_access[0] = false;
					user_access[1] = false;
					user_access[2] = true;
				}
				return true;
			}
		}
		return false;
	}

	/**
	 * metodo que permite dar valor a id
	 * 
	 * @param id
	 *            nuevo valor de id
	 */
	public static void setID(int id) {
		user_id = id;
	}

	/**
	 * metodo que devuelve el valor de id
	 * 
	 * @return devuele el valor de id
	 */
	public static int getID() {
		return user_id;
	}

	/**
	 * metodo que permite dar valores a user_access
	 * 
	 * @param admin
	 *            true en caso de tener permisos de administrador
	 * 
	 * @param inventory
	 *            true en caso de tener acceso al inventario
	 * @param seller
	 *            true en caso de tener acceso a las ventas
	 */
	public static void setAcces(boolean admin, boolean inventory, boolean seller) {
		user_access[0] = admin;
		user_access[1] = inventory;
		user_access[2] = seller;
	}

	/**
	 * metodo que permite obtener el valor de user_access
	 * 
	 * @param i
	 *            indica que permiso se debe devolver
	 * 
	 * @return devuelve el estado del permiso solicitado
	 */
	public static boolean getAccess(int i) {
		return user_access[i];
	}

	/**
	 * metodo que permite obtener la cantidad de usuarios del sistema
	 * 
	 * @return devuelve cantidad de usuarios
	 */
	public static int getUsersSize() {
		return db_user.size();
	}

	public static int getVentasSize() {
		return db_ventas.size();
	}

	/**
	 * metodo que permite obtener la cantidad de productos del sistema
	 * 
	 * @return devuelve cantidad de productos
	 */
	public static int getProductsSize() {
		return db_product.size();
	}

	public static int getClientsSize() {
		return db_client.size();
	}

	/**
	 * metodo que permite obtener un producto
	 * 
	 * @param i
	 *            indica el numero de producto a obtener
	 * 
	 * @return devuelve el producto solicitado
	 */
	public static Product getProduct(int i) {
		return db_product.get(i);
	}

	/**
	 * metodo que permite obtener un usuario
	 * 
	 * @param i
	 *            indica el numero de usuario a obtener
	 * 
	 * @return devuelve el usuario solicitado
	 */
	public static User getUser(int i) {
		return db_user.get(i);
	}

	/**
	 * unused
	 * 
	 * @param i
	 *            unused
	 * @return unused
	 */
	public static Client getClient(int i) {
		return db_client.get(i);
	}
}
