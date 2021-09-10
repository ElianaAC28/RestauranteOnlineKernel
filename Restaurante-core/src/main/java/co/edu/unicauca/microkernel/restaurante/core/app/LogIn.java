/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.microkernel.restaurante.core.app;

import co.edu.unicauca.microkernel.restaurante.commons.interfaces.IUsuarioRepository;
import co.edu.unicauca.microkernel.restaurante.core.access.Factory;
import co.edu.unicauca.microkernel.restaurante.core.services.UsuarioService;
import co.edu.unicauca.microkernel.restaurante.core.services.Messages.*;
import static co.edu.unicauca.microkernel.restaurante.core.services.Messages.successMessage;
import static co.edu.unicauca.microkernel.restaurante.core.services.Messages.warningMessage;

/**
 *
 * @author SoftwareTeam
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Login");

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
        txtPassword = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        btnContacto = new javax.swing.JButton();
        btnInvitado = new javax.swing.JButton();
        lblIngresePass = new javax.swing.JLabel();
        lblIngreseUser = new javax.swing.JLabel();
        imgWp5 = new javax.swing.JLabel();
        imgWp8 = new javax.swing.JLabel();
        imgWp6 = new javax.swing.JLabel();
        imgUser = new javax.swing.JLabel();
        imgPass = new javax.swing.JLabel();
        imgWp7 = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();
        imgWp = new javax.swing.JLabel();
        imgContacto4 = new javax.swing.JLabel();
        imgInstagram = new javax.swing.JLabel();
        imgFb = new javax.swing.JLabel();
        imgWp3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Ventana"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        txtPassword.setFont(new java.awt.Font("Calibri Light", 0, 10)); // NOI18N
        jPanel1.add(txtPassword);
        txtPassword.setBounds(440, 290, 180, 30);

        btnIniciarSesion.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesion);
        btnIniciarSesion.setBounds(480, 350, 120, 40);

        txtUsuario.setFont(new java.awt.Font("Calibri Light", 0, 10)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.setActionCommand("null");
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(440, 200, 180, 30);

        btnContacto.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnContacto.setForeground(new java.awt.Color(255, 255, 255));
        btnContacto.setText("Contactanos");
        btnContacto.setBorder(null);
        btnContacto.setBorderPainted(false);
        btnContacto.setContentAreaFilled(false);
        btnContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactoActionPerformed(evt);
            }
        });
        jPanel1.add(btnContacto);
        btnContacto.setBounds(570, 40, 110, 23);

        btnInvitado.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnInvitado.setForeground(new java.awt.Color(255, 255, 255));
        btnInvitado.setText("Omitir");
        btnInvitado.setBorder(null);
        btnInvitado.setBorderPainted(false);
        btnInvitado.setContentAreaFilled(false);
        btnInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvitadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnInvitado);
        btnInvitado.setBounds(550, 410, 171, 23);

        lblIngresePass.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        lblIngresePass.setText("Contraseña");
        jPanel1.add(lblIngresePass);
        lblIngresePass.setBounds(480, 260, 130, 30);

        lblIngreseUser.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        lblIngreseUser.setText("Usuario");
        jPanel1.add(lblIngreseUser);
        lblIngreseUser.setBounds(480, 170, 80, 30);

        imgWp5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jPanel1.add(imgWp5);
        imgWp5.setBounds(660, 0, 130, 480);

        imgWp8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jPanel1.add(imgWp8);
        imgWp8.setBounds(510, 0, 360, 480);

        imgWp6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jPanel1.add(imgWp6);
        imgWp6.setBounds(500, 0, 360, 480);

        imgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/round-account-button-with-user-inside_icon-icons.com_72596 (2).png"))); // NOI18N
        jPanel1.add(imgUser);
        imgUser.setBounds(440, 160, 32, 40);

        imgPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/key-silhouette-security-tool-interface-symbol-of-password_icon-icons.com_54503.png"))); // NOI18N
        jPanel1.add(imgPass);
        imgPass.setBounds(440, 250, 40, 40);

        imgWp7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jPanel1.add(imgWp7);
        imgWp7.setBounds(350, 0, 350, 480);

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo_restaurante .png"))); // NOI18N
        jPanel1.add(imgLogo);
        imgLogo.setBounds(70, 140, 200, 140);

        imgWp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/whatsapp-logo.png"))); // NOI18N
        jPanel1.add(imgWp);
        imgWp.setBounds(110, 320, 32, 40);

        imgContacto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fb_icon-icons.com_65434.png"))); // NOI18N
        jPanel1.add(imgContacto4);
        imgContacto4.setBounds(540, 30, 32, 40);

        imgInstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/instagram_icon_125245.png"))); // NOI18N
        jPanel1.add(imgInstagram);
        imgInstagram.setBounds(150, 320, 30, 40);

        imgFb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fb_icon-icons.com_65434.png"))); // NOI18N
        jPanel1.add(imgFb);
        imgFb.setBounds(190, 320, 32, 40);

        imgWp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blanco.jpg"))); // NOI18N
        jPanel1.add(imgWp3);
        imgWp3.setBounds(-40, 0, 430, 510);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactoActionPerformed
        Contacto cont = new Contacto(6);
        cont.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnContactoActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
         IUsuarioRepository repo = Factory.getInstance().getRepositoryUsuario();
        UsuarioService customerService = new UsuarioService(repo);
        try {
            if (txtUsuario.getText().isEmpty() || txtPassword.getText().isEmpty()) {
                warningMessage("CAMPOS VACIOS", "Atención");
            } else {
                String login = customerService.autenticarUsuario(txtUsuario.getText(), txtPassword.getText());
                if (login.equals("usuario")) {
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            String restId = "";
                            Usuario ins = new Usuario(restId);

                            ins.setVisible(true);

                            successMessage("Autenticacion exitosa!", "BIENVENIDO");
                        }
                    });
                    this.dispose();
                }
                if (login.equals("admin")) {
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            String restId = "";
                            Admin ins = new Admin(restId);

                            ins.setVisible(true);

                            successMessage("Autenticacion exitosa!", "BIENVENIDO");
                        }
                    });
                    this.dispose();
                }
                if (login != "admin" && login != "usuario") {
                    warningMessage("DATOS NO ENCONTRADOS!", "ERROR");
                    txtUsuario.setText("");
                    txtPassword.setText("");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
            successMessage(ex.getMessage() + "", "");
        }
    
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvitadoActionPerformed
        Visitante vist = new Visitante();
        vist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInvitadoActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContacto;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnInvitado;
    private javax.swing.JLabel imgContacto4;
    private javax.swing.JLabel imgFb;
    private javax.swing.JLabel imgInstagram;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel imgPass;
    private javax.swing.JLabel imgUser;
    private javax.swing.JLabel imgWp;
    private javax.swing.JLabel imgWp3;
    private javax.swing.JLabel imgWp5;
    private javax.swing.JLabel imgWp6;
    private javax.swing.JLabel imgWp7;
    private javax.swing.JLabel imgWp8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIngresePass;
    private javax.swing.JLabel lblIngreseUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
