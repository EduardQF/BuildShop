/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildShop.Windows;

import BuildShop.Data.AgreDelete;
import BuildShop.Data.DataManager;
import BuildShop.Data.Utiles;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Modificar extends javax.swing.JFrame {
	String ruts[];
        int user;

	public Modificar(String[] reg) {
		ruts = reg;
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

	/***
	 * metodo que crea la ventana
	 */
	@SuppressWarnings("unchecked")
	private void initComponents() {

		JNombre = new javax.swing.JTextField();
		JApellido = new javax.swing.JTextField();
		acceso = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		JRut = new javax.swing.JTextField();
		jemail = new javax.swing.JTextField();
		clave = new javax.swing.JLabel();
		jAcces = new javax.swing.JComboBox<>();
		JClave = new javax.swing.JTextField();
		jAgregar = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		Jmesannge = new javax.swing.JLabel();
		Jmesannge1 = new javax.swing.JLabel();
		Jmesannge3 = new javax.swing.JLabel();
		Jmesannge4 = new javax.swing.JLabel();
		Jmesannge5 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox<>();
		jLabel6 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Modificar Datos");
		setIconImage(getIconImage());
		setIconImages(getIconImages());

		acceso.setText("Acceso:");

		jLabel5.setText("Email:");

		clave.setText("Clave:");

		jAcces.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Adminsitrador", "Inventario", "Vendedor" }));
		jAcces.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jAccesActionPerformed(evt);
			}
		});

		jAgregar.setText("Guardar Cambios");
		jAgregar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jAgregarActionPerformed(evt);
			}
		});

		jLabel1.setText("Nombre:");

		jLabel3.setText("Rut:");

		jLabel4.setText("Apellidos:");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(ruts));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});

		jLabel6.setText("Usuario:");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addContainerGap()
								.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addGroup(layout.createSequentialGroup()
														.addComponent(jLabel4,
																javax.swing.GroupLayout.PREFERRED_SIZE, 60,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(JApellido))
												.addGroup(layout.createSequentialGroup().addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60,
																Short.MAX_VALUE)
														.addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(JNombre,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 278,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jComboBox1,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 145,
																		javax.swing.GroupLayout.PREFERRED_SIZE))))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(layout.createParallelGroup(
														javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(Jmesannge, javax.swing.GroupLayout.PREFERRED_SIZE,
																116, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																Jmesannge1, javax.swing.GroupLayout.PREFERRED_SIZE, 116,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(layout.createSequentialGroup().addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addGroup(layout.createSequentialGroup()
														.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
																60, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(
																JRut, javax.swing.GroupLayout.PREFERRED_SIZE, 278,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(layout.createSequentialGroup()
														.addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(JClave))
												.addGroup(layout.createSequentialGroup()
														.addComponent(acceso, javax.swing.GroupLayout.PREFERRED_SIZE,
																60, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jAgregar,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 147,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jAcces,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 105,
																		javax.swing.GroupLayout.PREFERRED_SIZE))))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(Jmesannge3,
																javax.swing.GroupLayout.PREFERRED_SIZE, 116,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(Jmesannge4,
																javax.swing.GroupLayout.PREFERRED_SIZE, 116,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 278,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(Jmesannge5, javax.swing.GroupLayout.PREFERRED_SIZE, 116,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(21, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel6))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(JNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Jmesannge, javax.swing.GroupLayout.PREFERRED_SIZE, 15,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(3, 3, 3)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(JApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Jmesannge1, javax.swing.GroupLayout.PREFERRED_SIZE, 15,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(JRut, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Jmesannge3, javax.swing.GroupLayout.PREFERRED_SIZE, 15,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(JClave, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Jmesannge4, javax.swing.GroupLayout.PREFERRED_SIZE, 15,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Jmesannge5, javax.swing.GroupLayout.PREFERRED_SIZE, 15,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(acceso, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jAcces, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jAgregar)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>                        

	/**
	 * metodo que modifica un usuario y limpia la ventana
	 * 
	 * @param evt
	 *            click en el boton
	 */
	private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {
		limpiar();
		modificar();

	}

	private void jAccesActionPerformed(java.awt.event.ActionEvent evt) {
	}

	/**
	 * llama al metodo regist
	 * 
	 * @param evt
	 *            click en el boton
	 */
	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		regist();
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTextField JApellido;
	private javax.swing.JTextField JClave;
	private javax.swing.JTextField JNombre;
	private javax.swing.JTextField JRut;
	private javax.swing.JLabel Jmesannge;
	private javax.swing.JLabel Jmesannge1;
	private javax.swing.JLabel Jmesannge3;
	private javax.swing.JLabel Jmesannge4;
	private javax.swing.JLabel Jmesannge5;
	private javax.swing.JLabel acceso;
	private javax.swing.JLabel clave;
	private javax.swing.JComboBox<String> jAcces;
	private javax.swing.JButton jAgregar;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JTextField jemail;
	// End of variables declaration//GEN-END:variables

	/**
	 * metodo de limpieza de labels en pantalla
	 */
	private void limpiar() {
		Jmesannge.setText("");
		Jmesannge1.setText("");
		Jmesannge3.setText("");
		Jmesannge4.setText("");

	}

	/**
	 * toma los datos de los usuarios y los compara para mostrarlos por pantalla
	 */
	private void regist() {
		for (int i = 0; i < DataManager.getUsersSize(); i++) {
			if (Utiles.comparador(jComboBox1.getSelectedItem().toString(), DataManager.getUser(i).getId())) {
				System.out.println("adquirido");
				JNombre.setText(DataManager.getUser(i).getFirstName());
				JApellido.setText(DataManager.getUser(i).getLastName());
				JClave.setText(DataManager.getUser(i).getPassword());
				JRut.setText(DataManager.getUser(i).getID());
				jemail.setText(DataManager.getUser(i).getEmail());
                                user=i;
				break;
			}
		}

	}

	/**
	 * obtiene los balores de los campos de textos y segun la validacion lo
	 * almacena en una vareable o envia un mensaje de error, cuando todas las
	 * validaciones son correctas llama a un metodo encargado de almasenar a el
	 * Usuario en la base de datos.
	 */
	private void modificar() {
		String firstname = "", lastname = "", rut = "", clave = "", email = "", acces;
		boolean fa = false, no = fa, ap = fa, ru = fa, cl = fa, em = fa;
		int edad = 0;
		if (Utiles.validadorString(JNombre.getText())) {
			firstname = JNombre.getText();
			no = true;
		} else {
			Jmesannge.setText("ingrese solamente letras");
		}
		if (Utiles.validadorString(JApellido.getText())) {
			lastname = JApellido.getText();
			ap = true;
		} else {
			Jmesannge1.setText("ingrese solamente letras");
		}
		if (Utiles.validarRut(JRut.getText())) {
			rut = JRut.getText();
			ru = true;
		} else {
			Jmesannge3.setText("Rut invalido");
		}
		if (Utiles.validarClave(JClave.getText())) {
			clave = JClave.getText();
			cl = true;
		} else {
			Jmesannge4.setText("ingrese solo letras y numeros");
		}
		if (Utiles.validadorCorreo(jemail.getText())) {
			email = jemail.getText();
			em = true;
		} else {
			Jmesannge4.setText("correo ingresado invalido");
		}
		acces = jAcces.getSelectedItem().toString();
		System.out.println("no:" + no + "\nap:" + ap + "\nru:" + ru + "\nem:" + em + "cl:" + cl);
		if (no && ap && ru && cl && em) {
			AgreDelete.ModUser(firstname, lastname, rut, clave, email, acces,user);
			JOptionPane.showMessageDialog(null, "Modificado");
			dispose();
		}

	}

}
