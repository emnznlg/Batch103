package day12loops;

public class DoWhileLoop01 {

    public static void main(String[] args) {

//        int i = 1;
//        while (i < 1) {
//            System.out.println("While Loop");
//            i++;
//        }
//
//        int k = 1;
//        do {
//            System.out.println("Do While Loop");
//            k++;
//        }while (k < 1);


        //Example 1: Bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz

        double sayi = 3.4568;
        String str = String.valueOf(sayi);
        String strSplitted = str.split("[.]")[1];
        int decimalInt = Integer.valueOf(strSplitted);
        int sum = 0;
        do {
            sum += decimalInt % 10;
            decimalInt = decimalInt / 10;
        }while (decimalInt > 0);

        System.out.println(sum);
    }

}
