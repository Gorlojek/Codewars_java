package kyu6.Vasaya_clerk;

public class Line {
    public static String Tickets(int[] peopleInLine) {
        int status25 = 0;
        int status50 = 0;
        int status100 = 0;
        int cash = 0;
        for (int i = 0; i < peopleInLine.length; i++) {
            cash += peopleInLine[i];

            if (peopleInLine[i] == 50) {
                status50++;
            }
            if (peopleInLine[i] == 25) {
                status25++;
            }
            if (peopleInLine[i] == 100) {
                status100++;
            }

            if (peopleInLine[i] == 50) {
                status25--;
            }

            if (peopleInLine[i] == 100) {
                if (status50 == 0) {
                    status25--;
                    status25--;
                    status25--;

                }else {
                    status50--;
                    status25--;
                }
            }
            System.out.println(status25 + " " + status50 + " " + status100);
            if ((status25 < 0 || status50 < 0 || status100 < 0)) {
                return "NO";
            }

        }
        return "YES";
    }

    public static void main(String[] args) {
        int[] a = new int[]{25, 25, 50, 50, 100};
        System.out.println(Tickets(a));
    }
}
