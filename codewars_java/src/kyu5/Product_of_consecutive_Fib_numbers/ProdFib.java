package kyu5.Product_of_consecutive_Fib_numbers;

import java.util.Arrays;

public class ProdFib {
    public static long[] productFib(long prod) {
       long a =0;
       long b =0;
       long c = 1;
       long[] fibNums = new long[60];
       fibNums[0] = 0;
       fibNums[1] = 1;
       for (int i =2; i<60;i++){
           a=b;
           b=c;
           c=a+b;
           fibNums[i] = c;

       }
      for(int i = 0; i<fibNums.length-1;i++){
          long forCheck = fibNums[i]*fibNums[i+1];
          if(forCheck == prod){
              long[] result = {fibNums[i],fibNums[i+1],1};
              return result;
          }
          else if(forCheck>prod){
              long[] result = {fibNums[i],fibNums[i+1],0};
              return  result;
          }
      }


        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productFib(4895)));
    }
}
