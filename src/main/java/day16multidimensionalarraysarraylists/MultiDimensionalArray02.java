package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArray02 {

    public static void main(String[] args) {

        //Bir multidimansional arraydaki en buyuk ve en kucuk elemanin toplamini veren kodu yaz

        int arr[][] = {{2,5,1}, {83,75}};
        int elemanSayisi = 0;
        int idx = 0;

        for (int[] w : arr) {
            for (int s : w) {
                elemanSayisi++;
            }
        }

        int arr2[] = new int[elemanSayisi];

        for ( int[] w : arr) {
            for (int s : w) {
                arr2[idx] = s;
                idx++;
            }
        }
        Arrays.sort(arr2);
        System.out.println("En buyuk deger: " + arr2[arr2.length-1] + " ve En kucuk deger: " + arr2[0]);
    }

}
