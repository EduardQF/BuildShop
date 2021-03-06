/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildShop.Windows;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

import BuildShop.Data.AgreDelete;
import BuildShop.Data.Utiles;

/*
 *
 * @author Cristobal y Eduard QF :D
 */
public class NewProduct extends javax.swing.JFrame {

	/**
	 * constructor de la clase
	 */
	public NewProduct() {
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
	 * metodo encargado de mostrar mensajes de error en caso de que los datos
	 * ingresados no pasen la validacion
	 */
	public void validarEntradas() {

		String producto = "", id = "", cantidad = "", codigo = "", precioVenta = "", costo = "", unit = "",
				descripcion = "";
		boolean fa = false, pro = fa, id2 = fa, cant = fa, cod = fa, pre = fa, cos = fa, uni = fa, des = fa;
		if (Utiles.validadorString(nameProduct.getText())) {
			producto = nameProduct.getText();
			pro = true;
		} else {
			errorName.setText("ingrese solamente letras");
		}

		if (Utiles.validadorIntPos(idProduct.getText())) {
			id = idProduct.getText();
			id2 = true;
		} else {
			errorId.setText("ingrese solamente letras");
		}

		if (Utiles.validadorIntPos(cantProduct.getText())) {
			cantidad = cantProduct.getText();
			cant = true;
		} else {
			errorCant.setText("ingrese solamente numeros");
		}

		if (Utiles.validadorMixto(codigoProduct.getText())) {
			codigo = codigoProduct.getText();
			cod = true;
		} else {
			errorCod.setText("ingrese solamente numeros");
		}

		if (Utiles.validadorIntPos(precioProduct.getText())) {
			precioVenta = precioProduct.getText();
			pre = true;
		} else {
			errorPrecio.setText("ingrese solamente numeros");
		}

		if (Utiles.validadorIntPos(costProduct.getText())) {
			costo = costProduct.getText();
			cos = true;
		} else {
			errorCost.setText("ingrese solamente numeros");
		}

		if (Utiles.validadorString(cantProduct1.getText())) {
			unit = cantProduct1.getText();
			uni = true;
		} else {
			errorUnit.setText("ingrese solamente numeros");
		}

		if (Utiles.validadorString(jTextArea1.getText())) {
			descripcion = jTextArea1.getText();
			des = true;
		}
		System.out.println("pro:" + pro + "\nid:" + id2 + "\ncant:" + cant + "\ncod:" + cod + "\npre:" + pre + "\ncos:"
				+ cos + "\nunit:" + uni + "\ndes:" + des);
		if (pro && id2 && cant && cod && pre && cos && uni && des) {
			AgreDelete.newProduct(producto, id, cantidad, codigo, precioVenta, costo, unit, descripcion);
			JOptionPane.showMessageDialog(null, "Agregado");
			dispose();
		}

	}

	/**
	 * metodo que crea la ventana
	 */
	@SuppressWarnings("unchecked")
	private void initComponents() {

		jLabel8 = new javax.swing.JLabel();
		agregarProduct = new javax.swing.JButton();
		nameProduct = new javax.swing.JTextField();
		idProduct = new javax.swing.JTextField();
		cantProduct = new javax.swing.JTextField();
		codigoProduct = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		precio = new javax.swing.JLabel();
		Codigo = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		precio1 = new javax.swing.JLabel();
		DescripcionProduct = new javax.swing.JLabel();
		precioProduct = new javax.swing.JTextField();
		costProduct = new javax.swing.JTextField();
		cantProduct1 = new javax.swing.JTextField();
		errorName = new javax.swing.JLabel();
		errorCant = new javax.swing.JLabel();
		errorId = new javax.swing.JLabel();
		errorCod = new javax.swing.JLabel();
		errorPrecio = new javax.swing.JLabel();
		errorCost = new javax.swing.JLabel();
		errorUnit = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();

		jLabel8.setText("jLabel5");

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Agregar Producto");
		setIconImage(getIconImage());
		setIconImages(getIconImages());

		agregarProduct.setText("agregar");
		agregarProduct.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				agregarProductActionPerformed(evt);
			}
		});

		jLabel1.setText("Producto:");

		jLabel2.setText(" Id:");

		precio.setText("Cantidad:");

		Codigo.setText("Codigo:");

		jLabel3.setText("Precio Venta:");

		jLabel4.setText("Costo:");

		precio1.setText("Unit:");

		DescripcionProduct.setText("Descripcion:");

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
										.createSequentialGroup()
										.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(nameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 240,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(errorName,
												javax.swing.GroupLayout.PREFERRED_SIZE, 165,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup().addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(precio, javax.swing.GroupLayout.DEFAULT_SIZE,
																70, Short.MAX_VALUE)
														.addComponent(Codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 70,
																Short.MAX_VALUE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(cantProduct,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 240,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(codigoProduct,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 240,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(layout.createSequentialGroup()
														.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 70,
																Short.MAX_VALUE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(idProduct, javax.swing.GroupLayout.PREFERRED_SIZE,
																240, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(errorCant, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(errorId, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(errorCod, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(30, 30, 30))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(precio1, javax.swing.GroupLayout.DEFAULT_SIZE, 80,
														Short.MAX_VALUE)
												.addComponent(DescripcionProduct, javax.swing.GroupLayout.DEFAULT_SIZE,
														80, Short.MAX_VALUE))
										.addGap(439, 439, 439))
								.addGroup(layout.createSequentialGroup().addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(precioProduct, javax.swing.GroupLayout.PREFERRED_SIZE,
														240, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(errorPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(layout.createSequentialGroup()
																.addComponent(costProduct,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 240,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(errorCost,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 165,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(layout.createSequentialGroup().addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		false)
																.addComponent(jScrollPane1,
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(cantProduct1,
																		javax.swing.GroupLayout.Alignment.LEADING,
																		javax.swing.GroupLayout.DEFAULT_SIZE, 240,
																		Short.MAX_VALUE))
																.addGroup(layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(layout.createSequentialGroup()
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(errorUnit,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						165,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(layout.createSequentialGroup()
																				.addGap(34, 34, 34)
																				.addComponent(agregarProduct)))))))
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(nameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(errorName, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(idProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(errorId, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(cantProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(precio, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(errorCant, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(codigoProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Codigo, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(errorCod, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(precioProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(errorPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(costProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(errorCost, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(cantProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(precio1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(errorUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(DescripcionProduct, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(116, 116, 116))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(agregarProduct).addComponent(jScrollPane1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * metodo que valida los datos y limpia la pantalla
	 * @param evt click en el boton
	 */
	private void agregarProductActionPerformed(java.awt.event.ActionEvent evt) {
		limpiar();
		validarEntradas();
	}

	private javax.swing.JLabel Codigo;
	private javax.swing.JLabel DescripcionProduct;
	private javax.swing.JButton agregarProduct;
	private javax.swing.JTextField cantProduct;
	private javax.swing.JTextField cantProduct1;
	private javax.swing.JTextField codigoProduct;
	private javax.swing.JTextField costProduct;
	private javax.swing.JLabel errorCant;
	private javax.swing.JLabel errorCod;
	private javax.swing.JLabel errorCost;
	private javax.swing.JLabel errorId;
	private javax.swing.JLabel errorName;
	private javax.swing.JLabel errorPrecio;
	private javax.swing.JLabel errorUnit;
	private javax.swing.JTextField idProduct;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField nameProduct;
	private javax.swing.JLabel precio;
	private javax.swing.JLabel precio1;
	private javax.swing.JTextField precioProduct;
	// End of variables declaration//GEN-END:variables

	/**
	 * metodo que limpia la pantalla
	 */
	private void limpiar() {
		errorCant.setText("");
		errorCod.setText("");
		errorCost.setText("");
		errorId.setText("");
		errorName.setText("");
		errorPrecio.setText("");
		errorUnit.setText("");

	}
}
