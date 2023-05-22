/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finaltrabajo.vistas;

import finaltrabajo.BaseDatosAcademia;
import finaltrabajo.Herramientas;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author yuripastorovic
 */
public class AlumnosModificar2 extends javax.swing.JFrame {

    /**
     * Creates new form CursosModificar
     */
    private BaseDatosAcademia bd = new BaseDatosAcademia();
    private Herramientas h1 = new Herramientas();

    public AlumnosModificar2() {
        initComponents();
        comboBox1();
    }

    public JPanel getFondo() {
        JPanel fondo = PanelFondo;
        return fondo;
    }

    private void comboBox1() {
        String arrayString[] = bd.leerIdNombreApellidoAlumnosExistentes();
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
        Modificar_ = new javax.swing.JPanel();
        LabelButtonAlta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CBHoras1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        CampoApellido = new javax.swing.JTextField();
        CampoTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CampoCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        caja = new javax.swing.JPanel();
        texto = new javax.swing.JLabel();

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

        Modificar_.setBackground(new java.awt.Color(25, 34, 43));
        Modificar_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modificar_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modificar_Crear_alumno(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Modificar_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Modificar_MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Modificar_MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Modificar_MouseReleased(evt);
            }
        });

        LabelButtonAlta.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonAlta.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonAlta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonAlta.setText("MODIFICAR");

        javax.swing.GroupLayout Modificar_Layout = new javax.swing.GroupLayout(Modificar_);
        Modificar_.setLayout(Modificar_Layout);
        Modificar_Layout.setHorizontalGroup(
            Modificar_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_Layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(LabelButtonAlta))
        );
        Modificar_Layout.setVerticalGroup(
            Modificar_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonAlta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 34, 43));
        jLabel5.setText("SELECCIONE ALUMNO");

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

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 34, 43));
        jLabel4.setText("APELLIDO");

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

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 34, 43));
        jLabel6.setText("TELEFONO");

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

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(25, 34, 43));
        jLabel7.setText("CORREO");

        caja.setBackground(new java.awt.Color(221, 214, 204));

        texto.setBackground(new java.awt.Color(221, 214, 204));
        texto.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        texto.setForeground(new java.awt.Color(221, 214, 204));

        javax.swing.GroupLayout cajaLayout = new javax.swing.GroupLayout(caja);
        caja.setLayout(cajaLayout);
        cajaLayout.setHorizontalGroup(
            cajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cajaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cajaLayout.setVerticalGroup(
            cajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(texto, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(caja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBHoras1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(CampoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(CampoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Modificar_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBHoras1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(Modificar_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNombreMouseClicked
        CampoNombre.setText("");
        CampoNombre.setBackground(new Color(189, 146, 64));
        CampoNombre.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_CampoNombreMouseClicked

    private void Modificar_Crear_alumno(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modificar_Crear_alumno
        if (!(CBHoras1.getSelectedIndex() == -1
                || CampoNombre.getText().trim().equals("")
                || CampoApellido.getText().trim().equals("")
                || CampoCorreo.getText().trim().equals("")
                || CampoTelefono.getText().trim().equals("")
                || CampoNombre.getText().trim().equals("Introduzca nombre")
                || CampoApellido.getText().trim().equals("Introduzca apellido")
                || CampoCorreo.getText().trim().equals("Introduzca correo")
                || CampoTelefono.getText().trim().equals("Introduzca telefono"))) {

            String[] partes = CBHoras1.getSelectedItem().toString().split(",");
            String id = partes[0].trim();
            bd.modificarAlumno(Integer.valueOf(id), CampoNombre.getText(), CampoApellido.getText(), CampoCorreo.getText(), CampoTelefono.getText());
            h1.popUp1("MODIFICAR ALUMNO", "ALUMNO MODIFICADO", "OK", "favicon-32x32.png");
            comboBox1();
            CampoNombre.setText("Introduzca nombre");
            CampoApellido.setText("Introduzca apellido");
            CampoCorreo.setText("Introduzca correo");
            CampoTelefono.setText("Introduzca telefono");
            CampoNombre.setBackground(new Color(25, 34, 43));
            CampoNombre.setForeground(new Color(221, 214, 204));
            CampoApellido.setBackground(new Color(25, 34, 43));
            CampoApellido.setForeground(new Color(221, 214, 204));
            CampoCorreo.setBackground(new Color(25, 34, 43));
            CampoCorreo.setForeground(new Color(221, 214, 204));
            CampoTelefono.setBackground(new Color(25, 34, 43));
            CampoTelefono.setForeground(new Color(221, 214, 204));
            CBHoras1.setBackground(new Color(25, 34, 43));
            CBHoras1.setForeground(new Color(221, 214, 204));
        } else {
            h1.popUp1("MODIFICAR ALUMNO", "PORFAVOR ELIJA Y MODIFIQUE UN ALUMNO CORRECTAMENTE", "OK", "favicon-32x32.png");
        }

    }//GEN-LAST:event_Modificar_Crear_alumno

    private void Modificar_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modificar_MouseEntered
        Modificar_.setBackground(new Color(189, 146, 64));
        LabelButtonAlta.setForeground(new Color(25, 34, 43));
        caja.setBackground(new Color(25, 34, 43));
        texto.setForeground(new Color(221, 214, 204));
        texto.setText("PERMITE MODIFICAR LOS DATOS DE UN ALUMNO EN ACTIVO");
    }//GEN-LAST:event_Modificar_MouseEntered

    private void Modificar_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modificar_MouseExited
        Modificar_.setBackground(new Color(25, 34, 43));
        LabelButtonAlta.setForeground(new Color(221, 214, 204));
        caja.setBackground(new Color(221, 214, 204));
        texto.setText("");
    }//GEN-LAST:event_Modificar_MouseExited

    private void Modificar_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modificar_MousePressed
        Modificar_.setBackground(new Color(184, 67, 87));
        LabelButtonAlta.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_Modificar_MousePressed

    private void Modificar_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modificar_MouseReleased
        Modificar_.setBackground(new Color(189, 146, 64));
        LabelButtonAlta.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_Modificar_MouseReleased

    private void CBHoras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBHoras1ActionPerformed
        String[] partes = CBHoras1.getSelectedItem().toString().split(",");
        String id = partes[0].trim();
        String[] partesTF = bd.leerDatosUnAlumnoExistente(Integer.valueOf(id)).toString().split(",");

        CampoNombre.setText(partesTF[1]);
        CampoApellido.setText(partesTF[2]);
        CampoCorreo.setText(partesTF[3]);
        CampoTelefono.setText(partesTF[4]);

    }//GEN-LAST:event_CBHoras1ActionPerformed

    private void CampoApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoApellidoMouseClicked
        CampoApellido.setText("");
        CampoApellido.setBackground(new Color(189, 146, 64));
        CampoApellido.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_CampoApellidoMouseClicked

    private void CampoTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoTelefonoMouseClicked
        CampoTelefono.setText("");
        CampoTelefono.setBackground(new Color(189, 146, 64));
        CampoTelefono.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_CampoTelefonoMouseClicked

    private void CampoCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoCorreoMouseClicked
        CampoCorreo.setText("");
        CampoCorreo.setBackground(new Color(189, 146, 64));
        CampoCorreo.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_CampoCorreoMouseClicked

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
            java.util.logging.Logger.getLogger(AlumnosModificar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnosModificar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnosModificar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnosModificar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnosModificar2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBHoras1;
    private javax.swing.JTextField CampoApellido;
    private javax.swing.JTextField CampoCorreo;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JTextField CampoTelefono;
    private javax.swing.JLabel LabelButtonAlta;
    private javax.swing.JPanel Modificar_;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel caja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
