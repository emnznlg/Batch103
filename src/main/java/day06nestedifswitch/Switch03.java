package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen islem isareti giriniz");
        char ch = scan.next().charAt(0);
        System.out.println("Lutfen ilk sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        double sayi2 = scan.nextDouble();

        switch (ch) {
            case '+':
                double sonuc = sayi1 + sayi2;
                System.out.println(sonuc);
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                System.out.println(sonuc);
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                System.out.println(sonuc);
                break;
            case '/':
                sonuc = sayi1 / sayi2;
                System.out.println(sonuc);
                break;
            default:
                System.out.println("Yanlis bir islem isareti yazdınız");
        }

    }

}
