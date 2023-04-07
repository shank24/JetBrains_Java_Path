package Revision.General_Problems;

import java.util.Scanner;

public class Fibbo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        System.out.println(a);
        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
            System.out.println(b);
        }

    }
}
