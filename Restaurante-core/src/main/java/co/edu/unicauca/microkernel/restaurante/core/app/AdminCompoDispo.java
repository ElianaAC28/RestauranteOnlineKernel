/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.microkernel.restaurante.core.app;

import co.edu.unicauca.microkernel.restaurante.commons.entities.Almuerzo;
import co.edu.unicauca.microkernel.restaurante.commons.entities.Componente;
import co.edu.unicauca.microkernel.restaurante.commons.infra.JsonError;
import co.edu.unicauca.microkernel.restaurante.commons.interfaces.IAlmuerzoRepository;
import co.edu.unicauca.microkernel.restaurante.commons.interfaces.IComponenteRepository;
import co.edu.unicauca.microkernel.restaurante.core.access.Factory;
import co.edu.unicauca.microkernel.restaurante.core.services.AlmuerzoService;
import co.edu.unicauca.microkernel.restaurante.core.services.ComponenteService;
import static co.edu.unicauca.microkernel.restaurante.core.services.Messages.successMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author softwareTeam
 */
public class AdminCompoDispo extends javax.swing.JFrame {
    
    String idComp = "";
    String idAlmu = "";
    /**
     * Creates new form AdminComponentes
     */
    public AdminCompoDispo(){
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Actualizar Componente Almuerzo");        
    }
    
    public AdminCompoDispo(String viejo, String idAlmu1){
        idComp = viejo;
        idAlmu = idAlmu1;
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Actualizar Componente Almuerzo");  
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
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaComp = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo restaurante esquina.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 80, 90, 60);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Componentes Disponibles");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(240, 130, 220, 23);

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 0));
        jButton3.setText("Seleccionar");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(460, 390, 190, 30);

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 0, 0));
        jButton4.setText("Mostrar Componentes");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(80, 390, 200, 27);

        tblListaComp.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
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

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(90, 170, 540, 180);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setText("Salir");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(600, 70, 33, 30);

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton5.setText("Contactanos");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(500, 70, 81, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("Id:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-30, 0, 16, 18);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Base2.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -20, 770, 530);

        jButton7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton7.setText("Contactanos");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(340, 60, 81, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AdminActualizarAlmuerzo adcom = new AdminActualizarAlmuerzo();
        //Sacamos el ide de la tabla con los componentes
        DefaultTableModel tabla1 = (DefaultTableModel) tblListaComp.getModel();
        
        int ban=0;
        
        String idCompNuevo=String.valueOf(tabla1.getValueAt(tblListaComp.getSelectedRow(),0));
        String nombreCom = String.valueOf(tabla1.getValueAt(tblListaComp.getSelectedRow(),2));
        

        //VARIABLE PARA SACAR ID COMPTIPO
        String idTipoCom = convert(nombreCom);
               
        IAlmuerzoRepository service = Factory.getInstance().getRepositoryAlmuerzo();
        AlmuerzoService objService= new AlmuerzoService(service);
        
        IComponenteRepository serviceCom = Factory.getInstance().getRepositoryComponente();
        ComponenteService objServiceCom = new ComponenteService(serviceCom);
        
        Almuerzo objAlmu = new Almuerzo();
        
        objAlmu.setIdAlmuerzo(idAlmu);
        objAlmu.setRestId(idComp);
        objAlmu.setCostoAlm(idCompNuevo); //mandarle el id del componente nuevo
           
        try {
             String response = objServiceCom.contarComponente(Integer.parseInt(idAlmu), Integer.parseInt(idTipoCom));
             int valor = Integer.parseInt(response);
             if(valor < 5){
                ban =1;
             } else {
                 successMessage("Error el Almuerzo "+idAlmu+" ya cuenta con 5 "+nombreCom+".", "Atención");
             }
        } catch (Exception ex) {
                System.out.println(ex);
                successMessage(ex.getMessage() + "Error", "Atención");
        }
        
        if(ban == 1){
            try {
                String response = objService.updateAlmuerzo(objAlmu);
                 successMessage("Componente de Almuerzo " + response + " Actualizado con exito.", "Atención");

            } catch (Exception ex) {
                    System.out.println(ex);
                    successMessage(ex.getMessage() + "Error", "Atención");
            }
        }
        adcom.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            llenarTabla();
        } catch (Exception ex) {
            Logger.getLogger(AdminCompoDispo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LogIn log= new LogIn();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Contactanos cont = new Contactanos();
        cont.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminCompoDispo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminCompoDispo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminCompoDispo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminCompoDispo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdminCompoDispo().setVisible(true);
                } catch (Exception ex) { 
                    Logger.getLogger(AdminCompoDispo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
        });
    }
    private void llenarTabla() throws Exception {
        IComponenteRepository service= Factory.getInstance().getRepositoryComponente();
        ComponenteService componenteService= new ComponenteService(service);

        //Componente objComponente = new Componente();
        List<Componente> objListComponentes = new ArrayList<Componente>();

        objListComponentes = componenteService.listComponentes();

        String matriz[][] = new String[objListComponentes.size()][3];

        for (int i = 0; i < objListComponentes.size(); i++) {
            matriz[i][0] = objListComponentes.get(i).getIdComponente()+"";
            matriz[i][1] = objListComponentes.get(i).getNombreComponente();
            matriz[i][2] = objListComponentes.get(i).getTipoComponente();
        }

        tblListaComp.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                     "ID","Nombre", "Tipo"
                }
        ));
    }
    
    private String convert(String nombre){
        if(nombre.equals("Entrada")){
            return 1+"";
        }
        if(nombre.equals("Principio")){
            return 2+"";
        }
        if(nombre.equals("Proteina")){
            return 3+"";
        }
        return 4+"";
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaComp;
    // End of variables declaration//GEN-END:variables
}
