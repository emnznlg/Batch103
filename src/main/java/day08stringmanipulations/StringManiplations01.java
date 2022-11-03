package day08stringmanipulations;

import java.util.Scanner;

public class StringManiplations01 {

    public static void main(String[] args) {

//        //Example 1: Kullanıcıdan aldığımız ismin ilk ve son harfini ekrana yazdırınız.
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Lutfen isminizi yazınız");
//        String isim = scan.next().toUpperCase();
//
//        //1.Yol
////      char ilkHarf = isim.charAt(0);
////      char sonHarf = isim.charAt(isim.length() - 1);
//
//        //2.Yol
//        String ilkHarf = isim.substring(0,1);
//        String sonHarf = isim.substring(isim.length() - 1);
//
//        System.out.println("İsminizin ilk harfi: " + ilkHarf + " ve isminizin son harfi: " + sonHarf);

//        //Example 2: Verilen String'deki sadece hayvan isimlerini ekrana yazdırınız
//        // "Ben kedi, esim tavuk, oglum inek sever"
//
//        String str = "Ben kedi, esim tavuk, oglum inek sever.";
//        System.out.println(str.substring(4,8));
//        System.out.println(str.substring(15,20));
//        System.out.println(str.substring(28,32));

        Scanner scan = new Scanner(System.in);
        System.out.println("Ad ve soyad bilginizi giriniz");
        String tamIsim = scan.nextLine().toUpperCase();
        char isimIlkharf = tamIsim.split(" ")[0].charAt(0);
        char soyIsimIlkharf = tamIsim.split(" ")[1].charAt(0);

        System.out.println(isimIlkharf + " " + soyIsimIlkharf);





    }

}
