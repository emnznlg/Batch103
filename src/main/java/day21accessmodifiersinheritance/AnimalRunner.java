package day21accessmodifiersinheritance;

import java.util.Arrays;

public class AnimalRunner {

    /*
        1-) Inheritance sayesinde;
            i) Kod tekrarlarindan kurtuluruz
            ii) Kod maintanence kolay olur
            iii) Child Class lari daha atomik yapmis oluruz
        2-)Bir Class i baska bir class in child Class i yapmak icin extends keywordu kullanilir.
        3-) Child Class object leri parent Class method ve variable larini kullanabilir.
        4-) Child Class object leri parent Class method ve variable larini kullanamazlar.
        5-) Object Class her Class in Parent idir.
        6-) private Method ve Variable lar inherit edilemez.

        NOTE: Multi Level Inheritance : Apartman gibi, Hierarchical Inheritance: Bizim yaptigimiz gibi, Multiple Inheritance: Java'nin desteklemedigi...

     */


    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.eat();
        cat1.drink();
        cat1.meow();

        System.out.println();

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.eat();
        dog1.drink();

        System.out.println();

        Bird bird1 = new Bird();
        bird1.tweet();
        bird1.eat();
        bird1.drink();


    }

}
