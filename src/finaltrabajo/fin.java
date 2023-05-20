/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finaltrabajo;

import finaltrabajo.vistas.Ajustes;
import finaltrabajo.vistas.Alumnos;
import finaltrabajo.vistas.Cursos;
import finaltrabajo.vistas.Inscripciones;
import finaltrabajo.vistas.Principal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Miguel y Jorge
 */
public class fin extends javax.swing.JFrame {

    //Inicializamos la BBDD
    private BaseDatosAcademia bd = new BaseDatosAcademia();
    //Necesario para poder arrastar la ventana
    int xEje, yEje;

    public fin() {
        // Iniciamos componenetes
        initComponents();
        //setLocationRelativeTo(null);
        //Actualizamos la hora
        rfresh();
        //Creamos / Conectamos con la BBDD
        bd.crearDB();
    }

    /**
     * Metodo que permite actualizar la hora
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

    /**
     * Método que permite mostrar un JFrame en un JPanel
     *
     * @param panel
     */
    private void showPanel(JPanel panel) {
        panel.setSize(this.PanelContenedor.getWidth(), this.PanelContenedor.getHeight());
        panel.setLocation(0, 0);
        this.PanelContenedor.removeAll();
        this.PanelContenedor.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        this.PanelContenedor.revalidate();
        this.PanelContenedor.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        movimiento = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        exiit = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        PanelBotonera = new javax.swing.JPanel();
        ButtonPrinc = new javax.swing.JPanel();
        LabelButtonModificar2 = new javax.swing.JLabel();
        ButtonAlumn = new javax.swing.JPanel();
        LabelButtonModificar3 = new javax.swing.JLabel();
        ButtonCurso = new javax.swing.JPanel();
        LabelButtonModificar4 = new javax.swing.JLabel();
        ButtonInsc = new javax.swing.JPanel();
        LabelButtonModificar5 = new javax.swing.JLabel();
        ButtonAjustes = new javax.swing.JPanel();
        LabelButtonModificar = new javax.swing.JLabel();
        PanelHeader = new javax.swing.JPanel();
        PanelHora = new javax.swing.JPanel();
        LabelTime = new javax.swing.JLabel();
        PanelFecha = new javax.swing.JPanel();
        LabelDate = new javax.swing.JLabel();
        PanelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        PanelFondo.setBackground(new java.awt.Color(221, 214, 204));
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movimiento.setBackground(new java.awt.Color(0, 255, 0));
        movimiento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movimientoMouseDragged(evt);
            }
        });
        movimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movimientoMousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(204, 0, 0));
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        exiit.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        exiit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exiit.setText("X");

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exiit, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exiit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout movimientoLayout = new javax.swing.GroupLayout(movimiento);
        movimiento.setLayout(movimientoLayout);
        movimientoLayout.setHorizontalGroup(
            movimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movimientoLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 886, Short.MAX_VALUE))
        );
        movimientoLayout.setVerticalGroup(
            movimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelFondo.add(movimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 40));

        PanelMenu.setBackground(new java.awt.Color(25, 34, 43));

        PanelBotonera.setBackground(new java.awt.Color(25, 34, 43));
        PanelBotonera.setForeground(new java.awt.Color(221, 214, 204));
        PanelBotonera.setLayout(new java.awt.GridLayout(5, 1));

        ButtonPrinc.setBackground(new java.awt.Color(25, 34, 43));
        ButtonPrinc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Principal_action(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonPrincMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonPrincMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonPrincMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonPrincMouseReleased(evt);
            }
        });

        LabelButtonModificar2.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonModificar2.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonModificar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonModificar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaltrabajo/vistas/icon/icon3.png"))); // NOI18N
        LabelButtonModificar2.setText("PRINCIPAL");

        javax.swing.GroupLayout ButtonPrincLayout = new javax.swing.GroupLayout(ButtonPrinc);
        ButtonPrinc.setLayout(ButtonPrincLayout);
        ButtonPrincLayout.setHorizontalGroup(
            ButtonPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ButtonPrincLayout.setVerticalGroup(
            ButtonPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        PanelBotonera.add(ButtonPrinc);

        ButtonAlumn.setBackground(new java.awt.Color(25, 34, 43));
        ButtonAlumn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Alumn_action(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonAlumnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonAlumnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonAlumnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonAlumnMouseReleased(evt);
            }
        });

        LabelButtonModificar3.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonModificar3.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonModificar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonModificar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaltrabajo/vistas/icon/icon5.png"))); // NOI18N
        LabelButtonModificar3.setText("ALUMNOS");

        javax.swing.GroupLayout ButtonAlumnLayout = new javax.swing.GroupLayout(ButtonAlumn);
        ButtonAlumn.setLayout(ButtonAlumnLayout);
        ButtonAlumnLayout.setHorizontalGroup(
            ButtonAlumnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ButtonAlumnLayout.setVerticalGroup(
            ButtonAlumnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        PanelBotonera.add(ButtonAlumn);

        ButtonCurso.setBackground(new java.awt.Color(25, 34, 43));
        ButtonCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Curso_action(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonCursoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonCursoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonCursoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonCursoMouseReleased(evt);
            }
        });

        LabelButtonModificar4.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonModificar4.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonModificar4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonModificar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaltrabajo/vistas/icon/icon2.png"))); // NOI18N
        LabelButtonModificar4.setText("CURSOS");

        javax.swing.GroupLayout ButtonCursoLayout = new javax.swing.GroupLayout(ButtonCurso);
        ButtonCurso.setLayout(ButtonCursoLayout);
        ButtonCursoLayout.setHorizontalGroup(
            ButtonCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ButtonCursoLayout.setVerticalGroup(
            ButtonCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        PanelBotonera.add(ButtonCurso);

        ButtonInsc.setBackground(new java.awt.Color(25, 34, 43));
        ButtonInsc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Inscrip_action(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonInscMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonInscMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonInscMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonInscMouseReleased(evt);
            }
        });

        LabelButtonModificar5.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonModificar5.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonModificar5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonModificar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaltrabajo/vistas/icon/icon4.png"))); // NOI18N
        LabelButtonModificar5.setText("INSCRIPCION");

        javax.swing.GroupLayout ButtonInscLayout = new javax.swing.GroupLayout(ButtonInsc);
        ButtonInsc.setLayout(ButtonInscLayout);
        ButtonInscLayout.setHorizontalGroup(
            ButtonInscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonInscLayout.createSequentialGroup()
                .addComponent(LabelButtonModificar5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        ButtonInscLayout.setVerticalGroup(
            ButtonInscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        PanelBotonera.add(ButtonInsc);

        ButtonAjustes.setBackground(new java.awt.Color(25, 34, 43));
        ButtonAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ajustes_action(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonAjustesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonAjustesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonAjustesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonAjustesMouseReleased(evt);
            }
        });

        LabelButtonModificar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonModificar.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaltrabajo/vistas/icon/icon1.png"))); // NOI18N
        LabelButtonModificar.setText("AJUSTES");

        javax.swing.GroupLayout ButtonAjustesLayout = new javax.swing.GroupLayout(ButtonAjustes);
        ButtonAjustes.setLayout(ButtonAjustesLayout);
        ButtonAjustesLayout.setHorizontalGroup(
            ButtonAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );
        ButtonAjustesLayout.setVerticalGroup(
            ButtonAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        PanelBotonera.add(ButtonAjustes);

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBotonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(PanelBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        PanelFondo.add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
                .addGap(0, 328, Short.MAX_VALUE)
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

        PanelFondo.add(PanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 49, 780, -1));

        PanelContenedor.setBackground(new java.awt.Color(221, 214, 204));
        PanelContenedor.setPreferredSize(new java.awt.Dimension(654, 375));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaltrabajo/vistas/icon/frontal.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 34, 43));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BIENVENIDO A LA UNIVERSIDAD DE MIGUEL Y JORGE");

        javax.swing.GroupLayout PanelContenedorLayout = new javax.swing.GroupLayout(PanelContenedor);
        PanelContenedor.setLayout(PanelContenedorLayout);
        PanelContenedorLayout.setHorizontalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(103, 103, 103))
        );
        PanelContenedorLayout.setVerticalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContenedorLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12))
        );

        PanelFondo.add(PanelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 90, 769, 369));

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
     * Permite navegar a la pestanna de Ajustes
     *
     * @param evt
     */
    private void Ajustes_action(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ajustes_action
        Ajustes bbb = new Ajustes();
        showPanel(bbb.getFondo());
    }//GEN-LAST:event_Ajustes_action
    /**
     * Permite navegar a la pestanna de Principal
     *
     * @param evt
     */
    private void Principal_action(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Principal_action
        Principal bbb = new Principal();
        showPanel(bbb.getFondo());
        //ButtonPrinc.setBackground(new Color(184, 67, 87));
        //LabelButtonModificar2.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_Principal_action
    /**
     * Permite navegar a la pestanna de Alumnos
     *
     * @param evt
     */
    private void Alumn_action(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Alumn_action
        Alumnos bbb = new Alumnos();
        showPanel(bbb.getFondo());
    }//GEN-LAST:event_Alumn_action
    /**
     * Permite navegar a la pestanna de Cursos
     *
     * @param evt
     */
    private void Curso_action(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Curso_action
        Cursos bbb = new Cursos();
        showPanel(bbb.getFondo());
    }//GEN-LAST:event_Curso_action
    /**
     * Permite navegar a la pestanna de Inscripcciones
     *
     * @param evt
     */
    private void Inscrip_action(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inscrip_action
        Inscripciones bbb = new Inscripciones();
        showPanel(bbb.getFondo());
    }//GEN-LAST:event_Inscrip_action
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonPrincMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPrincMouseEntered
        ButtonPrinc.setBackground(new Color(189, 146, 64));
        LabelButtonModificar2.setForeground(new Color(25, 34, 43));

    }//GEN-LAST:event_ButtonPrincMouseEntered
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonPrincMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPrincMouseExited
        ButtonPrinc.setBackground(new Color(25, 34, 43));
        LabelButtonModificar2.setForeground(new Color(221, 214, 204));

    }//GEN-LAST:event_ButtonPrincMouseExited
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonAlumnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAlumnMouseEntered
        ButtonAlumn.setBackground(new Color(189, 146, 64));
        LabelButtonModificar3.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ButtonAlumnMouseEntered
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonAlumnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAlumnMouseExited
        ButtonAlumn.setBackground(new Color(25, 34, 43));
        LabelButtonModificar3.setForeground(new Color(221, 214, 204));
    }//GEN-LAST:event_ButtonAlumnMouseExited
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonCursoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCursoMouseEntered
        ButtonCurso.setBackground(new Color(189, 146, 64));
        LabelButtonModificar4.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ButtonCursoMouseEntered
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonCursoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCursoMouseExited
        ButtonCurso.setBackground(new Color(25, 34, 43));
        LabelButtonModificar4.setForeground(new Color(221, 214, 204));
    }//GEN-LAST:event_ButtonCursoMouseExited
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonInscMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonInscMouseEntered
        // TODO add your handling code here:ButtonInsc
        ButtonInsc.setBackground(new Color(189, 146, 64));
        LabelButtonModificar5.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ButtonInscMouseEntered
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonInscMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonInscMouseExited
        // TODO add your handling code here:
        ButtonInsc.setBackground(new Color(25, 34, 43));
        LabelButtonModificar5.setForeground(new Color(221, 214, 204));
    }//GEN-LAST:event_ButtonInscMouseExited
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonAjustesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAjustesMouseEntered
        // TODO add your handling code here: ButtonAjustes
        ButtonAjustes.setBackground(new Color(189, 146, 64));
        LabelButtonModificar.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ButtonAjustesMouseEntered
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonAjustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAjustesMouseExited
        // TODO add your handling code here:
        ButtonAjustes.setBackground(new Color(25, 34, 43));
        LabelButtonModificar.setForeground(new Color(221, 214, 204));
    }//GEN-LAST:event_ButtonAjustesMouseExited
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonPrincMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPrincMouseReleased
        ButtonPrinc.setBackground(new Color(189, 146, 64));
        LabelButtonModificar2.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ButtonPrincMouseReleased
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonPrincMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPrincMousePressed
        ButtonPrinc.setBackground(new Color(184, 67, 87));
        LabelButtonModificar2.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_ButtonPrincMousePressed
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonAlumnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAlumnMousePressed
        ButtonAlumn.setBackground(new Color(184, 67, 87));
        LabelButtonModificar3.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_ButtonAlumnMousePressed
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonAlumnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAlumnMouseReleased
        ButtonAlumn.setBackground(new Color(189, 146, 64));
        LabelButtonModificar3.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ButtonAlumnMouseReleased
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonCursoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCursoMousePressed
        ButtonCurso.setBackground(new Color(184, 67, 87));
        LabelButtonModificar4.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_ButtonCursoMousePressed
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonCursoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCursoMouseReleased
        ButtonCurso.setBackground(new Color(189, 146, 64));
        LabelButtonModificar4.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ButtonCursoMouseReleased
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonInscMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonInscMousePressed
        ButtonInsc.setBackground(new Color(184, 67, 87));
        LabelButtonModificar5.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_ButtonInscMousePressed
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonInscMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonInscMouseReleased
        ButtonInsc.setBackground(new Color(189, 146, 64));
        LabelButtonModificar5.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ButtonInscMouseReleased
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonAjustesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAjustesMousePressed
        // TODO add your handling code here:
        ButtonAjustes.setBackground(new Color(184, 67, 87));
        LabelButtonModificar.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_ButtonAjustesMousePressed
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void ButtonAjustesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAjustesMouseReleased
        // TODO add your handling code here:
        ButtonAjustes.setBackground(new Color(189, 146, 64));
        LabelButtonModificar.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_ButtonAjustesMouseReleased
    /**
     * Permite cerrar el programa generando una copia local de la base de datos
     *
     * @param evt
     */
    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
        //System.exit(0);

    }//GEN-LAST:event_exitMouseClicked
    /**
     * Permite reconocer las coordenadas del raton para poder mover la pantalla
     *
     * @param evt
     */
    private void movimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movimientoMousePressed
        xEje = evt.getX();
        yEje = evt.getY();
    }//GEN-LAST:event_movimientoMousePressed
    /**
     * Permite mover la ventana por la pantalla
     *
     * @param evt
     */
    private void movimientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movimientoMouseDragged
        int vert = evt.getXOnScreen();
        int horiz = evt.getYOnScreen();
        this.setLocation(vert - xEje, horiz - yEje);

    }//GEN-LAST:event_movimientoMouseDragged
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setBackground(Color.black);
        exiit.setForeground(Color.WHITE);
    }//GEN-LAST:event_exitMouseEntered
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBackground(Color.black);
        exiit.setForeground(Color.WHITE);
    }//GEN-LAST:event_exitMouseExited

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
    private javax.swing.JPanel ButtonAjustes;
    private javax.swing.JPanel ButtonAlumn;
    private javax.swing.JPanel ButtonCurso;
    private javax.swing.JPanel ButtonInsc;
    private javax.swing.JPanel ButtonPrinc;
    private javax.swing.JLabel LabelButtonModificar;
    private javax.swing.JLabel LabelButtonModificar2;
    private javax.swing.JLabel LabelButtonModificar3;
    private javax.swing.JLabel LabelButtonModificar4;
    private javax.swing.JLabel LabelButtonModificar5;
    private javax.swing.JLabel LabelDate;
    private javax.swing.JLabel LabelTime;
    private javax.swing.JPanel PanelBotonera;
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JPanel PanelFecha;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel PanelHeader;
    private javax.swing.JPanel PanelHora;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JLabel exiit;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel movimiento;
    // End of variables declaration//GEN-END:variables
}
