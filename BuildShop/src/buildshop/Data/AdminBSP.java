package BuildShop.Data;

import javax.swing.JOptionPane;

import BuildShop.Windows.AgreVendedor;
import BuildShop.Windows.EliminarVend;
import BuildShop.Windows.MesangeError;
import BuildShop.Windows.NewProduct;
import BuildShop.Windows.ProductDelete;
import BuildShop.Windows.Register;

public abstract class AdminBSP {

    /*personal*/
    
    /*metodo encargado de validar el permiso del usuario y dependiendo de eso 
    *llama la clase AgreVendedor, sino llama a un metodo mesangeError*/
    public static void addWorker() {
        if (DataManager.getAccess(0)) {
            AgreVendedor vend = new AgreVendedor();
            vend.setVisible(true);
        } else {
            mesangeError();
        }
    }//listo

    /*metodo encargado de validar el permiso del usuario y dependiendo de eso 
    *llama la clase EliminarVend, sino llama a un metodo mesangeError*/
    public static void removeWorker() {
        if (DataManager.getAccess(0)) {
            EliminarVend elim = new EliminarVend();
            elim.setVisible(true);
        } else {
            mesangeError();
        }
    }//listo

    /*metodo encargado de validar el permiso del usuario y dependiendo de eso 
    *llama al metodo readUsers, sino llama a un metodo mesangeError*/
    public static void usersActived() {
        if (DataManager.getAccess(0)) {
            readUsers(1);
        } else {
            mesangeError();
        }
    }//listo

    /*metodo encargado de validar el permiso del usuario y dependiendo de eso 
    *llama al metodo readUsers, sino llama a un metodo mesangeError*/
    public static void registerUsers() {
        if (DataManager.getAccess(0)) {
            readUsers(0);
        } else {
            mesangeError();
        }
    }//listo

    /*ventas*/
    
    /*metodo encargado de validar el permiso del usuario y dependiendo de eso 
    *llama al metodo ----, sino llama a un metodo mesangeError*/
    public static void registroVentasM() {
        if (DataManager.getAccess(0)) {
            
        } else {
            mesangeError();
        }
    }
    
    /*metodo encargado de validar el permiso del usuario y dependiendo de eso 
    *llama al metodo ----, sino llama a un metodo mesangeError*/
    public static void registroVentasA() {
        if (DataManager.getAccess(1)) {
            
        } else {
            mesangeError();
        }
    }

    //productos
    
    /*metodo encargado de validar el permiso del usuario y dependiendo de eso 
    *llama al metodo readProduct, sino llama a un metodo mesangeError*/
    public static void registroProduct() {
        if (DataManager.getAccess(1)) {
            readProduct(1);
        } else {
            mesangeError();
        }
    }//listo

    
    /*metodo encargado de validar el permiso del usuario y dependiendo de eso 
    *llama al metodo readProduct, sino llama a un metodo mesangeError*/
    public static void stock() {
        if (DataManager.getAccess(1)) {
            readProduct(2);
        } else {
            mesangeError();
        }
    }
    
    /*metodo encargado de validar el permiso del usuario y dependiendo de eso 
    *llama a la clase addProduct, sino llama a un metodo mesangeError*/
    public static void addProduct() {
        if (DataManager.getAccess(0)) {
            NewProduct np = new NewProduct();
            np.setVisible(true);
        } else {
            mesangeError();
        }
        
    }//listo

    /*metodo encargado de validar el permiso del usuario y dependiendo de eso 
    *llama a la clase ProductDelete, sino llama a un metodo mesangeError*/
    public static void removeProduct() {
        if (DataManager.getAccess(0)) {
            ProductDelete pd = new ProductDelete();
            pd.setVisible(true);
        } else {
            mesangeError();
        }
    }
    
    /*metodo encargado de validar el permiso del usuario y dependiendo de eso 
    *llama al metodo ----, sino llama a un metodo mesangeError
    *falta implementar*/
    public static void requeredProduct() {
        if (DataManager.getAccess(1)) {
            
        } else {
            mesangeError();
        }
    }

    //other
    
    /*metodo encargado de llamar a la clase MesangeError la cual indica por 
    *pantalla un mensaje de error*/
    private static void mesangeError() {
        MesangeError me = new MesangeError();
        me.setVisible(true);
    }
    
    /*metodo que segun el parametro que recibe crea retorna un arreglo de String distinto para cada 
    *muestra para la clase Register*/
    private static String[] titulo(int i) {
        switch (i) {
            case 0:
                String tituloa[] = {"Id", "Code", "Nombre", "Costo", "Precio", "Stock", "Unit", "Estado"};
                return tituloa;
            case 1:
                String titulob[] = {"Id", "Code", "Nombre", "Stock"};
                return titulob;
            default:
                String titul[] = {"Usuario", "Contraseña", "Permiso", "Nombre", "Apellido", "correo", "Estado"};
                return titul;
        }
    }

    /* ProductRegister*/
    
    /*metodo que recibe los datos en forma de array desde readProduct para guardarlo en una matriz
    *que se utilizala en la clase Register con el stock de productos
    */
    private static String[][] productStock(String[] product) {
        int tam = product.length / 7, j = 0;
        String productList[][] = new String[tam][4];
        //productList = {"Id","Code","Nombre","Stock"};
        System.out.println("started read");
        for (int i = 0; i < product.length; i += 8) {
            if (product[i + 7].equalsIgnoreCase("true")) {
                System.out.println("\tread:" + j);
                productList[j][0] = product[i];
                productList[j][1] = product[i + 1];
                productList[j][2] = product[i + 2];
                /*productList[j][3]=product[i+3];*/
                /*productList[j][4]=product[i+4]*/
                productList[j][3] = product[i + 5];
                /*productList[j][6]=product[i+6]*/
                j++;
            }
        }
        return productList;
    }
    
    /*metodo que recibe los datos en forma de array desde readProduct para guardarlo en una matriz
    *que se utilizala en la clase Register
    */
    public static String[][] productRegister(String[] product) {
        int tam = product.length / 7, j = 0;
        String productList[][] = new String[tam][8];
        //productList = {"Id","Code","Nombre","Costo","Precio","Stock","Unit","state"};
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
    
    /*metodo que recibe los datos desde DataManager para guardarlo en un arreglo
    *que se utilizala en los metodos anteriores
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

    //userRegister
    /*metodo que recibe los datos en forma de array desde readProduct para guardarlo en una matriz
    *que se utilizala en la clase Register
    */
    public static String[][] userRegist(String[] users) {
        int i = 0;
        int tm = users.length / 6;
        String userList[][] = new String[tm][7];
        System.out.println("started read");
        for (int j = 0; j < users.length; j += 7) {
            System.out.println("read:" + i);
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
    
    /*metodo que recibe los datos en forma de array desde readProduct para guardarlo en una matriz
    *que se utilizala en la clase Register
    */
    private static String[][] userActiv(String[] users) {
        System.out.println("created");
        String o[][] = {{""}, {""}};
        return o;
    }
    
    /*metodo que recibe los datos desde DataManager para guardarlo en un arreglo
    *que se utilizala en los metodos anteriores
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
    
}
