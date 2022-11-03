package day22inheritancepolymorphism;

public class Mammal extends Animal {

    public int a = 13;
    public int b = 34;

    public void eat() {
        System.out.println("Mammals eat...");
    }

    public void drink() {
        System.out.println("Mammals drink...");
    }

    public Mammal() {
        System.out.println("Mammal");
    }

}
