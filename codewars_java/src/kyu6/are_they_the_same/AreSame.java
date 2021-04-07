package kyu6.are_they_the_same;


import java.util.Arrays;

public class AreSame {
    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a, b));
    }

    public static boolean comp(int[] a, int[] b) {
        boolean tempBoolean = false;
        int tempArr[] = new int[b.length];
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(tempArr);

        for (int i = 0; i < tempArr.length; i++) {
            if (b[i] <= 0) {
                tempBoolean = false;
                break;
            }
            tempArr[i] = b[i] / a[i];

        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == tempArr[i]) {
                tempBoolean = true;
                System.out.println(a[i] + " " + tempArr[i]);
            } else {
                tempBoolean = false;
                break;
            }
        }
        return tempBoolean;
    }


    public static boolean comp2(int[] a, int[] b) {
        if ((a == null) || (b == null)) {
            return false;
        }
        int[] aa = Arrays.stream(a).map(n -> n * n).toArray();
        Arrays.sort(aa);
        Arrays.sort(b);
        return (Arrays.equals(aa, b));

    }

}
//https://www.codewars.com/kata/550498447451fbbd7600041c


