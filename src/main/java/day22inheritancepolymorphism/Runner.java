package day22inheritancepolymorphism;

public class Runner {

    public static void main(String[] args) {

        //Inheritance da variable secilirken Java object in data type ine bakar.
        //Oncelikli istediginiz variable i Object in data type i olan Class da arar.
        //O Class da bulamazsa Parent Class lara bakar.
        //Hicbir Class da bulamazsa hata verir.

        Cat cat1 = new Cat();
        System.out.println(cat1.a);
        System.out.println(cat1.b);
        System.out.println(cat1.c);

        Mammal cat2 = new Cat();
        System.out.println(cat2.a);
        System.out.println(cat2.b);

        Animal cat3 = new Cat();
        System.out.println(cat3.a);
        System.out.println(cat3.b);

        //Inheritance da method secilirken Java Constructor a bakar...

        Cat cat4 = new Cat();
        cat4.eat();
        cat4.drink();

        Mammal cat5 = new Mammal();
        cat5.eat();
        Animal cat6 = new Animal();
        cat6.eat();

        Animal c1 = new Animal();
        Animal c2 = new Mammal();


    }

    //Ozetle Java, variable secilirken data type a, method secilirken Constructor a bakar.

}
