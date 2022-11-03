package day19datetime;


import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {

        //Example 1: "Anlik Tarihi" ekrana bastiran kodu yaz
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        //"Anlik zamani" ekrana bastiran kodu yaz
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //Example 3: "Anlik tarihi ve Anlik zamani" ekrana bastiran kodu yaz
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        //Example 4: Japonyadaki "Anlik tarihi ve Anlik zamani" ekrana bastiran kodu yaz
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);

        //Example 5: Bugunden 789 gun sonra emekli olacaginiza gore emeklilik tarihini hesaplayan kodu yaziniz
        LocalDate countDate = LocalDate.of(2022,10,24);
        LocalDate retirementDay = countDate.plusDays(789);
        System.out.println(retirementDay);

        //Example 6: Ikı cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz
        LocalDate firstChild = LocalDate.of(2005,5,17);
        LocalDate secondChild = LocalDate.of(2013,2,8);
        Long yasFarki = ChronoUnit.DAYS.between(firstChild, secondChild);
        System.out.println(yasFarki);

        //Example 7: Istanbulun Fethi ile Cumhuriyetin kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz
        LocalDate istanbulunFethi = LocalDate.of(1453,5,29);
        LocalDate CumhuriyetinKurulusu = LocalDate.of(1923,10,29);
        Long ayFarki = ChronoUnit.MONTHS.between(istanbulunFethi, CumhuriyetinKurulusu);
        System.out.println(ayFarki);

        //Verilen tarihin hangi burcta yer aldigini bulan kodu yaziniz
        LocalDate dt = LocalDate.of(1989,12,7);
        int day = dt.getDayOfMonth();
        int month = dt.getMonthValue();

    }

}
