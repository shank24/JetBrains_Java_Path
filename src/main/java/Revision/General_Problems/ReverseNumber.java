package Revision.General_Problems;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int rem=0,value=0;
        while(number!=0){
            rem=number%10;
            value = value*10+rem;
            number/=10;
        }
        System.out.println(value);
    }
}
