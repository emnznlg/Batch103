package day03typecastingwrapperscanner;


import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("yaşınız nedir?");

        byte age = scan.nextByte();

        System.out.println("yaşınız: " + age);

    }

}
