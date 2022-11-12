package day28abstraction;

public abstract class Animal {

    //Body'si olmayan methodlar "abstract method" olarak adlandirilir.
    //Bir methodu abstract yapmak icin i) method body sil, ii) abstract keyword kullan
    //abstract methodlar abstract class icinde olmalidir.


    public abstract void eat();

    //abstract classlarda hem abstract method hem de concrete method kullanilabilir.
    public void drink() {
        System.out.println("Animals eat");
    }

    public abstract void move();

}
