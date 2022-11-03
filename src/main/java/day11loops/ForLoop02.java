package day11loops;

public class ForLoop02 {

    public static void main(String[] args) {

        //Example 1: 1 - 100 arası 6 ile bolunenler haric tum tam sayilari ekrana yazdiriniz.

//        for (int i = 1 ; i < 101 ; i++) {
//            if(i%6 == 0) {
//                continue;
//            }
//            System.out.print(i + " ");
//        }

        //Example 2: Size verilen String'deki "m" den önceki karakterleri yazdiriniz

        String str = "Luxemburmg";

        for(int i = 0 ; i < str.length() ; i++) {

            char ch = str.charAt(i);
            if(ch == 'm') {
                break;
            }
            System.out.print(ch);
        }


    }

}
