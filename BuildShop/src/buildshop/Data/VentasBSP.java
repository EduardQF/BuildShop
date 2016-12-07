package BuildShop.Data;

public class VentasBSP {

	// botones.
	/**
	 * datos para crear los botones de productos
	 * 
	 * @param boton
	 *            producto del cual se creara el boton
	 * @param cant
	 *            cantidad del producto
	 * @param valorT
	 *            valor total del producto
	 * @return devuelve un String[] con los datos del boton
	 */
	public static String[] created(Producto boton, int cant, int valorT) {
		String[] dataTable = { boton.getName(), boton.getCode(), String.valueOf(cant), String.valueOf(boton.getPrice()),
				String.valueOf(valorT) };
		return dataTable;
	}

	/**
	 * datos para modificar datos de la tablas de ventas
	 * 
	 * @param cost
	 *            ??
	 * @param valor
	 *            ??
	 * @param op
	 *            ??
	 * @return devuelve un String[] con los valores de la tabla
	 *
	 *
	 */
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
		String v[] = { v1, v2 };
		return v;
	}

	/**
	 * datos para generar filas y columnas de botones
	 * 
	 * @param length
	 *            indica el tamaño de la tabla a generar
	 * @return devuelve los tamaños de la tabla
	 */
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

	/**
	 * UNUSED
	 * ventas generadas
	 * @param productsSell unused
	 */
	public static void generateSell(String[] productsSell) {
		for (int i = 0; i < productsSell.length;i++)
		System.out.println("Generando Ventas \n"+productsSell[i]+"\n");
		DataManager.newVenta(productsSell);
	}

}
