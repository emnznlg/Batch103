package day06nestedifswitch;

import java.util.Scanner;

public class NestedIf01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen şifrenizi giriniz");
        String userPassword = scan.nextLine();

        char userPasswordFirstCharacter = userPassword.charAt(0);

        boolean isUpperCase = userPasswordFirstCharacter >= 'A' &&
                              userPasswordFirstCharacter <= 'Z';

        boolean isLowerCase = userPasswordFirstCharacter >= 'a' &&
                              userPasswordFirstCharacter <= 'z';

        if(isUpperCase) {
            boolean isCorrect = userPasswordFirstCharacter == 'A';
            if(isCorrect) {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }
        } else if(isLowerCase) {
            boolean isCorrect = userPasswordFirstCharacter == 'z';
            if(isCorrect) {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }
        } else {
            System.out.println("Ilk karakter harf olmalıdır.");
        }

//        Note: Java "nested" kodlari calistirirken cok zaman harcar, buna "Time Complexity" denir.
//                Bu yuzden mumkunse "nested" kod yazmamaya calisiriz.
    }

}
