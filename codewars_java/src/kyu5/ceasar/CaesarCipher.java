package kyu5.ceasar;

import java.util.List;

public class CaesarCipher {
    public static List<String> movingShift(String s, int shift) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        for (int i = 0; i < arr.length; i++) {
            int ascii = arr[i];
            if (ascii >= 65 && ascii < 91) {
                ascii += shift;


                if (ascii > 90) {
                    ascii = ascii - 26;

                }

                arr[i] = (char) ascii;
            } else if (ascii >= 97 && ascii <= 122) {
                ascii += shift;


                if (ascii > 122) {
                    ascii = ascii - 26;

                }

                arr[i] = (char) ascii;
            }
        shift++;
            if (shift>=26){
                shift=0;
            }
        }

        StringBuilder cezarCode = new StringBuilder();
        for (char c : arr) {
            cezarCode.append(c);
        }
        System.out.println(cezarCode);
        int strLength = s.length();
        int[] cutString = new int[5];
        for (int i = 0;i<strLength;i++){

        }
        System.out.println(strLength/4);
        return null;
    }

    public static String  demovingShift(List<String> s, int shift) {
		return null;
    }

    public static void main(String[] args) {
        String u = "I should have known that you would have a perfect answer for me!!!";
        int shift = 1;
        System.out.println(movingShift(u,1));
    }
}
