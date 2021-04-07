package Deodorant_evaporator;

public class Evaporator {
    public static int evaporator(double content, double evap_per_day, double threshold) {
        int day =0;
        double percentOfContent = 100;
        double tempContent = content;
        while(percentOfContent>threshold){
            tempContent -= tempContent*(evap_per_day/100);
            System.out.println(tempContent);
            percentOfContent = (tempContent/content)*100;
            System.out.println(percentOfContent);
            day++;
        }
        return day;
    }

    public static void main(String[] args) {
        System.out.println(evaporator(10,10,10));
    }
}

