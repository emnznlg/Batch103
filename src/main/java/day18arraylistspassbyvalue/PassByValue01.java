package day18arraylistspassbyvalue;

public class PassByValue01 {

    /*
        1-) Java, variable'ların orjinal değerlerini korumak ister.
        2-) Variable metotlar içinde kullanıldığında, Java metodun içine
        orijinal değer koymaz, o değerin kopyasını üretir ve metoda o kopyayı yollar.
        Metod kopya üstünde değişiklik yapar, dolayısıyla variable'ın
        orjinal değeri korunmuş olur. Bu sisteme Pass By Value denir.
        Note: Java Pass By Value kullanir. Pass By Refference kullanmaz...
        Note: Bazi programlama dilleri orjinal degeri koruma altina almamistir. Bu isi developerlara
        bırakmistir. Bu tarz diller Pass By Refference kullanir.
    */

    public static void main(String[] args) {

        int x = 5;
        change(x);

        int ucret = 100;
        System.out.println(ucret);

        int indirimliucret = indirim(ucret);
        System.out.println(indirimliucret);

        System.out.println(ucret);

    }
    //static method olan "main method' un icindeki her sey
    // static olmalidir.
    public static void change(int a) {
        System.out.println(a*3);
    }

    public static int indirim (int gomlekUcreti) {
        // void disindaki return type larda method body si icinde
        //return keyword kullanilmalidir
      return  gomlekUcreti - 10;
    };

}
