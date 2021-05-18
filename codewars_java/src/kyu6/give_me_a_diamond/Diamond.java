package kyu6.give_me_a_diamond;

public class Diamond {
    public static String print(int n) {
       String diamond = "";
       StringBuilder sb = new StringBuilder();
       String star = "*";
       String space = " ";
        if (n%2==1 && n>0){
            for (int i = 1; i<=n; i +=2){
                String reps = star.repeat(i);
                if(i<n) {
                    String reps2 = space.repeat(n/2 - i/2);
                    sb.append(reps2);
                }
                sb.append(reps);
                sb.append("\n");
            }
            for (int i = n-2;i >= 1; i-=2){
                String reps = star.repeat(i);

                if(i<n) {
                    String reps2 = space.repeat(n/2 - i/2);
                    sb.append(reps2);
                }
                sb.append(reps);
                sb.append("\n");
            }


       } else {
            return null;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(print(5));

    }
}
