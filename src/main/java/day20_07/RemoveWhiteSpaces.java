package day20_07;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {

        String str = "Java Programming is Easy";

        String result = str.replaceAll("\\s", "");

        System.out.println("Original String : " + str);
        System.out.println("Updated String  : " + result);
    }
}