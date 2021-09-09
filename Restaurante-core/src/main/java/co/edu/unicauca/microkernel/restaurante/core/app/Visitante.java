/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.microkernel.restaurante.core.app;

import javax.swing.JOptionPane;

/**
 *
 * @author SoftwareTeam
 */
public class Visitante extends javax.swing.JFrame {

    /**
     * Creates new form Contactanos
     */
    public Visitante() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Visitante");
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
        lblElegirRest = new javax.swing.JLabel();
        lblInicioSesion = new javax.swing.JButton();
        btnRest3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        btnRest2 = new javax.swing.JButton();
        btnRest1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        lblElegirRest.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblElegirRest.setForeground(new java.awt.Color(255, 255, 255));
        lblElegirRest.setText("Elige un restaurante ");
        jPanel1.add(lblElegirRest);
        lblElegirRest.setBounds(190, 90, 460, 40);

        lblInicioSesion.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblInicioSesion.setBorder(null);
        lblInicioSesion.setBorderPainted(false);
        lblInicioSesion.setContentAreaFilled(false);
        lblInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblInicioSesionActionPerformed(evt);
            }
        });
        jPanel1.add(lblInicioSesion);
        lblInicioSesion.setBounds(370, 330, 210, 20);

        btnRest3.setBackground(new java.awt.Color(102, 0, 0));
        btnRest3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRest3.setForeground(new java.awt.Color(255, 255, 255));
        btnRest3.setText("El Sotano");
        btnRest3.setBorder(null);
        btnRest3.setBorderPainted(false);
        btnRest3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRest3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRest3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRest3);
        btnRest3.setBounds(150, 300, 170, 50);

        jButton6.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButton6.setText("Inicio");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(530, 80, 90, 23);

        btnIniciarSesion.setBackground(new java.awt.Color(102, 0, 0));
        btnIniciarSesion.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesion);
        btnIniciarSesion.setBounds(420, 360, 130, 30);

        btnRest2.setBackground(new java.awt.Color(102, 0, 0));
        btnRest2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRest2.setForeground(new java.awt.Color(255, 255, 255));
        btnRest2.setText("Sazón de Emmy");
        btnRest2.setBorder(null);
        btnRest2.setBorderPainted(false);
        btnRest2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRest2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRest2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRest2);
        btnRest2.setBounds(150, 230, 170, 50);

        btnRest1.setBackground(new java.awt.Color(102, 0, 0));
        btnRest1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRest1.setForeground(new java.awt.Color(255, 255, 255));
        btnRest1.setText("Buffon Hut");
        btnRest1.setBorder(null);
        btnRest1.setBorderPainted(false);
        btnRest1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRest1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRest1);
        btnRest1.setBounds(150, 160, 170, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¿Desea iniciar sesión?");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(410, 320, 180, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("¿Desea iniciar sesión?");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(410, 320, 180, 40);

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo_restaurante .png"))); // NOI18N
        jPanel1.add(imgLogo);
        imgLogo.setBounds(390, 180, 200, 140);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/visitante.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 720, 480);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void lblInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblInicioSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblInicioSesionActionPerformed

    private void btnRest3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRest3ActionPerformed
      // JOptionPane.showMessageDialog(null, "Su pedido se ha realizado con éxito");
              JOptionPane.showMessageDialog(null, "Lo sentimos, aún estamos trabajando para darte lo mejor", "En contrucción", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_btnRest3ActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
       Login login = new Login();
       login.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnRest2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRest2ActionPerformed
        // TODO add your handling code here:
            JOptionPane.showMessageDialog(null, "Lo sentimos, aún estamos trabajando para darte lo mejor", "En contrucción", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_btnRest2ActionPerformed

    private void btnRest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRest1ActionPerformed
        // TODO add your handling code here:
        GUIVisitante vist = new GUIVisitante();
        vist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRest1ActionPerformed

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
            java.util.logging.Logger.getLogger(Visitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visitante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRest1;
    private javax.swing.JButton btnRest2;
    private javax.swing.JButton btnRest3;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblElegirRest;
    private javax.swing.JButton lblInicioSesion;
    // End of variables declaration//GEN-END:variables
}
