package kyu6.TortoisesRace;

import java.util.Arrays;

public class Tortoise {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(race(80,100,40)));
        System.out.println(Arrays.toString(race(720,850,70)));


    }

    public static int[] race(int v1, int v2, int g) {
        if (v1>=v2 || g <= 0){
            return null;
        }
        int sec =0,min = 0,hr = 0;
        double roadA,roadB;
        int timeCounter = 0;

        float v11 = v1/ 3600.0f;

        float v22 = v2/ 3600.0f;

        roadB =0;
        roadA = g;
        while (roadA>=roadB){
            roadA += v11;
            roadB += v22;

            timeCounter++;
            sec++;
            if(sec == 60){
                min++;
                sec = 0;
                if(min == 60){
                        hr++;
                        min = 0;


                    }
                }

            }

        if(sec == 60){
            sec = 0;
            min++;
        }
        else{
            sec = sec -1;
        }


        int[] time = {hr,min,sec};
        return time;

    }
        //docelowe rozwiazanie
        public static int[] race2(int v1, int v2, int g) {
            int totalSecondsTaken = 0;
            if (v2 > v1 ) {
                totalSecondsTaken = (g*3600) / (v2-v1) ;
            } else {
                return null;
            }
            return new int[] {totalSecondsTaken/3600, (totalSecondsTaken % 3600)/60, totalSecondsTaken % 60};

        }
    }





//https://www.codewars.com/kata/55e2adece53b4cdcb900006c/train/java