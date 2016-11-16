package BuildShop;

public abstract class Inventario {
    //planillas Excel
    public static void planilla_Productos() {
        if (DataManager.getAccess(0)) {
            
        } else {
            mesangeError();
        }
    }

    public static void planilla_Ventas() {
        if (DataManager.getAccess(0)) {

        } else {
            mesangeError();
        }
    }

    public static void planilla_Usuarios() {
        if (DataManager.getAccess(0)) {

        } else {
            mesangeError();
        }
    }
    //Graficos
    public static void generateGraficM() {
        if (DataManager.getAccess(0)) {

        } else {
            mesangeError();
        }
    }

    public static void generateGraficA() {
        if (DataManager.getAccess(0)) {

        } else {
            mesangeError();
        }
    }

    //other
    private static void mesangeError() {
        MesangeError me = new MesangeError();
        me.setVisible(true);
    }
}
