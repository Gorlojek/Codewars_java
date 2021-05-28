package kyu5.howManyNumbers;

import java.util.Arrays;

public class MaxSumDigits {

    public static long[] maxSumDig(long nmax, int maxsm) {
        long sumOfDigits = 0;
        long[] result = new long[3];
        long[] tempList = new long[0];
        for (long i = 1000; i <= nmax; i++) {
            if (i > 9999) {
                if (checkDigits(i, maxsm)) {
                    tempList = addToArr(tempList, i);
                }
            } else {
                sumOfDigits = String.valueOf(i)
                        .chars()
                        .map(Character::getNumericValue)
                        .sum();

                if (sumOfDigits <= maxsm) {

                    tempList = addToArr(tempList, i);
                }

            }
        }
        result[0] = tempList.length;
        long sumOfNumbers = 0;
        for (Long aLong : tempList) {
            sumOfNumbers += aLong;
        }
        result[2] = sumOfNumbers;

        long avg = sumOfNumbers / tempList.length;

        Arrays.sort(tempList);

        for (int i = 0; i < tempList.length - 1; i++) {
            if (tempList[i] < avg && tempList[i + 1] > avg) {
                long diff1 = Math.abs(avg - tempList[i]);
                long diff2 = Math.abs(avg - tempList[i + 1]);
                if (diff1 < diff2) {
                    result[1] = tempList[i];
                } else {
                    result[1] = tempList[i + 1];
                }
            }
        }

        System.out.println(Arrays.toString(result));
        return result;
    }

    public static long[] addToArr(long[] list, long l) {
        long[] temp = Arrays.copyOf(list, list.length + 1);
        temp[list.length] = l;
        return temp;
    }

    public static boolean checkDigits(long num, long maxSum) {
        char[] digits = String.valueOf(num).toCharArray();
        boolean check = false;
        int counter = 0;
        for (int i = 0; i < digits.length - 3; i++) {
            int sum = Character.getNumericValue(digits[i]) + Character.getNumericValue(digits[i + 1]) + Character.getNumericValue(digits[i + 2]) + Character.getNumericValue(digits[i + 3]);
            if (sum <= maxSum) {
                counter++;

            }
        }
        return counter == digits.length - 3;
    }


    public static void main(String[] args) {
        maxSumDig(103323, 4);
    }
}