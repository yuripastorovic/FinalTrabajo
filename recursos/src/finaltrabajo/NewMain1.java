/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finaltrabajo;

/**
 *
 * @author yuripastorovic
 */

        import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewMain1 {
  public static void main(String[] a) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel outerPanel = new JPanel(new BorderLayout());
    JPanel topPanel = new JPanel(new BorderLayout());
    JLabel label = new JLabel("Name:");
    JTextField text = new JTextField();
    topPanel.add(label, BorderLayout.BEFORE_LINE_BEGINS);
    topPanel.add(text, BorderLayout.CENTER);
    outerPanel.add(topPanel, BorderLayout.BEFORE_FIRST_LINE);

    frame.add(outerPanel);
    frame.setSize(300, 200);
    frame.setVisible(true);

  }
}

