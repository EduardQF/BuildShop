package BuildShop.Data;

import javax.swing.JOptionPane;

import BuildShop.Windows.AgreVendedor;
import BuildShop.Windows.EliminarVend;
import BuildShop.Windows.MesangeError;
import BuildShop.Windows.NewProduct;
import BuildShop.Windows.ProductDelete;
import BuildShop.Windows.Register;
import BuildShop.Windows.Modificar;
import buildshop.Windows.requered;

public abstract class AdminBSP {

	/* personal */

	/**
	 * metodo encargado de validar el permiso del usuario y dependiendo de eso
	 * llama la clase AgreVendedor, sino llama a un metodo mesangeError
	 */
	public static void addWorker() {
		if (DataManager.getAccess(0)) {
			AgreVendedor vend = new AgreVendedor();
			vend.setVisible(true);
		} else {
			mesangeError();
		}
	}// listo

	/**
	 * metodo encargado de validar el permiso del usuario y dependiendo de eso
	 * llama la clase EliminarVend, sino llama a un metodo mesangeError
	 */
	public static void removeWorker() {
		if (DataManager.getAccess(0)) {
			EliminarVend elim = new EliminarVend();
			elim.setVisible(true);
		} else {
			mesangeError();
		}
	}// listo

	/**
	 * metodo encargado de validar el permiso del usuario y dependiendo de eso
	 * llama al metodo readUsers, sino llama a un metodo mesangeError
	 */
	public static void usersActived() {
		if (DataManager.getAccess(0)) {
			readUsers(1);
		} else {
			mesangeError();
		}
	}// listo

	/**
	 * metodo encargado de validar el permiso del usuario y dependiendo de eso
	 * llama al metodo readUsers, sino llama a un metodo mesangeError
	 */
	public static void registerUsers() {
		if (DataManager.getAccess(0)) {
			readUsers(0);
		} else {
			mesangeError();
		}
	}// listo

	/* ventas */

	/**
	 * metodo encargado de validar el permiso del usuario y dependiendo de eso
	 * llama al metodo ----, sino llama a un metodo mesangeError
	 */
	public static void registroVentasM() {
		if (DataManager.getAccess(0)) {
                    readSells(0);
		} else {
			mesangeError();
		}
	}

	/**
	 * metodo encargado de validar el permiso del usuario y dependiendo de eso
	 * llama al metodo ----, sino llama a un metodo mesangeError
	 */
	public static void registroVentasA() {
		if (DataManager.getAccess(1)) {
                    readSells(1);
		} else {
			mesangeError();
		}
	}

	// productos

	/**
	 * metodo encargado de validar el permiso del usuario y dependiendo de eso
	 * llama al metodo readProduct, sino llama a un metodo mesangeError
	 */
	public static void registroProduct() {
		if (DataManager.getAccess(1)) {
			readProduct(1);
		} else {
			mesangeError();
		}
	}// listo

	/**
	 * metodo encargado de validar el permiso del usuario y dependiendo de eso
	 * llama al metodo readProduct, sino llama a un metodo mesangeError
	 */
	public static void stock() {
		if (DataManager.getAccess(1)) {
			readProduct(2);
		} else {
			mesangeError();
		}
	}

	/**
	 * metodo encargado de validar el permiso del usuario y dependiendo de eso
	 * llama a la clase addProduct, sino llama a un metodo mesangeError
	 */
	public static void addProduct() {
		if (DataManager.getAccess(0)) {
			NewProduct np = new NewProduct();
			np.setVisible(true);
		} else {
			mesangeError();
		}

	}// listo

	/**
	 * metodo encargado de validar el permiso del usuario y dependiendo de eso
	 * llama a la clase ProductDelete, sino llama a un metodo mesangeError
	 */
	public static void removeProduct() {
		if (DataManager.getAccess(0)) {
			ProductDelete pd = new ProductDelete();
			pd.setVisible(true);
		} else {
			mesangeError();
		}
	}

	/**
	 * metodo encargado de validar el permiso del usuario y dependiendo de eso
	 * llama al metodo ----, sino llama a un metodo mesangeError falta
	 * implementar
	 */
	public static void requeredProduct() {
		if (DataManager.getAccess(1)) {
                    String id[]=rproduct();
                    requered rd=new requered(id);
                    rd.setVisible(true);
		} else {
			mesangeError();
		}
	}

	// other

	/**
	 * metodo encargado de llamar a la clase MesangeError la cual indica por
	 * pantalla un mensaje de error
	 */
	private static void mesangeError() {
		MesangeError me = new MesangeError();
		me.setVisible(true);
	}

	/**
	 * metodo que segun el parametro que recibe crea retorna un arreglo de
	 * String distinto para cada muestra para la clase Register
	 * 
	 * @param i
	 *            indica que tipo de arreglo debe retornar
	 * 
	 * @return devuelve el tipo de arreglo requerido
	 */
	private static String[] titulo(int i) {
		switch (i) {
		case 0:
			String tituloa[] = { "Id", "Code", "Nombre", "Costo", "Precio", "Stock", "Unit", "Estado" };
			return tituloa;
		case 1:
			String titulob[] = { "Id", "Code", "Nombre", "Stock" };
			return titulob;
                case 2:
			String titul[] = { "Usuario", "Contraseña", "Permiso", "Nombre", "Apellido", "correo", "Estado" };
			return titul;
                default:String titulov[]={"fecha","hora","Nº productos vendidos","Id producto","Nombre del preoducto","Cantidad","Precio unitario","precio total P",
                    "precio total venta","stock al momento", "Id del vendedor","nombre del vendedor"};
                    return titulov;
		}
	}

	/* ProductRegister */

	/**
	 * metodo que recibe los datos en forma de array desde readProduct para
	 * guardarlo en una matriz que se utilizala en la clase Register con el
	 * stock de productos
	 * 
	 * @param product
	 *            un String[] con los datos del producto
	 * 
	 * @return retorna los datos del producto en un String[][]
	 */
	private static String[][] productStock(String[] product) {
		int tam = product.length / 7, j = 0;
		String productList[][] = new String[tam][4];
		// productList = {"Id","Code","Nombre","Stock"};
		System.out.println("started read");
		for (int i = 0; i < product.length; i += 8) {
			if (product[i + 7].equalsIgnoreCase("true")) {
				System.out.println("\tread:" + j);
				productList[j][0] = product[i];
				productList[j][1] = product[i + 1];
				productList[j][2] = product[i + 2];
				/* productList[j][3]=product[i+3]; */
				/* productList[j][4]=product[i+4] */
				productList[j][3] = product[i + 5];
				/* productList[j][6]=product[i+6] */
				j++;
			}
		}
		return productList;
	}

	/**
	 * metodo que recibe los datos en forma de array desde readProduct para
	 * guardarlo en una matriz que se utilizala en la clase Register
	 * 
	 * @param product
	 *            un String[] con los datos del producto
	 * 
	 * @return retorna los datos del producto en un String[][]
	 */
	public static String[][] productRegister(String[] product) {
		int tam = product.length / 7, j = 0;
		String productList[][] = new String[tam][8];
		// productList =
		// {"Id","Code","Nombre","Costo","Precio","Stock","Unit","state"};
		System.out.println("read started");
		for (int i = 0; i < product.length; i += 8) {
			System.out.println("read:" + j);
			productList[j][0] = product[i];
			productList[j][1] = product[i + 1];
			productList[j][2] = product[i + 2];
			productList[j][3] = product[i + 3];
			productList[j][4] = product[i + 4];
			productList[j][5] = product[i + 5];
			productList[j][6] = product[i + 6];
			productList[j][7] = product[i + 7];
			j++;
		}
		return productList;
	}

	/**
	 * metodo que recibe los datos desde DataManager para guardarlo en un
	 * arreglo que se utilizala en los metodos anteriores
	 * 
	 * @param op
	 *            numero que indica que tipo de listado debe generarse
	 */
	private static void readProduct(int op) {
		String product[] = DataReader.readData("C:/BuildShop/DB/products.buildshop");
		String productList[][], title[];
		if (op == 1) {
			title = titulo(0);
			productList = productRegister(product);
		} else {
			title = titulo(1);
			productList = productStock(product);
		}
		Register pv = new Register(title, productList);
		pv.setVisible(true);
	}

	// userRegister
	/**
	 * metodo que recibe los datos en forma de array desde readProduct para
	 * guardarlo en una matriz que se utilizala en la clase Register
	 * 
	 * @param users
	 *            String[] con los datos del usuario
	 * 
	 * @return devuelve los datos en un String[][]
	 */
	public static String[][] userRegist(String[] users) {
		int i = 0;
		int tm = users.length / 6;
		String userList[][] = new String[tm][7];
		System.out.println("tm:"+tm+"\nnstarted read");
		for (int j = 0; j < users.length; j += 7) {
			System.out.println("read:" + i+"\nj:"+j);
			userList[i][0] = users[j];
			userList[i][1] = ("******");
			userList[i][2] = users[j + 2];
			userList[i][3] = users[j + 3];
			userList[i][4] = users[j + 4];
			userList[i][5] = users[j + 5];
			userList[i][6] = users[j + 6];
			i++;
		}
		return userList;
	}

	/**
	 * metodo que recibe los datos en forma de array desde readProduct para
	 * guardarlo en una matriz que se utilizala en la clase Register
	 * 
	 * @param users
	 *            String[] con los datos del usuario
	 * 
	 * @return devuelve un String[][] vacio (???)
	 */
	private static String[][] userActiv(String[] users) {
		System.out.println("created");
                String o[][] = new String[1][7];
                for (int j = 0; j < DataManager.getUsersSize(); j++) {
                    System.out.println("ingreso user actived");
                    if ((DataManager.getUser(j).getID()).equals(DataManager.getUser_actived())) {
                        o[0][0]=DataManager.getUser(j).getID();
                        o[0][1]=DataManager.getUser(j).getPassword();
                        o[0][2]=DataManager.getUser(j).getAccess();
                        o[0][3]=DataManager.getUser(j).getFirstName();
                        o[0][4]=DataManager.getUser(j).getLastName();
                        o[0][5]=DataManager.getUser(j).getEmail();
                        o[0][6]=String.valueOf(DataManager.getUser(j).getStatus());    
                        break;
                    }
                }
		
		return o;
	}

	/**
	 * metodo que recibe los datos desde DataManager para guardarlo en un
	 * arreglo que se utilizala en los metodos anteriores
	 * 
	 * @param op
	 *            numero que indica la accion a realizar
	 */
	private static void readUsers(int op) {
		String users[] = DataReader.readData("C:/BuildShop/DB/users.buildshop");
		String usersList[][], title[];
		if (op == 0) {
			title = titulo(2);
			usersList = userRegist(users);
		} else {
			title = titulo(2);
			usersList = userActiv(users);
		}
		Register pv = new Register(title, usersList);
		pv.setVisible(true);

	}

	/**
	 * metodo que permite iniciar la ventana de modificacion de usuarios
	 */
	public static void modific() {
		String reg[];
		if (DataManager.getAccess(0)) {
			reg = regRuts();
			Modificar m = new Modificar(reg);
			m.setVisible(true);
		} else {
			mesangeError();
		}
	}

	/**
	 * metodo que permite obtener un listado de usuarios
	 * 
	 * @return devuelve un String[] con el listado de usuarios
	 */
	private static String[] regRuts() {
		String users[] = DataReader.readData("C:/BuildShop/DB/users.buildshop");
		int i = 0;
		int tm = users.length / 6;
		String List[] = new String[tm];
		System.out.println("started read");
		for (int j = 0; j < users.length; j += 7) {
			System.out.println("read:" + i);
			List[i] = users[j];
			i++;
		}
		return List;
	}
        
        private static String[] rproduct(){
            String product[]=DataReader.readData("C:/BuildShop/DB/products.buildshop");
            int tam = product.length / 7, j = 0;
		String productList[] = new String[tam];
		// productList =
		// {"Id","Code","Nombre","Costo","Precio","Stock","Unit","state"};
		System.out.println("read started");
		for (int i = 0; i < product.length; i += 8) {
			System.out.println("read:" + j);
			productList[j]= product[i];
			j++;
		}
		return productList;
        }
        
        //sells register
        private static void readSells(int op){
            String users[] = DataReader.readData("C:/BuildShop/DB/ventas.buildshop");
		String usersList[][], title[];
		if (op == 0) {
			title = titulo(3);
			usersList = sellRegister(users);
		} else {
			title = titulo(3);
			usersList = sellRegister(users);
		}
		Register pv = new Register(title, usersList);
		pv.setVisible(true);
        }
        
        public static String[][] sellRegister(String[] sells){
            System.out.println("Intro");
            int i=0;
            int tm=sells.length/12;
            System.out.println("tm:"+tm);
            String sellsList[][]=new String[tm][12];
            System.out.println("started read sellsList");
            for (int j = 0; i < tm; j += 12) {
			System.out.println("read:" + i+"\nj:"+j);
			sellsList[i][0] = sells[j];
			sellsList[i][1] = sells[j + 1];
			sellsList[i][2] = sells[j + 2];
			sellsList[i][3] = sells[j + 3];
			sellsList[i][4] = sells[j + 4];
			sellsList[i][5] = sells[j + 5];
			sellsList[i][6] = sells[j + 6];
                        sellsList[i][7] = sells[j + 7];
                        sellsList[i][8] = sells[j + 8];
                        sellsList[i][9] = sells[j + 9];
                        sellsList[i][10] = sells[j + 10];
                        sellsList[i][11] = sells[j + 11];
			i++;
		}
		return sellsList;
        } 

}
