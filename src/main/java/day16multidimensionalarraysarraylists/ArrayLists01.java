package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    /*
            ArrayList'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.
            Array ile ArrayList'in farki nedir?
            1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz
              Array'ler eleman sayisinda "fixed" dirler. Yani sonradan eleman sayisi degistirilemez
              ArrayList'leri olustururken eleman sayisi soylemeye gerek yok, cunku ArrayList'ler eleman sayisinda "flexible" dirlar.

            2)Array'lerin icine "primitive" ve "reference" lar konabilir
              ArrayList'lerin icine ise sadece "non-Primitive"ler konulur.

            3)Array'ler super fast, cok hizli. Array'ler memory'i cok az kullanir.
            Note: Eleman sayisi belli olan coklu datalari depolamak icin Array kullaniriz, ama
                  eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin
        */

    public static void main(String[] args) {

        //1.Yol
        ArrayList<Integer> ages = new ArrayList<Integer>();
        //2.Yol
        ArrayList<Integer> heights = new ArrayList<>();
        //3.Yol
        List<Integer> nums = new ArrayList<>();


        //ArrayList'ler nasil yazdirilir
        //add() her zaman elemani en sona ekler. (insertion order)
        nums.add(21);
        nums.add(18);
        nums.add(1, 25);
        nums.add(20);
        System.out.println(nums);

        List<Integer> prices = new ArrayList<>();
        prices.add(185);
        prices.add(789);

        nums.addAll(0, prices);
        System.out.println(nums);

        //Array List eleman sayisi nasil bulunur?
        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi);

        //Array List de herhangi bir eleman nasil secilir?
        int el1 = nums.get(2);  // get() istenen bir indexteki elemanı verir
        System.out.println(el1);

        //Array List in bos olup olmadigini nasil anlariz?
        boolean bos1 = nums.isEmpty();
        System.out.println(bos1);
        boolean bos2 = ages.isEmpty();
        System.out.println(bos2);

        //ArrayList'de bir eleman nasil degistirilir?
        nums.set(1,777);
        System.out.println(nums);

        //Example 1: nums ArrayList'indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz.
        for (int w : nums) {
            if(w % 2 == 1) {
                nums.set(nums.indexOf(w), w+11); // indexOf() ArrayList icindeki elemanın indexini verir.
            }
        }
        System.out.println(nums);

        //remove() method icine tamsayi koyarsaniz Java onu index olarak kabul eder

        // Note: Tüm tam sayılar Java için aksi söylenmedikçe primitive'dir, yani "int" dir.
        // Note 2: "primitive" ler ArrayList'lerin elemanı olamazlar.
        // Note 3: "primitive" i "Wrapper Class" a çevirirseniz, non-primitive olur
        // ve non-primitive ler ArrayList'lerin elemanı olur, index olamaz.

        Integer sayi = 196;
        nums.remove(sayi);
        System.out.println(nums);

    }

}
