
package BuildShop.Windows;

import BuildShop.Data.*;
import javax.swing.JOptionPane;

public class EliminarVend extends javax.swing.JFrame {


    public EliminarVend() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JRut = new javax.swing.JTextField();
        Jclave = new javax.swing.JPasswordField();
        JEliminar = new javax.swing.JButton();
        jMensaje1 = new javax.swing.JLabel();
        jMensaje2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar Vendedor");

        jLabel1.setText("Rut Usuario:");

        jLabel2.setText("clave Administrador:");

        Jclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JclaveActionPerformed(evt);
            }
        });

        JEliminar.setText("Eliminar");
        JEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JRut, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JEliminar)
                            .addComponent(Jclave))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMensaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JRut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jclave, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMensaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JEliminarActionPerformed
        limpiar();
        String rut="", clave,text="";
        boolean ru=false,cl=false;
        
        if(Utiles.validarRut(JRut.getText())){
            rut=JRut.getText();
            ru=true;
        }else{
            jMensaje1.setText("Rut invalido");
        }
        
        for (int i = 0; i < DataManager.getUsersSize(); i++) {
            text=DataManager.getUser(i).getPassword();
            if(Utiles.validarClave(Jclave.getText())&&Utiles.comparador(text,Jclave.getText())){
                clave=Jclave.getText();
                cl=true;
                break;
            }else{
                jMensaje2.setText("ingrese solo letras y numeros");
        }
        }
        
        if(ru&&cl){
            limpiar();
            AgreDelete.deleteUser(rut);
            JOptionPane.showMessageDialog(null, "Eliminado");
        }
    }//GEN-LAST:event_JEliminarActionPerformed

    private void JclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JclaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JclaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JEliminar;
    private javax.swing.JTextField JRut;
    private javax.swing.JPasswordField Jclave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jMensaje1;
    private javax.swing.JLabel jMensaje2;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        jMensaje1.setText("");
        jMensaje2.setText("");
    }
}
