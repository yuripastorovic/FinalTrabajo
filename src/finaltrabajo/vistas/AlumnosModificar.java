/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finaltrabajo.vistas;

import finaltrabajo.BaseDatosAcademia;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author yuripastorovic
 */
public class AlumnosModificar extends javax.swing.JFrame {

    /**
     * Creates new form AlumnosModificar
     */
    private BaseDatosAcademia bd = new BaseDatosAcademia();
    public AlumnosModificar() {
        initComponents();
    }

    public JPanel getFondo() {
        JPanel fondo = PanelFondo;
        return fondo;
    }
    
    private void comboBox1(){
        String arrayString[]=bd.leerIdNombreApellidoAlumnosExistentes();
        CBHoras1.setModel(new javax.swing.DefaultComboBoxModel<>(arrayString));
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
        jLabel1 = new javax.swing.JLabel();
        CampoNombre = new javax.swing.JTextField();
        CampoApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CampoCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CampoTelefono = new javax.swing.JTextField();
        ButtonModificar = new javax.swing.JPanel();
        LabelButtonModificar = new javax.swing.JLabel();
        CBHoras1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(221, 214, 204));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 34, 43));
        jLabel1.setText("NOMBRE");

        CampoNombre.setBackground(new java.awt.Color(25, 34, 43));
        CampoNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CampoNombre.setForeground(new java.awt.Color(196, 190, 181));
        CampoNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoNombre.setText("Introduzca nombre");
        CampoNombre.setBorder(null);
        CampoNombre.setSelectedTextColor(new java.awt.Color(25, 34, 43));
        CampoNombre.setSelectionColor(new java.awt.Color(184, 67, 87));
        CampoNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampoNombreMouseClicked(evt);
            }
        });

        CampoApellido.setBackground(new java.awt.Color(25, 34, 43));
        CampoApellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CampoApellido.setForeground(new java.awt.Color(196, 190, 181));
        CampoApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoApellido.setText("Introduzca apellido");
        CampoApellido.setBorder(null);
        CampoApellido.setSelectedTextColor(new java.awt.Color(25, 34, 43));
        CampoApellido.setSelectionColor(new java.awt.Color(184, 67, 87));
        CampoApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampoApellidoMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 34, 43));
        jLabel2.setText("APELLIDO");

        CampoCorreo.setBackground(new java.awt.Color(25, 34, 43));
        CampoCorreo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CampoCorreo.setForeground(new java.awt.Color(196, 190, 181));
        CampoCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoCorreo.setText("Introduzca correo");
        CampoCorreo.setBorder(null);
        CampoCorreo.setSelectedTextColor(new java.awt.Color(25, 34, 43));
        CampoCorreo.setSelectionColor(new java.awt.Color(184, 67, 87));
        CampoCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampoCorreoMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 34, 43));
        jLabel3.setText("CORREO");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 34, 43));
        jLabel4.setText("TELEFONO");

        CampoTelefono.setBackground(new java.awt.Color(25, 34, 43));
        CampoTelefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CampoTelefono.setForeground(new java.awt.Color(196, 190, 181));
        CampoTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoTelefono.setText("Introduzca telefono");
        CampoTelefono.setBorder(null);
        CampoTelefono.setSelectedTextColor(new java.awt.Color(25, 34, 43));
        CampoTelefono.setSelectionColor(new java.awt.Color(184, 67, 87));
        CampoTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampoTelefonoMouseClicked(evt);
            }
        });

        ButtonModificar.setBackground(new java.awt.Color(25, 34, 43));
        ButtonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modificar_press(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonModificarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonModificarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonModificarMouseReleased(evt);
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
            .addComponent(LabelButtonModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        CBHoras1.setBackground(new java.awt.Color(25, 34, 43));
        CBHoras1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CBHoras1.setForeground(new java.awt.Color(221, 214, 204));
        CBHoras1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBHoras1.setSelectedIndex(-1);
        CBHoras1.setBorder(null);
        CBHoras1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CBHoras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBHoras1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 34, 43));
        jLabel5.setText("SELECCIONE ALUMNO");

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBHoras1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(CampoTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(CampoCorreo)
                    .addComponent(CampoApellido)
                    .addComponent(CampoNombre))
                .addGap(133, 133, 133))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBHoras1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(ButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void CampoNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNombreMouseClicked
        CampoNombre.setText("");
    }//GEN-LAST:event_CampoNombreMouseClicked

    private void CampoApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoApellidoMouseClicked
        CampoApellido.setText("");
    }//GEN-LAST:event_CampoApellidoMouseClicked

    private void CampoCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoCorreoMouseClicked
        CampoCorreo.setText("");
    }//GEN-LAST:event_CampoCorreoMouseClicked

    private void CampoTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoTelefonoMouseClicked
        CampoTelefono.setText("");
    }//GEN-LAST:event_CampoTelefonoMouseClicked

    private void Modificar_press(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modificar_press
        String[] partes= CBHoras1.getSelectedObjects().toString().split(",");
        String id = partes[0].trim();
        bd.modificarAlumno(Integer.valueOf(id), CampoNombre.getText(), CampoApellido.getText(), CampoCorreo.getText(), CampoTelefono.getText());
        
        CampoNombre.setText("");
        CampoApellido.setText("");
        CampoCorreo.setText("");
        CampoTelefono.setText("");

    }//GEN-LAST:event_Modificar_press

    private void ButtonModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonModificarMouseEntered
        ButtonModificar.setBackground(new Color(189, 146, 64));
        LabelButtonModificar.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ButtonModificarMouseEntered

    private void ButtonModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonModificarMouseExited
        ButtonModificar.setBackground(new Color(25, 34, 43));
        LabelButtonModificar.setForeground(new Color(221, 214, 204));
    }//GEN-LAST:event_ButtonModificarMouseExited

    private void ButtonModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonModificarMousePressed
        ButtonModificar.setBackground(new Color(184, 67, 87));
        LabelButtonModificar.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_ButtonModificarMousePressed

    private void ButtonModificarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonModificarMouseReleased
        ButtonModificar.setBackground(new Color(189, 146, 64));
        LabelButtonModificar.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ButtonModificarMouseReleased

    private void CBHoras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBHoras1ActionPerformed
        // TODO add your handling code here:
        String[] partes= CBHoras1.getSelectedObjects().toString().split(",");
        String id = partes[0].trim();
        String[] partesTF = bd.leerDatosUnAlumnoExistente(Integer.valueOf(id)).toString().split(",");
        CampoNombre.setText(partesTF[1]);
        CampoApellido.setText(partesTF[2]);
        CampoCorreo.setText(partesTF[3]);
        CampoTelefono.setText(partesTF[4]);
    }//GEN-LAST:event_CBHoras1ActionPerformed

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
            java.util.logging.Logger.getLogger(AlumnosModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnosModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnosModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnosModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnosModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonModificar;
    private javax.swing.JComboBox<String> CBHoras1;
    private javax.swing.JTextField CampoApellido;
    private javax.swing.JTextField CampoCorreo;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JTextField CampoTelefono;
    private javax.swing.JLabel LabelButtonModificar;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
