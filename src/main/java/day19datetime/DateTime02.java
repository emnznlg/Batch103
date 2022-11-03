package day19datetime;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTime02 {

    public static void main(String[] args) {

        //Example 1: Java dan alinan tarihi ay/gun/yil olarak yaziniz
        LocalDate currentDate = LocalDate.of(2022,9,24);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = dtf.format(currentDate);
        System.out.println(formattedDate);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2 = dtf2.format(currentDate);
        System.out.println(formattedDate2);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate3 = dtf3.format(currentDate);
        System.out.println(formattedDate3);

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");
        String formattedDate4 = dtf4.format(currentDate);
        System.out.println(formattedDate4);

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("M/dd/yy");
        String formattedDate5 = dtf5.format(currentDate);
        System.out.println(formattedDate5);


    }

}
