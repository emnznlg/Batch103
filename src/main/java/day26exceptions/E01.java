package day26exceptions;

public class E01 {

    int rollno;
    String name;
    static String college = "ITS";

    //static method to change the value of static variable
    static void change() {
        college = "BBDIT";
    }

    E01(int r, String n) {
        rollno = r;
        name = n;
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String args[]){
        E01.change();//calling change method
        //creating objects
        E01 s1 = new E01(111,"Karan");
        //calling display method
        s1.display();
    }

}
