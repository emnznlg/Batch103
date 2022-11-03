package day06nestedifswitch;

import java.util.Scanner;

public class Switch0 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ay ismini giriniz");
        String ayIsmi = scan.next();

        switch (ayIsmi) {
            case "ocak":
                System.out.println("Ocak");
            case "subat":
                System.out.println("Subat");
            case "mart":
                System.out.println("Mart");
            case "nisan":
                System.out.println("Nisan");
            case "mayis":
                System.out.println("Mayis");
            case "haziran":
                System.out.println("Haziran");
            case "temmuz":
                System.out.println("Temmuz");
            case "agustos":
                System.out.println("Agustos");
            case "eylul":
                System.out.println("Eylul");
            case "ekim":
                System.out.println("Ekim");
            case "aralık":
                System.out.println("Aralık");
                break;
            default:
                System.out.println("gecerli ay ismi girmedin");
        }

    }

}
