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
 * @author yuripastorovic
 */
public class utiles {

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

    public static String getHoraActual() {
        String hora = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        return hora;
    }

}
