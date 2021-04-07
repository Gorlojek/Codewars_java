package Stop_spinning_my_words;

import java.util.Arrays;

public class SpinWords {

    public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            int length = words[i].length();


            if (length > 4) {
                char[] temp = new char[words[i].length()];
                for (int j = 0; j < temp.length; j++) {
                    temp[j] = words[i].charAt(words[i].length() - j - 1);

                }
                words[i] = String.valueOf(temp);


            }


            sb.append(words[i]).append(" ");

        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(spinWords("hey fellow warriors"));
        System.out.println(spinWords("Witam, teraz wszystko wykręce!"));
    }


//best practices

        public String spinWords2(String sentence) {
            String[] words = sentence.split(" ");
            for (int i=0; i<words.length; i++) {
                if (words[i].length() >= 5) {
                    words[i] = new StringBuilder(words[i]).reverse().toString();
                }
            }
            return String.join(" ",words);
        }
    }
