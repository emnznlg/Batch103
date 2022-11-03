package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*
            Java primitive'lere methodlar ekleyerek yeni bir yapı oluşturdu.
            Bu yapıya "Wrapper Class" denir.
         */

        byte primitiveByte = 12; // bunda hiç method yok çünkü primitivelerde method olmaz


        Byte wrapperByte = 12; // Bunda pek çok method var. Çünkü wrapper'lar method içerir.

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        float f1 = 45.8F;
        Float f1Wrapper = f1; // Bu olayın ismi Autoboxing.

        Character c = 'a';
        char newC = c; // Bu olayın ismi Unboxing.

        // Note: Autoboxing ve unboxing Java tarafından otomatik olarak yapılır.





    }


}
