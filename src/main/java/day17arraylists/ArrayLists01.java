package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);

        List<String> cities = new ArrayList<String>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

        names.removeAll(cities); //removeALL()methodu bir list'ten başka bir list'deki aynı olan elemanları siler.
                                 //removeAll()methodu ilk list'i degistirir. Ikinci list'i degistirmez
        System.out.println(names);
        System.out.println(cities);

        List<String> myNames = new ArrayList<String>();
        myNames.add("Thomas");
        myNames.add("Tahsin");

        boolean isContain = names.containsAll(myNames);
        System.out.println(isContain);


        // Example 1: a listinde shoes elemaninin ilk gorunumunu siliniz
        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        a.remove("Shoes");
        System.out.println(a);

        //Example 1: "a" listinde "Shoes" elemaninin tum gorunumlerini siliniz
        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");

        a.removeAll(silinecekler);
        System.out.println(a);//[TV, Radio, Laptop, Book]

        //Example 3: Bir tane salary listi olusturun,
        // eger salary 10000'den az ise %20 10000'den cok ise %10 zam yapiniz

        List<Double> salary = new ArrayList<Double>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);

        System.out.println(salary);

        for(Double w: salary) {
            if(w < 10000) {
                 salary.set(salary.indexOf(w), w*1.2);
            }else {
                salary.set(salary.indexOf(w), w*1.1);
            }
        }

        System.out.println(salary);

        //Ikı ArrayList'in esit olup olmadigini kontrol eden kodu yaziniz
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        boolean esitMi = m.equals(n);
        if(esitMi) {
            System.out.println("Listler esit");
        }else {
            System.out.println("Listler esit degil");
        }










    }

}
