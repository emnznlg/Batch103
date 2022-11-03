package day07ternerystringmaniplation;

public class NestedTernary01 {

    public static void main(String[] args) {

        /*Verilen kodun "leap year" olup olmadıgını kontrol eden kodu yaziniz.
          i) Yil 100'e bolunurse 400'e de bolunmelidir.
          ii) Yil 100'e bolunmezse 4'e bolunmelidir.
         */

        int year = 1600;
        String sonuc = year%100==0 ? (year%400==0 ? "Leap year" : "Leap year degil")
                                   : (year%4==0 ? "Leap year" : "Leap year degil");

        /*
        Asagidaki kurallara gore password'un gecerli oilup olmadigini kontrol eden kodu yaziniz
            i)Sekiz karakterden fazla veya sekiz karakter varsa ilk harfi 'i' olmalidir
            ii)Sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir
         */
        String pass = "K4645";
        char ch = pass.charAt(0);
        String sonuc1 = pass.length() < 8 ? (ch == 'K' ? "Sifre Dogru" : "Sifre yanlis")
                                          : (ch == 'i' ? "Sifre Dogru" : "Sifre yanlis");

        System.out.println(sonuc1);

    }

}
