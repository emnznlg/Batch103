package day24statickeywordencapsulation;

public class CarRunner {

    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        Car c4 = new Car();

        System.out.println(Car.counter);
        System.out.println(c1.price);

        System.out.println(Car.counter);
        System.out.println(c2.price);

        Car c5 = new Car();

        System.out.println(Car.counter);
        System.out.println(c5.price);
        System.out.println(Car.counter);
        System.out.println(c1.price);




    }

}
