/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lycan.apptienda.vistas.gui;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import lycan.apptienda.entidades.Usuario;

/**
 *
 * @author SANTIAGO
 */
public class VentanaOperaciones extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaOperaciones() {
        initComponents();
        
        //Establecer color blanco de fondo
        this.getContentPane().setBackground(Color.WHITE);
        VentanaPrincipal frm = new VentanaPrincipal();
        String nombre = frm.getNombre();
        lbNombre.setText(nombre);
        
        //Centrar la ventana
        this.setLocationRelativeTo(null);
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
        lbCabecera = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        btNuevoCliente = new javax.swing.JButton();
        btNuevaCuenta = new javax.swing.JButton();
        btNuevaCompra = new javax.swing.JButton();
        lbNombre1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 27, 110));

        lbCabecera.setBackground(new java.awt.Color(0, 27, 110));
        lbCabecera.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        lbCabecera.setForeground(new java.awt.Color(255, 255, 255));
        lbCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCabecera.setText("HAGA SUS OPERACIONES AQUÍ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCabecera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lbNombre.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lbNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNombre.setText("Nombre");
        lbNombre.setToolTipText("");

        btNuevoCliente.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        btNuevoCliente.setForeground(new java.awt.Color(0, 27, 110));
        btNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lycan/apptienda/vistas/gui/iconos/new_client64px.png"))); // NOI18N
        btNuevoCliente.setText("Nuevo Cliente");
        btNuevoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 209, 209)));
        btNuevoCliente.setContentAreaFilled(false);
        btNuevoCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNuevoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btNuevoClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btNuevoClienteMouseExited(evt);
            }
        });
        btNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoClienteActionPerformed(evt);
            }
        });

        btNuevaCuenta.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        btNuevaCuenta.setForeground(new java.awt.Color(0, 27, 110));
        btNuevaCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lycan/apptienda/vistas/gui/iconos/new_bill64px.png"))); // NOI18N
        btNuevaCuenta.setText("Nueva Cuenta");
        btNuevaCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 209, 209)));
        btNuevaCuenta.setContentAreaFilled(false);
        btNuevaCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNuevaCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btNuevaCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btNuevaCuentaMouseExited(evt);
            }
        });
        btNuevaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevaCuentaActionPerformed(evt);
            }
        });

        btNuevaCompra.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        btNuevaCompra.setForeground(new java.awt.Color(0, 27, 110));
        btNuevaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lycan/apptienda/vistas/gui/iconos/nueva_compra64px.png"))); // NOI18N
        btNuevaCompra.setText("Nueva Compra");
        btNuevaCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 209, 209)));
        btNuevaCompra.setContentAreaFilled(false);
        btNuevaCompra.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNuevaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btNuevaCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btNuevaCompraMouseExited(evt);
            }
        });

        lbNombre1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        lbNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNombre1.setText("Sesión de");
        lbNombre1.setToolTipText("");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lycan/apptienda/vistas/gui/iconos/Salir24px.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(lbNombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(btNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btNuevaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btNuevaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNuevaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNuevaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoClienteActionPerformed
        VentanaRegistrarCliente frm = new VentanaRegistrarCliente(this,true);
        frm.setVisible(true);
        
    }//GEN-LAST:event_btNuevoClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        VentanaPrincipal frm = new VentanaPrincipal();
        frm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btNuevaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevaCuentaActionPerformed
        VentanaRegistrarCuenta frm = new VentanaRegistrarCuenta(this, true);
        frm.setVisible(true);
        
    }//GEN-LAST:event_btNuevaCuentaActionPerformed

    private void btNuevoClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNuevoClienteMouseEntered
        btNuevoCliente.setOpaque(true);
        btNuevoCliente.setBackground(new Color(209,209,209));
    }//GEN-LAST:event_btNuevoClienteMouseEntered

    private void btNuevoClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNuevoClienteMouseExited
        btNuevoCliente.setBackground(Color.WHITE);
    }//GEN-LAST:event_btNuevoClienteMouseExited

    private void btNuevaCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNuevaCuentaMouseEntered
        btNuevaCuenta.setOpaque(true);
        btNuevaCuenta.setBackground(new Color(209,209,209));
    }//GEN-LAST:event_btNuevaCuentaMouseEntered

    private void btNuevaCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNuevaCuentaMouseExited
        btNuevaCuenta.setBackground(Color.WHITE);
    }//GEN-LAST:event_btNuevaCuentaMouseExited

    private void btNuevaCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNuevaCompraMouseEntered
        btNuevaCompra.setOpaque(true);
        btNuevaCompra.setBackground(new Color(209,209,209));
    }//GEN-LAST:event_btNuevaCompraMouseEntered

    private void btNuevaCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNuevaCompraMouseExited
        btNuevaCompra.setBackground(Color.WHITE);
    }//GEN-LAST:event_btNuevaCompraMouseExited

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
            java.util.logging.Logger.getLogger(VentanaOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaOperaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNuevaCompra;
    private javax.swing.JButton btNuevaCuenta;
    private javax.swing.JButton btNuevoCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCabecera;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombre1;
    // End of variables declaration//GEN-END:variables
}