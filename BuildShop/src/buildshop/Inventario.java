package BuildShop;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public abstract class Inventario {
    //planillas Excel
    public static void planilla_Productos() {
        if (DataManager.getAccess(0)) {
            try {
                excelProduct();
            } catch (Exception ex) {
                Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            mesangeError();
        }
    }

    public static void planilla_Ventas() {
        if (DataManager.getAccess(0)) {
            try {
                excelSells();
            } catch (Exception ex) {
                Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            mesangeError();
        }
    }

    public static void planilla_Usuarios() {
        if (DataManager.getAccess(0)) {
            try {
                excelUsers();
            } catch (Exception ex) {
                Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            }
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
    
    //new
    public static void excelProduct() throws Exception {
        String direccion = System.getProperty("user.home") + "/Productos.xls";
        String titulo = "Productos";
        String title[] = {"Id", "Code", "Nombre", "Costo", "Precio", "Stock", "Unit"};
        String product[] = DataReader.readData("C:/BuildShop/DB/products.buildshop");
        String productList[][] = AdminBSP.productRegister(product);
        created(direccion, titulo, title, productList);
    }

    public static void excelUsers() throws Exception {
        String direccion = System.getProperty("user.home") + "/Usuarios.xls";
        String titulo = "Usuarios";
        String title[] = {"Usuario", "Contraseña", "Permiso", "Nombre", "Apellido", "correo"};
        String users[] = DataReader.readData("C:/BuildShop/DB/users.buildshop");
        String usersList[][] = AdminBSP.userRegist(users);
        created(direccion, titulo, title, usersList);

    }

    public static void excelSells()throws Exception {
        String direccion = System.getProperty("user.home") + "/Ventas.xls";
        String titulo = "Ventas";
        //String title[]={};
        //String sells[]=;
        //String sellsList[][]=;
        //created(direccion,titulo,sells,sellsList);
    }//modificar

    //craete graficos
    
    
    //create Excels
    public static void created(String rutaArchivo, String tipo, String[] title, String[][] List) throws Exception {
        File archivoXLS = new File(rutaArchivo);
        if (archivoXLS.exists()) {
            archivoXLS.delete();
        }
        archivoXLS.createNewFile();
        Workbook libro = new HSSFWorkbook();
        FileOutputStream archivo = new FileOutputStream(archivoXLS);
        Sheet hoja = libro.createSheet(tipo);
        rellenarMio(hoja, List, title);
        libro.write(archivo);
        archivo.close();
        Desktop.getDesktop().open(archivoXLS);
    }

    private static void rellenarMio(Sheet hoja, String[][] productList, String[] title) {
        System.out.println("comienso excel");
        for (int filas = 0; filas < productList.length + 1; filas++) {
            Row fila = hoja.createRow(filas);
            System.out.println("fila:" + filas);
            for (int colum = 0; colum < productList[0].length; colum++) {
                System.out.println("columna:" + colum);
                Cell celda = fila.createCell(colum);

                if (filas == 0) {
                    celda.setCellValue(title[colum]);
                } else {
                    celda.setCellValue(productList[filas - 1][colum]);
                }

            }
        }
    }

}
