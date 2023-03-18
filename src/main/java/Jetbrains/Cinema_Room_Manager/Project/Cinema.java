package Jetbrains.Cinema_Room_Manager.Project;

import java.util.Scanner;

public class Cinema {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        cinemaSeats();
        calculateIncome();
    }

    private static void calculateIncome() {
        System.out.println("Enter the number of rows:");
        int numberOfRows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int numberOfSeats = scanner.nextInt();

        int totalNumberOfSeats = numberOfRows * numberOfSeats;

        int cost = 0;
        int firstHalfRows = 0;
        int secondHalfRows = 0;

        if(totalNumberOfSeats > 81){
            return;
        }

        //Odd Case of Rows
        if(totalNumberOfSeats > 60 && numberOfRows%2!=0) {
                firstHalfRows = numberOfRows/2;
                secondHalfRows = (numberOfRows/2) + 1;

                cost = firstHalfRows * 10 * numberOfSeats + secondHalfRows * 8 * numberOfSeats;
                System.out.println("Total income:\n" + "$" + cost);
        }

        //Even Case of Rows
        else if(totalNumberOfSeats > 60) {
            firstHalfRows = numberOfRows/2;
            secondHalfRows = (numberOfRows/2);

            cost = firstHalfRows * 10 * numberOfSeats + secondHalfRows * 8 * numberOfSeats;
            System.out.println("Total income:\n" + "$" + cost);
        }

        //When Rows Are Less Than 60
        else {
            System.out.println("Total income:\n" + "$" + totalNumberOfSeats * 10);
        }
    }

    //Print Cinema
    private static void cinemaSeats() {
        System.out.println("Cinema:");
        System.out.println("  1 2 3 4 5 6 7 8");
        for (int i = 1; i < 8; i++) {
            System.out.println(i + " S S S S S S S S");
        }
    }
}
