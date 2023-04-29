package DSA_Bootcamp.Assignments.Ass_01;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = in.nextInt();
        System.out.println(isLeapYear(year));
    }

    private static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 !=0) || year %400==0)?true:false;
    }
}
