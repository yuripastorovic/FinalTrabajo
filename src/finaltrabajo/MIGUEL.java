/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finaltrabajo;
//-------------------------------------------------------------------clase base de datos, y funcionalidades de esta MARIADLB+jar

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Jorge
 */
public class MIGUEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(getHoraDATE());
                
    }
    public static String getHoraDATE() {
        String hora = new SimpleDateFormat("dd-MM-yyyy - HH:mm:ss ").format(Calendar.getInstance().getTime());
        return hora;
    }
}
