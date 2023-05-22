/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaltrabajo;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author migue
 */
public class Herramientas {
    public int popUp1(String titulo, String contenido, String opcion0, String path) {
        UIManager UI = new UIManager();
        UI.put("JOptionPane.background", new Color(0, 0, 0));
        UI.put("Panel.background", new Color(221, 214, 204));//[]
        Object[] options = {opcion0};
        int opcion = JOptionPane.showOptionDialog(null, contenido, titulo, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, this.busca(path, 40, 40), options, options[0]);
        return opcion;
    }
    public int popUp2(String titulo, String contenido, String opcion0, String opcion1, String path) {
        UIManager UI = new UIManager();
        UI.put("JOptionPane.background", new Color(0, 0, 0));
        UI.put("Panel.background", new Color(221, 214, 204));//[]
        Object[] options = {opcion0, opcion1};
        int opcion = JOptionPane.showOptionDialog(null, contenido, titulo, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, this.busca(path, 40, 40), options, options[0]);
        return opcion;
    }
    public Icon busca(String ruta, int ancho, int alto) {
        Icon result = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH));
        return result;
    }

}
