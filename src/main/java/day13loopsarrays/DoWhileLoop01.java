package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //Example 1: Kullanıcıdan bir sayi aliniz. Sayi 100 den kucukse ekrana 'Kazandın!' yazdiriniz. Aksi halde
        //ekrana 'Kaybettin' yazdiriniz. Kullanıcı kazandikca oyun devam etmeli.


        Scanner scan = new Scanner(System.in);
//        int sayi;
//        do {
//            System.out.println("Lutfen bir sayi giriniz");
//            sayi = scan.nextInt();
//            if(sayi < 100) {
//                System.out.println("Kazandin!");
//            } else{
//                System.out.println("Kaybettin!");
//            }
//        }while (sayi < 100);


        //Example 2: Kullanicidan ismini aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz.

        String isim = "";
        int k = 1;

        do {
            System.out.println("Lutfen ismini gir");
            isim = scan.next();
            char ch = isim.charAt(0);

            if(ch >= 'a' && ch <= 'z') {
                System.out.println("Ismi yanlis girdiginiz icin islem iptal edilmistir. ");
            }else {
                System.out.println("Ismi basariyla girdiniz");
                break;
            }

            k++;
        }while (k<4);

        //Infinite Loop: Sonsuz dongu.

    }

}
