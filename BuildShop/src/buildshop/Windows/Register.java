package BuildShop.Windows;

import java.awt.Image;
import java.awt.Toolkit;

public class Register extends javax.swing.JFrame {

	String userTitle[];
	String userList[][];

	/**
	 * constructor de la clase
	 * 
	 * @param title
	 *            String[] con los titulos de las tablas
	 * 
	 * @param list
	 *            String[][] con los datos de las tablas
	 */
	public Register(String[] title, String[][] list) {
		read(title, list);
		initComponents();

	}

	/**
	 * metodo encargado de encontrar y guardar una imagen desde la carpeta
	 * especificada y guardarla en una variable que luego sera ocupada en las
	 * pantallas
	 */
	@Override
	public Image getIconImage() {
		Image retValue = Toolkit.getDefaultToolkit().getImage("C:/BuildShop/IMG/Logo64x64.png");
		return retValue;
	}

	/**
	 * metodo que crea la ventana
	 */
	@SuppressWarnings("unchecked")
	private void initComponents() {

		jScrollPane2 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("BuildShop");
		setIconImage(getIconImage());
		setIconImages(getIconImages());

		jTable1.setModel(new javax.swing.table.DefaultTableModel(userList, userTitle

		));
		jScrollPane2.setViewportView(jTable1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * metodo encargado de almacenar en las variables locales los valores
	 * entregados en title y list, que son el titulo de la tabla y el contenido
	 * de esta respectivamente
	 * 
	 * @param title
	 *            String[] con los titulos de las tablas
	 * 
	 * @param list
	 *            String[][] con los datos de las tablas
	 */
	private void read(String[] title, String[][] list) {
		userTitle = title;
		userList = list;
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable jTable1;
	// End of variables declaration//GEN-END:variables
}
