package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {

    public static void main(String[] args) {

        // ExampLe 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz
        //            [2, 3, 12, 0, 0, 0]

        int arr2[] = {0,2,3,0,12,0};
        int newArr2[] = new int[arr2.length];
        int idx = 0;

        for(int w: arr2) {
            if(w != 0) {
                newArr2[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr2));

        System.out.println();

        //Example 2: Bir Array in icinde herhangi bir elemanin olup olmadigini kontrol eden kodu yaziniz

        String arr[] = {"Ali", "Veli", "Mahmut", "Ali"};
        String eleman = "Ayse";
        int count = 0;
        for (String w : arr) {
            if(w.equals(eleman)) {
                count++;
            }
        }

        if(count == 0) {
            System.out.println("Eleman Array de yoktur");
        }else {
            System.out.println(eleman + " elemani Array de " + count + " kere vardir.");
        }

        ////Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz

        String cumle = "Javaaaaaaaaaaaaa kolaydir calisana, ne kolay ki calismayana";
        String yeniCumle = cumle.replaceAll("\\p{Punct}", "");
        String kelimeler[] = yeniCumle.split(" ");

        Arrays.sort(kelimeler, Comparator.comparingInt(String::length));

        System.out.println("En uzun kelime: " + kelimeler[kelimeler.length - 1]);


    }

}
