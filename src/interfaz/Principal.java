/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import clases.Password;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class Principal extends javax.swing.JFrame {

     ArrayList<Password> v = new ArrayList();
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JpContraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        cmdCrear = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdCambiar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMostrar = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("PASSWORD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        JpContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JpContraseñaKeyReleased(evt);
            }
        });
        jPanel1.add(JpContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 110, -1));

        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 80, 40));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 80, 40));

        cmdCambiar.setText("Cambiar");
        cmdCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCambiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 80, 40));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 80, 40));

        txtMostrar.setEditable(false);
        txtMostrar.setColumns(20);
        txtMostrar.setRows(5);
        jScrollPane1.setViewportView(txtMostrar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, 110));

        jLabel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel3KeyTyped(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, 20));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 120, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
       String contra;
       Password p;
        if (JpContraseña.getText().length() < 6) {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener minimo 6 caracteres");
             JpContraseña.requestFocusInWindow();
        } else {
            
        
            JpContraseña.setText(JpContraseña.getText());
            JOptionPane.showMessageDialog(this, "Contraseña cambiada correctamente");
       contra = JpContraseña.getText();
      
       p = new Password(contra);
       v.add(p);

        JOptionPane.showMessageDialog(this, "Contraseña Agregada Exitosamente!");
    }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCambiarActionPerformed
       String newcontra = null; 
       
       int op;
       
       op = JOptionPane.showConfirmDialog(this, "¿ Seguro que desea cambiar la contraseña ?","Pregunta",JOptionPane.YES_NO_OPTION);
       if(op == JOptionPane.YES_OPTION){
           newcontra = JOptionPane.showInputDialog("Ingrese la nueva contraseña y Presione CREAR para guardar");
           
           
           JpContraseña.setText(newcontra);
           txtMostrar.setText("");
            
       }
    }//GEN-LAST:event_cmdCambiarActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        String aux;
        txtMostrar.setText("");

        if (v.isEmpty()) {
            txtMostrar.setText("No hay contraseña que mostrar");
        } else {

            for (int i = 0; i < v.size(); i++) {
                aux = "Contraseña No. " + (i + 1) + "\n"
                        + "Contraseña es: " + v.get(i).getPassword() + "\n";
                       
                txtMostrar.append(aux);

            }
        }
        JpContraseña.requestFocusInWindow();
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void JpContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JpContraseñaKeyReleased
       
    }//GEN-LAST:event_JpContraseñaKeyReleased

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtMostrar.setText("");
        JpContraseña.setText("");
        
        JpContraseña.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void jLabel3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyTyped
     
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JpContraseña;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCambiar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtMostrar;
    // End of variables declaration//GEN-END:variables
}
