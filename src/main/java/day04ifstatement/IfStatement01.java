package day04ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {

        int sayi = -15;

        if (sayi > 0) {
            System.out.println("pozitif");
        } else {
            System.out.println("Negatif");
        }

        char karakter = 'a';

        if(karakter >= 'A' && karakter <= 'Z') {
            System.out.println("Büyük Harf");
        } else {
            System.out.println("Küçük harf");
        }

        int sayi11 = -126;
        sayi11 = Math.abs(sayi11);

        if(sayi11 > 99 && sayi11 < 1000) {
            System.out.println( "Uc basamaklı");
        } else {
            System.out.println("uc basamaklı degil");
        }

        int deger = -12;
        deger = Math.abs(deger);

        if(deger % 2 == 0) {
            System.out.println("Cift Sayidir");
        } else {
            System.out.println("Tek Sayidir");
        }

        int aa = 451;
        if( aa < 300 || aa > 1200) {
            System.out.println("Harika sayi");
        }else {
            System.out.println("Harika sayi degil");
        }

    }

}
