package home_work2607;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateFormatUtil {

    public static LocalDate convertDate(String text) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter = formatter.withLocale(Locale.CANADA_FRENCH);
        LocalDate date = LocalDate.parse(text, formatter);

        String  dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CANADA);
        System.out.println(dayOfWeek);
        return date;
    }

    public static String convertDate(LocalDate date) {
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd/MMM/yy"));
        //String formattedDate = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return formattedDate;
    }

    public static String convertDateTime(LocalDateTime date) {
        String formattedDateTime = date.format(DateTimeFormatter.ofPattern("dd/MMM/yy HH:mm"));
        return formattedDateTime;
    }

    public static LocalDateTime convertDateTime(String text) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        formatter = formatter.withLocale(Locale.CANADA_FRENCH);
        LocalDateTime dateTime = LocalDateTime.parse(text, formatter);
        return dateTime;
    }
}
