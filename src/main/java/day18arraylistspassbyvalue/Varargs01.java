package day18arraylistspassbyvalue;

public class Varargs01 {
     /*

        1)Farkli sayilardaki parametrelerle calisabilen bir method olusturmak isterseniz "varargs"
          kullanmalisiniz.

        2)"varargs" arka tarafta "Array" kullanir. Bu yuzden varargslarla calisirken,
          Arraylerle calisiyormus gibi davranabilirsiniz.

        3)"varargs" olusturmak icin "<data type>...<varargs ismi>"

        4)Bir method'da varargsin yanında baska bir parametre, varargs en sonda olmak sartıyla kullanilabilir.

        5)Bir methodda birden fazla varargs kullanilamaz.Cunku varargs en sonda olmak zorundadır.Birden fazla
          kullanildiginda en az bir varargs en sonda olmayacaktır. Bu da 4. madde ile celisir.

     */


    public static void main(String[] args) {

        int sonuc = topla(3,5);
        System.out.println(sonuc);

        int sonuc2 = ucSayiyiTopla(3,5, 1);
        System.out.println(sonuc2);

        int sonuc3 = dortSayiyiTopla(3,5, 1, 2);
        System.out.println(sonuc3);

        int sonuc4 = add(1,5,7,9,6);
        System.out.println(sonuc4);

    }
    //2 sayiyi toplayan method
    public static int topla (int a, int b) {
        return a + b;
    };
    //3 sayiyi toplayan method
    public static int ucSayiyiTopla (int a, int b,int c) {
        return  a + b + c;
    }
    //4 sayiyi toplayan method
    public static int dortSayiyiTopla (int a, int b,int c, int d) {
        return  a + b + c + d;
    }

    //Istedigimiz kadar sayiyi toplayabilecegimiz method
    public static int add(int... a) {
        int sum = 0;
        for ( int w : a) {
          sum+=w;
        }
        return sum;
    };

}
