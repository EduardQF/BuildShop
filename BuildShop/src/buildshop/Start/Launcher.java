package BuildShop.Start;

import BuildShop.Data.DataManager;
import BuildShop.Windows.LogIn;

public class Launcher {
	/**
	 * metodo que da inicio al programa
	 * @param args ...
	 */
	public static void main(String[] args) throws InterruptedException {
		start();
	}

	/**
	 * metodo que lee los archivos del sistema e inicia la pantalla de LogIn
	 */
	private static void start() throws InterruptedException {
		DataManager.showLS();
		System.out.println("LS Loaded");
		Thread.sleep(500);
		DataManager.readUsers();
		DataManager.readProducts();
		DataManager.readClients();
		System.out.println("DB Loaded");
		LogIn li = new LogIn();
		li.setVisible(true);
	}

}
