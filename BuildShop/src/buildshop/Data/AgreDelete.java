package BuildShop.Data;

import BuildShop.Windows.*;

public abstract class AgreDelete {

    public static void newUser(String firstname, String lastname, String rut, String clave, String email, String acces) {
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

    public static void newProduct(String producto, String id, String cantidad, String codigo, String precioVenta, String costo, String unit, String descripcion) {
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

    public static void deleteProduct(String idp) {
        for (int i = 0; i <DataManager.getProductsSize(); i++) {
            if(idp.equals(DataManager.getProduct(i).getID())){
                DataManager.getProduct(i).setStatus(false);
                break;
            }
        }
        DataManager.writeProducts();
        System.out.println("Product deleted");
    }
}
