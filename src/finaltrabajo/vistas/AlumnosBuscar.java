/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finaltrabajo.vistas;

import finaltrabajo.BaseDatosAcademia;
import finaltrabajo.Herramientas;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yuripastorovic
 */
public class AlumnosBuscar extends javax.swing.JFrame {

    /**
     * Creates new form AlumnosBuscar
     */
    private BaseDatosAcademia bd = new BaseDatosAcademia();
    private DefaultTableModel modelo = new DefaultTableModel();
    private Herramientas h1 = new Herramientas();

    public AlumnosBuscar() {
        initComponents();
        comboBox1();
        comboBox2();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("CORREO");
        modelo.addColumn("TELEFONO");
    }

    public JPanel getFondo() {
        JPanel fondo = PanelFondo;
        return fondo;
    }

    private void comboBox1() {
        String arrayString[] = bd.leerIdNombreApellidoAlumnosExistentes();
        ComboNombre.setModel(new javax.swing.DefaultComboBoxModel<>(arrayString));
    }

    private void comboBox2() {
        String arrayString[] = bd.leerIdTelefonosAlumnosExistentes();
        ComboTelefono.setModel(new javax.swing.DefaultComboBoxModel<>(arrayString));
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
        LabelInfo = new javax.swing.JLabel();
        ComboNombre = new javax.swing.JComboBox<>();
        LabelNombreC = new javax.swing.JLabel();
        LabelTelefono = new javax.swing.JLabel();
        ComboTelefono = new javax.swing.JComboBox<>();
        BotonReset = new javax.swing.JPanel();
        reset = new javax.swing.JLabel();
        BotonBuscar = new javax.swing.JPanel();
        buscar = new javax.swing.JLabel();
        Alineador = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaNew = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(221, 214, 204));

        LabelInfo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        LabelInfo.setForeground(new java.awt.Color(25, 34, 43));
        LabelInfo.setText("BUSCAR POR:");

        ComboNombre.setBackground(new java.awt.Color(25, 34, 43));
        ComboNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ComboNombre.setForeground(new java.awt.Color(221, 214, 204));
        ComboNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboNombre.setSelectedIndex(-1);
        ComboNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboNombreActionPerformed(evt);
            }
        });

        LabelNombreC.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        LabelNombreC.setForeground(new java.awt.Color(25, 34, 43));
        LabelNombreC.setText("BUSCAR POR NOMBRE COMPLETO");

        LabelTelefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        LabelTelefono.setForeground(new java.awt.Color(25, 34, 43));
        LabelTelefono.setText("BUSCAR POR TELEFONO");

        ComboTelefono.setBackground(new java.awt.Color(25, 34, 43));
        ComboTelefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ComboTelefono.setForeground(new java.awt.Color(221, 214, 204));
        ComboTelefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboTelefono.setSelectedIndex(-1);
        ComboTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTelefonoActionPerformed(evt);
            }
        });

        BotonReset.setBackground(new java.awt.Color(25, 34, 43));
        BotonReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_reset(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonResetMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonResetMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotonResetMouseReleased(evt);
            }
        });

        reset.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        reset.setForeground(new java.awt.Color(221, 214, 204));
        reset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reset.setText("RESETEAR");

        javax.swing.GroupLayout BotonResetLayout = new javax.swing.GroupLayout(BotonReset);
        BotonReset.setLayout(BotonResetLayout);
        BotonResetLayout.setHorizontalGroup(
            BotonResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        BotonResetLayout.setVerticalGroup(
            BotonResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        BotonBuscar.setBackground(new java.awt.Color(25, 34, 43));
        BotonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_buscar(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonBuscarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonBuscarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotonBuscarMouseReleased(evt);
            }
        });

        buscar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        buscar.setForeground(new java.awt.Color(221, 214, 204));
        buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscar.setText("BUSCAR");

        javax.swing.GroupLayout BotonBuscarLayout = new javax.swing.GroupLayout(BotonBuscar);
        BotonBuscar.setLayout(BotonBuscarLayout);
        BotonBuscarLayout.setHorizontalGroup(
            BotonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        BotonBuscarLayout.setVerticalGroup(
            BotonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        Alineador.setBackground(new java.awt.Color(221, 214, 204));

        TablaNew.setBackground(new java.awt.Color(25, 34, 43));
        TablaNew.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TablaNew.setForeground(new java.awt.Color(221, 214, 204));
        TablaNew.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "CORREO", "TELEFONO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaNew.setGridColor(new java.awt.Color(189, 146, 64));
        TablaNew.setSelectionBackground(new java.awt.Color(184, 67, 87));
        TablaNew.setSelectionForeground(new java.awt.Color(25, 34, 43));
        jScrollPane1.setViewportView(TablaNew);
        if (TablaNew.getColumnModel().getColumnCount() > 0) {
            TablaNew.getColumnModel().getColumn(0).setMinWidth(50);
            TablaNew.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaNew.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        Alineador.add(jScrollPane1);

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelFondoLayout.createSequentialGroup()
                                .addComponent(LabelNombreC)
                                .addGap(38, 38, 38)
                                .addComponent(LabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                                .addComponent(ComboNombre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(ComboTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(BotonReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(Alineador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addComponent(Alineador, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(LabelInfo)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelNombreC)
                            .addComponent(LabelTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BotonReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void ComboTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTelefonoActionPerformed
        this.ComboNombre.setEnabled(false);
    }//GEN-LAST:event_ComboTelefonoActionPerformed

    private void ComboNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboNombreActionPerformed
        this.ComboTelefono.setEnabled(false);
    }//GEN-LAST:event_ComboNombreActionPerformed

    private void Boton_buscar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_buscar
        if (ComboTelefono.isEnabled() && ComboNombre.isEnabled()) {
            for (int i = 0; i < modelo.getRowCount(); i++) {
                modelo.removeRow(i);
                i--;
            }
            TablaNew.setModel(modelo);
            String[] partes;
            if (ComboNombre.isEnabled()) {
                partes = ComboNombre.getSelectedItem().toString().split(",");
            } else {
                partes = ComboTelefono.getSelectedItem().toString().split(",");
            }
            String id = partes[0];
            String[] datitos = bd.leerDatosUnAlumnoExistente(Integer.parseInt(id)).split(",");
            modelo.addRow(datitos);
        } else {
            h1.popUp1("BUSCAR ALUMNO", "PORFAVOR ELIGE UN ALUMNO", "OK", "favicon-32x32.png");
        }
    }//GEN-LAST:event_Boton_buscar

    private void Boton_reset(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_reset
        ComboTelefono.setEnabled(true);
        ComboNombre.setEnabled(true);
        ComboTelefono.setSelectedIndex(-1);
        ComboNombre.setSelectedIndex(-1);
        comboBox1();
        comboBox2();
    }//GEN-LAST:event_Boton_reset

    private void BotonResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonResetMouseEntered
        BotonReset.setBackground(new Color(189, 146, 64));
        reset.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_BotonResetMouseEntered

    private void BotonResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonResetMouseExited
        BotonReset.setBackground(new Color(25, 34, 43));
        reset.setForeground(new Color(221, 214, 204));
    }//GEN-LAST:event_BotonResetMouseExited

    private void BotonResetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonResetMousePressed
        BotonReset.setBackground(new Color(184, 67, 87));
        reset.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_BotonResetMousePressed

    private void BotonResetMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonResetMouseReleased
        BotonReset.setBackground(new Color(189, 146, 64));
        reset.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_BotonResetMouseReleased

    private void BotonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseEntered
        BotonBuscar.setBackground(new Color(189, 146, 64));
        buscar.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_BotonBuscarMouseEntered

    private void BotonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseExited
        BotonBuscar.setBackground(new Color(25, 34, 43));
        buscar.setForeground(new Color(221, 214, 204));
    }//GEN-LAST:event_BotonBuscarMouseExited

    private void BotonBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMousePressed
        BotonBuscar.setBackground(new Color(184, 67, 87));
        buscar.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_BotonBuscarMousePressed

    private void BotonBuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseReleased
        BotonBuscar.setBackground(new Color(189, 146, 64));
        buscar.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_BotonBuscarMouseReleased

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
            java.util.logging.Logger.getLogger(AlumnosBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnosBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnosBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnosBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnosBuscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Alineador;
    private javax.swing.JPanel BotonBuscar;
    private javax.swing.JPanel BotonReset;
    private javax.swing.JComboBox<String> ComboNombre;
    private javax.swing.JComboBox<String> ComboTelefono;
    private javax.swing.JLabel LabelInfo;
    private javax.swing.JLabel LabelNombreC;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JTable TablaNew;
    private javax.swing.JLabel buscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel reset;
    // End of variables declaration//GEN-END:variables
}
