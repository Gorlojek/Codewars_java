package kyu6.Playing_on_a_chessboard;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Suite2 {
    public static String game(long n) {

        if((n*n)%2 != 0){
            return "["+ (n*n) +" ,2]";
        }
        else {
            return "["+(n*n)/2+"]";
        }
    }

    public static void main(String[] args) {
        System.out.println(game(8));
    }
}
