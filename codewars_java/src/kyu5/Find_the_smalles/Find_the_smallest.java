package kyu5.Find_the_smalles;

import java.util.Arrays;

public class Find_the_smallest {
    public static long[] smallest(long n) {
        long[] result = new long[3];
        String number = String.valueOf(n);
        char[] digits = number.toCharArray();
        int indexOfSmallestNum =0;
        long smallest = 9;
        while(n != 0){
            long r = n % 10;
            smallest = Math.min(r, smallest);
            n = n / 10;
        }
        for(int i = 0; i<digits.length;i++){
            long digit = Character.getNumericValue(digits[i]);
            if(digit == smallest){
                indexOfSmallestNum = i;
            }
        }
        result[1] = indexOfSmallestNum;
        System.out.println(indexOfSmallestNum);


        return result;
    }

    public static void main(String[] args) {
        long test1 =261235;
        long test2 =209917;
        long test3 =285365;
        long test4 =269045;
        long test5 =296837;
        System.out.println(Arrays.toString(smallest(test1)));
    }
}
