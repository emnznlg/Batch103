package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        System.out.println("Lütfen adınızı giriniz");
//        char ad = scan.next().charAt(0);
//        System.out.println("Lütfen soyadınızı giriniz");
//        char soyAd = scan.next().charAt(0);
//
//        System.out.print("" + ad + soyAd);

        System.out.println("Tam ismi gir:");
        String tamIsim = scan.nextLine();

        char ilkisim = tamIsim.charAt(0);
        System.out.print(ilkisim);

        char ikincIsim = tamIsim.split(" ")[1].charAt(0);
        System.out.print(ikincIsim);

    }

}
