package day09stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Java is easy";

        System.out.println(str.indexOf("a")); // "a" yı bulduğu ilk index'i verir
        System.out.println(str.lastIndexOf("a")); // "a" yı bulduğu son index'i verir
        System.out.println(str.indexOf("ava")); // Buldugunda ilk karakterin index'ini verir

        //Ecample 1: Bir String'deki bir karakterin tekrarli veya tekrarsiz olup olmadıgını gosteren kodu yaz

        String str2 = "Helloooo";
        char ch = 'e';
        boolean isTekrarsiz = str2.indexOf(ch) == str2.lastIndexOf(ch);
        String sonuc = isTekrarsiz ? "Tekrarsiz" : "Tekrarli";
        System.out.println(sonuc);


        String u = "Learn java earn money";
        int sonuc2 = u.indexOf("e", 4); // Ilk 4 indexi atar ve sonra buldugu ilk 'e' yi yazar.
        System.out.println(sonuc2);

        String m = "hello everyone!";
        int e = m.lastIndexOf("e", 7); // Ilk 7 indexi atar ve sonra buldugu son 'e' yi yazar.

        System.out.println(e);


    }

}
