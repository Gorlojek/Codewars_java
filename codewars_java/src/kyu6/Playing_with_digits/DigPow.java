package kyu6.Playing_with_digits;

public class DigPow {

    public static long digPow(int n, int p) {
        int[] digits = new int[String.valueOf(n).length()];
        int tempNumber = 0;
        long k = 0;
        for (int i = 0; i < digits.length; i++) {
            char temp = String.valueOf(n).charAt(i);
            digits[i] = Integer.parseInt(String.valueOf(temp));

        }
        for (int i = 0; i < digits.length; i++) {
            tempNumber += Math.pow(digits[i], (p + i));


        }
        boolean isInteger = false;
        if (tempNumber % n == 0) {
            isInteger = true;
        }
        if (isInteger) {
            k = tempNumber / n;
            return k;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        //System.out.println(digPow(695,2));
        System.out.println(digPow(46288, 3));
        System.out.println(digPow(92, 1));

    }
//other solution

    public static long digPow2(int n, int p) {
        String intString = String.valueOf(n);
        long sum = 0;
        for (int i = 0; i < intString.length(); ++i, ++p)
            sum += Math.pow(Character.getNumericValue(intString.charAt(i)), p);
        return (sum % n == 0) ? sum / n : -1;
    }

}


