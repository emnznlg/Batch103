package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {

    public static void main(String[] args) {

        char arr[][] = {{'a', 'b', 'c'}, {'C', 'D', 'E'}, {'?'}}; //Kısayoldan multidimensional Array olusturma
        System.out.println(Arrays.deepToString(arr)); //deepToString multidimensional Array'i yazdirir

        //Bir String multidimansional Array'de icinde 'a' olan elemanlari yazdiriniz

        String arr2[][] = {{"learning", "Java", "it"}, {"is", "easy"}};

        for (String[] w : arr2) {
            for ( String s : w) {
                if(s.contains("a")) {
                    System.out.print(s + " ");
                }
            }
        }

    }

}
