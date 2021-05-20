package kyu6.brake_camelcase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class solution {
    public static String camelCase(String input) {
        char[] char_arr = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char s: char_arr) {
            if(Character.isLowerCase(s)){
                sb.append(s);
            }else{
                sb.append(" ").append(s);
            }
        }

        return sb.toString();
    }
    public static String camelCase2(String input) {
        return input.replaceAll("([A-Z])"," $1");
    }


    public static void main(String[] args) {
        camelCase("camelCasing");

        System.out.println( camelCase2("RozbijamyCamelCaseJednąLinijką"));
    }

}
