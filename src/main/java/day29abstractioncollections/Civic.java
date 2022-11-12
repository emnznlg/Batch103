package day29abstractioncollections;

/*
    * "abstract method"lar sadece ne yapilacagini soyler.(What to do)
    * "concrete method"lar ne yapilacagi ile birlikte nasil yapilacagini de soyler.(How to do)

    * "interface"ler yapilacak isler listesidir. (To do list)

    * "multiple parent interface" kullandiginizda ayni method ismi ile birden fazla method olusturursaniz
       bu methodlarin return typle'lari ayni olmalidir aksi takdirde hata verir.

    * interface'lerde constructor olmadigi icin obje olusturulamaz. Abstract class'larda costructor vardir ama constructorlar abstract classlarda
      object olusturamazlar.
 */

public class Civic implements Engine, Ac {

    @Override
    public void run() {
        System.out.println("Civic runs well...");
    }

}
