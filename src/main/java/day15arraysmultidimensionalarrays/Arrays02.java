package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1: Size verilen ve pozitif ve negatif sayilar iceren bir int Array'deki en buyuk negatif ve
        //en kucuk pozitif elemani bul.

        int arr[] = {-5,5,-45,89,-55,-1,0,78};

        Arrays.sort(arr);
        int idx = Arrays.binarySearch(arr,0);
        int enKucukPozitif = 0;
        int enBuyukNegatif = 0;

        if(idx < 0) {
            enBuyukNegatif = arr[idx-2];
            enKucukPozitif = arr[idx];
        }else {
            enBuyukNegatif = arr[idx-1];
            enKucukPozitif = arr[idx+1];
        }

        System.out.println(enBuyukNegatif + " " + enKucukPozitif);




//        int arr[] = {-5,-45,-89,-55,-1,0,78};
//        Arrays.sort(arr);
//        int maxNegative = arr[0];
//        int minPositive = arr[arr.length - 1];
//
//        for ( int w : arr) {
//
//            if(w < 0) {
//                maxNegative = Math.max(maxNegative,w);
//            }
//            if(w > 0) {
//                minPositive = Math.min(minPositive,w);
//            }
//        }
//
//        System.out.println("MinPositive: " + minPositive);
//        System.out.println("MaxNegative: " + maxNegative);

    }

}
