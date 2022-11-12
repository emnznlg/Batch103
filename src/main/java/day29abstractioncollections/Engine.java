package day29abstractioncollections;

public interface Engine extends Vehicle {

    //Interface'lerdeki tum variable'lar otomatik olarak public'tir.
    //Interface'lerdeki tum variable'lar otomatik olarak final'dir.
    //Interface'lerdeki tum variable'lar otomatik olarak static'dir.

    // Child ----- Parent
    // Class ----> Interface     ==> implements
    // Class ----> Class         ==> extends
    // Interface ----> Interface ==> extends
    // Interface ----> Class     ==> Impossible

    /*
        Soru: "Abstract Class" ile "Interface" in farklari nelerdir?
       1)Method
            "Abstract Class" hem abstract hem de concrete method lar icerebilir.
            "Interface" ler ise sadece abstract method'lar icerir.
            Ama istersek interface'ler icinde de "default" ve "static" keyword'ler kullanarak concrete method lar olusturabiliriz.

       2)Variable
            "Abstract Class" larda normal Class'lardaki gibi her turlu variable olusturulabilir.
            "Interface" lerde ise variable'lar public static ve final olmak zorundadir.

       3)Inheritance
            "Abstract Class" lar class olduklari icin multiple inheritance'a musaade etmezler.
            "Interface" ler ise multiple inheritance'i desteklerler.

       4)Object Creation
            "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar.
            "Interface" lerde ise constructor olmadigindan object olusturulamaz.

        Soru: Object-Oriented Programming Language prensipleri(principles) nelerdir?
            i)Inheritance   ii)Polymorphism   iii)Encapsulation   iv)Abstraction
     */
    int price = 2000;

    double weight = 23.5;

    void run();

}
