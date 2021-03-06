
package BuildShop;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class AgreVendedor extends javax.swing.JFrame {
/*
 ahutor Carrion Cristo, Darigo Giaccomo, Queupumil Eduardo.    
*/
    
    public AgreVendedor() {
        initComponents();
       
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage("C:/BuildShop/IMG/Logo64x64.png");
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JNombre = new javax.swing.JTextField();
        JApellido = new javax.swing.JTextField();
        JEdad = new javax.swing.JTextField();
        JRut = new javax.swing.JTextField();
        clave = new javax.swing.JLabel();
        JClave = new javax.swing.JTextField();
        jAgregar = new javax.swing.JButton();
        Jmesannge = new javax.swing.JLabel();
        Jmesannge1 = new javax.swing.JLabel();
        Jmesannge2 = new javax.swing.JLabel();
        Jmesannge3 = new javax.swing.JLabel();
        Jmesannge4 = new javax.swing.JLabel();
        acceso = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jemail = new javax.swing.JTextField();
        jAcces = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Vendedor");
        setIconImage(getIconImage());
        setIconImages(getIconImages());

        jLabel1.setText("Nombre:");

        jLabel2.setText("Edad:");

        jLabel3.setText("Rut:");

        jLabel4.setText("Apellidos:");

        clave.setText("Clave:");

        jAgregar.setText("Agregar");
        jAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarActionPerformed(evt);
            }
        });

        acceso.setText("Acceso:");

        jLabel5.setText("Email:");

        jAcces.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adminsitrador", "Inventario", "Vendedor"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                            .addComponent(JRut)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(acceso, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jAcces, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JClave))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JApellido))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jmesannge)
                                    .addComponent(Jmesannge1)
                                    .addComponent(Jmesannge2)
                                    .addComponent(Jmesannge3)
                                    .addComponent(Jmesannge4)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jmesannge, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jmesannge1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jmesannge2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JRut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jmesannge3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JClave, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jmesannge4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAcces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jAgregar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarActionPerformed
        limpiar();
        String firstname="",lastname="",rut="",clave="",email="",acces;
        boolean fa=false,no=fa,ap=fa,ed=fa,ru=fa,cl=fa,em=fa;
        int edad=0;
        if(Utiles.validadorString(JNombre.getText())){
            firstname=JNombre.getText();
            no=true;
        }else{
            Jmesannge.setText("ingrese solamente letras");
        }
        if(Utiles.validadorString(JApellido.getText())){
            lastname=JApellido.getText();
            ap=true;
        }else{
            Jmesannge1.setText("ingrese solamente letras");
        }
        if(Utiles.validadorIntPos(JEdad.getText())){
            edad=Integer.parseInt(JEdad.getText());
            ed=true;
        }else{
            Jmesannge2.setText("ingrese solamente numeros");
        }
        if(Utiles.validarRut(JRut.getText())){
            rut=JRut.getText();
            ru=true;
        }else{
            Jmesannge3.setText("Rut invalido");
        }
        if(Utiles.validarClave(JClave.getText())){
            clave=JClave.getText();
            cl=true;
        }else{
            Jmesannge4.setText("ingrese solo letras y numeros");
        }
        if(Utiles.validadorCorreo(jemail.getText())){
            email=jemail.getText();
            em=true;
        }else{
            Jmesannge4.setText("correo ingresado invalido");
        }
        acces=jAcces.getSelectedItem().toString();
        System.out.println("no:"+no+"\nap:"+ap+"\ned:"+ed+"\nru:"+ru+"\nem:"+em+"cl:"+cl);
        if(no && ap && ed && ru && cl&&em){
            AgreDelete.newUser(firstname,lastname,rut,clave,email,acces);
            JOptionPane.showMessageDialog(null, "Agregado");
            dispose();
        }
        
        
    }//GEN-LAST:event_jAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JApellido;
    private javax.swing.JTextField JClave;
    private javax.swing.JTextField JEdad;
    private javax.swing.JTextField JNombre;
    private javax.swing.JTextField JRut;
    private javax.swing.JLabel Jmesannge;
    private javax.swing.JLabel Jmesannge1;
    private javax.swing.JLabel Jmesannge2;
    private javax.swing.JLabel Jmesannge3;
    private javax.swing.JLabel Jmesannge4;
    private javax.swing.JLabel acceso;
    private javax.swing.JLabel clave;
    private javax.swing.JComboBox<String> jAcces;
    private javax.swing.JButton jAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jemail;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        Jmesannge.setText("");
        Jmesannge1.setText("");
        Jmesannge2.setText("");
        Jmesannge3.setText("");
        Jmesannge4.setText("");
              
    }
}
