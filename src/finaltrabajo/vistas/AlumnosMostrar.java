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
public class AlumnosMostrar extends javax.swing.JFrame {

    /**
     * Creates new form AlumnosMostrar
     */
    private BaseDatosAcademia bd = new BaseDatosAcademia();
    private DefaultTableModel modelo = new DefaultTableModel();
    public AlumnosMostrar() {
        initComponents();
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        BotonExalumnos = new javax.swing.JPanel();
        LabelButtonModificar1 = new javax.swing.JLabel();
        ButtonAlumnos = new javax.swing.JPanel();
        LabelButtonModificar = new javax.swing.JLabel();
        Alineador = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaNew = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(221, 214, 204));

        BotonExalumnos.setBackground(new java.awt.Color(25, 34, 43));
        BotonExalumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MostrarExalumnos(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonExalumnosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonExalumnosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonExalumnosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotonExalumnosMouseReleased(evt);
            }
        });

        LabelButtonModificar1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonModificar1.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonModificar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonModificar1.setText("EXALUMNOS");

        javax.swing.GroupLayout BotonExalumnosLayout = new javax.swing.GroupLayout(BotonExalumnos);
        BotonExalumnos.setLayout(BotonExalumnosLayout);
        BotonExalumnosLayout.setHorizontalGroup(
            BotonExalumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );
        BotonExalumnosLayout.setVerticalGroup(
            BotonExalumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        ButtonAlumnos.setBackground(new java.awt.Color(25, 34, 43));
        ButtonAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MostrarAlumnos(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonAlumnosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonAlumnosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonAlumnosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonAlumnosMouseReleased(evt);
            }
        });

        LabelButtonModificar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonModificar.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonModificar.setText("ALUMNOS");

        javax.swing.GroupLayout ButtonAlumnosLayout = new javax.swing.GroupLayout(ButtonAlumnos);
        ButtonAlumnos.setLayout(ButtonAlumnosLayout);
        ButtonAlumnosLayout.setHorizontalGroup(
            ButtonAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );
        ButtonAlumnosLayout.setVerticalGroup(
            ButtonAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(ButtonAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(BotonExalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelFondoLayout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(Alineador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(5, 5, 5)))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonExalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(258, Short.MAX_VALUE))
            .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelFondoLayout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(Alineador, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addContainerGap()))
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
     * Debe borrar el contenido de la tabla y mostrar la tabla alumnos boolean
     * exalumno=false
     *
     * @param evt
     */
    private void MostrarAlumnos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarAlumnos
        for (int i = 0; i <modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i--;
            
        }
        TablaNew.setModel(modelo);
        String datitos[]=bd.leerStringArrayAlumnosExistentes();
        for (int i = 0; i < bd.leerStringArrayAlumnosExistentes().length; i++) {
            modelo.addRow(datitos[i].split(","));
        }
                
        
    }//GEN-LAST:event_MostrarAlumnos
    /**
     * Debe borrar el contenido de la tabla y mostrar la tabla alumnos boolean
     * exalumno=true
     *
     * @param evt
     */
    private void MostrarExalumnos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarExalumnos
        for (int i = 0; i <modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i--;
            System.out.println(modelo.getRowCount());
        }
        
        TablaNew.setModel(modelo);
        String datitos[]= bd.leerStringArrayAlumnosNoExistentes();
        for (int i = 0; i < bd.leerStringArrayAlumnosNoExistentes().length; i++) {
            modelo.addRow(datitos[i].split(","));
        }
        
    }//GEN-LAST:event_MostrarExalumnos

    private void BotonExalumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonExalumnosMouseEntered
        BotonExalumnos.setBackground(new Color(189, 146, 64));
        LabelButtonModificar1.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_BotonExalumnosMouseEntered

    private void BotonExalumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonExalumnosMouseExited
        BotonExalumnos.setBackground(new Color(25, 34, 43));
        LabelButtonModificar1.setForeground(new Color(221, 214, 204));
    }//GEN-LAST:event_BotonExalumnosMouseExited

    private void BotonExalumnosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonExalumnosMousePressed
        BotonExalumnos.setBackground(new Color(184, 67, 87));
        LabelButtonModificar1.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_BotonExalumnosMousePressed

    private void BotonExalumnosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonExalumnosMouseReleased
        BotonExalumnos.setBackground(new Color(189, 146, 64));
        LabelButtonModificar1.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_BotonExalumnosMouseReleased

    private void ButtonAlumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAlumnosMouseEntered
        // TODO add your handling code here:ButtonAlumnos
        ButtonAlumnos.setBackground(new Color(189, 146, 64));
        LabelButtonModificar.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ButtonAlumnosMouseEntered

    private void ButtonAlumnosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAlumnosMousePressed
        ButtonAlumnos.setBackground(new Color(184, 67, 87));
        LabelButtonModificar.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_ButtonAlumnosMousePressed

    private void ButtonAlumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAlumnosMouseExited
        ButtonAlumnos.setBackground(new Color(25, 34, 43));
        LabelButtonModificar.setForeground(new Color(221, 214, 204));
    }//GEN-LAST:event_ButtonAlumnosMouseExited

    private void ButtonAlumnosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAlumnosMouseReleased
        ButtonAlumnos.setBackground(new Color(189, 146, 64));
        LabelButtonModificar.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ButtonAlumnosMouseReleased

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
            java.util.logging.Logger.getLogger(AlumnosMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnosMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnosMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnosMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnosMostrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Alineador;
    private javax.swing.JPanel BotonExalumnos;
    private javax.swing.JPanel ButtonAlumnos;
    private javax.swing.JLabel LabelButtonModificar;
    private javax.swing.JLabel LabelButtonModificar1;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JTable TablaNew;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
