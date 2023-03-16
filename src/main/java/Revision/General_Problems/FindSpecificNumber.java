package Revision.General_Problems;

import java.util.Scanner;

public class FindSpecificNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int searchDig = in.nextInt();

        searchDigit(number, searchDig);
    }

    private static void searchDigit(int number, int searchDig) {
        int rem=0, count=0;

        while(number !=0){
            rem= number %10;
            if(rem== searchDig)
                count++;
            number = number /10;
        }
        System.out.println(count);
    }
}
