package day15arraysmultidimensionalarrays;

import day06nestedifswitch.Switch0;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example 1: Bir String'deki sesli harf sayisini bulan kodu yaz

        String str = "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki";

        //1.Yol

        String arr[] = str.toLowerCase().split("");
        int count = 0;

        for ( String w : arr ) {
            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    count++;
            }
        }

        System.out.println("Cumlede " + count + " tane sesli harf vardir.");


        //2.Yol

        for (String w : arr) {
            boolean sesliharfVarMi = w.equalsIgnoreCase("a") ||
                                     w.equalsIgnoreCase("e") ||
                                     w.equalsIgnoreCase("i") ||
                                     w.equalsIgnoreCase("o") ||
                                     w.equalsIgnoreCase("u");

            count = sesliharfVarMi ? count+1 : count;
        }


        System.out.println("Cumlede " + count + " tane sesli harf vardir.");


    }

}
