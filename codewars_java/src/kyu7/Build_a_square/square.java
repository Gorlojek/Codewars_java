package kyu7.Build_a_square;

public class square {
    public static final String generateShape(int n) {
       StringBuilder sb = new StringBuilder();
       if(n>0) {
           for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                   sb.append("+");
               }
               sb.append("\n");
           }
           String s = sb.toString();
           s = s.substring(0, s.length() - 1);
           return s;
       }
       else {
           return "";
       }
    }

    public static void main(String[] args) {
        System.out.println(generateShape(3));
    }
    public static final String generateShape2(int n) {
        return ("+".repeat(n) + "\n").repeat(n).trim();
    }
}
