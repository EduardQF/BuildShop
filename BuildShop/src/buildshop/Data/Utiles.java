package BuildShop.Data;

import javax.swing.JOptionPane;

public class Utiles {

	/**
	 * metodo que valida los caracteres de una contraseña
	 * 
	 * @param cadena
	 *            String a validar
	 * 
	 * @return devuelve true en caso de coindidir
	 */
	public static boolean validarClave(String cadena) {
		boolean v = cadena.matches("[a-zA-Z0-9]+");
		return v;
	}

	/**
	 * metodo que valida los caracteres de un String
	 * 
	 * @param cadena
	 *            String a validar
	 * 
	 * @return devuelve true en caso de coindidir
	 */
	public static boolean validadorString(String cadena) {
		boolean v = cadena.matches("[a-zA-Z\\s]+");
		return v;
	}

	/**
	 * metodo que valida los caracteres de un String
	 * 
	 * @param cadena
	 *            String a validar
	 * 
	 * @return devuelve true en caso de coindidir
	 */
	public static boolean validadorMixto(String cadena) {
		boolean v = cadena.matches("[a-zA-Z0-9]+");
		return v;
	}

	/**
	 * metodo que valida los caracteres de un String
	 * 
	 * @param cadena
	 *            String a validar
	 * 
	 * @return devuelve true en caso de coindidir
	 */
	public static boolean validadorIntPos(String cadena) {
		boolean v = cadena.matches("[0-9]+");
		return v;
	}

	/**
	 * metodo que valida los digitos de un rut
	 * 
	 * @param cadena
	 *            String a validar
	 * 
	 * @return devuelve true en caso de coindidir
	 */
	public static boolean validarRut(String cadena) {
		cadena = cadena.toUpperCase();
		if (validarFormatoRut(cadena)) {
			String n = cadena.substring(0, cadena.length() - 2);
			String d = cadena.substring(cadena.length() - 1);
			n = n.replaceAll("\\.", "");
			int v = digitoVerificador(n);
			if (v < 10 && d.equals(String.valueOf(v))) {
				return true;
			} else if (v == 10 && d.equals("K")) {
				return true;
			}
		}
		return false;
	}

	/**
	 * metodo que valida el formato de un rut
	 * 
	 * @param r
	 *            String a validar
	 * 
	 * @return devuelve true en caso de coindidir
	 */
	private static boolean validarFormatoRut(String r) {
		return r.matches("[0-9]{1,2}\\.{0,1}[0-9]{3,3}\\.{0,1}[0-9]{3,3}\\-[0-9K]{1,1}");
	}

	/**
	 * metodo que valida el digito verificador de un rut
	 * 
	 * @param r
	 *            String a validar
	 * 
	 * @return devuelve el numero del verificador
	 */
	private static int digitoVerificador(String r) {
		int v = 0;
		int c = 1;
		int s = 0;
		int d[] = new int[r.length()];
		for (int i = r.length() - 1; i >= 0; i--) {
			d[i] = Integer.valueOf(r.substring(i, i + 1));
			c++;
			if (c > 7) {
				c = 2;
			}
			s += (d[i] * c);
		}
		v = 11 - (s % 11);
		if (v == 11) {
			v = 0;
		}
		return v;
	}

	/**
	 * metodo que valida un email
	 * 
	 * @param r
	 *            String a validar
	 * 
	 * @return devuelve true en caso de coindidir
	 */
	private static boolean validarFormatoCorreo(String r) {
		return r.matches(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	}

	public static boolean validadorCorreo(String cadena) {
		boolean v = true;
		return v;
	}

	/**
	 * metodo que valida un String de numeros
	 * 
	 * @param cadena
	 *            String a validar
	 * 
	 * @return devuelve true en caso de coindidir
	 */
	public static boolean validarIntNegativos(String cadena) {
		boolean validador;
		int num = 0;

		validador = true;

		if (cadena.matches("\\-[0-9]+")) {
			num = Integer.valueOf(cadena);
			if (num <= 0) {
				validador = true;
			}
		}

		return validador;
	}

	/**
	 * metodo que valida un String de numeros
	 * 
	 * @param cadena
	 *            String a validar
	 * 
	 * @return devuelve true en caso de coindidir
	 */
	public static boolean validarFloatPositivos(String cadena) {
		boolean validador;
		double num = 0;

		validador = true;

		if (cadena.matches("[0-9]+")) {
			num = Double.valueOf(cadena);
			if (num >= 0) {
				validador = true;
			}
		} else if (cadena.matches("[0-9]+\\.[0-9]+")) {
			num = Double.valueOf(cadena);
			if (num >= 0) {
				validador = true;
			}
		}
		return validador;
	}

	/**
	 * metodo que valida un String de numeros
	 * 
	 * @param cadena
	 *            String a validar
	 * 
	 * @return devuelve true en caso de coindidir
	 */
	public static boolean validarFloatNegativos(String cadena) {
		boolean validador;
		double num = 0;

		validador = true;

		if (cadena.matches("\\-[0-9]+")) {
			num = Double.valueOf(cadena);
			if (num >= 0) {
				validador = true;
			}
		} else if (cadena.matches("\\-[0-9]+\\.[0-9]+")) {
			num = Double.valueOf(cadena);
			if (num >= 0) {
				validador = true;
			}
		}
		return validador;
	}

	/**
	 * metodo que compara 2 Strings diferentes
	 * 
	 * @param nombre
	 *            primer String a comparar
	 * 
	 * @param valueAt
	 *            segundo String a comparar
	 * 
	 * @return devuelve true en caso de coindidir
	 */
	public static boolean comparadorTabla(String nombre, String valueAt) {
		return (nombre.equals(String.valueOf(valueAt)));
	}

	/**
	 * metodo que compara 2 Strings diferentes
	 * 
	 * @param text
	 *            primer String a comparar
	 * 
	 * @param text0
	 *            segundo String a comparar
	 * 
	 * @return devuelve true en caso de coindidir
	 */
	public static boolean comparador(String text, String text0) {
		return text.equals(text0);
	}

}
