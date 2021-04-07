package Alphabet_war;

import java.util.ArrayList;
import java.util.List;

public class alphabetWars {
    public static String alphabetWar(String fight) {
        String left = "Left side wins!";
        String right = "Right side wins!";
        String draw = "Let's fight again!";
        int right_counter = 0;
        int left_counter = 0;
        /* LEFT SIDE
        w - 4
        p - 3
        b - 2
        s - 1*/
        /*RIGHT SIDE
        m - 4
        q - 3
        d - 2
        z - 1*/
        List<Character> chars = new ArrayList<>();
        for (char ch : fight.toCharArray()){
            chars.add(ch);
        }
        for(int i = 0;i<chars.size();i++){
            if (chars.get(i).equals('w')){
                left_counter +=4;
            }else if (chars.get(i).equals('p')){
                left_counter +=3;
            }else if(chars.get(i).equals('b')){
                left_counter +=2;
            }else if(chars.get(i).equals('s')){
                left_counter+=1;
            }
            else if (chars.get(i).equals('m')){
                right_counter +=4;
            }else if (chars.get(i).equals('q')){
                right_counter +=3;
            }else if(chars.get(i).equals('d')){
                right_counter +=2;
            }else if(chars.get(i).equals('z')){
                right_counter+=1;
            }
        }

        if(right_counter>left_counter){
            return right;
        }else if(right_counter==left_counter){
            return draw;

        }else{
            return left;
        }
    }



    public static void main(String[] args) {
        System.out.println(alphabetWar("zdqmwpbsz"));

    }
//ładniejsze rozwiązanie
        public static String alphabetWar2(String fight){
            int right = 0, left = 0;
            for (char c : fight.toCharArray()) {
                switch (c) {
                    case 'w' : left += 4; break;
                    case 'p' : left += 3; break;
                    case 'b' : left += 2; break;
                    case 's' : left += 1; break;

                    case 'm' : right += 4; break;
                    case 'q' : right += 3; break;
                    case 'd' : right += 2; break;
                    case 'z' : right += 1; break;
                }
            }
            if (left == right) return "Let's fight again!";
            return (left > right ? "Left" : "Right") + " side wins!";
        }
    }

