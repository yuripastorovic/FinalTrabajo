package finaltrabajo.vistas;

import finaltrabajo.BaseDatosAcademia;
import finaltrabajo.Herramientas;
import java.awt.Color;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Jorge & Miguel
 */
public class CursosAlta extends javax.swing.JFrame {

    private BaseDatosAcademia bd = new BaseDatosAcademia();
    private Herramientas h1 = new Herramientas();

    public CursosAlta() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ButtonAlta = new javax.swing.JPanel();
        LabelButtonAlta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaDescr = new javax.swing.JTextArea();
        CBHoras = new javax.swing.JComboBox<>();
        caja = new javax.swing.JPanel();
        texto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(221, 214, 204));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 34, 43));
        jLabel1.setText("NOMBRE DEL CURSO");

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

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 34, 43));
        jLabel2.setText("NUMERO DE HORAS");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 34, 43));
        jLabel3.setText("DESCRIPCION");

        ButtonAlta.setBackground(new java.awt.Color(25, 34, 43));
        ButtonAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonAltaCrear_alumno(evt);
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
        LabelButtonAlta.setText("CREAR CURSO");

        javax.swing.GroupLayout ButtonAltaLayout = new javax.swing.GroupLayout(ButtonAlta);
        ButtonAlta.setLayout(ButtonAltaLayout);
        ButtonAltaLayout.setHorizontalGroup(
            ButtonAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonAlta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        ButtonAltaLayout.setVerticalGroup(
            ButtonAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonAlta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        TextAreaDescr.setBackground(new java.awt.Color(25, 34, 43));
        TextAreaDescr.setColumns(20);
        TextAreaDescr.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TextAreaDescr.setForeground(new java.awt.Color(196, 190, 181));
        TextAreaDescr.setRows(5);
        TextAreaDescr.setText("Introduzca una descripcion del curso");
        TextAreaDescr.setToolTipText("");
        TextAreaDescr.setAlignmentX(5.0F);
        TextAreaDescr.setBorder(null);
        TextAreaDescr.setSelectedTextColor(new java.awt.Color(25, 34, 43));
        TextAreaDescr.setSelectionColor(new java.awt.Color(184, 67, 87));
        TextAreaDescr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextAreaDescrMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TextAreaDescr);

        CBHoras.setBackground(new java.awt.Color(25, 34, 43));
        CBHoras.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CBHoras.setForeground(new java.awt.Color(221, 214, 204));
        CBHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        CBHoras.setSelectedIndex(-1);
        CBHoras.setBorder(null);
        CBHoras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CBHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBHorasActionPerformed(evt);
            }
        });

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaltrabajo/vistas/icon/curs.png"))); // NOI18N

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelFondoLayout.createSequentialGroup()
                                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26))
                            .addComponent(CampoNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelFondoLayout.createSequentialGroup()
                                .addComponent(CBHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(50, 50, 50))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                        .addComponent(ButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38))))
            .addComponent(caja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
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
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void CampoNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNombreMouseClicked
        CampoNombre.setText("");
        CampoNombre.setBackground(new Color(189, 146, 64));
        CampoNombre.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_CampoNombreMouseClicked
    /**
     * Permite crear un alumno asegurandose de que los campos son validos
     *
     * @param evt
     */
    private void ButtonAltaCrear_alumno(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAltaCrear_alumno
        if (!(CampoNombre.getText().trim().equals("")
                || TextAreaDescr.getText().trim().equals("")
                || CampoNombre.getText().trim().equals("Introduzca nombre")
                || TextAreaDescr.getText().trim().equals("Introduzca descripcion del curso")
                || CBHoras.getSelectedIndex() == -1
                || CampoNombre.getText().trim().contains(",")
                || TextAreaDescr.getText().trim().contains(","))) {

            if (!bd.confirmarCurso(CampoNombre.getText(), TextAreaDescr.getText(), CBHoras.getSelectedItem().toString())) {
                h1.popUp1("ALTA CURSO", "CURSO CREADO", "OK", "favicon-32x32.png");
                bd.insertarCurso(CampoNombre.getText().trim(), TextAreaDescr.getText().trim(), CBHoras.getSelectedItem().toString().trim());
            } else {
                if (bd.confirmarCursoNoExistente(CampoNombre.getText(), TextAreaDescr.getText(), CBHoras.getSelectedItem().toString())) {
                    int resultado = h1.popUp2("ALTA CURSO", "ESTE CURSO EXISTE PERO ESTA DESMATRICULADO", "READMITIR", "CANCELAR", "favicon-32x32.png");
                    if (resultado == 0) {
                        int id = bd.retornarIdCurso(CampoNombre.getText(), TextAreaDescr.getText(), CBHoras.getSelectedItem().toString());
                        bd.modificarExistenciaCursosANoExistente(id);
                    }
                } else {
                    h1.popUp1("ALTA CURSO", "CURSO YA EXISTENTE", "OK", "favicon-32x32.png");
                }
            }
            CampoNombre.setText("Introduzca nombre");
            TextAreaDescr.setText("Introduzca descripcion del curso");
            CBHoras.setSelectedIndex(-1);
            CBHoras.setBackground(new Color(25, 34, 43));
            CBHoras.setForeground(new Color(221, 214, 204));
            TextAreaDescr.setBackground(new Color(25, 34, 43));
            TextAreaDescr.setForeground(new Color(221, 214, 204));
            CampoNombre.setBackground(new Color(25, 34, 43));
            CampoNombre.setForeground(new Color(221, 214, 204));
        } else {
            h1.popUp1("ALTA CURSO", "PORFAVOR RELLENE BIEN LOS CAMPOS Y SIN COMAS ", "OK", "favicon-32x32.png");
        }

    }//GEN-LAST:event_ButtonAltaCrear_alumno
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
        texto.setText("PERMITE AGREGAR UN NUEVO CURSO");
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
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void CBHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBHorasActionPerformed
        CBHoras.setBackground(new Color(189, 146, 64));
        CBHoras.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_CBHorasActionPerformed
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void TextAreaDescrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextAreaDescrMouseClicked
        TextAreaDescr.setText("");
        TextAreaDescr.setBackground(new Color(189, 146, 64));
        TextAreaDescr.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_TextAreaDescrMouseClicked

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
            java.util.logging.Logger.getLogger(CursosAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursosAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursosAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursosAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CursosAlta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonAlta;
    private javax.swing.JComboBox<String> CBHoras;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JLabel LabelButtonAlta;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JTextArea TextAreaDescr;
    private javax.swing.JPanel caja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
