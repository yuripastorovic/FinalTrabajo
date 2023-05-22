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
 * @author Jorge & Miguel
 */
public class AlumnosAlta extends javax.swing.JFrame {

    private BaseDatosAcademia bd = new BaseDatosAcademia();
    private Herramientas h1 = new Herramientas();

    public AlumnosAlta() {
        initComponents();
    }

    /**
     * Permite devolver el panel de fondo que contiene todos los componenetes
     * del JFrame
     *
     * @return fondo
     */
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
        jLabel1 = new javax.swing.JLabel();
        CampoNombre = new javax.swing.JTextField();
        CampoApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CampoCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CampoTelefono = new javax.swing.JTextField();
        ButtonAlta = new javax.swing.JPanel();
        LabelButtonAlta = new javax.swing.JLabel();
        caja = new javax.swing.JPanel();
        texto = new javax.swing.JLabel();
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

        ButtonAlta.setBackground(new java.awt.Color(25, 34, 43));
        ButtonAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Crear_alumno(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonAltaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonAltaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonAltaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonAltaMouseReleased(evt);
            }
        });

        LabelButtonAlta.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonAlta.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonAlta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonAlta.setText("AGRGAR ALUMNO");

        javax.swing.GroupLayout ButtonAltaLayout = new javax.swing.GroupLayout(ButtonAlta);
        ButtonAlta.setLayout(ButtonAltaLayout);
        ButtonAltaLayout.setHorizontalGroup(
            ButtonAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        ButtonAltaLayout.setVerticalGroup(
            ButtonAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonAlta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

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
                .addComponent(texto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cajaLayout.setVerticalGroup(
            cajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(texto, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaltrabajo/vistas/icon/alum.png"))); // NOI18N

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addComponent(CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
                        .addComponent(ButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(caja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     * borrando el textField
     *
     * @param evt
     */
    private void CampoNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNombreMouseClicked
        CampoNombre.setText("");
        CampoNombre.setBackground(new Color(189, 146, 64));
        CampoNombre.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_CampoNombreMouseClicked
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     * borrando el textField
     *
     * @param evt
     */
    private void CampoApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoApellidoMouseClicked
        CampoApellido.setText("");
        CampoApellido.setBackground(new Color(189, 146, 64));
        CampoApellido.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_CampoApellidoMouseClicked
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     * borrando el textField
     *
     * @param evt
     */
    private void CampoCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoCorreoMouseClicked
        CampoCorreo.setText("");
        CampoCorreo.setBackground(new Color(189, 146, 64));
        CampoCorreo.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_CampoCorreoMouseClicked
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     * borrando el textField
     *
     * @param evt
     */
    private void CampoTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoTelefonoMouseClicked
        CampoTelefono.setText("");
        CampoTelefono.setBackground(new Color(189, 146, 64));
        CampoTelefono.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_CampoTelefonoMouseClicked
    /**
     * Permite la creaccion de un nuevo alumno, un alumno esgresado. tambien
     * verifica que la introduccion de los datos es corracta
     *
     * @param evt
     */
    private void Crear_alumno(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Crear_alumno
        if (!(CampoNombre.getText().trim().equals("")
                || CampoApellido.getText().trim().equals("")
                || CampoCorreo.getText().trim().equals("")
                || CampoTelefono.getText().trim().equals("")
                || CampoNombre.getText().trim().equals("Introduzca nombre")
                || CampoApellido.getText().trim().equals("Introduzca apellido")
                || CampoCorreo.getText().trim().equals("Introduzca correo")
                || CampoTelefono.getText().trim().equals("Introduzca telefono")
                || CampoApellido.getText().trim().contains(",")
                || CampoCorreo.getText().trim().contains(",")
                || CampoTelefono.getText().trim().contains(","))
                && h1.comprobarNumeros(CampoTelefono.getText().trim())
                && h1.comprobarSinEspacios(CampoNombre.getText().trim())
                && h1.comprobarConEspacios(CampoApellido.getText().trim())
                && CampoCorreo.getText().trim().contains("@")) {
            if (!bd.confirmarAlumno(CampoNombre.getText(), CampoApellido.getText(), CampoCorreo.getText(), CampoTelefono.getText())) {
                bd.insertarAlumno(CampoNombre.getText(), CampoApellido.getText(), CampoCorreo.getText(), CampoTelefono.getText());
                h1.popUp1("ALTA ALUMNO", "ALUMNO CREADO", "OK", "favicon-32x32.png");
            } else {
                if (bd.confirmarAlumnoNoExistente(CampoNombre.getText(), CampoApellido.getText(), CampoCorreo.getText(), CampoTelefono.getText())) {
                    int resultado = h1.popUp2("ALTA ALUMNO", "ESTE ALUMNO EXISTE PERO ESTA DESMATRICULADO", "READMITIR", "CANCELAR", "favicon-32x32.png");
                    if (resultado == 0) {
                        int id = bd.retornarIdAlumno(CampoNombre.getText(), CampoApellido.getText(), CampoCorreo.getText(), CampoTelefono.getText());
                        bd.modificarExistenciaAlumnoANoExistente(id);
                    }
                } else {
                    h1.popUp1("ALTA ALUMNO", "ALUMNO YA EXISTENTE", "OK", "favicon-32x32.png");
                }
            }

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
        } else {
            h1.popUp1("ALTA ALUMNO", "PORFAVOR RELLENE BIEN LOS CAMPOS Y SIN COMAS ", "OK", "favicon-32x32.png");
        }

    }//GEN-LAST:event_Crear_alumno
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton asi
     * como mostrar una descripcion del boton
     *
     * @param evt
     */
    private void ButtonAltaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAltaMouseEntered
        ButtonAlta.setBackground(new Color(189, 146, 64));
        LabelButtonAlta.setForeground(new Color(25, 34, 43));
        caja.setBackground(new Color(25, 34, 43));
        texto.setForeground(new Color(221, 214, 204));
        texto.setText("PUEDE AGREGAR NUEVOS ALUMNOS.   PARA READMITIR A UN EXALUMNO ESCRIBA SUS DATOS");
    }//GEN-LAST:event_ButtonAltaMouseEntered
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonAltaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAltaMouseExited
        ButtonAlta.setBackground(new Color(25, 34, 43));
        LabelButtonAlta.setForeground(new Color(221, 214, 204));
        caja.setBackground(new Color(221, 214, 204));
        texto.setText("");
    }//GEN-LAST:event_ButtonAltaMouseExited
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonAltaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAltaMousePressed
        ButtonAlta.setBackground(new Color(184, 67, 87));
        LabelButtonAlta.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_ButtonAltaMousePressed
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonAltaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAltaMouseReleased
        ButtonAlta.setBackground(new Color(189, 146, 64));
        LabelButtonAlta.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ButtonAltaMouseReleased

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
            java.util.logging.Logger.getLogger(AlumnosAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnosAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnosAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnosAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnosAlta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonAlta;
    private javax.swing.JTextField CampoApellido;
    private javax.swing.JTextField CampoCorreo;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JTextField CampoTelefono;
    private javax.swing.JLabel LabelButtonAlta;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel caja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
