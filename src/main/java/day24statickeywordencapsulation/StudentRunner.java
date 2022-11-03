package day24statickeywordencapsulation;

public class StudentRunner {

    public static void main(String[] args) {

        Student std1 = new Student();
        System.out.println(std1.getStId());
        System.out.println(std1.getGpa());
        System.out.println(std1.isRetired());

        std1.setStId("AB");
        System.out.println(std1.getStId());
        std1.setGpa(4.0);
        System.out.println(std1.getGpa());
        std1.setRetired(true);
        System.out.println(std1.isRetired());

    }

}
