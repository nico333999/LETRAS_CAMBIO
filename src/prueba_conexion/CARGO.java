/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nico-
 */
public class CARGO extends javax.swing.JFrame {

    /**
     * Creates new form CARGO
     */
    public CARGO() {
        initComponents();
        mostrar("");
        txtcod.setEditable(false);
            txtnom.setEditable(false);
            txtestado.setEditable(false);
            valbuscar.setEditable(false); 
             cestado.removeAllItems();
            this.iniciarcombo();
            cestado.setVisible(false);
            contador++;
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
        jPanel2 = new javax.swing.JPanel();
        label2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtestado = new javax.swing.JTextField();
        valbuscar = new javax.swing.JTextField();
        BUSCAR = new javax.swing.JButton();
        MOSTRAR = new javax.swing.JButton();
        cestado = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablecargo = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        ADICIONAR = new javax.swing.JButton();
        MODIFICAR = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        INACTIVAR = new javax.swing.JButton();
        REACTIVAR = new javax.swing.JButton();
        ACEPTAR = new javax.swing.JButton();
        CANCELAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        jLabel1.setText("CARGO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        label2.setText("CODIGO:");

        jLabel3.setText("CARGO:");

        jLabel4.setText("ESTADO:");

        BUSCAR.setText("BUSCAR");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        MOSTRAR.setText("MOSTRAR");
        MOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOSTRARActionPerformed(evt);
            }
        });

        cestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cestadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(valbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(BUSCAR)
                        .addGap(18, 18, 18)
                        .addComponent(MOSTRAR)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUSCAR)
                    .addComponent(MOSTRAR))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tablecargo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablecargo);

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));

        ADICIONAR.setText("ADICIONAR");
        ADICIONAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADICIONARActionPerformed(evt);
            }
        });

        MODIFICAR.setText("MODIFICAR");
        MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICARActionPerformed(evt);
            }
        });

        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });

        INACTIVAR.setText("INACTIVAR");
        INACTIVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INACTIVARActionPerformed(evt);
            }
        });

        REACTIVAR.setText("REACTIVAR");
        REACTIVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REACTIVARActionPerformed(evt);
            }
        });

        ACEPTAR.setText("ACEPTAR");
        ACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACEPTARActionPerformed(evt);
            }
        });

        CANCELAR.setText("CANCELAR");
        CANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(INACTIVAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(REACTIVAR))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ADICIONAR)
                        .addGap(39, 39, 39)
                        .addComponent(MODIFICAR)))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ACEPTAR)
                    .addComponent(ELIMINAR))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CANCELAR))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADICIONAR)
                    .addComponent(MODIFICAR)
                    .addComponent(ELIMINAR)
                    .addComponent(SALIR))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INACTIVAR)
                    .addComponent(REACTIVAR)
                    .addComponent(ACEPTAR)
                    .addComponent(CANCELAR))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELARActionPerformed
        // TODO add your handling code here:
          clean();
        mostrar("");
        opcion=0;
    }//GEN-LAST:event_CANCELARActionPerformed

    private void ADICIONARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADICIONARActionPerformed
        // TODO add your handling code here:
        if(opcion==0){
            cestado.setVisible(true);
        txtnom.setEditable(true);
         
        opcion=1;
        }
    }//GEN-LAST:event_ADICIONARActionPerformed

    private void ACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACEPTARActionPerformed
        // TODO add your handling code here:
        if(opcion==1){
            try {
                PreparedStatement ps=connection.prepareStatement("INSERT INTO CARGO (CargNom,ESTADO_EstCod) VALUES (?,?)");
                 ps.setString(1,txtnom.getText());
         ps.setString(2,txestado);
        ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(CARGO.class.getName()).log(Level.SEVERE, null, ex);
            }
             mostrar("");
        }else if(opcion==2){
       mostrar(valbuscar.getText().toString());
        }else if(opcion==3){
            try {
                if(txestado.equals(""))
                    txestado=txtestado.getText();
                PreparedStatement pst=connection.prepareStatement("UPDATE CARGO SET CargNom='"
                        +txtnom.getText() + "',ESTADO_EstCod='"+txestado+"' WHERE CargCod='"+
                        txtcod.getText()+"'");
                  pst.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(CARGO.class.getName()).log(Level.SEVERE, null, ex);
            }
        mostrar("");
        }else if(opcion==4){
           String i ="I";
            try {
                PreparedStatement pst=connection.prepareStatement("UPDATE CARGO SET ESTADO_EstCod='"+i+
                        "' WHERE CargCod='"
                        +txtcod.getText()+"'");
                pst.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(CARGO.class.getName()).log(Level.SEVERE, null, ex);
            }
             mostrar("");
        }else if(opcion==5){
        String i ="A";
            try {
                PreparedStatement pst=connection.prepareStatement("UPDATE CARGO SET ESTADO_EstCod='"+i+
                        "' WHERE CargCod='"
                        +txtcod.getText()+"'");
                 pst.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(CARGO.class.getName()).log(Level.SEVERE, null, ex);
            }
         mostrar("");
        
        }else if(opcion==6){
            String i ="*";
            try {
                 PreparedStatement pst=connection.prepareStatement("UPDATE CARGO SET ESTADO_EstCod='"+i+
                        "' WHERE CargCod='"
                        +txtcod.getText()+"'");
                 pst.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(CARGO.class.getName()).log(Level.SEVERE, null, ex);
            }
        mostrar("");
        }
         clean();
       opcion=0;
    }//GEN-LAST:event_ACEPTARActionPerformed

    private void MOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOSTRARActionPerformed
        // TODO add your handling code here:
          mostrar("");
    }//GEN-LAST:event_MOSTRARActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        // TODO add your handling code here:
        if(opcion==0){ 
        valbuscar.setEditable(true);
        opcion=2;
        }
    }//GEN-LAST:event_BUSCARActionPerformed

    private void MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARActionPerformed
        // TODO add your handling code here:
        if(opcion==0){ 
        int fila=tablecargo.getSelectedRow();
         if(fila>=0){
          cestado.setVisible(true);
             txtcod.setText(tablecargo.getValueAt(fila,0).toString());
             txtnom.setText(tablecargo.getValueAt(fila,1).toString());
            txtestado.setText(tablecargo.getValueAt(fila,2).toString());
           opcion=3;
         
            txtnom.setEditable(true);
            
         }else{
         JOptionPane.showMessageDialog(null,"fila no seleccionada");
         }
         }
    }//GEN-LAST:event_MODIFICARActionPerformed

    private void INACTIVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INACTIVARActionPerformed
        // TODO add your handling code here:
        if(opcion==0){
        int fila=tablecargo.getSelectedRow();
         if(fila>=0){
             txtcod.setText(tablecargo.getValueAt(fila,0).toString());
             txtnom.setText(tablecargo.getValueAt(fila,1).toString());
            txtestado.setText(tablecargo.getValueAt(fila,2).toString());
            
           opcion=4;
         
         }else{
         JOptionPane.showMessageDialog(null,"fila no seleccionada");
         }
         }
    }//GEN-LAST:event_INACTIVARActionPerformed

    private void REACTIVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REACTIVARActionPerformed
        // TODO add your handling code here:
        if(opcion==0){ 
        int fila=tablecargo.getSelectedRow();
         if(fila>=0){
             
             txtcod.setText(tablecargo.getValueAt(fila,0).toString());
             txtnom.setText(tablecargo.getValueAt(fila,1).toString());
            txtestado.setText(tablecargo.getValueAt(fila,2).toString());
           opcion=5;
         
         }else{
         JOptionPane.showMessageDialog(null,"fila no seleccionada");
         }
         }
    }//GEN-LAST:event_REACTIVARActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        // TODO add your handling code here:
        if(opcion==0){ 
        int fila=tablecargo.getSelectedRow();
         if(fila>=0){
             
             txtcod.setText(tablecargo.getValueAt(fila,0).toString());
             txtnom.setText(tablecargo.getValueAt(fila,1).toString());
            txtestado.setText(tablecargo.getValueAt(fila,2).toString());
           opcion=6;
         
         }else{
         JOptionPane.showMessageDialog(null,"fila no seleccionada");
         }
         }
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void cestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cestadoActionPerformed
        // TODO add your handling code here:
         if(this.contador>0){ 
        try {
            // TODO add your handling code here:
            Statement st=connection.createStatement();
            ResultSet result=st.executeQuery("SELECT *FROM ESTADO WHERE EstNom='"+cestado.getSelectedItem()+"'");
            result.next();
            txestado=result.getString("EstCod");
            txtestado.setText(txestado);
        } catch (SQLException ex) {
            Logger.getLogger(LUGARGIRO.class.getName()).log(Level.SEVERE, null, ex);
        }
             
      }
    }//GEN-LAST:event_cestadoActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        // TODO add your handling code here:
        Conexion_formulario h=new Conexion_formulario();
        h.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_SALIRActionPerformed

    /**
     * @param args the command line arguments
     */
     public void mostrar(String valor){
    DefaultTableModel modelo=new DefaultTableModel();
    modelo.addColumn("CODIGO");
     modelo.addColumn("CARGO");
      modelo.addColumn("ESTADO");
      tablecargo.setModel(modelo);
      String datos[]=new String[3]; 
      String texto="SELECT * FROM CARGO";
    
    if(valor.equals("")==false)
          texto="SELECT * FROM CARGO WHERE CargCod='"+valor+"'";
     try {
            Statement st=connection.createStatement();
             ResultSet result=st.executeQuery(texto);
            while(result.next()){
            datos[0]=result.getString(1);
            datos[1]=result.getString(2);
              datos[2]=result.getString(3);
            modelo.addRow(datos);
             }
            tablecargo.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(CARGO.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
     public void clean(){
    txtcod.setText("");
    txtnom.setText("");
    txtestado.setText("");
    valbuscar.setText("");
    txtcod.setEditable(false);
            txtnom.setEditable(false);
            txtestado.setEditable(false);
           valbuscar.setEditable(false);  
    cestado.setVisible(false);
    txestado="";
    }
      public void iniciarcombo(){
        try {
            Statement st=connection.createStatement();
             ResultSet result=st.executeQuery("SELECT *FROM ESTADO");
             
             while(result.next()){
                 cestado.addItem(result.getString("EstNom"));
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(LUGARGIRO.class.getName()).log(Level.SEVERE, null, ex);
        }
           cestado.setVisible(false);
    }
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
            java.util.logging.Logger.getLogger(CARGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CARGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CARGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CARGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CARGO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACEPTAR;
    private javax.swing.JButton ADICIONAR;
    private javax.swing.JButton BUSCAR;
    private javax.swing.JButton CANCELAR;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JButton INACTIVAR;
    private javax.swing.JButton MODIFICAR;
    private javax.swing.JButton MOSTRAR;
    private javax.swing.JButton REACTIVAR;
    private javax.swing.JButton SALIR;
    private javax.swing.JComboBox<String> cestado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label2;
    private javax.swing.JTable tablecargo;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField valbuscar;
    // End of variables declaration//GEN-END:variables
int opcion=0;
int contador=0;
String txestado="";
    Conectar co=new Conectar();
Connection connection=co.conexion();

}
