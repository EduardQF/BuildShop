
package BuildShop.Data;

public class VentasBSP {
    
    //botones.
    

    public static String[] created(Producto boton, int cant, int valorT) {
        String[] dataTable = {boton.getName(), String.valueOf(cant), String.valueOf(boton.getPrice()), String.valueOf(valorT)};
        return dataTable;
    }

   
    public static int[] valores(Producto boton,int valor) {
        
        int cant = 1 + valor;
        System.out.println(".");
        int valorT = boton.getPrice() * cant;
        int v[]={cant,valorT};
        return v;
    }
    
    public static int[] filcol(int length){
        int[]filcol=new int[2];
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
