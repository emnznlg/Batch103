package day10stringmanipulations;

public class ForLoop01 {

    public static void main(String[] args) {

        String str = "Helloooo Ali";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                System.out.print(ch);
            }

        }

    }

}
