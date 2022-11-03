package day05ifStatement;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi yazınız");

        String gun = scan.next();

        //1.Yol
//
//        if (gun.equalsIgnoreCase("Pazar")) {
//            System.out.println("Hafta sonu...");
//        } else if (gun.equalsIgnoreCase("Pazartesi")) {
//            System.out.println("Hafta içi...");
//        } else if (gun.equalsIgnoreCase("Salı")) {
//            System.out.println("Hafta içi...");
//        } else if (gun.equalsIgnoreCase("Çarşamba")) {
//            System.out.println("Hafta içi...");
//        } else if (gun.equalsIgnoreCase("Perşembe")) {
//            System.out.println("Hafta içi...");
//        } else if (gun.equalsIgnoreCase("Cuma")) {
//            System.out.println("Hafta içi...");
//        } else if (gun.equalsIgnoreCase("Cumartesi")) {
//            System.out.println("Hafta sonu...");
//        }else {
//            System.out.println("Geçerli bir gün ismi giriniz...");
//        }
//
//
        //2.Yol

//        if(gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")){
//            System.out.println("Hafta sonu...");
//        }else if(gun.equalsIgnoreCase("Pazartesi") ||
//                 gun.equalsIgnoreCase("Sali") ||
//                 gun.equalsIgnoreCase("Carsamba") ||
//                 gun.equalsIgnoreCase("Persembe") ||
//                 gun.equalsIgnoreCase("Cuma")){
//            System.out.println("Hafta ici...");
//        }else{
//            System.out.println("Gecerli bir gun ismi giriniz...");
//        }

        //3.Yol

//        boolean haftaSonuMu = gun.equalsIgnoreCase("Pazar") ||
//                              gun.equalsIgnoreCase("Cumartesi");
//
//        boolean haftaIciMi = gun.equalsIgnoreCase("Pazartesi") ||
//                             gun.equalsIgnoreCase("Sali") ||
//                             gun.equalsIgnoreCase("Carsamba") ||
//                             gun.equalsIgnoreCase("Persembe") ||
//                             gun.equalsIgnoreCase("Cuma");
//
//        if(haftaSonuMu){
//            System.out.println("Hafta sonu...");
//        }else if(haftaIciMi) {
//            System.out.println("Hafta içi...");
//        }else {
//            System.out.println("Gecerli bir gun ismi girmediniz...");
//        }
    }

}
