package kyu4.sum_by_factors;

import java.util.Arrays;


public class SumByFactors {
    public static String sumOfDivided(int[] l) {
        int[] primeNums = new int[0];
        for (int i = 0; i < l.length; i++) {
            int temp = l[i];
            for (int j = 2; j <= Math.abs(temp); j++) {
                if (temp % j == 0) {
                    if (isPrime(j)) {
                        primeNums = addToArr(primeNums, j);
                    }
                }
            }

        }
        Arrays.sort(primeNums);
        primeNums = removeDuplicates(primeNums);
        int[] sums = new int[0];
        for (int i = 0; i < primeNums.length; i++) {
            int tempsum = 0;
            for (int j = 0; j < l.length; j++) {
                if (l[j] % primeNums[i] == 0) {
                    tempsum += l[j];
                }
            }
            sums = addToArr(sums, tempsum);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < primeNums.length; i++) {
            sb.append("(");
            sb.append(primeNums[i] + " ");
            sb.append(sums[i] + ")");

        }
        return sb.toString();
    }

    public static int[] addToArr(int[] l, int x) {
        int[] temp = Arrays.copyOf(l, l.length + 1);
        temp[l.length] = x;
        return temp;
    }

    public static boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int[] removeDuplicates(int[] origArray) {
        int[] clearTab = new int[1];
        clearTab[0] = origArray[0];
        for (int i = 0; i < origArray.length-1; i++) {
            if (origArray[i] != origArray[i + 1]) {
                clearTab = addToArr(clearTab, origArray[i+1]);
           }
        }
        return clearTab;
    }

    public static void main(String[] args) {
        int[] lst = new int[]{12, 15};
        int[] lst2 = new int[]{107, 158, 204, 100, 118, 123, 126, 110, 116, 100};
        int[] lst3 = new int[]{424, 246, 250, -59, 387, 278, 424, -84, -86, 219, 145, 428, 228, 176, 465, 119, 243};
        System.out.println(sumOfDivided(lst));
        System.out.println(sumOfDivided(lst2));
        System.out.println(sumOfDivided(lst3));
    }
}
