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
public class Ajustes extends javax.swing.JFrame {

    /**
     * Creates new form Ajustes
     */
    public Ajustes() {
        initComponents();
    }

    private void showPanel(JPanel panel) {
        panel.setSize(this.contenedor.getWidth(), this.contenedor.getHeight());
        panel.setLocation(0, 0);
        this.contenedor.removeAll();
        this.contenedor.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        this.contenedor.revalidate();
        this.contenedor.repaint();
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
        contenedor = new javax.swing.JPanel();
        settings_img = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PanelFaldon = new javax.swing.JPanel();
        Ajustes_bbdd = new javax.swing.JPanel();
        LabelButtonModificar4 = new javax.swing.JLabel();
        Ajustes_local = new javax.swing.JPanel();
        LabelButtonModificar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(184, 67, 87));

        contenedor.setBackground(new java.awt.Color(221, 214, 204));

        settings_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaltrabajo/vistas/icon/setting_img.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaltrabajo/vistas/icon/ajustes_txt.png"))); // NOI18N

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(settings_img)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(41, 41, 41))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(settings_img, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        PanelFaldon.setBackground(new java.awt.Color(25, 34, 43));

        Ajustes_bbdd.setBackground(new java.awt.Color(25, 34, 43));
        Ajustes_bbdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ajustes_bbddBuscar_alum(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ajustes_bbddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ajustes_bbddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Ajustes_bbddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Ajustes_bbddMouseReleased(evt);
            }
        });

        LabelButtonModificar4.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonModificar4.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonModificar4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonModificar4.setText("BASE DE DATOS");

        javax.swing.GroupLayout Ajustes_bbddLayout = new javax.swing.GroupLayout(Ajustes_bbdd);
        Ajustes_bbdd.setLayout(Ajustes_bbddLayout);
        Ajustes_bbddLayout.setHorizontalGroup(
            Ajustes_bbddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        Ajustes_bbddLayout.setVerticalGroup(
            Ajustes_bbddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        Ajustes_local.setBackground(new java.awt.Color(25, 34, 43));
        Ajustes_local.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ajustes_localBaja_alum(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ajustes_localMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ajustes_localMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Ajustes_localMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Ajustes_localMouseReleased(evt);
            }
        });

        LabelButtonModificar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonModificar.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonModificar.setText("COPIAS LOCALES");

        javax.swing.GroupLayout Ajustes_localLayout = new javax.swing.GroupLayout(Ajustes_local);
        Ajustes_local.setLayout(Ajustes_localLayout);
        Ajustes_localLayout.setHorizontalGroup(
            Ajustes_localLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        Ajustes_localLayout.setVerticalGroup(
            Ajustes_localLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelFaldonLayout = new javax.swing.GroupLayout(PanelFaldon);
        PanelFaldon.setLayout(PanelFaldonLayout);
        PanelFaldonLayout.setHorizontalGroup(
            PanelFaldonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFaldonLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(Ajustes_bbdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addComponent(Ajustes_local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelFaldonLayout.setVerticalGroup(
            PanelFaldonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFaldonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelFaldonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ajustes_bbdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ajustes_local, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelFaldon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                .addComponent(PanelFaldon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ajustes_bbddBuscar_alum(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ajustes_bbddBuscar_alum
        AjustesBBDD bbb = new AjustesBBDD();
        showPanel(bbb.getFondo());
    }//GEN-LAST:event_Ajustes_bbddBuscar_alum

    private void Ajustes_bbddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ajustes_bbddMouseEntered
        // TODO add your handling code here:
        Ajustes_bbdd.setBackground(new Color(189, 146, 64));
        LabelButtonModificar4.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_Ajustes_bbddMouseEntered

    private void Ajustes_bbddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ajustes_bbddMouseExited
        Ajustes_bbdd.setBackground(new Color(25, 34, 43));
        LabelButtonModificar4.setForeground(new Color(221, 214, 204));
    }//GEN-LAST:event_Ajustes_bbddMouseExited

    private void Ajustes_bbddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ajustes_bbddMousePressed
        Ajustes_bbdd.setBackground(new Color(184, 67, 87));
        LabelButtonModificar4.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_Ajustes_bbddMousePressed

    private void Ajustes_bbddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ajustes_bbddMouseReleased
        Ajustes_bbdd.setBackground(new Color(189, 146, 64));
        LabelButtonModificar4.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_Ajustes_bbddMouseReleased

    private void Ajustes_localBaja_alum(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ajustes_localBaja_alum
        AjustesLocal bbb = new AjustesLocal();
        showPanel(bbb.getFondo());
    }//GEN-LAST:event_Ajustes_localBaja_alum

    private void Ajustes_localMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ajustes_localMouseEntered
        Ajustes_local.setBackground(new Color(189, 146, 64));
        LabelButtonModificar.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_Ajustes_localMouseEntered

    private void Ajustes_localMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ajustes_localMouseExited
        Ajustes_local.setBackground(new Color(25, 34, 43));
        LabelButtonModificar.setForeground(new Color(221, 214, 204));
    }//GEN-LAST:event_Ajustes_localMouseExited

    private void Ajustes_localMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ajustes_localMousePressed
        Ajustes_local.setBackground(new Color(184, 67, 87));
        LabelButtonModificar.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_Ajustes_localMousePressed

    private void Ajustes_localMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ajustes_localMouseReleased
        Ajustes_local.setBackground(new Color(189, 146, 64));
        LabelButtonModificar.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_Ajustes_localMouseReleased

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
            java.util.logging.Logger.getLogger(Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ajustes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ajustes_bbdd;
    private javax.swing.JPanel Ajustes_local;
    private javax.swing.JLabel LabelButtonModificar;
    private javax.swing.JLabel LabelButtonModificar4;
    private javax.swing.JPanel PanelFaldon;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel settings_img;
    // End of variables declaration//GEN-END:variables

}
