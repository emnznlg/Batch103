package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {

    public static void main(String[] args) {

        //Example 1: Asagidaki sekli ekrana yazdiran kodu yazinin
            // ****
            // ****
            // ****

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Satir sayisiniz giriniz");
//        int satir = scan.nextInt();
//        System.out.println("Sutun sayisiniz giriniz");
//        int sutun = scan.nextInt();
//
//        for (int i = 1; i < satir; i++) {
//            for (int j = 1; j < sutun; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        //Example 2: Asagidaki sekli cizen kodu yaziniz
            /*
                1
                12
                123
                1234
                12345

             */

//        for (int i = 1; i < 4; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + "  ");
//            }
//            System.out.println();
//        }

        //Example 3: Asagidaki sekli cizen kodu yaziniz

        for (int i = 1; i < 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

}
