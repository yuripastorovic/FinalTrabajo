/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finaltrabajo.vistas;

import finaltrabajo.BaseDatosAcademia;
import finaltrabajo.Herramientas;
import java.awt.Color;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JPanel;

/**
 *
 * @author yuripastorovic
 */
public class AjustesBBDD extends javax.swing.JFrame {

    public static Color AZUL = new Color(25, 34, 43); 
    public static Color BEIGE = new Color(221, 214, 204);
    /**
     * Creates new form AjustesBBDD
     */
    private Herramientas h1 = new Herramientas();

    public AjustesBBDD() {
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
        imagen_png = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        MODIFICAR = new javax.swing.JPanel();
        LabelButtonModificar = new javax.swing.JLabel();
        nameLabel2 = new javax.swing.JLabel();
        PASS = new javax.swing.JTextField();
        nameLabel1 = new javax.swing.JLabel();
        IP = new javax.swing.JTextField();
        nameLabel3 = new javax.swing.JLabel();
        PUERTO = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        USER = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CONECTAR = new javax.swing.JPanel();
        LabelButtonModificar1 = new javax.swing.JLabel();
        MariaDB_logo = new javax.swing.JLabel();
        caja = new javax.swing.JPanel();
        texto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(221, 214, 204));

        imagen_png.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaltrabajo/vistas/icon/BBDD.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(221, 214, 204));

        MODIFICAR.setBackground(new java.awt.Color(25, 34, 43));
        MODIFICAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MODIFICAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MODIFICARModificar_press(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MODIFICARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MODIFICARMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MODIFICARMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MODIFICARMouseReleased(evt);
            }
        });

        LabelButtonModificar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonModificar.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonModificar.setText("MODIFICAR");

        javax.swing.GroupLayout MODIFICARLayout = new javax.swing.GroupLayout(MODIFICAR);
        MODIFICAR.setLayout(MODIFICARLayout);
        MODIFICARLayout.setHorizontalGroup(
            MODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MODIFICARLayout.setVerticalGroup(
            MODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        nameLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nameLabel2.setForeground(new java.awt.Color(25, 34, 43));
        nameLabel2.setText("CONTRASEÑA");

        PASS.setBackground(new java.awt.Color(25, 34, 43));
        PASS.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        PASS.setForeground(new java.awt.Color(196, 190, 181));
        PASS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PASS.setText("*********");
        PASS.setBorder(null);
        PASS.setSelectedTextColor(new java.awt.Color(25, 34, 43));
        PASS.setSelectionColor(new java.awt.Color(184, 67, 87));
        PASS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PASSMouseClicked(evt);
            }
        });
        PASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASSActionPerformed(evt);
            }
        });

        nameLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nameLabel1.setForeground(new java.awt.Color(25, 34, 43));
        nameLabel1.setText("USUARIO");

        IP.setBackground(new java.awt.Color(25, 34, 43));
        IP.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        IP.setForeground(new java.awt.Color(196, 190, 181));
        IP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IP.setText("Introduzca IP");
        IP.setBorder(null);
        IP.setSelectedTextColor(new java.awt.Color(25, 34, 43));
        IP.setSelectionColor(new java.awt.Color(184, 67, 87));
        IP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IPMouseClicked(evt);
            }
        });

        nameLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nameLabel3.setForeground(new java.awt.Color(25, 34, 43));
        nameLabel3.setText("IP CONEXION");

        PUERTO.setBackground(new java.awt.Color(25, 34, 43));
        PUERTO.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        PUERTO.setForeground(new java.awt.Color(196, 190, 181));
        PUERTO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PUERTO.setText("Introduzca Puerto");
        PUERTO.setBorder(null);
        PUERTO.setSelectedTextColor(new java.awt.Color(25, 34, 43));
        PUERTO.setSelectionColor(new java.awt.Color(184, 67, 87));
        PUERTO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PUERTOMouseClicked(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(25, 34, 43));
        nameLabel.setText("PUERTO CONEXIÓN XAAMP");

        USER.setBackground(new java.awt.Color(25, 34, 43));
        USER.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        USER.setForeground(new java.awt.Color(196, 190, 181));
        USER.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        USER.setText("Introduzca usuario");
        USER.setBorder(null);
        USER.setSelectedTextColor(new java.awt.Color(25, 34, 43));
        USER.setSelectionColor(new java.awt.Color(184, 67, 87));
        USER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                USERMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PASS, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MODIFICAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nameLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addComponent(IP)
                    .addComponent(PUERTO, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(USER))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PUERTO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(USER, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(nameLabel2)
                .addGap(3, 3, 3)
                .addComponent(PASS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(184, 67, 87));

        jPanel3.setBackground(new java.awt.Color(189, 146, 64));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 34, 43));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><body>Este programa esta conectado<br>\ncon una base de datos MriaDB.<br>\nAsegurese de que ha encendido<br>\nla base de datos, antes de encender<br> \nel programa.<br>\nAsegurese de que el puerto de <br>\nconexion entre la aplicacion y <br>\nla de datos es el mismo \n</body></html>");

        CONECTAR.setBackground(new java.awt.Color(25, 34, 43));
        CONECTAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CONECTAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CONECTARModificar_clicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CONECTARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CONECTARMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CONECTARMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CONECTARMouseReleased(evt);
            }
        });

        LabelButtonModificar1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        LabelButtonModificar1.setForeground(new java.awt.Color(221, 214, 204));
        LabelButtonModificar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelButtonModificar1.setText("CONECTAR");

        javax.swing.GroupLayout CONECTARLayout = new javax.swing.GroupLayout(CONECTAR);
        CONECTAR.setLayout(CONECTARLayout);
        CONECTARLayout.setHorizontalGroup(
            CONECTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        );
        CONECTARLayout.setVerticalGroup(
            CONECTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelButtonModificar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        MariaDB_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaltrabajo/vistas/icon/MariaDB.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CONECTAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MariaDB_logo)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(MariaDB_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(CONECTAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(29, 29, 29)
                .addComponent(imagen_png)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(caja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(imagen_png)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelFondoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 757, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Permite cambiar parametros de configuracion de conexion con BBDD
     *
     * @param evt
     */
    private void MODIFICARModificar_press(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MODIFICARModificar_press
        if (!(IP.getText().trim().equals("")
                || PUERTO.getText().trim().equals("")
                || USER.getText().trim().equals("")
                || PASS.getText().trim().equals("")
                || IP.getText().trim().equals("Introduzca IP")
                || PUERTO.getText().trim().equals("Introduzca Puerto")
                || USER.getText().trim().equals("Introduzca usuario")
                || PASS.getText().trim().equals("*********")
                || IP.getText().trim().contains(",")
                || PUERTO.getText().trim().contains(",")
                || USER.getText().trim().contains(",")
                || PASS.getText().trim().contains(","))) {

            String parametros = "ip = " + IP.getText() + "\n" + "puerto = " + PUERTO.getText() + "\n" + "db = " + "\n" + "usuario = " + USER.getText() + "\n" + "password = " + PASS.getText() + "\n";
            String dirFichero = "conf.prop";
            File fDatos = new File(dirFichero);
            if (!(fDatos.exists())) {
                try {
                    File comprobacion = new File(dirFichero);
                    comprobacion.createNewFile();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            FileOutputStream fileOut = null;
            BufferedOutputStream bufOut = null;
            ObjectOutputStream objOut = null;
            try {
                fileOut = new FileOutputStream(dirFichero);
                bufOut = new BufferedOutputStream(fileOut);
                objOut = new ObjectOutputStream(bufOut);
                objOut.writeObject(parametros);///////////////////////////////////////////////////////
                System.out.println("los datos se han ESCRITO EN : " + dirFichero);
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    objOut.close();
                    bufOut.close();
                    fileOut.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            h1.popUp1("AjustesBBDD", "MODIFICACION REALIZADA", "OK", "favicon-32x32.png");
            PUERTO.setBackground(AZUL);
            PUERTO.setForeground(BEIGE);
            PUERTO.setText("Introduzca Puerto");
            IP.setText("Introduzca IP");
            IP.setBackground(AZUL);
            IP.setForeground(BEIGE);
            PASS.setText("Introduzca usuario");
            PASS.setBackground(AZUL);
            PASS.setForeground(BEIGE);
            PASS.setBackground(AZUL);
            PASS.setForeground(BEIGE);
            PASS.setText("*********");
        } else {
            h1.popUp1("AjustesBBDD", "PORFAVOR INTRODUCE BIEN LOS DATOS", "OK", "favicon-32x32.png");
        }
    }//GEN-LAST:event_MODIFICARModificar_press
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton asi
     * como mostrar una descripcion del boton
     *
     * @param evt
     */
    private void MODIFICARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MODIFICARMouseEntered
        MODIFICAR.setBackground(new Color(189, 146, 64));
        LabelButtonModificar.setForeground(new Color(25, 34, 43));
        caja.setBackground(new Color(25, 34, 43));
        texto.setForeground(new Color(221, 214, 204));
        texto.setText("PERMITE MODICICAR AJUSTES DE CONEXION DE BASE DE DATOS");
    }//GEN-LAST:event_MODIFICARMouseEntered
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void MODIFICARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MODIFICARMouseExited
        MODIFICAR.setBackground(new Color(25, 34, 43));
        LabelButtonModificar.setForeground(new Color(221, 214, 204));
        caja.setBackground(new Color(221, 214, 204));
        texto.setText("");
    }//GEN-LAST:event_MODIFICARMouseExited
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void PASSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PASSMouseClicked
        PASS.setText("");
        PASS.setBackground(new Color(189, 146, 64));
        PASS.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_PASSMouseClicked
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void PUERTOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PUERTOMouseClicked
        PUERTO.setText("");
        PUERTO.setBackground(new Color(189, 146, 64));
        PUERTO.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_PUERTOMouseClicked
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void IPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IPMouseClicked
        IP.setText("");
        IP.setBackground(new Color(189, 146, 64));
        IP.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_IPMouseClicked
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void MODIFICARMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MODIFICARMousePressed
        MODIFICAR.setBackground(new Color(184, 67, 87));
        MODIFICAR.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_MODIFICARMousePressed
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void MODIFICARMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MODIFICARMouseReleased
        MODIFICAR.setBackground(new Color(189, 146, 64));
        MODIFICAR.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_MODIFICARMouseReleased
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void CONECTARMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONECTARMouseReleased
        CONECTAR.setBackground(new Color(189, 146, 64));
        CONECTAR.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_CONECTARMouseReleased
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void CONECTARMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONECTARMousePressed
        CONECTAR.setBackground(new Color(221, 214, 204));
        LabelButtonModificar1.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_CONECTARMousePressed
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void CONECTARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONECTARMouseExited
        CONECTAR.setBackground(new Color(25, 34, 43));
        LabelButtonModificar1.setForeground(new Color(221, 214, 204));
        caja.setBackground(new Color(221, 214, 204));
        texto.setText("");
    }//GEN-LAST:event_CONECTARMouseExited
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton asi
     * como mostrar una descripcion del boton
     *
     * @param evt
     */
    private void CONECTARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONECTARMouseEntered
        CONECTAR.setBackground(new Color(184, 67, 87));
        LabelButtonModificar1.setForeground(new Color(25, 34, 43));
        caja.setBackground(new Color(25, 34, 43));
        texto.setForeground(new Color(221, 214, 204));
        texto.setText("ACTUALIZA Y RESTABLECE CONEXION CON LA BASE DE DATOS");
    }//GEN-LAST:event_CONECTARMouseEntered
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void CONECTARModificar_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONECTARModificar_clicked
        BaseDatosAcademia bc = new BaseDatosAcademia();
        CONECTAR.setBackground(new Color(184, 67, 87));
        CONECTAR.setForeground(new Color(189, 146, 64));
    }//GEN-LAST:event_CONECTARModificar_clicked
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void USERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_USERMouseClicked
        USER.setText("");
        USER.setBackground(new Color(189, 146, 64));
        USER.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_USERMouseClicked
    /**
     * Permite hacer cambiar el color del boton por interaccion del raton
     *
     * @param evt
     */
    private void PASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASSActionPerformed
        PASS.setText("");
        PASS.setBackground(new Color(189, 146, 64));
        PASS.setForeground(new Color(25, 34, 43));
    }//GEN-LAST:event_PASSActionPerformed

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
            java.util.logging.Logger.getLogger(AjustesBBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjustesBBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjustesBBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjustesBBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjustesBBDD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CONECTAR;
    private javax.swing.JTextField IP;
    private javax.swing.JLabel LabelButtonModificar;
    private javax.swing.JLabel LabelButtonModificar1;
    private javax.swing.JPanel MODIFICAR;
    private javax.swing.JLabel MariaDB_logo;
    private javax.swing.JTextField PASS;
    private javax.swing.JTextField PUERTO;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JTextField USER;
    private javax.swing.JPanel caja;
    private javax.swing.JLabel imagen_png;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel nameLabel3;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
