package day05ifStatement;

import java.util.Scanner;

public class Ifstatement02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen gün numarasını giriniz");
        byte numara = scan.nextByte();

        if(numara == 1) {
            System.out.println("Pazar");
        } else if(numara == 2) {
            System.out.println("Pazartesi");
        } else if(numara == 3) {
            System.out.println("Sali");
        } else if(numara == 4) {
            System.out.println("Carsamba");
        } else if(numara == 5) {
            System.out.println("Persembe");
        } else if(numara == 6) {
            System.out.println("Cuma");
        } else if(numara == 7) {
            System.out.println("Cumartesi");
        } else {
            System.out.println("Yanlis girdiniz. Bir hafta 7 gundur");
        }

    }

}
