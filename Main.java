package home_work2607;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        //convert from inputted text to LocalDate
        System.out.println("Date conversion from text (\"2020-07-26\") to date:");
        System.out.println(DateFormatUtil.convertDate("2020-07-26"));
        //System.out.println(DateFormatUtil.convertDate("2020-07-26").format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
        System.out.println("----------------------------------------------------");

        //convert from inputted text to LocalDateTime
        System.out.println("Date conversion from text (\"2020-07-26 11:30\") to dateTime:");
        System.out.println(DateFormatUtil.convertDateTime("2020-07-26 11:30"));
        System.out.println("----------------------------------------------------");

        //convert from inputted LocalDate to formatted text
        LocalDate date = LocalDate.of(2020, 9, 27);
        System.out.println("Date conversion from date ("+ date +") to text:");
        System.out.println(DateFormatUtil.convertDate(date));
        System.out.println("----------------------------------------------------");

        //convert from inputted LocalDateTime to formatted text
        LocalDateTime dateTime = LocalDateTime.of(2020,7,28,12,14);
        System.out.println("Date conversion from dateTime ("+dateTime+") to text:");
        System.out.println(DateFormatUtil.convertDateTime(dateTime));
        System.out.println("----------------------------------------------------");

    }
}
