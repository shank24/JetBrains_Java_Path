package Jetbrains.Chuck_Norris_Cipher_Encoder.Problems;

import java.util.Scanner;

public class KateMathFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        double val=0;
        if(x<=0){
            val = f1(x);
        }
        if(x<1 && x>0){
            val = f2(x);
        }
        if(x>=1){
            val = f3(x);
        }
        return val;
    }

    public static double f1(double x){
        return Math.pow(x,2)+1;
    }
    public static double f2(double x){
        return (1/Math.pow(x,2));
    }
    public static double f3(double x){
        return Math.pow(x,2)-1;
    }
}
