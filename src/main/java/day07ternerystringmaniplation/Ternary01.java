package day07ternerystringmaniplation;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Bir sayinin pozitif olup olmadıgını ekrana yazdıran kodu yaziniz.
        int a = -12;
        String sonuc = a>0 ? "pozitif" : "Pozitif degil";
        System.out.println(sonuc);

        //Example 2: Ikı sayidan kucuk olani secen kodu yazinizi
        int b = 12;
        int c = 23;
        int sonuc2 = b<c ? b : c;
        System.out.println(sonuc2);

        //Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        int d = -45;
        int sonuc3 = d<0 ? d*(-1) : d;
        System.out.println(sonuc3);

        //Example 4: iki sayi ayni isaretli ise bu sayilari carpiniz, farkli isaretli ise "bu sayileri carpamam"
        // mesaji veriniz

        int e = 12;
        int f = -10;
        Object sonuc4 = (e>0 && f>0) || (e<0 && f<0) ? e*f : "Bu sayileri carpamam";
        //Ternary fakli data tiplerinde sonuc return ederse sonucun data tipini Object yapiniz.
        System.out.println(sonuc4);

        //Java'da her class'ın en az bir tane "parent" class'ı vardır. Sadece "Object" class'ın parent class'ı
        // yoktur.

    }

}
