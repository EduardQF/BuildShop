package BuildShop.Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class DataReader {

	/**
	 * metodo encargado de la lectura de archivos del sistema
	 * 
	 * @param path
	 *            direccion absoluta del archivo a leer
	 * 
	 * @return devuelve un String[] con los datos del archivo
	 */
	public static String[] readData(String path) {
		String data = "";
		try {
			data = new String(Files.readAllBytes(Paths.get(path)));
		} catch (IOException e) {
			System.out.println("File not found");
		}
		return data.split("-----");
	}

	/**
	 * metodo encargado de la escritura de archivos del sistema
	 * 
	 * @param file
	 *            direccion absoluta del archivo a escribir
	 * 
	 * @param data
	 *            informacion a guardar en el archivo
	 */
	public static void writeData(String file, String data) {
		try {
			Files.write(Paths.get(file), data.getBytes(), StandardOpenOption.CREATE);
			System.out.println("File created");
		} catch (IOException e) {
			System.out.println("File not created");
		}

	}

}
