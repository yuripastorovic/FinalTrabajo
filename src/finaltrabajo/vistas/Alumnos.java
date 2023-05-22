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
public class Alumnos extends javax.swing.JFrame {

    /**
     * Creates new form Alumnos
     */
    public Alumnos() {
        initComponents();
    }

    public JPanel getFondo() {
        JPanel fondo = PanelFondo;
        return fondo;
    }

    private void showPanel(JPanel panel) {
        panel.setSize(this.contenedor.getWidth(), this.contenedor.getHeight());
        panel.setLocation(0, 0);
        this.contenedor.removeAll();
        this.contenedor.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        this.contenedor.revalidate();
        this.contenedor.repaint();
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
        PanelFaldon = new javax.swing.JPanel();
        ALTA = new javax.swing.JPanel();
        LabelButtonModificar1 = new javax.swing.JLabel();
        BUSCAR = new javax.swing.JPanel();
        LabelButtonModificar4 = new javax.swing.JLabel();
        MODIFY = new javax.swing.JPanel();
        LabelButtonModificar3 = new javax.swing.JLabel();
        BAJA = new javax.swing.JPanel();
        LabelButtonModificar = new javax.swing.JLabel();
        MOSTRAR = new javax.swing.JPanel();
        LabelButtonModificar5 = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();
        Image_png = new javax.swing.JLabel();
        caja = new javax.swing.JPanel();
        texto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PanelFondo.setBackground(new java.awt.Color(184, 67, 87));

        PanelFaldon.setBackground(new java.awt.Color(25, 34, 43));

        ALTA.setBackground(new java.awt.Color(25, 34, 43));
        ALTA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ALTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Alta_alum(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ALTAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ALTAMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ALTAMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ALTAMouseReleased(evt);
            }
        });

        LabelButtonModificar1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonModificar1.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonModificar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonModificar1.setText("NUEVO ALUMNO");

        javax.swing.GroupLayout ALTALayout = new javax.swing.GroupLayout(ALTA);
        ALTA.setLayout(ALTALayout);
        ALTALayout.setHorizontalGroup(
            ALTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        ALTALayout.setVerticalGroup(
            ALTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        BUSCAR.setBackground(new java.awt.Color(25, 34, 43));
        BUSCAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BUSCAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Buscar_alum(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BUSCARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BUSCARMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BUSCARMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BUSCARMouseReleased(evt);
            }
        });

        LabelButtonModificar4.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonModificar4.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonModificar4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonModificar4.setText("BUSCAR");

        javax.swing.GroupLayout BUSCARLayout = new javax.swing.GroupLayout(BUSCAR);
        BUSCAR.setLayout(BUSCARLayout);
        BUSCARLayout.setHorizontalGroup(
            BUSCARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        BUSCARLayout.setVerticalGroup(
            BUSCARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        MODIFY.setBackground(new java.awt.Color(25, 34, 43));
        MODIFY.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MODIFY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modi_alum(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MODIFYMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MODIFYMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MODIFYMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MODIFYMouseReleased(evt);
            }
        });

        LabelButtonModificar3.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonModificar3.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonModificar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonModificar3.setText("MODIFICAR");

        javax.swing.GroupLayout MODIFYLayout = new javax.swing.GroupLayout(MODIFY);
        MODIFY.setLayout(MODIFYLayout);
        MODIFYLayout.setHorizontalGroup(
            MODIFYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        MODIFYLayout.setVerticalGroup(
            MODIFYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        BAJA.setBackground(new java.awt.Color(25, 34, 43));
        BAJA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BAJA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Baja_alum(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BAJAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BAJAMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BAJAMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BAJAMouseReleased(evt);
            }
        });

        LabelButtonModificar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonModificar.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonModificar.setText("DESMATRICULAR");

        javax.swing.GroupLayout BAJALayout = new javax.swing.GroupLayout(BAJA);
        BAJA.setLayout(BAJALayout);
        BAJALayout.setHorizontalGroup(
            BAJALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        BAJALayout.setVerticalGroup(
            BAJALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        MOSTRAR.setBackground(new java.awt.Color(25, 34, 43));
        MOSTRAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MOSTRAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mostrar_alum(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MOSTRARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MOSTRARMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MOSTRARMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MOSTRARMouseReleased(evt);
            }
        });

        LabelButtonModificar5.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonModificar5.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonModificar5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonModificar5.setText("MOSTRAR");

        javax.swing.GroupLayout MOSTRARLayout = new javax.swing.GroupLayout(MOSTRAR);
        MOSTRAR.setLayout(MOSTRARLayout);
        MOSTRARLayout.setHorizontalGroup(
            MOSTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        MOSTRARLayout.setVerticalGroup(
            MOSTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelFaldonLayout = new javax.swing.GroupLayout(PanelFaldon);
        PanelFaldon.setLayout(PanelFaldonLayout);
        PanelFaldonLayout.setHorizontalGroup(
            PanelFaldonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFaldonLayout.createSequentialGroup()
                .addComponent(ALTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MODIFY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BAJA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MOSTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelFaldonLayout.setVerticalGroup(
            PanelFaldonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFaldonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelFaldonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ALTA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUSCAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MODIFY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAJA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MOSTRAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        contenedor.setBackground(new java.awt.Color(184, 67, 87));

        Image_png.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaltrabajo/vistas/icon/alumnos.jpg"))); // NOI18N

        caja.setBackground(new java.awt.Color(184, 67, 87));

        texto.setBackground(new java.awt.Color(221, 214, 204));
        texto.setForeground(new java.awt.Color(221, 214, 204));

        javax.swing.GroupLayout cajaLayout = new javax.swing.GroupLayout(caja);
        caja.setLayout(cajaLayout);
        cajaLayout.setHorizontalGroup(
            cajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cajaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cajaLayout.setVerticalGroup(
            cajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(texto, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(caja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Image_png, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addComponent(Image_png, javax.swing.GroupLayout.PREFERRED_SIZE, 307, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFaldon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addComponent(PanelFaldon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Baja_alum(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Baja_alum
        AlumnosBaja bbb = new AlumnosBaja();
        showPanel(bbb.getFondo());
    }//GEN-LAST:event_Baja_alum

    private void Alta_alum(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Alta_alum
        AlumnosAlta bbb = new AlumnosAlta();
        showPanel(bbb.getFondo());
    }//GEN-LAST:event_Alta_alum

    private void Modi_alum(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modi_alum
        AlumnosModificar2 bbb = new AlumnosModificar2();
        showPanel(bbb.getFondo());
    }//GEN-LAST:event_Modi_alum

    private void Buscar_alum(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buscar_alum
        AlumnosBuscar bbb = new AlumnosBuscar();
        showPanel(bbb.getFondo());
    }//GEN-LAST:event_Buscar_alum

    private void Mostrar_alum(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mostrar_alum
        AlumnosMostrar bbb = new AlumnosMostrar();
        showPanel(bbb.getFondo());
    }//GEN-LAST:event_Mostrar_alum

    private void ALTAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ALTAMouseEntered
        ALTA.setBackground(new Color(189, 146, 64));
        LabelButtonModificar1.setForeground(new Color(25, 34, 43));
        caja.setBackground(new Color(25, 34, 43));
        texto.setForeground(new Color(221, 214, 204));
        texto.setText("A");
    }//GEN-LAST:event_ALTAMouseEntered

    private void ALTAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ALTAMouseExited
        ALTA.setBackground(new Color(25, 34, 43));
        LabelButtonModificar1.setForeground(new Color(221, 214, 204));
        caja.setBackground(new Color(221, 214, 204));
        texto.setText("");
    }//GEN-LAST:event_ALTAMouseExited

    private void BUSCARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BUSCARMouseEntered
        // TODO add your handling code here:
        BUSCAR.setBackground(new Color(189, 146, 64));
        LabelButtonModificar4.setForeground(new Color(25, 34, 43));
        caja.setBackground(new Color(25, 34, 43));
        texto.setForeground(new Color(221, 214, 204));
        texto.setText("A");
    }//GEN-LAST:event_BUSCARMouseEntered

    private void BUSCARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BUSCARMouseExited
        BUSCAR.setBackground(new Color(25, 34, 43));
        LabelButtonModificar4.setForeground(new Color(221, 214, 204));
        caja.setBackground(new Color(221, 214, 204));
        texto.setText("");
    }//GEN-LAST:event_BUSCARMouseExited

    private void MODIFYMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MODIFYMouseEntered
        MODIFY.setBackground(new Color(189, 146, 64));
        LabelButtonModificar3.setForeground(new Color(25, 34, 43));
        caja.setBackground(new Color(25, 34, 43));
        texto.setForeground(new Color(221, 214, 204));
        texto.setText("A");
    }//GEN-LAST:event_MODIFYMouseEntered

    private void MODIFYMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MODIFYMouseExited
        MODIFY.setBackground(new Color(25, 34, 43));
        LabelButtonModificar3.setForeground(new Color(221, 214, 204));
        caja.setBackground(new Color(221, 214, 204));
        texto.setText("");
    }//GEN-LAST:event_MODIFYMouseExited

    private void BAJAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BAJAMouseEntered
        BAJA.setBackground(new Color(189, 146, 64));
        LabelButtonModificar.setForeground(new Color(25, 34, 43));
        caja.setBackground(new Color(25, 34, 43));
        texto.setForeground(new Color(221, 214, 204));
        texto.setText("A");
    }//GEN-LAST:event_BAJAMouseEntered

    private void BAJAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BAJAMouseExited
        BAJA.setBackground(new Color(25, 34, 43));
        LabelButtonModificar.setForeground(new Color(221, 214, 204));
        caja.setBackground(new Color(221, 214, 204));
        texto.setText("");
    }//GEN-LAST:event_BAJAMouseExited

    private void MOSTRARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MOSTRARMouseEntered
        MOSTRAR.setBackground(new Color(189, 146, 64));
        LabelButtonModificar5.setForeground(new Color(25, 34, 43));
        caja.setBackground(new Color(25, 34, 43));
        texto.setForeground(new Color(221, 214, 204));
        texto.setText("A");
    }//GEN-LAST:event_MOSTRARMouseEntered

    private void MOSTRARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MOSTRARMouseExited
        MOSTRAR.setBackground(new Color(25, 34, 43));
        LabelButtonModificar5.setForeground(new Color(221, 214, 204));
        caja.setBackground(new Color(221, 214, 204));
        texto.setText("");
    }//GEN-LAST:event_MOSTRARMouseExited

    private void ALTAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ALTAMousePressed
        ALTA.setBackground(new Color(184, 67, 87));
        LabelButtonModificar1.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_ALTAMousePressed

    private void ALTAMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ALTAMouseReleased
        ALTA.setBackground(new Color(189, 146, 64));
        LabelButtonModificar1.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ALTAMouseReleased

    private void BUSCARMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BUSCARMousePressed
        BUSCAR.setBackground(new Color(184, 67, 87));
        LabelButtonModificar4.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_BUSCARMousePressed

    private void BUSCARMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BUSCARMouseReleased
        BUSCAR.setBackground(new Color(189, 146, 64));
        LabelButtonModificar4.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_BUSCARMouseReleased

    private void MODIFYMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MODIFYMousePressed
        MODIFY.setBackground(new Color(184, 67, 87));
        LabelButtonModificar3.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_MODIFYMousePressed

    private void MODIFYMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MODIFYMouseReleased
        MODIFY.setBackground(new Color(189, 146, 64));
        LabelButtonModificar3.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_MODIFYMouseReleased

    private void BAJAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BAJAMousePressed
        BAJA.setBackground(new Color(184, 67, 87));
        LabelButtonModificar.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_BAJAMousePressed

    private void BAJAMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BAJAMouseReleased
        BAJA.setBackground(new Color(189, 146, 64));
        LabelButtonModificar.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_BAJAMouseReleased

    private void MOSTRARMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MOSTRARMousePressed
        MOSTRAR.setBackground(new Color(184, 67, 87));
        LabelButtonModificar5.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_MOSTRARMousePressed

    private void MOSTRARMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MOSTRARMouseReleased
        MOSTRAR.setBackground(new Color(189, 146, 64));
        LabelButtonModificar5.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_MOSTRARMouseReleased

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
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ALTA;
    private javax.swing.JPanel BAJA;
    private javax.swing.JPanel BUSCAR;
    private javax.swing.JLabel Image_png;
    private javax.swing.JLabel LabelButtonModificar;
    private javax.swing.JLabel LabelButtonModificar1;
    private javax.swing.JLabel LabelButtonModificar3;
    private javax.swing.JLabel LabelButtonModificar4;
    private javax.swing.JLabel LabelButtonModificar5;
    private javax.swing.JPanel MODIFY;
    private javax.swing.JPanel MOSTRAR;
    private javax.swing.JPanel PanelFaldon;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel caja;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
