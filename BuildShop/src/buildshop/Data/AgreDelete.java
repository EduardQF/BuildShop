package BuildShop.Data;

import BuildShop.Windows.*;

public abstract class AgreDelete {

	/**
	 * metodo encargado de revisar los datos dela acceso, y transformar otros
	 * parametros de formato y luego llamar al metodo alojado en DataManager, y
	 * crear un nuebo objeto usurio , y actualizar la base de datos
	 * 
	 * @param firstname
	 *            nombre del usuario
	 * @param lastname
	 *            apellido del usuario
	 * @param rut
	 *            rut del usuario
	 * @param clave
	 *            contraseña del usuario
	 * @param email
	 *            email del usuario
	 * @param acces
	 *            nivel de acceso del usuario
	 */
	public static void newUser(String firstname, String lastname, String rut, String clave, String email,
			String acces) {
		boolean st = true;
		for (int i = 0; i < DataManager.getUsersSize(); i++) {
			if (rut.equals(DataManager.getUser(i).getId())) {
				DataManager.getUser(i).setStatus(true);
				st = false;
				break;
			}
		}
		if (st) {
			if (acces == "Administrador") {
				acces = "Admin";
			} else if (acces == "Inventario") {
				acces = "inventory";
			} else {
				acces = "seller";
			}
			DataManager.newUser(rut, clave, acces, firstname, lastname, email);

		}
		DataManager.writeUsers();
		System.out.println("User Add");
	}

	/**
	 * metodo encargado de revisar y comparar el parametro rut,para ubicarlo en
	 * la lista de usuario luego llamar al metodo alojado en DataManager, y
	 * modifca el estado a falso,luego actualiza la base de datos
	 * 
	 * @param rut
	 *            rut del usuario a eliminar
	 */
	public static void deleteUser(String rut) {
		for (int i = 0; i < DataManager.getUsersSize(); i++) {
			if (rut.equals(DataManager.getUser(i).getId())) {
				DataManager.getUser(i).setStatus(false);
				break;
			}
		}
		DataManager.writeUsers();
		System.out.println("User deleted");
	}

	/**
	 * metodo encargado de revisar los datos de el codigo de el producto para
	 * verificar si ya existe el producto, ademas de transformar otros
	 * parametros de formato , luego llamar al metodo alojado en DataManager, y
	 * crear un nuebo objeto de tipo Product, luego, actualizar la base de datos
	 * 
	 * @param producto
	 *            nombre del producto
	 * @param id
	 *            numero de identificacion del producto
	 * @param cantidad
	 *            la cantidad en stock del producto
	 * @param codigo
	 *            codigo de busqueda del producto
	 * @param precioVenta
	 *            precio de venta del producto
	 * @param costo
	 *            costo del producto
	 * @param unit
	 *            unidad de medida del producto
	 * @param descripcion
	 *            informacion sobre el producto
	 */
	public static void newProduct(String producto, String id, String cantidad, String codigo, String precioVenta,
			String costo, String unit, String descripcion) {
		boolean st = true;
		for (int i = 0; i < DataManager.getProductsSize(); i++) {
			if (id.equals(DataManager.getProduct(i).getID())) {
				DataManager.getProduct(i).setStatus(true);
				st = false;
				break;
			}
		}
		if (st) {
			int cost = Integer.parseInt(costo);
			int price = Integer.parseInt(precioVenta);
			int stoc = Integer.parseInt(cantidad);
			DataManager.newProduct(id, codigo, producto, cost, price, stoc, unit);
		}
		DataManager.writeProducts();
		System.out.println("Product Add");
	}

	/**
	 * metodo que verifica el parametro idp con los de la vase de dato para
	 * descativar el producto al que le pertenesca, y luego actualizar la base
	 * de datos
	 * 
	 * @param idp
	 *            id del producto a eliminar
	 * 
	 */
	public static void deleteProduct(String idp) {
		for (int i = 0; i < DataManager.getProductsSize(); i++) {
			if (idp.equals(DataManager.getProduct(i).getID())) {
				DataManager.getProduct(i).setStatus(false);
				break;
			}
		}
		DataManager.writeProducts();
		System.out.println("Product deleted");
	}

	public static void ModUser(String firstname, String lastname, String rut,
                String clave, String email,String acces,int i) {
            DataManager.getUser(i).setFirstName(firstname);
            DataManager.getUser(i).setLastName(lastname);
            DataManager.getUser(i).setID(rut);
            DataManager.getUser(i).setPassword(clave);
            DataManager.getUser(i).setEmail(email);
            DataManager.getUser(i).setAccess(acces);
            
	}
}
