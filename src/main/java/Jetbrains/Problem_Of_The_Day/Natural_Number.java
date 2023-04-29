package Jetbrains.Problem_Of_The_Day;

import java.util.Scanner;

public class Natural_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        getNextEvenNumber(number);
    }

    private static void getNextEvenNumber(int number) {
        int value=0;
            for(int i = 1; i<10000; i++){
                if(number%2!=0){
                    value=number+1;
                }
                else{
                    value=number+2;
                }
            }
        System.out.println(value);
    }
}

/*
Given a natural number, not greater than 10000.
Output the even number following this number.

 */