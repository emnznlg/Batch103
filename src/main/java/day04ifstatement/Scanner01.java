package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk adınızı giriniz:");
        String ad = scan.next();
        System.out.println("Lütfen göbek adınızı giriniz:");
        String gobekAd = scan.next();
        System.out.println("Lütfen soyadınızı giriniz:");
        String soyad = scan.next();
        System.out.println("Lütfen kimlik numaranızı giriniz:");
        String kimlikNo = scan.next();

        System.out.println(ad + " " + gobekAd + " " + soyad);
        System.out.println(kimlikNo);

    }

}
