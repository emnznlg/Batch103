package day05ifStatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Soru 1:

//        System.out.println("Lütfen bir sayı giriniz");
//        int sayi = scan.nextInt();
//        Math.abs(sayi);
//        if(sayi % 2 == 0) {
//            System.out.println("Cift Sayidir");
//        } else {
//            System.out.println("Tek Sayidir");
//        }
//
//      //Soru 2:

        System.out.println("Lütfen bir sayi giriniz");
        int sayi2 = scan.nextInt();

        if (sayi2 < 0) {
            System.out.println("Bu sayi negatif sayidir.");
        } else if (sayi2 == 0) {
            System.out.println("Bu sayi nötr bir sayidir.");
        } else {
            System.out.println("Bu sayi pozitif bir sayidir.");
        }



    }

}
