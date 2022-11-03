package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public int fiyat = 20000;

    public static void main(String[] args) {

        /*
            Object nasıl olusturulur?
            1-) Class ismini yaz
            2-) isimlendirmeyi yap
            3-) "=" koy
            4-) new keywordünü yaz
            5-) class ismini parantezle yaz (constructor)
         */

        MethodCreation obj = new MethodCreation();

        Car myHonda = new Car();
        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);
        myHonda.hareketEt();
        myHonda.dur();

        MethodCreation obje = new MethodCreation();
        System.out.println(obje.toplamaYap(3,5));

    }

    public void hareketEt(){
        System.out.println("Honda guzel hareket eder...");
    }
    public void dur() {
        System.out.println("Honda guvenli durur...");
    }



}
