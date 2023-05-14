/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finaltrabajo.vistas;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author yuripastorovic
 */
public class AjustesBBDD extends javax.swing.JFrame {

    /**
     * Creates new form AjustesBBDD
     */
    public AjustesBBDD() {
        initComponents();
    }

    public JPanel getFondo() {
        JPanel fondo = PanelFondo;
        return fondo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        ButtonModificar = new javax.swing.JPanel();
        LabelButtonModificar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ButtonModificar1 = new javax.swing.JPanel();
        LabelButtonModificar1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        CampoPuerto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(221, 214, 204));

        ButtonModificar.setBackground(new java.awt.Color(25, 34, 43));
        ButtonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonModificarModificar_press(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonModificarMouseExited(evt);
            }
        });

        LabelButtonModificar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonModificar.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonModificar.setText("MODIFICAR");

        javax.swing.GroupLayout ButtonModificarLayout = new javax.swing.GroupLayout(ButtonModificar);
        ButtonModificar.setLayout(ButtonModificarLayout);
        ButtonModificarLayout.setHorizontalGroup(
            ButtonModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonModificarLayout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(LabelButtonModificar))
        );
        ButtonModificarLayout.setVerticalGroup(
            ButtonModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(184, 67, 87));

        jPanel2.setBackground(new java.awt.Color(189, 146, 64));

        ButtonModificar1.setBackground(new java.awt.Color(25, 34, 43));
        ButtonModificar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonModificar1Modificar_press(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonModificar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonModificar1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonModificar1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonModificar1MouseReleased(evt);
            }
        });

        LabelButtonModificar1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonModificar1.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonModificar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonModificar1.setText("CONECTAR");

        javax.swing.GroupLayout ButtonModificar1Layout = new javax.swing.GroupLayout(ButtonModificar1);
        ButtonModificar1.setLayout(ButtonModificar1Layout);
        ButtonModificar1Layout.setHorizontalGroup(
            ButtonModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonModificar1Layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(LabelButtonModificar1))
        );
        ButtonModificar1Layout.setVerticalGroup(
            ButtonModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 34, 43));
        jLabel1.setText("<html><body>Este programa esta conectado<br>\ncon una base de datos MriaDB.<br>\nAsegurese de que ha encendido<br>\nla base de datos, antes de encender<br> \nel programa.<br>\nAsegurese de que el puerto de <br>\nconexion entre la aplicacion y <br>\nla de datos es el mismo \n</body></html>");

        nameLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(25, 34, 43));
        nameLabel.setText("PUERTO CONEXIÓN XAPPM");

        CampoPuerto.setBackground(new java.awt.Color(25, 34, 43));
        CampoPuerto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CampoPuerto.setForeground(new java.awt.Color(196, 190, 181));
        CampoPuerto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoPuerto.setText("Introduzca Puerto");
        CampoPuerto.setBorder(null);
        CampoPuerto.setSelectedTextColor(new java.awt.Color(25, 34, 43));
        CampoPuerto.setSelectionColor(new java.awt.Color(184, 67, 87));
        CampoPuerto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampoPuertoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(ButtonModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(ButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 757, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonModificarModificar_press(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonModificarModificar_press

    }//GEN-LAST:event_ButtonModificarModificar_press

    private void ButtonModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonModificarMouseEntered
        ButtonModificar.setBackground(new Color(189, 146, 64));
        LabelButtonModificar.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ButtonModificarMouseEntered

    private void ButtonModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonModificarMouseExited
        ButtonModificar.setBackground(new Color(25, 34, 43));
        LabelButtonModificar.setForeground(new Color(221, 214, 204));
    }//GEN-LAST:event_ButtonModificarMouseExited

    private void ButtonModificar1Modificar_press(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonModificar1Modificar_press
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonModificar1Modificar_press

    private void ButtonModificar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonModificar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonModificar1MouseEntered

    private void ButtonModificar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonModificar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonModificar1MouseExited

    private void ButtonModificar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonModificar1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonModificar1MousePressed

    private void ButtonModificar1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonModificar1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonModificar1MouseReleased

    private void CampoPuertoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoPuertoMouseClicked
        CampoPuerto.setText("");
        CampoPuerto.setBackground(new Color(25, 34, 43));
        CampoPuerto.setForeground(new Color(189, 146, 64));

    }//GEN-LAST:event_CampoPuertoMouseClicked

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
            java.util.logging.Logger.getLogger(AjustesBBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjustesBBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjustesBBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjustesBBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjustesBBDD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonModificar;
    private javax.swing.JPanel ButtonModificar1;
    private javax.swing.JTextField CampoPuerto;
    private javax.swing.JLabel LabelButtonModificar;
    private javax.swing.JLabel LabelButtonModificar1;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
}