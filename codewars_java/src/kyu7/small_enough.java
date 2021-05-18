package kyu7;

import java.util.Arrays;

public class small_enough {
    public static boolean smallEnough(int[] a, int limit) {
        Arrays.sort(a);
        if (a[a.length - 1] > limit) {
            return false;

        }

        return true;
    }

    public static void main(String[] args) {

    }
}
