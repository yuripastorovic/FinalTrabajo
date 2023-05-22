/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaltrabajo;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author Jorge & Miguel
 */
/**
 * La clase Reloj es la clase que contiene todos los metodos que relacionados
 * con fechas y horas
 *
 */
public class Reloj {

    /**
     * Devuelve la fecha actual en formato DIA DE LA SEMANA(texto), DIA(numero
     * de dia en mes) DE MES(texto) DE AÑO
     *
     * @return
     */
    public static String getFechaActual() {
        ZoneId zoneId = ZoneId.of("Europe/Madrid");
        ZonedDateTime zdt = ZonedDateTime.now(zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        Locale locale = new Locale("es", "ES");
        formatter = formatter.withLocale(locale);
        String output = zdt.format(formatter);
        String fecha = output;
        String mayus = "" + fecha.charAt(0);
        fecha = mayus.toUpperCase() + fecha.substring(1);
        return fecha;
    }
    /**
     * Devuelve la hora actual en el formato HH:mm:ss
     * @return 
     */
    public static String getHoraActual() {
        String hora = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        return hora;
    }

}
