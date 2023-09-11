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
public class agregarProductos extends javax.swing.JFrame {

    public static ArrayList<String> listaArticulo;
    DefaultTableModel modeloTabla = new DefaultTableModel();

    /**
     * Creates new form Principal
     */
    public agregarProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        bAgregarArticulo.setEnabled(false);
        String[] titulo = new String[]{"Articulos"};
        modeloTabla.setColumnIdentifiers(titulo);
        tArticulo.setModel(modeloTabla);

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
        Bg = new javax.swing.JPanel();
        textCodigoRubro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textDescripcion = new javax.swing.JTextField();
        bAgregarArticulo = new javax.swing.JButton();
        bAgregarRubro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tArticulo = new javax.swing.JTable();
        textArticulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bInsertar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();

        jLabel3.setText("Articulo");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Bg.setBackground(new java.awt.Color(255, 255, 255));

        textCodigoRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoRubroActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo Rubro");

        jLabel2.setText("Descripcion");

        textDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDescripcionActionPerformed(evt);
            }
        });

        bAgregarArticulo.setBackground(new java.awt.Color(0, 204, 255));
        bAgregarArticulo.setForeground(new java.awt.Color(255, 255, 255));
        bAgregarArticulo.setText("Agegar Articulo");
        bAgregarArticulo.setEnabled(false);
        bAgregarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarArticuloActionPerformed(evt);
            }
        });

        bAgregarRubro.setBackground(new java.awt.Color(0, 204, 255));
        bAgregarRubro.setForeground(new java.awt.Color(255, 255, 255));
        bAgregarRubro.setText("Agegar Rubro");
        bAgregarRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarRubroActionPerformed(evt);
            }
        });

        tArticulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tArticulo.setGridColor(new java.awt.Color(204, 204, 204));
        tArticulo.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tArticulo);

        textArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textArticuloActionPerformed(evt);
            }
        });

        jLabel4.setText("Articulo");

        bInsertar.setBackground(new java.awt.Color(0, 204, 255));
        bInsertar.setForeground(new java.awt.Color(255, 255, 255));
        bInsertar.setText("Insertar");
        bInsertar.setEnabled(false);
        bInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInsertarActionPerformed(evt);
            }
        });

        bEliminar.setBackground(new java.awt.Color(0, 204, 255));
        bEliminar.setForeground(new java.awt.Color(255, 255, 255));
        bEliminar.setText("Eliminar");
        bEliminar.setEnabled(false);
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BgLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18))
                            .addGroup(BgLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(9, 9, 9)))
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BgLayout.createSequentialGroup()
                                .addComponent(textCodigoRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BgLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bEliminar)
                                    .addComponent(bInsertar)
                                    .addComponent(bAgregarArticulo))))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                        .addComponent(bAgregarRubro)
                        .addGap(46, 46, 46))))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCodigoRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(textDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bAgregarRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addComponent(bInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(bAgregarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
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
    void insertar() {
        modeloTabla.addRow(new Object[]{textArticulo.getText()});
        listaArticulo.add(textArticulo.getText());
        textArticulo.setText("");
        bAgregarArticulo.setEnabled(true);
    }

    void eliminar() {
        try {
            int fila = tArticulo.getSelectedRow();
            modeloTabla.removeRow(fila);
            listaArticulo.remove(fila);
            if (modeloTabla.getRowCount() == 0) {
                bAgregarArticulo.setEnabled(false);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(rootPane, "No hay fila para eliminar");
        } catch (Exception e) {
            String error = e.toString();
            int i = 0;
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
    }

    public Boolean verificarRepetido() {
        boolean flag = true;
        for (int i = 0; i < EListasMKiosco.listaRubro.size(); i++) {
            if (EListasMKiosco.listaRubro.get(i).codigoRepetido(Integer.parseInt(textCodigoRubro.getText()))
                    && (flag == true)) {
                flag = false;
            }
        }
       return flag;
    }

    void agregarRubro() {

        Rubro rubro = new Rubro();
        try {
            if (rubro.validadCodigo(Integer.parseInt(textCodigoRubro.getText()))) {
                if (verificarRepetido()) {

                    if (rubro.validadDescripcion(textDescripcion.getText())) {
                        bInsertar.setEnabled(true);
                        bEliminar.setEnabled(true);
                        bAgregarRubro.setEnabled(false);

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "La descripcion debe tener menos de 20 caracteres");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "El codigo ya existe");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "El codigo debe ser entre 1 y 9");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "El codigo debe ser entre 1 y 9");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR");

        }

    }

    void agregarArticulo() {
        Rubro rubro = new Rubro(Integer.parseInt(textCodigoRubro.getText()),textDescripcion.getText(),listaArticulo);
        /*rubro.setCodRubro(Integer.parseInt(textCodigoRubro.getText()));
        rubro.setDescripcion(textDescripcion.getText());
        rubro.setArticulo(listaArticulo);*/        
        EListasMKiosco.listaRubro.add(rubro);
        bInsertar.setEnabled(false);
        bEliminar.setEnabled(false);
        bAgregarArticulo.setEnabled(false);
        int i=0;
    }

    void borrarTabla() {
        int i = modeloTabla.getRowCount();
        while (i > 0) {
            i--;
            modeloTabla.removeRow(i);
        }

        /*int tamañoTabla=modeloTabla.getRowCount();
         for (int i=0; i<tamañoTabla;i++){
            modeloTabla.r
            int b=0;
            b=modeloTabla.getRowCount();
            int c=0;
         }*/
    }

    void borraListaArticulos() {
        int i = listaArticulo.size();
        while (i > 0) {
            i--;
            listaArticulo.remove(i);
        }
    }
    private void textCodigoRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoRubroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigoRubroActionPerformed

    private void textDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDescripcionActionPerformed

    private void bAgregarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarArticuloActionPerformed
       
        agregarArticulo();
        borrarTabla();
        textCodigoRubro.setText("");
        textDescripcion.setText("");
        bAgregarRubro.setEnabled(true);
       

    }//GEN-LAST:event_bAgregarArticuloActionPerformed

    private void bAgregarRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarRubroActionPerformed
        agregarRubro();
        listaArticulo= new ArrayList();

    }//GEN-LAST:event_bAgregarRubroActionPerformed

    private void textArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textArticuloActionPerformed

    private void bInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInsertarActionPerformed
       if(!("".equals(textArticulo.getText())))
            insertar();
    }//GEN-LAST:event_bInsertarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_bEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(agregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregarProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JButton bAgregarArticulo;
    private javax.swing.JButton bAgregarRubro;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tArticulo;
    private javax.swing.JTextField textArticulo;
    private javax.swing.JTextField textCodigoRubro;
    private javax.swing.JTextField textDescripcion;
    // End of variables declaration//GEN-END:variables
}