/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Requerimiento_1;
import modelo.Requerimiento_2;
import modelo.Requerimiento_3;
import static vista.VistaRequerimientos.controlador;

/**
 *
 * @author Laura
 */
public class ProyectoConstrucccionGui extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form ProyectoConstrucccionGui
     * @throws java.sql.SQLException
     */
    public ProyectoConstrucccionGui() throws SQLException {
        initComponents();
        actualizarTabla();
        actualizarTabla2();
        actualizarTabla3();
     }
    
    private void actualizarTabla() throws SQLException {
         
        ArrayList<Requerimiento_1> requerimiento1 = controlador.consultarRequerimiento1();

        DefaultTableModel modelo = (DefaultTableModel) jTConsulta1.getModel();
        //recorre cada una de los registros obtenidos en la consulta retornaUsuario

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        int numcols = modelo.getColumnCount();
        for (Requerimiento_1 requerimiento : requerimiento1) {
            Object[] fila = new Object[numcols];
          
            fila[0] = requerimiento.getConstructora();
            fila[1] = requerimiento.getCiudad();
            fila[2] = requerimiento.getBanco();
            fila[3] = requerimiento.getPorcentaje();
            fila[4] = requerimiento.getClasificacion();
            fila[5] = requerimiento.getFecha();
          

            modelo.addRow(fila);
            //ExcelAdapter myAd = new ExcelAdapter(jTableAF);

        }

    }
    
    private void actualizarTabla2() throws SQLException {
         
        ArrayList<Requerimiento_2> requerimiento2 = controlador.consultarRequerimiento2();

        DefaultTableModel modelo = (DefaultTableModel) jTConsulta2.getModel();
        //recorre cada una de los registros obtenidos en la consulta retornaUsuario

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        int numcols = modelo.getColumnCount();
        for (Requerimiento_2 requerimiento : requerimiento2) {
            Object[] fila = new Object[numcols];
          
            fila[0] = requerimiento.getProveedor();
            fila[1] = requerimiento.getConstructora();
            fila[2] = requerimiento.getPagado();
          

            modelo.addRow(fila);
            //ExcelAdapter myAd = new ExcelAdapter(jTableAF);

        }

    }
    
    private void actualizarTabla3() throws SQLException {
         
        ArrayList<Requerimiento_3> requerimiento3 = controlador.consultarRequerimiento3();

        DefaultTableModel modelo = (DefaultTableModel) jTConsulta3.getModel();
        //recorre cada una de los registros obtenidos en la consulta retornaUsuario

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        int numcols = modelo.getColumnCount();
        for (Requerimiento_3 requerimiento : requerimiento3) {
            Object[] fila = new Object[numcols];
          
            fila[0] = requerimiento.getCargo();
            fila[1] = requerimiento.getMaxSalario();

            modelo.addRow(fila);
            //ExcelAdapter myAd = new ExcelAdapter(jTableAF);

        }

    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTConsultas = new javax.swing.JTabbedPane();
        jPConsulta1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTConsulta1 = new javax.swing.JTable();
        jPConsulta2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTConsulta2 = new javax.swing.JTable();
        jPConsulta3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTConsulta3 = new javax.swing.JTable();
        jLImagen = new javax.swing.JLabel();
        jMOpciones = new javax.swing.JMenuBar();
        jMArchivo = new javax.swing.JMenu();
        jMExit = new javax.swing.JMenuItem();
        jMReportes = new javax.swing.JMenu();
        jMConsulta1 = new javax.swing.JMenuItem();
        jMConsulta2 = new javax.swing.JMenuItem();
        jMConsulta3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROYECTO CAMACOL");
        setBackground(new java.awt.Color(153, 153, 255));
        setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        setForeground(new java.awt.Color(204, 204, 255));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        jTConsultas.setBackground(new java.awt.Color(204, 204, 255));
        jTConsultas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPConsulta1.setLayout(new java.awt.BorderLayout());

        jTConsulta1.setAutoCreateRowSorter(true);
        jTConsulta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CONSTUCTORA", "CIUDAD", "BANCO", "PORCENTAJE", "CLASIFICACIÓN", "FECHA DE INICIO"
            }
        ));
        jTConsulta1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTConsulta1.setGridColor(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(jTConsulta1);
        if (jTConsulta1.getColumnModel().getColumnCount() > 0) {
            jTConsulta1.getColumnModel().getColumn(0).setResizable(false);
            jTConsulta1.getColumnModel().getColumn(1).setResizable(false);
            jTConsulta1.getColumnModel().getColumn(2).setResizable(false);
            jTConsulta1.getColumnModel().getColumn(3).setResizable(false);
            jTConsulta1.getColumnModel().getColumn(4).setResizable(false);
            jTConsulta1.getColumnModel().getColumn(5).setResizable(false);
        }

        jPConsulta1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jTConsultas.addTab("PROYECTOS", jPConsulta1);

        jPConsulta2.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        jTConsulta2.setAutoCreateRowSorter(true);
        jTConsulta2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
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
                "PROVEEDOR", "CONSTRUCTORA", "CANCELADO"
            }
        ));
        jTConsulta2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTConsulta2.setGridColor(new java.awt.Color(102, 153, 255));
        jTConsulta2.setSelectionForeground(new java.awt.Color(204, 204, 255));
        jScrollPane2.setViewportView(jTConsulta2);
        if (jTConsulta2.getColumnModel().getColumnCount() > 0) {
            jTConsulta2.getColumnModel().getColumn(0).setResizable(false);
            jTConsulta2.getColumnModel().getColumn(1).setResizable(false);
            jTConsulta2.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel3.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPConsulta2.add(jPanel3, java.awt.BorderLayout.CENTER);

        jTConsultas.addTab("COMPRAS", jPConsulta2);

        jPConsulta3.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.BorderLayout());

        jTConsulta3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CARGO", "SALARIO"
            }
        ));
        jScrollPane3.setViewportView(jTConsulta3);

        jPanel6.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPConsulta3.add(jPanel6, java.awt.BorderLayout.CENTER);

        jTConsultas.addTab("LÍDERES", jPConsulta3);

        getContentPane().add(jTConsultas);
        jTConsultas.setBounds(10, 10, 700, 450);

        jLImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/construct.jpg"))); // NOI18N
        getContentPane().add(jLImagen);
        jLImagen.setBounds(710, 310, 166, 190);

        jMOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMOpciones.setOpaque(false);

        jMArchivo.setText("ARCHIVO");

        jMExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMExit.setText("SALIR");
        jMExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMExitActionPerformed(evt);
            }
        });
        jMArchivo.add(jMExit);

        jMOpciones.add(jMArchivo);

        jMReportes.setText("REPORTES");

        jMConsulta1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMConsulta1.setText("PROYECTOS");
        jMConsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsulta1ActionPerformed1(evt);
            }
        });
        jMReportes.add(jMConsulta1);

        jMConsulta2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMConsulta2.setText("COMPRAS");
        jMConsulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsulta2ActionPerformed(evt);
            }
        });
        jMReportes.add(jMConsulta2);

        jMConsulta3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMConsulta3.setText("LÍDERES");
        jMConsulta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsulta3ActionPerformed(evt);
            }
        });
        jMReportes.add(jMConsulta3);

        jMOpciones.add(jMReportes);

        setJMenuBar(jMOpciones);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMConsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsulta1ActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jMConsulta1ActionPerformed

    private void jMExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMExitActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿DESEA CERRAR LA APLICACIÓN?", 
             getTitle(), JOptionPane.YES_NO_OPTION,
             JOptionPane.CLOSED_OPTION) == JOptionPane.YES_OPTION) {
         
         dispose();
     
     }
    }//GEN-LAST:event_jMExitActionPerformed

    private void jMConsulta1ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsulta1ActionPerformed1
        jTConsultas.setSelectedIndex(0);
    }//GEN-LAST:event_jMConsulta1ActionPerformed1

    private void jMConsulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsulta2ActionPerformed
        jTConsultas.setSelectedIndex(1);
    }//GEN-LAST:event_jMConsulta2ActionPerformed

    private void jMConsulta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsulta3ActionPerformed
        jTConsultas.setSelectedIndex(2);
    }//GEN-LAST:event_jMConsulta3ActionPerformed

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
            java.util.logging.Logger.getLogger(ProyectoConstrucccionGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoConstrucccionGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoConstrucccionGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoConstrucccionGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ProyectoConstrucccionGui().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ProyectoConstrucccionGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLImagen;
    private javax.swing.JMenu jMArchivo;
    private javax.swing.JMenuItem jMConsulta1;
    private javax.swing.JMenuItem jMConsulta2;
    private javax.swing.JMenuItem jMConsulta3;
    private javax.swing.JMenuItem jMExit;
    private javax.swing.JMenuBar jMOpciones;
    private javax.swing.JMenu jMReportes;
    private javax.swing.JPanel jPConsulta1;
    private javax.swing.JPanel jPConsulta2;
    private javax.swing.JPanel jPConsulta3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTConsulta1;
    private javax.swing.JTable jTConsulta2;
    private javax.swing.JTable jTConsulta3;
    private javax.swing.JTabbedPane jTConsultas;
    // End of variables declaration//GEN-END:variables
}
