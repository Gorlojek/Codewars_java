package kyu5.gap_in_primes;

import java.util.Arrays;

public class GapInPrimes {
    public static long[] gap(int g, long m, long n) {

        long[] y = new long[0];
        long[] finalArr = new long[2];
        boolean x = true;
        for (long i = m; i <= n; i++) {
            x = isPrime(i);
           if (x) {
                y = addNewItemToArr(y, i);
            }
        }
        for(int i = 0;i<y.length-1;i++){
            if(y[i+1]-y[i] == g){
                finalArr[0] = y[i];
                finalArr[1] = y[i+1];
                return finalArr;
            }
        }

        return null;

    }

    public static boolean isPrime(long number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                // number is perfectly divisible - no prime
                return false;
            }
        }
        return true;
    }

    public static long[] addNewItemToArr(long[] x, long y) {
        long[] temp = Arrays.copyOf(x, x.length + 1);
        temp[x.length] = y;
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(gap(4, 100, 110)));
    }
}
