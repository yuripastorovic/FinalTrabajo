/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finaltrabajo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author yuripastorovic
 */
public class fin extends javax.swing.JFrame {

    /**
     * Creates new form fin
     */
    public fin() {
        initComponents();
        rfresh();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void rfresh() {
       
        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LabelTime.setText(utiles.getHoraActual());
                LabelTime.setForeground(new Color(187, 187, 187));
                LabelDate.setText(utiles.getFechaActual());
                LabelDate.setForeground(new Color(187, 187, 187));
            }
        });
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        PanelMenu = new javax.swing.JPanel();
        PanelBotonera = new javax.swing.JPanel();
        ButtonPrincipal1 = new javax.swing.JButton();
        ButtonPrincipal = new javax.swing.JButton();
        ButtonPrincipal2 = new javax.swing.JButton();
        ButtonPrincipal3 = new javax.swing.JButton();
        ButtonPrincipal4 = new javax.swing.JButton();
        PanelHeader = new javax.swing.JPanel();
        PanelHora = new javax.swing.JPanel();
        LabelTime = new javax.swing.JLabel();
        PanelFecha = new javax.swing.JPanel();
        LabelDate = new javax.swing.JLabel();
        PanelContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(221, 214, 204));

        PanelMenu.setBackground(new java.awt.Color(25, 34, 43));

        PanelBotonera.setBackground(new java.awt.Color(25, 34, 43));
        PanelBotonera.setForeground(new java.awt.Color(221, 214, 204));
        PanelBotonera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonPrincipal1.setBackground(new java.awt.Color(25, 34, 43));
        ButtonPrincipal1.setForeground(new java.awt.Color(221, 214, 204));
        ButtonPrincipal1.setText("Principal");
        ButtonPrincipal1.setBorder(null);
        ButtonPrincipal1.setBorderPainted(false);
        ButtonPrincipal1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelBotonera.add(ButtonPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 44));

        ButtonPrincipal.setBackground(new java.awt.Color(25, 34, 43));
        ButtonPrincipal.setForeground(new java.awt.Color(221, 214, 204));
        ButtonPrincipal.setText("Alumnos");
        ButtonPrincipal.setBorder(null);
        ButtonPrincipal.setBorderPainted(false);
        ButtonPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelBotonera.add(ButtonPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 260, 44));

        ButtonPrincipal2.setBackground(new java.awt.Color(25, 34, 43));
        ButtonPrincipal2.setForeground(new java.awt.Color(221, 214, 204));
        ButtonPrincipal2.setText("Cursos");
        ButtonPrincipal2.setBorder(null);
        ButtonPrincipal2.setBorderPainted(false);
        ButtonPrincipal2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelBotonera.add(ButtonPrincipal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 260, 44));

        ButtonPrincipal3.setBackground(new java.awt.Color(25, 34, 43));
        ButtonPrincipal3.setForeground(new java.awt.Color(221, 214, 204));
        ButtonPrincipal3.setText("Inscripciones");
        ButtonPrincipal3.setBorder(null);
        ButtonPrincipal3.setBorderPainted(false);
        ButtonPrincipal3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelBotonera.add(ButtonPrincipal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 260, 44));

        ButtonPrincipal4.setBackground(new java.awt.Color(25, 34, 43));
        ButtonPrincipal4.setForeground(new java.awt.Color(221, 214, 204));
        ButtonPrincipal4.setText("Ajustes");
        ButtonPrincipal4.setBorder(null);
        ButtonPrincipal4.setBorderPainted(false);
        ButtonPrincipal4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelBotonera.add(ButtonPrincipal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 260, 44));

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBotonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(PanelBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );

        PanelHeader.setBackground(new java.awt.Color(184, 67, 87));

        PanelHora.setBackground(new java.awt.Color(184, 67, 87));
        PanelHora.setForeground(new java.awt.Color(221, 214, 204));

        LabelTime.setBackground(new java.awt.Color(221, 214, 204));
        LabelTime.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N

        javax.swing.GroupLayout PanelHoraLayout = new javax.swing.GroupLayout(PanelHora);
        PanelHora.setLayout(PanelHoraLayout);
        PanelHoraLayout.setHorizontalGroup(
            PanelHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelTime, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );
        PanelHoraLayout.setVerticalGroup(
            PanelHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTime, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelFecha.setBackground(new java.awt.Color(184, 67, 87));
        PanelFecha.setForeground(new java.awt.Color(221, 214, 204));

        LabelDate.setBackground(new java.awt.Color(221, 214, 204));
        LabelDate.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N

        javax.swing.GroupLayout PanelFechaLayout = new javax.swing.GroupLayout(PanelFecha);
        PanelFecha.setLayout(PanelFechaLayout);
        PanelFechaLayout.setHorizontalGroup(
            PanelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelDate, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
        );
        PanelFechaLayout.setVerticalGroup(
            PanelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelDate, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelHeaderLayout = new javax.swing.GroupLayout(PanelHeader);
        PanelHeader.setLayout(PanelHeaderLayout);
        PanelHeaderLayout.setHorizontalGroup(
            PanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHeaderLayout.createSequentialGroup()
                .addGap(0, 202, Short.MAX_VALUE)
                .addComponent(PanelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelHeaderLayout.setVerticalGroup(
            PanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        PanelContenedor.setBackground(new java.awt.Color(51, 255, 0));

        javax.swing.GroupLayout PanelContenedorLayout = new javax.swing.GroupLayout(PanelContenedor);
        PanelContenedor.setLayout(PanelContenedorLayout);
        PanelContenedorLayout.setHorizontalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelContenedorLayout.setVerticalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(PanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(fin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonPrincipal;
    private javax.swing.JButton ButtonPrincipal1;
    private javax.swing.JButton ButtonPrincipal2;
    private javax.swing.JButton ButtonPrincipal3;
    private javax.swing.JButton ButtonPrincipal4;
    private javax.swing.JLabel LabelDate;
    private javax.swing.JLabel LabelTime;
    private javax.swing.JPanel PanelBotonera;
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JPanel PanelFecha;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel PanelHeader;
    private javax.swing.JPanel PanelHora;
    private javax.swing.JPanel PanelMenu;
    // End of variables declaration//GEN-END:variables
}
