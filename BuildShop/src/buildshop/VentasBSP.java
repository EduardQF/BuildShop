
package buildshop;

public class VentasBSP {

    public  boolean comparador(String nombre, String valueAt) {
        return(nombre.equals(String.valueOf(valueAt)));
    }

    private String[] created(BuildShop.Producto boton, int cant, int valorT) {
        String[] dataTable = {boton.getName(), String.valueOf(cant), String.valueOf(boton.getPrice()), String.valueOf(valorT)};
        return dataTable;
    }


    private int[] valores(BuildShop.Producto boton, int valor) {

        int cant = 1 + valor;
        System.out.println(".");
        int valorT = boton.getPrice() * cant;
        int v[] = {cant, valorT};
        return v;
    }
}
