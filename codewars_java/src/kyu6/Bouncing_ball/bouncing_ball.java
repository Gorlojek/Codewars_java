package kyu6.Bouncing_ball;

public class bouncing_ball {
    public static void main(String[] args) {
        System.out.println(bouncingBall(3,0.66,1.5));
        System.out.println(bouncingBall(30,0.66,1.5));
        System.out.println(bouncingBall(0,0.5,1));
        System.out.println(bouncingBall(10,1,2));
        System.out.println(bouncingBall(10,0.5,11));
        System.out.println(bouncingBall2(3,0.66,1.5));
        System.out.println(bouncingBall2(30,0.66,1.5));


    }
    public static int bouncingBall(double h, double bounce, double window) {
        int counter = 1;
        if(h<=0 || bounce >= 1 || bounce <= 0 || window>h){
            return -1;
        }
        for (int i = 0; i < h*h*h;i++){
            h = h*bounce;

            if(h>window){
                counter += 2;
            }
        }
        return counter;
    }



    public static int bouncingBall2(double h, double bounce, double window) {
        if ((h <= 0) || (window >= h) || (bounce <= 0) || (bounce >= 1))
            return -1;
        int seen = -1;
        while (h > window) {
            seen += 2;
            h = h * bounce;
        }
        return seen;

    }
}

//https://www.codewars.com/kata/5544c7a5cb454edb3c000047
