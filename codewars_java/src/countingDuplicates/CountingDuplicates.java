package countingDuplicates;

import java.util.Arrays;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int counter = 0;
        char[] charArray = text.toCharArray();
        Arrays.sort(charArray);

        for (int i = 0; i<charArray.length-1;i++){

            if(charArray[i]==charArray[i+1]){
                counter++;
            }
        }
        System.out.println(Arrays.toString(charArray));
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("ABSADDDAsssc"));
    }
}




//https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java