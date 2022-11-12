package day28abstraction;

public interface Engine {
    //"multiple inheritance" class'larda mumkun degildir fakat
    // Java "interface" isimli yeni bir yapi olusturdu bu yapida "multiple inheritance" a musaade etti.

    //Interface'lerdeki tum methodlar abstract olmalidir.

    //Interface'lerdeki methodlar Java tarafindan otomatik olarak public kabul edilir.
    // Bu sebeple public yazmaya gerek yoktur
    void eco();
    void gas();
    void tsi();

    //Interface icinde Concrete method kullanmanin iki yolu var. 1) default keyword kullanmak, 2) static method kullanmak.
    default int topla(int a, int b) {
        return a + b;
    }

    static String update(String str) {
        return str + "!";
    }
    
}
