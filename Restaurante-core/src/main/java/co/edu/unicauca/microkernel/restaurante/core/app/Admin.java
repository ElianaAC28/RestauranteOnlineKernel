/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.microkernel.restaurante.core.app;

import co.edu.unicauca.microkernel.restaurante.commons.entities.Componente;
import co.edu.unicauca.microkernel.restaurante.commons.interfaces.IComponenteRepository;
import co.edu.unicauca.microkernel.restaurante.core.access.Factory;
import co.edu.unicauca.microkernel.restaurante.core.services.ComponenteService;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SoftwareTeam
 */
public class Admin extends javax.swing.JFrame {
    String restId = "";
    int cantidad = 5;
    int index = 0;
    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Administrador");
        try {
            llenarTabla(0);
        } catch (Exception ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     

    //Constructor usado por Login para manejar el usuario que se Loggea
    public Admin(String restId) {
        this.restId = restId;
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Administrador");
        try {
            llenarTabla(0);
        } catch (Exception ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaComp = new javax.swing.JTable();
        btnGUIComponentes = new javax.swing.JButton();
        btnAñadorAlmuerzo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnVeinte = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnDiez = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnContacto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tblListaComp.setAutoCreateRowSorter(true);
        tblListaComp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tblListaComp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListaComp);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 540, 170));

        btnGUIComponentes.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnGUIComponentes.setForeground(new java.awt.Color(153, 0, 0));
        btnGUIComponentes.setText("Añadir Componentes");
        btnGUIComponentes.setBorder(null);
        btnGUIComponentes.setBorderPainted(false);
        btnGUIComponentes.setContentAreaFilled(false);
        btnGUIComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUIComponentesActionPerformed(evt);
            }
        });
        getContentPane().add(btnGUIComponentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, 30));

        btnAñadorAlmuerzo.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnAñadorAlmuerzo.setForeground(new java.awt.Color(153, 0, 0));
        btnAñadorAlmuerzo.setText("Añadir Almuerzo");
        btnAñadorAlmuerzo.setBorder(null);
        btnAñadorAlmuerzo.setBorderPainted(false);
        btnAñadorAlmuerzo.setContentAreaFilled(false);
        btnAñadorAlmuerzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadorAlmuerzoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAñadorAlmuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, 30));

        btnSalir.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 60, 30));

        btnVeinte.setBackground(new java.awt.Color(255, 255, 255));
        btnVeinte.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVeinte.setText("20");
        btnVeinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeinteActionPerformed(evt);
            }
        });
        getContentPane().add(btnVeinte, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 50, -1));

        btnCinco.setBackground(new java.awt.Color(255, 255, 255));
        btnCinco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 50, -1));

        btnDiez.setBackground(new java.awt.Color(255, 255, 255));
        btnDiez.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDiez.setText("10");
        btnDiez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiezActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiez, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 50, -1));

        btnNext.setBackground(new java.awt.Color(255, 255, 255));
        btnNext.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Cantidad de elementos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 280, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("En esta lista encontrara los componentes del restaurante");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 390, 60));

        jLabel3.setFont(new java.awt.Font("Calibri Light", 2, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Administrador");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 320, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo restaurante esquina.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 70, 50));

        btnContacto.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        btnContacto.setText("Contactanos");
        btnContacto.setBorder(null);
        btnContacto.setBorderPainted(false);
        btnContacto.setContentAreaFilled(false);
        btnContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactoActionPerformed(evt);
            }
        });
        getContentPane().add(btnContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 90, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Base2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton salir de la sesion y devolverse a Login
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    //Boton para acceder a la interfaz grafica de agregar almuerzo
    private void btnAñadorAlmuerzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadorAlmuerzoActionPerformed
        AdminAlmuerzo adalmu = null;
        try {
            adalmu = new AdminAlmuerzo();
        } catch (Exception ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        adalmu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAñadorAlmuerzoActionPerformed

    //Boton para acceder a la interfaz grafica de agregar componente
    private void btnGUIComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUIComponentesActionPerformed
        AdminCompo adcom = new AdminCompo();
        adcom.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGUIComponentesActionPerformed

    //Boton para acceder a la interfaz grafica de contacto
    private void btnContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactoActionPerformed
        
        Contacto cont = new Contacto(1);
        cont.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnContactoActionPerformed

    //Boton para definir la cantidad de elementos a 20 en lista
    private void btnVeinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeinteActionPerformed
        cantidad = 20;
        try {
            llenarTabla(0);
        } catch (Exception ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVeinteActionPerformed

    //Boton para definir la cantidad de elementos a 5 en lista (default)
    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        cantidad = 5;
        try {
            llenarTabla(0);
        } catch (Exception ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCincoActionPerformed

    //Boton para definir la cantidad de elementos a 10 en lista
    private void btnDiezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiezActionPerformed
        cantidad = 10;
        try {
            llenarTabla(0);
        } catch (Exception ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDiezActionPerformed

    //Boton para ir avanzar a los siguientes X elementos en la lista
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(index < returnCantidad()-cantidad){
            index = index + cantidad;
            try {
                llenarTabla(index);
            } catch (Exception ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnNextActionPerformed

    //Boton para retroceder a los siguientes X elementos en la lista
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if(index > 0){
            index = index - cantidad;
            try {
                llenarTabla(index);
            } catch (Exception ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    //Metodo para llenar la tabla con todos los componentes
    private void llenarTabla(int indicador) throws Exception {
        index = indicador;
        
        IComponenteRepository service = Factory.getInstance().getRepositoryComponente();
        ComponenteService componenteService = new ComponenteService(service);

        //Componente objComponente = new Componente();
        List<Componente> objListComponentes = new ArrayList<Componente>();

        objListComponentes = componenteService.listComponentes();

        String matriz[][] = new String[objListComponentes.size()][3];

        for (int i = 0; i < objListComponentes.size(); i++) {
            matriz[i][0] = objListComponentes.get(i).getIdComponente() + "";
            matriz[i][1] = objListComponentes.get(i).getNombreComponente();
            matriz[i][2] = objListComponentes.get(i).getTipoComponente();
        }
        
        int residuo = objListComponentes.size() % cantidad;
        int temp = cantidad;
                
        if(( objListComponentes.size()-index)==residuo){
            cantidad = residuo;
        }
        
        String littleMatriz[][] = new String[cantidad][3];
        
        for (int j = 0; j < cantidad; j++){
            if(index == objListComponentes.size()-1)
                break;
            littleMatriz[j][0] = matriz[index+j][0];
            littleMatriz[j][1] = matriz[index+j][1];
            littleMatriz[j][2] = matriz[index+j][2];
        }
        
        cantidad = temp;
        
        //Anterior codigo para llenar con todos los componentes disponibles sin restringir elementos
        /*tblListaComp.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID", "Nombre", "Tipo"
                }
        ));*/
        
        tblListaComp.setModel(new javax.swing.table.DefaultTableModel(
                littleMatriz,
                new String[]{
                    "ID", "Nombre", "Tipo"
                }
        ));
    }
    
    //Metodo que retorna la cantidad de componentes, usado en el boton next para
    // evitar que el usuaria avance mas de los componentes permitidos
    private int returnCantidad(){
        IComponenteRepository service = Factory.getInstance().getRepositoryComponente();
        ComponenteService componenteService = new ComponenteService(service);

        //Componente objComponente = new Componente();
        List<Componente> objListComponentes = new ArrayList<Componente>();

        objListComponentes = componenteService.listComponentes();
        
        return objListComponentes.size();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadorAlmuerzo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnContacto;
    private javax.swing.JButton btnDiez;
    private javax.swing.JButton btnGUIComponentes;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVeinte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaComp;
    // End of variables declaration//GEN-END:variables
}
