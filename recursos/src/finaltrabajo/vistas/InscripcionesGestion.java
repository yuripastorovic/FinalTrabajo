/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finaltrabajo.vistas;

import finaltrabajo.BaseDatosAcademia;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yuripastorovic
 */
public class InscripcionesGestion extends javax.swing.JFrame {

    /**
     * Creates new form InscripcionesAluCurs
     */
    private BaseDatosAcademia bd = new BaseDatosAcademia();
    private DefaultTableModel modelo = new DefaultTableModel();
    public InscripcionesGestion() {
        initComponents();
        modelo.addColumn("ID");
        modelo.addColumn("ID_ALUMNO");
        modelo.addColumn("ID_CURSO");
        modelo.addColumn("FECHA_INICIO");
        modelo.addColumn("FECHA_FIN");
        modelo.addColumn("NOTA");
        comboBox1();
    }
    public JPanel getFondo() {
        JPanel fondo = PanelFondo;
        return fondo;
    }
    private void comboBox1() {
        String arrayString[] = bd.leerIdId_alumnoNombreId_cursoNombreInscripcionesExistentes();//-------------------
        ComboNombre.setModel(new javax.swing.DefaultComboBoxModel<>(arrayString));
    }
    private void ponerInscripcionTabla(){
        String partes[] = ComboNombre.getSelectedItem().toString().split(",");
        for (int i = 0; i <modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i--;
        }
        TablaNew.setModel(modelo);
        String datitos=bd.leerDatosUnInscripcioneExistente(Integer.valueOf(partes[0]));
        modelo.addRow(datitos.split(","));
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
        PanelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ButtonAlta = new javax.swing.JPanel();
        LabelButtonAlta = new javax.swing.JLabel();
        ComboNombre = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaNew = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        ComboNota = new javax.swing.JComboBox<>();
        ButtonModificar = new javax.swing.JPanel();
        LabelButtonModificar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(221, 214, 204));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 34, 43));
        jLabel1.setText("SELECCIONE ALUMNO");

        ButtonAlta.setBackground(new java.awt.Color(25, 34, 43));
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
        LabelButtonAlta.setText("ELIMINAR INSCRIPCION");

        javax.swing.GroupLayout ButtonAltaLayout = new javax.swing.GroupLayout(ButtonAlta);
        ButtonAlta.setLayout(ButtonAltaLayout);
        ButtonAltaLayout.setHorizontalGroup(
            ButtonAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonAlta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        ButtonAltaLayout.setVerticalGroup(
            ButtonAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonAlta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        ComboNombre.setBackground(new java.awt.Color(25, 34, 43));
        ComboNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ComboNombre.setForeground(new java.awt.Color(221, 214, 204));
        ComboNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboNombreActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(221, 214, 204));

        TablaNew.setBackground(new java.awt.Color(25, 34, 43));
        TablaNew.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TablaNew.setForeground(new java.awt.Color(221, 214, 204));
        TablaNew.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ID_ALUMNO", "ID_CURSO", "F_INICIO", "F_FIN", "NOTA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            TablaNew.getColumnModel().getColumn(0).setResizable(false);
            TablaNew.getColumnModel().getColumn(1).setResizable(false);
            TablaNew.getColumnModel().getColumn(2).setResizable(false);
            TablaNew.getColumnModel().getColumn(3).setResizable(false);
            TablaNew.getColumnModel().getColumn(4).setResizable(false);
            TablaNew.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel2.add(jScrollPane1);

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 34, 43));
        jLabel2.setText("SELECCIONE NOTA");

        ComboNota.setBackground(new java.awt.Color(25, 34, 43));
        ComboNota.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ComboNota.setForeground(new java.awt.Color(221, 214, 204));
        ComboNota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        ComboNota.setSelectedIndex(-1);
        ComboNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboNotaActionPerformed(evt);
            }
        });

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
        LabelButtonModificar.setText("ESTABLECER NOTA");

        javax.swing.GroupLayout ButtonModificarLayout = new javax.swing.GroupLayout(ButtonModificar);
        ButtonModificar.setLayout(ButtonModificarLayout);
        ButtonModificarLayout.setHorizontalGroup(
            ButtonModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        );
        ButtonModificarLayout.setVerticalGroup(
            ButtonModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addComponent(ButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboNota, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                        .addComponent(ComboNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAltaCrear_alumno(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAltaCrear_alumno
        String[] partes = ComboNombre.getSelectedItem().toString().split(",");
        
        String id_alumno = partes[1].trim();
        String id_curso = partes[3].trim();
        String datos[] = bd.leerInscripcionConAlumnoYCursoQueExista( Integer.valueOf(id_alumno), Integer.valueOf(id_curso)).split(",");
        String nota = "ABANDONO";
        String fFin= "ABANDONO";
        bd.modificarInscripciones(Integer.valueOf(datos[0]) , Integer.valueOf(datos[1]) , Integer.valueOf(datos[2])  , fFin , nota);
        comboBox1();
    }//GEN-LAST:event_ButtonAltaCrear_alumno

    private void ButtonAltaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAltaMouseEntered
        ButtonAlta.setBackground(new Color(189, 146, 64));
        LabelButtonAlta.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ButtonAltaMouseEntered

    private void ButtonAltaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAltaMouseExited
        ButtonAlta.setBackground(new Color(25, 34, 43));
        LabelButtonAlta.setForeground(new Color(221, 214, 204));
    }//GEN-LAST:event_ButtonAltaMouseExited

    private void ButtonAltaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAltaMousePressed
        ButtonAlta.setBackground(new Color(184, 67, 87));
        LabelButtonAlta.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_ButtonAltaMousePressed

    private void ButtonAltaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAltaMouseReleased
        ButtonAlta.setBackground(new Color(189, 146, 64));
        LabelButtonAlta.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ButtonAltaMouseReleased

    private void ComboNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboNombreActionPerformed
        ponerInscripcionTabla();
        System.out.println(ComboNombre.getSelectedItem().toString());
        
        ComboNombre.setBackground(new Color(189, 146, 64));
        ComboNombre.setForeground(new Color(25, 34, 43));    }//GEN-LAST:event_ComboNombreActionPerformed

    private void ComboNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboNotaActionPerformed
        ComboNota.setBackground(new Color(189, 146, 64));
        ComboNota.setForeground(new Color(25, 34, 43));
        this.ButtonAlta.setEnabled(false);
    }//GEN-LAST:event_ComboNotaActionPerformed

    private void ButtonModificarModificar_press(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonModificarModificar_press
        String[] partes = ComboNombre.getSelectedItem().toString().split(",");
        String id_alumno = partes[1].trim();
        String id_curso = partes[3].trim();
        String datos[] = bd.leerInscripcionConAlumnoYCursoQueExista( Integer.valueOf(id_alumno), Integer.valueOf(id_curso)).split(",");
        String nota = ComboNota.getSelectedItem().toString();
        String fFin= bd.getHoraDATE();
        System.out.println("id="+datos[0] +"    id_alumno="+ datos[1] +"   id_curso="+ datos[2]+ "   fecha fin="+fFin+"  nota="+ nota);
        bd.modificarInscripciones(Integer.valueOf(datos[0]) , Integer.valueOf(datos[1]) , Integer.valueOf(datos[2])  , fFin , nota);
        comboBox1();
    }//GEN-LAST:event_ButtonModificarModificar_press

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
            java.util.logging.Logger.getLogger(InscripcionesGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InscripcionesGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InscripcionesGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InscripcionesGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InscripcionesGestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonAlta;
    private javax.swing.JPanel ButtonModificar;
    private javax.swing.JComboBox<String> ComboNombre;
    private javax.swing.JComboBox<String> ComboNota;
    private javax.swing.JLabel LabelButtonAlta;
    private javax.swing.JLabel LabelButtonModificar;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JTable TablaNew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
