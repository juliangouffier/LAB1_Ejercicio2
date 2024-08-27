package org.example;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author Hernan
 * @author Julian
 * @author Valeria
 * @author Franco
 */

public class DateUtils {

    public static String obtenerDiaPorDate(LocalDate date){
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
    }
}
