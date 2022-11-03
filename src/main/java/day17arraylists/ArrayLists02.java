package day17arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists02 {

    public static void main(String[] args) {

        //Example 1:Verilen bir listteki elemanlari tekrasiz olarak yaziniz
        List<Integer> a = new ArrayList<Integer>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        List<Integer> newList = new ArrayList<Integer>();

        for (Integer w : a) {
            if(!newList.contains(w)) {
                newList.add(w);
            }
        }
        System.out.println(newList);

        //Example 2: Kullanıcıdan bir harf aliniz, harf List in icinde varsa o harfi bulunduya ceviriniz
        //yoksa o harfi List e ekleyiniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        String harf = scan.next().substring(0, 1);

        List<String> liste = new ArrayList<>();
        liste.add("a");
        liste.add("c");
        liste.add("z");
        liste.add("g");
        liste.add("w");

       if(liste.contains(harf)) {
            liste.set(liste.indexOf(harf), "Bulundu");
        }else {
            liste.add(harf);
        }

       System.out.println(liste);
    }
}
