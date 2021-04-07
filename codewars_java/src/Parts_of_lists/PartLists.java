package Parts_of_lists;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PartLists {
    public static void main(String[] args) {
        String[] arr = {"chuj", "dupa", "kurwa", "cipa"};
        System.out.println();
        System.out.println(Arrays.deepToString(partlist(arr)));

    }

    public static String[][] partlist(String[] arr) {
        String[][] temp = new String[arr.length-1][2];
        for (int i = 0; i < temp.length; i++) {
          String[] tempA = Arrays.copyOfRange(arr,0,i+1);
          String[] tempB = Arrays.copyOfRange(arr,i+1,arr.length);
          String tempC = Arrays.stream(tempA).collect(Collectors.joining(" "));
            System.out.println(tempC);
          String tempD = Arrays.stream(tempB).collect(Collectors.joining(" "));
            System.out.println(tempD);
          temp[i][0] = tempC;
          temp[i][1] = tempD;

        }
        return temp;
    }
    public static String[][] partlist2(String[] arr) {
        String[][] returnArray = new String[arr.length-1][2];
        for(int i = 0; i < arr.length-1; ++i) {
            returnArray[i][0] = String.join(" ", Arrays.copyOfRange(arr, 0, i+1));
            returnArray[i][1] = String.join(" ", Arrays.copyOfRange(arr, i+1, arr.length));
        }

        return returnArray;
    }
}
