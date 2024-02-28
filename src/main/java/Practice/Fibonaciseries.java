package Practice;

import java.util.ArrayList;

public class Fibonaciseries {
    static void fibbonaci(int num){
       int [] fib=new int[num];
       fib[0]=0;
       fib[1]=1;
        for(int i=2;i<num;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
       for(int n:fib){
           System.out.print(n);

       }
    }
    public static void main(String [] args){
        fibbonaci(9);
    }
}
