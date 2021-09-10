/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.microkernel.restaurante.core.app;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SoftwareTeam
 */
public class Contacto extends javax.swing.JFrame {

    private int numInterfaz = 6;

    /**
     * Creates new form Contactanos
     */
    public Contacto() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Contactanos");
    }

    public Contacto(int num) {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Contactanos");
        numInterfaz = num;
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
        lblAyuda = new javax.swing.JLabel();
        lblWp = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        imgWp = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        imgContacto = new javax.swing.JLabel();
        imgHome = new javax.swing.JLabel();
        btnOrden = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        lblAyuda.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        lblAyuda.setText("Hola, ¿En qué te podemos ayudar?");
        jPanel1.add(lblAyuda);
        lblAyuda.setBounds(120, 110, 560, 50);

        lblWp.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        lblWp.setText("Whatsapp: 311 7568328");
        jPanel1.add(lblWp);
        lblWp.setBounds(470, 350, 160, 40);

        btnAtras.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.setBorder(null);
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras);
        btnAtras.setBounds(540, 70, 90, 30);

        imgWp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/whatsapp-logo.png"))); // NOI18N
        jPanel1.add(imgWp);
        imgWp.setBounds(430, 350, 40, 32);

        btnReporte.setBackground(new java.awt.Color(102, 0, 0));
        btnReporte.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte.setText("Quiero reportar otro tipo de caso");
        btnReporte.setBorder(null);
        btnReporte.setBorderPainted(false);
        btnReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnReporte);
        btnReporte.setBounds(140, 310, 220, 50);

        btnAyuda.setBackground(new java.awt.Color(102, 0, 0));
        btnAyuda.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnAyuda.setForeground(new java.awt.Color(255, 255, 255));
        btnAyuda.setText("Necesito ayuda con mi domicilio");
        btnAyuda.setBorder(null);
        btnAyuda.setBorderPainted(false);
        btnAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAyuda);
        btnAyuda.setBounds(140, 170, 220, 50);

        imgContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atencionalcliente.png"))); // NOI18N
        jPanel1.add(imgContacto);
        imgContacto.setBounds(460, 190, 140, 140);

        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.png"))); // NOI18N
        jPanel1.add(imgHome);
        imgHome.setBounds(530, 60, 40, 40);

        btnOrden.setBackground(new java.awt.Color(102, 0, 0));
        btnOrden.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnOrden.setForeground(new java.awt.Color(255, 255, 255));
        btnOrden.setText("Mi orden fue rechazada");
        btnOrden.setBorder(null);
        btnOrden.setBorderPainted(false);
        btnOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrden);
        btnOrden.setBounds(140, 240, 220, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Base2.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 480);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        switch (numInterfaz) {
            case 1:
                Admin admin = new Admin();
                admin.setVisible(true);
                this.dispose();
                break;
            case 2:
                AdminActualizarAlmuerzo adminAlm = new AdminActualizarAlmuerzo();
                adminAlm.setVisible(true);
                this.dispose();
                break;
            case 3:
                AdminAlmuerzo adminAl = null;
                try {
                    adminAl = new AdminAlmuerzo();
                } catch (Exception ex) {
                    Logger.getLogger(Contacto.class.getName()).log(Level.SEVERE, null, ex);
                }
                adminAl.setVisible(true);
                this.dispose();
                break;

            case 4:
                AdminCompo admCom = new AdminCompo();
                admCom.setVisible(true);
                this.dispose();
                break;
            case 5:
                AdminCompoDispo admComD = new AdminCompoDispo();
                admComD.setVisible(true);
                this.dispose();
                break;

            case 6:
                IniciarSesion login = new IniciarSesion();
                login.setVisible(true);
                this.dispose();
                break;
            case 7:
                Usuario user = new Usuario();
                user.setVisible(true);
                this.dispose();
                break;
        }


    }//GEN-LAST:event_btnAtrasActionPerformed
    //en construcción
    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        JOptionPane.showMessageDialog(null, "Lo sentimos, aún estamos trabajando para darte lo mejor", "En contrucción", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_btnReporteActionPerformed
    //en construcción
    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        JOptionPane.showMessageDialog(null, "Lo sentimos, aún estamos trabajando para darte lo mejor", "En contrucción", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnAyudaActionPerformed

    //en construcción
    private void btnOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenActionPerformed
        JOptionPane.showMessageDialog(null, "Lo sentimos, aún estamos trabajando para darte lo mejor", "En contrucción", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_btnOrdenActionPerformed

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
            java.util.logging.Logger.getLogger(Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnOrden;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel imgContacto;
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel imgWp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAyuda;
    private javax.swing.JLabel lblWp;
    // End of variables declaration//GEN-END:variables
}
