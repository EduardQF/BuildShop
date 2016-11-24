package BuildShop.Data;

public class VentasBSP {

    //botones.
    /*datos para crear un boton*/
    public static String[] created(Producto boton, int cant, int valorT) {
        String[] dataTable = {boton.getName(), boton.getCode(), String.valueOf(cant), String.valueOf(boton.getPrice()), String.valueOf(valorT)};
        return dataTable;
    }

    /*datos para agregar a la tabla*/
    public static String[] valores(int cost, int valor, int op) {
        int cant;
        if (op == 0) {
            cant = valor + 1;
        } else if (valor <= 0) {
            cant = valor;
        } else {
            cant = valor - 1;
        }
        System.out.println(".");
        int valorT = cost * cant;
        String v1 = String.valueOf(cant);
        String v2 = String.valueOf(valorT);
        String v[] = {v1, v2};
        return v;
    }

    /*datos para quitar de uno de la tabla*/
   /* public static String[] valoresRe(int price, int valor) {
        int cant;

        System.out.println(".");
        int valorT = price * cant;
        String v1 = String.valueOf(cant);
        String v2 = String.valueOf(valorT);
        String v[] = {v1, v2};
        return v;
    }*/

    /*datos para generar filas y columnas de botones*/
    public static int[] filcol(int length) {
        int[] filcol = new int[2];
        if (length <= 10) {
            filcol[0] = 5;
            filcol[1] = 2;
        } else if (length <= 30) {
            filcol[0] = 10;
            filcol[1] = 3;
        } else if (length <= 50) {
            filcol[0] = 20;
            filcol[1] = 3;
        }
        return filcol;
    }

    //ventas
    public static void generateSell(String[] productsSell) {

    }

}
