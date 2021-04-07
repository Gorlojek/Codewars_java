package kyu6.Primorial_of_a_number;

import java.math.BigInteger;

public class Primorial {
    public static String numPrimorial(int n) {
        int[] primeNumbers = new int[n];
        int counter = 0;
        int num = 1, i;
        BigInteger primorial = BigInteger.valueOf(1);


        while (n > counter) {
            num = num + 1;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                primeNumbers[counter] = num;
                counter++;


            }

        }
        for (i = 0; i < n; i++) {
            BigInteger temp = BigInteger.valueOf(primeNumbers[i]);
            primorial = primorial.multiply(temp);

        }
        StringBuilder sb = new StringBuilder();
        sb.append(primorial);

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(numPrimorial(15));
    }
}
