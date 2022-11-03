package day12loops;

import java.util.Scanner;

public class WhileLoops01 {

    public static void main(String[] args) {

        //Example 1: 3'ten 10'a kadar tam sayilari ayni satirda ekrana yazdiran kodu yaziniz

//        for (int i = 3; i < 11; i++) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//
//        int i = 3;
//        while (i < 11) {
//            System.out.print(i + " ");
//            i++;
//        }
//
//        System.out.println();

        //Example 2: 17'den 4'e kadar tüm cift sayilari ekrana yazdiran kodu yaziniz

//        int j = 17;
//        while (j > 3) {
//            if(j%2==0) {
//                System.out.print(j + " ");
//            }
//            j--;
//        }
//
//        System.out.println();

        //Example 3: 12'den 67'yee kadar sayilarin toplamini ekrana yazdiran kodu yaziniz

//        int k = 12;
//        int sum = 0;
//
//        while (k < 68) {
//            sum+=k;
//            k++;
//        }
//        System.out.println(sum);

        //Example 4: Size verilen bir tamsayinin rakamlari toplamini ekrana yazdiran kodu yaziniz

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Lutfen bir tam sayi giriniz");
//        int sayi = scan.nextInt();
//        int sum1 = 0;
//        int count = 0;
//        while (sayi > 0) {
//            sum1 += sayi % 10;
//            sayi /= 10;
//            count++; //Basamak sayisini hesapladim.
//        }
//        System.out.println(sum1);
//        System.out.println("Girdiginiz sayi " + count + " basamaklidir");

        //Example 5: Kullanıcıdan aldiginiz bir sayinin carpim tablosunu ekrana yazdiran kodu yaziniz
        Scanner scann = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scann.nextInt();
        int sonuc = 1;

        int i = 1;
        while (i<11) {
            sonuc = sayi * i;
            System.out.print(sayi + "X" + i + "=" + sonuc + " ");
            i++;
        }
    }

}
