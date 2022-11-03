package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //Binary Search Method: Bu methodu kullanarak
        //bir elemanın Array de olup olmadıgını anlarız

        int arr[] = {12,31,43,14,55};
        int sayi = 121;
        Arrays.sort(arr);//Binary Search Methodunu kullanmadan once mutlaka
                         //sort method kullanılmalıdır.

        //binary search olan elemanın indexini verir,
        //olmayan elemanın olsaydı hangi sirada olacagini, basina - koyup gosterir
        int idx1 = Arrays.binarySearch(arr, sayi);
        System.out.println(idx1);

        //NOT: binary search methodu tekrarlayan elemanlar icin kullanilmaz


    }

}
