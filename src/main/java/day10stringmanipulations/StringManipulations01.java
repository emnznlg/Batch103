package day10stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String a = "Java kolaydir";

        boolean b = a.startsWith("va", 2);
        System.out.println(b);

        System.out.println(a.replaceFirst("a", "*"));
        System.out.println(a.concat(" Anladin mi?"));

        String h = " kava";
        String i = "kbva";

        System.out.println(h.compareTo(i));
        System.out.println(a.repeat(5));

    }

}
