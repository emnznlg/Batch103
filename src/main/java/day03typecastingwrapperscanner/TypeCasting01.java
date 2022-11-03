package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type Casting: Bir numerik data tipini diğer nümerik data tipine çevirmektir.
    //       byte < short < int < long < float < double
    // Küçükten büyüğe: Auto Widening || Büyükten küçüğe: Explicit Narrowing

    public static void main(String[] args) {

        byte age = 15;
        int newAge = age; //Auto Widening

        long sayi = 456876L;
        short newSayi = (short) sayi; // Explicit Narrowing

        short s1 = 4563;
        double s2 = s1;

        float price = 12.99F;
        byte newPrice = (byte) price;

        long s3 = 158456L;
        int newS3 = (int) s3;
        System.out.println("newS3 = " + newS3);


        System.out.println(newPrice); // Java ondalık sayıyı tam sayıya çevirirken ondalık kısmı siler.





    }

}
