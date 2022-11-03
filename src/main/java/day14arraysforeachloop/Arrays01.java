package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    public static void main(String[] args) {

        //Arrays'lerin icine sadece primitive data tipleri ve refference'lar yerlestirilebilir

        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprise you!";
        System.out.println(Arrays.toString(str));

        //String bir Array olusturunuz ve "Tom" dan onceki tum elemanlari ve "Tom" u yazdiriniz

        String arr[] = {"Ali", "Veli", "Kamil", "Tom", "Jane", "Mahmut"};


        for (String w : arr) {
            System.out.print(w + " ");
            if (w.endsWith("Tom")) {
                break;
            }
        }

        System.out.println();

        //String bir Array olusturunuz. "Tom" ve "Jane" haric tum elemanlari yazdiriniz

        String str3[] = {"Tom", "Jane", "Ali", "Rojda", "Mahmut",};

        for (String w : str3) {
            if (w.equals("Tom") || w.equals("Jane")) {
                continue;
            }
            System.out.print(w + " ");
        }

        System.out.println();


        //Bir ogretmenin sinifindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.
        // ( Kullanici ile bir Array olusturunuz ve icine data ekleyiniz )
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ogrenci sayisini giriniz");
        int stdNum = scan.nextInt();

        String stdNames[] = new String[stdNum];

        System.out.println("Lutfen cıkmak istediginiz zaman 'Q' tusuna basiniz");

        for (int i = 1; i <= stdNum; i++) {
            System.out.println("Lutfen " + i + ". ogrencinin adini giriniz");
            String name = scan.next();
            if(name.equalsIgnoreCase("Q")) {
                break;
            }
            stdNames[i - 1] = name;
        }
        System.out.println(Arrays.toString(stdNames));

    }
}
