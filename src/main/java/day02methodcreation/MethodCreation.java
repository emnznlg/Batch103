package day02methodcreation;

public class MethodCreation {


    // main method içinde kullanacağınız herşey "static" olmalıdır.
    public static void main(String[] args) {

        System.out.println(toplamaYap(7,4));
        System.out.println(ucSayiyiCarp(7,4, 8));
        System.out.println(ilkIkisiniToplaUcuncuIleCarp(1.5,11,8));



    }

    // Example 1: Toplama işlemi yapan bir method olusturunuz.
    public static double toplamaYap(double a, double b) {
        return a + b;
    }

    // Example 2: Uc sayiyi birbiri ile carpan bir method olustur.
    public static double ucSayiyiCarp(double x, double y, double z) {
        return x * y * z;
    }

    // Example 3: Uc sayidan ilk ikisini toplayip ucuncu ile carpan bir method olusturup sonucu ekrana yazdırınız
    public static double ilkIkisiniToplaUcuncuIleCarp(double s1, double s2, double s3) {
        return (s1 + s2) * s3;
    }
}
