package day08stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        // Example 1:

        String isim = "Ali okula gitti.";
        System.out.println(isim.replace(" ", "").length());

        //Example 2: Bir String'deki tüm 'a' harflerini 'A' ya çeviriniz.
        String s = "Ankara'nın tasina gozlerimin yasina bak";
        System.out.println(s.replace("a", "A"));

        //Example 2: Bir String'deki tüm sayilari "*" a çeviriniz.
        String a = "ID4546646";
        System.out.println(a.replaceAll("[0-9]","*"));

        /*
            Bir grup data'yı ifade eden kodlara "Regex" denir.
            "Regex" Regular Expressions'in kısaltılmış halidir.

            1)Tüm rakamlar ==> [0-9]
            2)Tüm küçük harfler ==> [a-z]
            3)Tüm büyük harfler ==> [A-Z]
            4)Tüm harfler ==> [a-zA-Z]
            5)Sesli hardler ==> [aeiouAEIOU]
            6)Space ==> [ ]
            7)Tüm rakamlar ve tüm harfler ==>[0-9a-zA-Z]
            8)Tum noktalama isaretleri ==> \\p{Punct}

            1) Rakamlar haric tum karakterler ==> [^0-9]
            2) kucuk harfler haric butun karakterler ==> [^a-z]
            3) Buyuk harfler haric tum karakterler.==> [^A-Z]
            4) Tum harfler haric tum karakterler ==> [^a-zA-Z]
            5) Space haric ==> [^ ]
        */

        //Example 5: Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric
        //tum karakterlerin sayisini bulan kodu yaziniz

        String u = "Ali 13 yasinda, dersem inanma...";

        int yeniU = u.replaceAll("[0-9]","").replace(" ", "").
                         replaceAll("\\p{Punct}", "").
                         length();
        System.out.println(yeniU);

        //Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
//           i)Space haric en az sekiz karakter olmali
//           ii)En az 1 sembol icermeli
//           iii)En az 1 rakam icermeli
//           iv)En az 1 buyuk harf icermeli
//           v)En az 1 kucuk harf icermeli

        String pwd = "B78c? K!m";

        boolean first = pwd.replace(" ", "").length() > 7;
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length() > 0;
        boolean third = pwd.replaceAll("[^0-9]", "").length() > 0;
        boolean fourth = pwd.replaceAll("[^A-Z]", "").length() > 0;
        boolean fifth = pwd.replaceAll("[^a-z]", "").length() > 0;
        boolean pwdGecerli = (first && second && third && fourth && fifth);
        System.out.println(pwdGecerli ? "Gecerli Sifre" : "Gecersiz Sifre");


        //Example 8: Verilen bir String "Al" ile başlıyor ve 'x' ile bitiyorsa ekrana "Harika" yazdirin
        //aksi durumda "Normal" yazdirin

        String v = "Alem";
        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");

        System.out.println(baslangic && bitis ? "Harika" : "Normal");



    }

}
