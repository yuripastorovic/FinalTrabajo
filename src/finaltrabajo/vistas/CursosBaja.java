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
public class CursosBaja extends javax.swing.JFrame {

    /**
     * Creates new form CursosBaja
     */
    private BaseDatosAcademia bd = new BaseDatosAcademia();
    private DefaultTableModel modelo = new DefaultTableModel();
    private Herramientas h1 = new Herramientas();

    public CursosBaja() {
        initComponents();
        comboBox1();
        comboBox2();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("HORAS");
    }

    public JPanel getFondo() {
        JPanel fondo = PanelFondo;
        return fondo;
    }

    private void comboBox1() {
        String arrayString[] = bd.leerIdNombresCursosExistentes();
        ComboNombre.setModel(new javax.swing.DefaultComboBoxModel<>(arrayString));
    }

    private void comboBox2() {
        String arrayString[] = bd.leerIdHorasCursosExistentes();
        ComboHoras.setModel(new javax.swing.DefaultComboBoxModel<>(arrayString));
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
        ComboHoras = new javax.swing.JComboBox<>();
        BotonReset = new javax.swing.JPanel();
        reset = new javax.swing.JLabel();
        BotonBuscar = new javax.swing.JPanel();
        buscar = new javax.swing.JLabel();
        LabelInfo1 = new javax.swing.JLabel();
        Alineador = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaNew = new javax.swing.JTable();
        ButtonModificar = new javax.swing.JPanel();
        LabelButtonModificar = new javax.swing.JLabel();
        caja = new javax.swing.JPanel();
        texto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(221, 214, 204));

        LabelInfo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        LabelInfo.setForeground(new java.awt.Color(25, 34, 43));
        LabelInfo.setText("SELECCIONE CURSO PARA RETIRAR");

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
        LabelNombreC.setText("NOMBRE ");

        LabelTelefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        LabelTelefono.setForeground(new java.awt.Color(25, 34, 43));
        LabelTelefono.setText("HORAS");

        ComboHoras.setBackground(new java.awt.Color(25, 34, 43));
        ComboHoras.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ComboHoras.setForeground(new java.awt.Color(221, 214, 204));
        ComboHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboHoras.setSelectedIndex(-1);
        ComboHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboHorasActionPerformed(evt);
            }
        });

        BotonReset.setBackground(new java.awt.Color(25, 34, 43));
        BotonReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonResetBoton_reset(evt);
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
        BotonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBuscar_buscar(evt);
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
            .addComponent(buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );
        BotonBuscarLayout.setVerticalGroup(
            BotonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        LabelInfo1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        LabelInfo1.setForeground(new java.awt.Color(25, 34, 43));
        LabelInfo1.setText("BUSCAR POR:");

        Alineador.setBackground(new java.awt.Color(221, 214, 204));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        TablaNew.setBackground(new java.awt.Color(25, 34, 43));
        TablaNew.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TablaNew.setForeground(new java.awt.Color(221, 214, 204));
        TablaNew.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID ", "NOMBRE", "DESCRIPCION", "HORAS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            TablaNew.getColumnModel().getColumn(0).setPreferredWidth(40);
            TablaNew.getColumnModel().getColumn(1).setResizable(false);
            TablaNew.getColumnModel().getColumn(1).setPreferredWidth(120);
            TablaNew.getColumnModel().getColumn(2).setResizable(false);
            TablaNew.getColumnModel().getColumn(2).setPreferredWidth(200);
            TablaNew.getColumnModel().getColumn(3).setResizable(false);
            TablaNew.getColumnModel().getColumn(3).setPreferredWidth(80);
        }

        Alineador.add(jScrollPane1);

        ButtonModificar.setBackground(new java.awt.Color(25, 34, 43));
        ButtonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        LabelButtonModificar.setText("RETIRAR");

        javax.swing.GroupLayout ButtonModificarLayout = new javax.swing.GroupLayout(ButtonModificar);
        ButtonModificar.setLayout(ButtonModificarLayout);
        ButtonModificarLayout.setHorizontalGroup(
            ButtonModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ButtonModificarLayout.setVerticalGroup(
            ButtonModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        caja.setBackground(new java.awt.Color(221, 214, 204));

        texto.setBackground(new java.awt.Color(221, 214, 204));
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
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelFondoLayout.createSequentialGroup()
                                    .addComponent(LabelInfo1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(PanelFondoLayout.createSequentialGroup()
                                    .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabelNombreC)
                                        .addComponent(ComboNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                                    .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ComboHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(83, 83, 83)))
                            .addGroup(PanelFondoLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)))
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(Alineador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(caja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addComponent(Alineador, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addComponent(LabelInfo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelNombreC)
                            .addComponent(LabelTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void ComboNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboNombreActionPerformed
        ComboHoras.setEnabled(false);
        ComboNombre.setBackground(new Color(189, 146, 64));
        ComboNombre.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ComboNombreActionPerformed

    private void ComboHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboHorasActionPerformed
        ComboNombre.setEnabled(false);
        ComboHoras.setBackground(new Color(189, 146, 64));
        ComboHoras.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ComboHorasActionPerformed

    private void BotonResetBoton_reset(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonResetBoton_reset
        comboBox1();
        comboBox2();
        ComboHoras.setEnabled(true);
        ComboNombre.setEnabled(true);
        ComboHoras.setBackground(new Color(25, 34, 43));
        ComboHoras.setForeground(new Color(221, 214, 204));
        ComboNombre.setBackground(new Color(25, 34, 43));
        ComboNombre.setForeground(new Color(221, 214, 204));
    }//GEN-LAST:event_BotonResetBoton_reset

    private void BotonResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonResetMouseEntered
        BotonReset.setBackground(new Color(189, 146, 64));
        reset.setForeground(new Color(25, 34, 43));
        caja.setBackground(new Color(25, 34, 43));
        texto.setForeground(new Color(221, 214, 204));
        texto.setText("A");
    }//GEN-LAST:event_BotonResetMouseEntered

    private void BotonResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonResetMouseExited
        BotonReset.setBackground(new Color(25, 34, 43));
        reset.setForeground(new Color(221, 214, 204));
        caja.setBackground(new Color(221, 214, 204));
        texto.setText("");
    }//GEN-LAST:event_BotonResetMouseExited

    private void BotonResetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonResetMousePressed
        BotonReset.setBackground(new Color(184, 67, 87));
        reset.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_BotonResetMousePressed

    private void BotonResetMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonResetMouseReleased
        BotonReset.setBackground(new Color(189, 146, 64));
        reset.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_BotonResetMouseReleased

    private void BotonBuscar_buscar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscar_buscar
        if (!(ComboNombre.getSelectedIndex() == -1 && ComboHoras.getSelectedIndex() == -1)) {
            for (int i = 0; i < modelo.getRowCount(); i++) {
                modelo.removeRow(i);
                i--;
            }

            TablaNew.setModel(modelo);
            String[] partes;
            if (ComboNombre.isEnabled()) {
                partes = ComboNombre.getSelectedItem().toString().split(",");
            } else {
                partes = ComboHoras.getSelectedItem().toString().split(",");
            }

            String id = partes[0].trim();
            String datos[] = new String[1];
            datos = bd.leerDatosUnCursoExistente(Integer.valueOf(id)).split(",");
            modelo.addRow(datos);
        } else {
            h1.popUp1("BAJA CURSO", "PORFAVOR SELECCIONE UN CURSO", "OK", "favicon-32x32.png");
        }
    }//GEN-LAST:event_BotonBuscar_buscar

    private void BotonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseEntered
        BotonBuscar.setBackground(new Color(189, 146, 64));
        buscar.setForeground(new Color(25, 34, 43));
        caja.setBackground(new Color(25, 34, 43));
        texto.setForeground(new Color(221, 214, 204));
        texto.setText("A");
    }//GEN-LAST:event_BotonBuscarMouseEntered

    private void BotonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseExited
        BotonBuscar.setBackground(new Color(25, 34, 43));
        buscar.setForeground(new Color(221, 214, 204));
        caja.setBackground(new Color(221, 214, 204));
        texto.setText("");
    }//GEN-LAST:event_BotonBuscarMouseExited

    private void BotonBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMousePressed
        BotonBuscar.setBackground(new Color(184, 67, 87));
        buscar.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_BotonBuscarMousePressed

    private void BotonBuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseReleased
        BotonBuscar.setBackground(new Color(189, 146, 64));
        buscar.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_BotonBuscarMouseReleased

    private void ButtonModificarModificar_press(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonModificarModificar_press
        if (!(ComboNombre.getSelectedIndex() == -1 && ComboHoras.getSelectedIndex() == -1)) {
            for (int i = 0; i < modelo.getRowCount(); i++) {
                modelo.removeRow(i);
                i--;
            }
            String[] partes;
            if (ComboNombre.isEnabled()) {
                partes = ComboNombre.getSelectedItem().toString().split(",");
            } else {
                partes = ComboHoras.getSelectedItem().toString().split(",");
            }
            String id = partes[0].trim();
            bd.modificarExistenciaCursos(Integer.valueOf(id));
            h1.popUp1("BAJA CURSO", "CURSO DESMATRICULADO", "OK", "favicon-32x32.png");
        } else {
            h1.popUp1("BAJA CURSO", "PORFAVOR SELECCIONE UN CURSO", "OK", "favicon-32x32.png");
        }
    }//GEN-LAST:event_ButtonModificarModificar_press

    private void ButtonModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonModificarMouseEntered
        ButtonModificar.setBackground(new Color(189, 146, 64));
        LabelButtonModificar.setForeground(new Color(25, 34, 43));
        caja.setBackground(new Color(25, 34, 43));
        texto.setForeground(new Color(221, 214, 204));
        texto.setText("A");
    }//GEN-LAST:event_ButtonModificarMouseEntered

    private void ButtonModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonModificarMouseExited
        ButtonModificar.setBackground(new Color(25, 34, 43));
        LabelButtonModificar.setForeground(new Color(221, 214, 204));
        caja.setBackground(new Color(221, 214, 204));
        texto.setText("");
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
            java.util.logging.Logger.getLogger(CursosBaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursosBaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursosBaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursosBaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CursosBaja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Alineador;
    private javax.swing.JPanel BotonBuscar;
    private javax.swing.JPanel BotonReset;
    private javax.swing.JPanel ButtonModificar;
    private javax.swing.JComboBox<String> ComboHoras;
    private javax.swing.JComboBox<String> ComboNombre;
    private javax.swing.JLabel LabelButtonModificar;
    private javax.swing.JLabel LabelInfo;
    private javax.swing.JLabel LabelInfo1;
    private javax.swing.JLabel LabelNombreC;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JTable TablaNew;
    private javax.swing.JLabel buscar;
    private javax.swing.JPanel caja;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel reset;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
