/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package elistasmkiosco;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Piruxb17
 */
public class mostrarArticulos extends javax.swing.JFrame {
    private int posicion;
    
    DefaultTableModel modeloTabla = new DefaultTableModel();

    /**
     * Creates new form Principal
     */
     
    public mostrarArticulos() {
        initComponents();
        this.setLocationRelativeTo(null);
        String[] titulo = new String[]{"Articulos"};
        modeloTabla.setColumnIdentifiers(titulo);
        tArticulos.setModel(modeloTabla);
        
     
    }
    void borrarTabla() {
        int i = modeloTabla.getRowCount();
        while (i > 0) {
            i--;
            modeloTabla.removeRow(i);
        }
    }
    public Boolean buscarRubro(int Codigo){
        boolean flag=false;
        for (int i=0; i< EListasMKiosco.listaRubro.size();i++ ){
            if((Codigo == EListasMKiosco.listaRubro.get(i).getCodRubro())&& flag==false){
                flag=true;
                posicion=i;
            }
        }
        return flag;
    }
    void cargarArticulos() {
        TableModel modeloDatos= tArticulos.getModel();
        Rubro rubros= new Rubro();
        rubros=EListasMKiosco.listaRubro.get(posicion);        
        for (int i=0; i< rubros.getArticulo().size();i++ ){
          //String valor= (String) rubros.getArticulo().get(i);
          int c=0;
          modeloTabla.addRow(new Object[]{rubros.getArticulo().get(i)});
                        
        }
    }
    void cargarRubro(){
        try{
        int codigo= Integer.parseInt(textCodigoRubro.getText());
        
        if (buscarRubro(codigo)){
            jDescripcion.setText(EListasMKiosco.listaRubro.get(posicion).getDescripcion());
            cargarArticulos();
            } else 
              JOptionPane.showMessageDialog(rootPane, "No exite el codigo");
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "El codigo debe ser entre 1 y 9");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR");

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

        jLabel3 = new javax.swing.JLabel();
        bAgregarRubro = new javax.swing.JButton();
        Bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tArticulos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jDescripcion = new javax.swing.JLabel();
        textCodigoRubro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bAgregarRubro1 = new javax.swing.JButton();

        jLabel3.setText("Articulo");

        bAgregarRubro.setBackground(new java.awt.Color(0, 204, 255));
        bAgregarRubro.setForeground(new java.awt.Color(255, 255, 255));
        bAgregarRubro.setText("Agegar Rubro");
        bAgregarRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarRubroActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Bg.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("ARTICULOS");

        tArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Articulos"
            }
        ));
        tArticulos.setGridColor(new java.awt.Color(204, 204, 204));
        tArticulos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tArticulos);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Descripcion:");

        jDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jDescripcion.setText(".");

        textCodigoRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoRubroActionPerformed(evt);
            }
        });

        jLabel5.setText("Codigo Rubro");

        bAgregarRubro1.setBackground(new java.awt.Color(0, 204, 255));
        bAgregarRubro1.setForeground(new java.awt.Color(255, 255, 255));
        bAgregarRubro1.setText("Buscar");
        bAgregarRubro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarRubro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(textCodigoRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(bAgregarRubro1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BgLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)))
                .addGap(109, 109, 109))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCodigoRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(bAgregarRubro1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jDescripcion))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textCodigoRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoRubroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigoRubroActionPerformed

    private void bAgregarRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarRubroActionPerformed
        
    }//GEN-LAST:event_bAgregarRubroActionPerformed

    private void bAgregarRubro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarRubro1ActionPerformed
        borrarTabla();
        cargarRubro();
        
    }//GEN-LAST:event_bAgregarRubro1ActionPerformed
   
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
            java.util.logging.Logger.getLogger(mostrarArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mostrarArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mostrarArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mostrarArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mostrarArticulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JButton bAgregarRubro;
    private javax.swing.JButton bAgregarRubro1;
    private javax.swing.JLabel jDescripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tArticulos;
    private javax.swing.JTextField textCodigoRubro;
    // End of variables declaration//GEN-END:variables
}