package BuildShop.Windows;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.*;

import BuildShop.Data.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduard QF
 */
public class BuildShopP extends javax.swing.JFrame implements ActionListener {

    public BuildShopP() {
        initComponents();
        DataManager.hideLS();
        mostBotonsProduct();
        this.paintAll(this.getGraphics());

    }

    /*metodo encargado de encontrar y guardar una imagen desde la carpeta 
     *especificada y guardarla en una variable que luego sera ocupada en las pantallas*/
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage("C:/BuildShop/IMG/Logo64x64.png");
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanelBotonProductos = new javax.swing.JPanel();
        jVenta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProducts = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTotal = new javax.swing.JTextField();
        deletePventa = new javax.swing.JButton();
        addOne = new javax.swing.JButton();
        deleteOne = new javax.swing.JButton();
        jbusqued = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jcreatedSell = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        registroMensual = new javax.swing.JMenuItem();
        fullVentas = new javax.swing.JMenuItem();
        planillaVentas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        detallesP = new javax.swing.JMenuItem();
        stock = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        AgregarProductos = new javax.swing.JMenuItem();
        QuitarProductos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        usersActived = new javax.swing.JMenuItem();
        registerUsers = new javax.swing.JMenuItem();
        modificarWorker = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        addWorker = new javax.swing.JMenuItem();
        deleteWorker = new javax.swing.JMenuItem();
        estadisticas = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jRegistroVentas = new javax.swing.JMenuItem();
        jRegistroProductos = new javax.swing.JMenuItem();
        jregistrosUsers = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BuildShop");
        setFocusTraversalPolicyProvider(true);
        setIconImage(getIconImage());
        setIconImages(getIconImages());

        jPanelBotonProductos.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelBotonProductosLayout = new javax.swing.GroupLayout(jPanelBotonProductos);
        jPanelBotonProductos.setLayout(jPanelBotonProductosLayout);
        jPanelBotonProductosLayout.setHorizontalGroup(
            jPanelBotonProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );
        jPanelBotonProductosLayout.setVerticalGroup(
            jPanelBotonProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );

        jVenta.setBackground(new java.awt.Color(255, 255, 255));

        jTableProducts.setAutoCreateRowSorter(true);
        jTableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Codigo", "Cantidad", "Precio Unitario", "Precio Total"
            }
        ));
        jScrollPane1.setViewportView(jTableProducts);

        jLabel2.setText("Total:");

        jTotal.setToolTipText("");

        javax.swing.GroupLayout jVentaLayout = new javax.swing.GroupLayout(jVenta);
        jVenta.setLayout(jVentaLayout);
        jVentaLayout.setHorizontalGroup(
            jVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
            .addGroup(jVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTotal))
        );
        jVentaLayout.setVerticalGroup(
            jVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jVentaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        deletePventa.setText("Eliminar");
        deletePventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePventaActionPerformed(evt);
            }
        });

        addOne.setText("Agregar");
        addOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOneActionPerformed(evt);
            }
        });

        deleteOne.setText("Quitar");
        deleteOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOneActionPerformed(evt);
            }
        });

        jLabel1.setText("Busqueda:");

        jcreatedSell.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcreatedSell.setText("Generar Ventas");
        jcreatedSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcreatedSellActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");

        jMenu1.setText("Venta");

        registroMensual.setText("Registro Ventas mensuales");
        registroMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroMensualActionPerformed(evt);
            }
        });
        jMenu1.add(registroMensual);

        fullVentas.setText("ventas Totales");
        fullVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullVentasActionPerformed(evt);
            }
        });
        jMenu1.add(fullVentas);

        planillaVentas.setText("Planillas de venta");
        planillaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planillaVentasActionPerformed(evt);
            }
        });
        jMenu1.add(planillaVentas);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Inventario");

        detallesP.setText("Detralles de los Productos");
        detallesP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesPActionPerformed(evt);
            }
        });
        jMenu2.add(detallesP);

        stock.setText("Stock de productos");
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });
        jMenu2.add(stock);

        jMenu7.setText("Agregar/Quitar");

        AgregarProductos.setText("Agregar productos");
        AgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProductosActionPerformed(evt);
            }
        });
        jMenu7.add(AgregarProductos);

        QuitarProductos.setText("Quitar productos");
        QuitarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitarProductosActionPerformed(evt);
            }
        });
        jMenu7.add(QuitarProductos);

        jMenu2.add(jMenu7);

        jMenuItem1.setText("requerir Pedido");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Personal");

        usersActived.setText("Usuarios activos");
        usersActived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersActivedActionPerformed(evt);
            }
        });
        jMenu3.add(usersActived);

        registerUsers.setText("Usuarios registrados");
        registerUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerUsersActionPerformed(evt);
            }
        });
        jMenu3.add(registerUsers);

        modificarWorker.setText("Modificar personal");
        modificarWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarWorkerActionPerformed(evt);
            }
        });
        jMenu3.add(modificarWorker);

        jMenu5.setText("Agregar/Eliminar");

        addWorker.setText("Agregar trabajador");
        addWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWorkerActionPerformed(evt);
            }
        });
        jMenu5.add(addWorker);

        deleteWorker.setText("Eliminar Vendedor");
        deleteWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteWorkerActionPerformed(evt);
            }
        });
        jMenu5.add(deleteWorker);

        jMenu3.add(jMenu5);

        jMenuBar1.add(jMenu3);

        estadisticas.setText("Estadisticas");

        jMenu6.setText("Generar Excel");

        jRegistroVentas.setText("Registro de ventas");
        jRegistroVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegistroVentasActionPerformed(evt);
            }
        });
        jMenu6.add(jRegistroVentas);

        jRegistroProductos.setText("Registro de Productos");
        jRegistroProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegistroProductosActionPerformed(evt);
            }
        });
        jMenu6.add(jRegistroProductos);

        jregistrosUsers.setText("Registro de Usuarios");
        jregistrosUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jregistrosUsersActionPerformed(evt);
            }
        });
        jMenu6.add(jregistrosUsers);

        estadisticas.add(jMenu6);

        jMenuBar1.add(estadisticas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBotonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbusqued, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletePventa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addOne, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteOne, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jcreatedSell, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbusqued, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(jButton1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(deleteOne)
                                .addComponent(addOne)
                                .addComponent(deletePventa)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcreatedSell))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBotonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteWorkerActionPerformed
        AdminBSP.removeWorker();
    }//GEN-LAST:event_deleteWorkerActionPerformed

    private void addWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWorkerActionPerformed
        AdminBSP.addWorker();
    }//GEN-LAST:event_addWorkerActionPerformed

    private void registerUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerUsersActionPerformed
        AdminBSP.registerUsers();
    }//GEN-LAST:event_registerUsersActionPerformed

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        AdminBSP.stock();
    }//GEN-LAST:event_stockActionPerformed

    private void detallesPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesPActionPerformed
        AdminBSP.registroProduct();
    }//GEN-LAST:event_detallesPActionPerformed

    private void usersActivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersActivedActionPerformed
        AdminBSP.usersActived();
    }//GEN-LAST:event_usersActivedActionPerformed

    private void registroMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroMensualActionPerformed
        AdminBSP.registroVentasM();
    }//GEN-LAST:event_registroMensualActionPerformed

    private void fullVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullVentasActionPerformed
        AdminBSP.registroVentasA();
    }//GEN-LAST:event_fullVentasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AdminBSP.requeredProduct();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void AgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProductosActionPerformed
        AdminBSP.addProduct();
    }//GEN-LAST:event_AgregarProductosActionPerformed

    private void QuitarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitarProductosActionPerformed
        AdminBSP.removeProduct();
    }//GEN-LAST:event_QuitarProductosActionPerformed

    private void jRegistroVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegistroVentasActionPerformed
        Inventario.planilla_Ventas();
    }//GEN-LAST:event_jRegistroVentasActionPerformed

    private void jRegistroProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegistroProductosActionPerformed
        Inventario.planilla_Productos();
    }//GEN-LAST:event_jRegistroProductosActionPerformed

    private void jregistrosUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jregistrosUsersActionPerformed
        Inventario.planilla_Usuarios();
    }//GEN-LAST:event_jregistrosUsersActionPerformed

    private void jcreatedSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcreatedSellActionPerformed
        String[] productsSell = readProducts();
        VentasBSP.generateSell(productsSell);
        JOptionPane.showMessageDialog(this, "venta Generada con exito");
        vaciarTable();
    }//GEN-LAST:event_jcreatedSellActionPerformed

    private void deletePventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePventaActionPerformed
        deleteRow();
    }//GEN-LAST:event_deletePventaActionPerformed

    private void deleteOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOneActionPerformed
        deletecant();
    }//GEN-LAST:event_deleteOneActionPerformed

    private void addOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOneActionPerformed
          int x=jTableProducts.getSelectedRow();
          int priu=Integer.valueOf(String.valueOf(jTableProducts.getValueAt(x, 3)));
          addProduct(x, priu);
    }//GEN-LAST:event_addOneActionPerformed

    private void modificarWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarWorkerActionPerformed
        AdminBSP.modific();
    }//GEN-LAST:event_modificarWorkerActionPerformed

    private void planillaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planillaVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planillaVentasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarProductos;
    private javax.swing.JMenuItem QuitarProductos;
    private javax.swing.JButton addOne;
    private javax.swing.JMenuItem addWorker;
    private javax.swing.JButton deleteOne;
    private javax.swing.JButton deletePventa;
    private javax.swing.JMenuItem deleteWorker;
    private javax.swing.JMenuItem detallesP;
    private javax.swing.JMenu estadisticas;
    private javax.swing.JMenuItem fullVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanelBotonProductos;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem jRegistroProductos;
    private javax.swing.JMenuItem jRegistroVentas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProducts;
    private javax.swing.JTextField jTotal;
    private javax.swing.JPanel jVenta;
    private javax.swing.JTextField jbusqued;
    private javax.swing.JButton jcreatedSell;
    private javax.swing.JMenuItem jregistrosUsers;
    private javax.swing.JMenuItem modificarWorker;
    private javax.swing.JMenuItem planillaVentas;
    private javax.swing.JMenuItem registerUsers;
    private javax.swing.JMenuItem registroMensual;
    private javax.swing.JMenuItem stock;
    private javax.swing.JMenuItem usersActived;
    // End of variables declaration//GEN-END:variables

    /*crea botones de los productos*/
    private void mostBotonsProduct() {
        System.out.println("creating botons..");
        this.jPanelBotonProductos.removeAll();
        int cont = 0;
        String product[] = DataReader.readData("C:/BuildShop/DB/products.buildshop");
        String productList[][] = AdminBSP.productRegister(product);
        int[] fc = VentasBSP.filcol(productList.length);
        this.jPanelBotonProductos.setLayout(new java.awt.GridLayout(fc[0], fc[1]));
        for (int filas = 0; filas < fc[0]; filas++) {
            for (int columnas = 0; columnas < fc[1]; columnas++) {
                if (cont < productList.length) {
                    System.out.println(" productList[" + cont + "][7]:" + productList[cont][7]);
                    if (productList[cont][7].equalsIgnoreCase("true")) {
                        System.out.println("boton:" + cont);
                        Producto cuadro = new Producto(productList[cont][0], productList[cont][1],
                                productList[cont][2], productList[cont][3],
                                productList[cont][4], productList[cont][5]);
                        cuadro.addActionListener((ActionListener) this);
                        cuadro.setText(cuadro.getName());
                        jPanelBotonProductos.add(cuadro);
                    }
                    cont++;
                } else {
                    break;
                }
            }
        }

        System.out.println("create complet");
    }

    /*entrega la acciones*/
    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel model = (DefaultTableModel) jTableProducts.getModel();
        Producto boton = (Producto) e.getSource();
        String code=boton.getCode();
        int cant = 1, position = 0;
        int valorT = boton.getPrice() * cant;
        boolean state = false;
        if (jTableProducts.getRowCount() == 0) {
            model.addRow(VentasBSP.created(boton, cant, valorT));
            System.out.println("craeted");
        } else {
            for (int x = 0; x < jTableProducts.getRowCount(); x++) {
                System.out.println(jTableProducts.getRowCount() + " x:" + x);
                if (Utiles.comparadorTabla(boton.getName(), String.valueOf(jTableProducts.getValueAt(x, 0)))) {
                    state = true;
                    position = x;
                    break;
                }
            }
            
            if (state) {
                System.out.println("modifict\nvalor: " + jTableProducts.getValueAt(position, 1));
                addProduct(position, boton.getPrice());
                System.out.println("add cant");
            } else {
                model.addRow(VentasBSP.created(boton, cant, valorT));
                System.out.println("add to Sell");
            }
   
        }
        mostTotal();
    }

    /*añade filas de productos añaddidos al carro a la tabla*/
    private void addProduct(int row, int price) {
        System.out.println("add one product");
        int valor = Integer.valueOf(String.valueOf(jTableProducts.getValueAt(row, 2)));
        String v[] = VentasBSP.valores(price, valor,0);
        actualizar(v, row);

    }

    /*lee los productos desde la tabla para generar la venta*/
    private String[] readProducts() {
        int cant = (jTableProducts.getRowCount() * 2) + 1;
        System.out.println("GV\ncantP:" + cant);
        String read[] = new String[cant];
        int sig = 0;
        for (int i = 0; i < cant - 1; i += 2) {
            System.out.println("product:" + jTableProducts.getValueAt(sig, 0) + ""
                    + "\ncant:" + jTableProducts.getValueAt(sig, 1));
            /*producto*/
            read[i] = String.valueOf(jTableProducts.getValueAt(sig, 0));
            /*cantidad*/
            read[i + 1] = String.valueOf(jTableProducts.getValueAt(sig, 2));
            sig++;
        }
        /*total*/
        read[cant - 1] = String.valueOf(jTotal.getText());
        return read;
    }

    /*muestra el total de lo que tiene el carro*/
    private void mostTotal() {
        System.out.println("most ");
        int total=0;
        for (int i = 0; i < jTableProducts.getRowCount(); i++) {
            System.out.println("i:"+jTableProducts.getValueAt(i, 3));
                total = total + Integer.parseInt(String.valueOf(jTableProducts.getValueAt(i, 4)));
            }
            System.out.println("total:" + total);
            jTotal.setText("$"+String.valueOf(total));
   }

    /*quita la fila seleccionda*/
    private void deleteRow() {
        System.out.println("remove rowd");
        DefaultTableModel model = (DefaultTableModel) jTableProducts.getModel();
        model.removeRow(jTableProducts.getSelectedRow());
        mostTotal();
    }

    /*resta en 1 el producto seleccionado*/
    private void deletecant() {
        System.out.println("remove one product");
        int row=jTableProducts.getSelectedRow();
        int valor = Integer.valueOf(String.valueOf(jTableProducts.getValueAt(row, 2)));
        int price=Integer.valueOf(String.valueOf(jTableProducts.getValueAt(row, 3)));
        String v[] = VentasBSP.valores(price, valor,1);
        actualizar(v, row);
        
    }
    
    /*actualiza los valores de la tabla*/
    private void actualizar(String[]v,int x){
        jTableProducts.setValueAt(v[0], x, 2);
        jTableProducts.setValueAt(v[1], x, 4);
        mostTotal();
    }

    private void vaciarTable() {
        DefaultTableModel model = (DefaultTableModel) jTableProducts.getModel();
        for (int i = 0; i < jTableProducts.getRowCount(); i++) {
            model.removeRow(i);
            i-=1;
        }
    }
    

}
