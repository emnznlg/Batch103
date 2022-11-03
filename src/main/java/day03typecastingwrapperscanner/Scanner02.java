package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Example 1: Sayıları kullanıcıdan alan ve toplama işlemi yapan kodu yazınız.

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen 1.sayıyı giriniz:");
        double s1 = scan.nextDouble();
        System.out.println("lütfen 2.sayıyı giriniz:");
        double s2 = scan.nextDouble();
        System.out.println(s1 + s2);

    }


}
