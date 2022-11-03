package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArray01 {

    public static void main(String[] args) {

        //Bir tane Integer multi dimensional Array olustur ve
        //bu Array'deki tum sayilarin toplamini veren kodu yaz

        int arr[][] = {{2,5,1}, {32,75}, {13,21,43,56}};

        int sum = 0;

        for (int[] w : arr) {
            for (int k : w) {
                sum = sum + k;
            }
        }
        System.out.println(sum);


        //Bir multidimensional arrayi normal array a ceviren kodu yaziniz

        int arr2[][] = {{2,5,1}, {32,75}};
        int elemanSayisi = 0;

        for (int[] w : arr2) {
            elemanSayisi+= w.length;
        }

        int idx = 0
;
        int newArr[] = new int[elemanSayisi];

        for (int[] w : arr2) {
            for (int k : w) {
                newArr[idx] = k;
                idx++;
            }
        }

        System.out.println(Arrays.toString(newArr));

    }

}
