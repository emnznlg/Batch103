package day13loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int stdAges[] = new int[7];
        System.out.println(Arrays.toString(stdAges));

        stdAges[1] = 11;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;
        stdAges[0] = 12;

        //Example 1: Array deki en kucuk ve en buyuk elemanı ekrana yazdiriniz
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));

        int ilk = stdAges[0];
        //Arraylerde length parantezsiz kullanılır.
        int son = stdAges[stdAges.length -1];
        System.out.println(ilk + son);

        //Example 2: stdAges Array'i icindeki tum elemanlarin toplamini ekrana yazdiriniz

        int toplam = 0;
        for ( int w : stdAges) {
            toplam+=w;
        }
        System.out.println("******" + toplam);



        int sum = 0;
        for (int i = 0; i < stdAges.length; i++) {

            sum += stdAges[i];
        }
        System.out.println(sum);

        int sum2 = 0;
        int k = 0;
        while (k < stdAges.length) {
            sum2 += stdAges[k];
            k++;
        }

        System.out.println(sum2);

        int j = 0;
        int sum3 = 0;

        do {
            sum3 += stdAges[j];
            j++;
        }while (j < stdAges.length);

        System.out.println(sum3);


        //4.Yol for each loop Array'lerde ve Collections larda kullanılır

        int sum4 = 0;
        for (int w : stdAges) {
            sum4 += w;
        }

        System.out.println(sum4);

        //Example 3: String bir Array olusturunuz.
        //Bu Array e 5 tane isim yerlestiriniz
        //Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz

        String isimler[] = new String[5];
        isimler[0] = "Ali";
        isimler[1] = "Tom";
        isimler[2] = "Veli";
        isimler[3] = "Kemal";
        isimler[4] = "Cem";

        //For dongusu ile yapilisi
        for (int i = 0; i < isimler.length; i++) {
            toplam += isimler[i].length();
        }
        System.out.println(toplam);

        //While ile yapilisi
        int m = 0;
        while (m < isimler.length) {
            toplam+=isimler[m].length();
            m++;
        }
        System.out.println(toplam);

        //Example 4: Char bir Array olusturunuz
        //Bu Array e 5 eleman ekleyiniz
        //Bu Array deki sadece buyuk harfleri ekrana yazdiriniz

        char ch[] = {'A', 'c', 'D', 'k', 'M',};
        for(char w : ch) {
            if(w >= 'A' && w <= 'Z') {
                System.out.print(w);
            }
        }

    }

}
