package Revision.General_Problems;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        checkIsPrime(number);
    }

    private static void checkIsPrime(int number) {
        int i =2;
        boolean flag=false;

        while(i<Math.sqrt(number)){
            if(number%i==0){
                flag=true;
                break;
            }
            i=i+1;
        }
        if(flag){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}
