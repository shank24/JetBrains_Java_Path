package Session_2.Project;

import java.util.Scanner;

public class Cinema_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //Inputting Rows and columns
        System.out.println("Enter the number of rows:");
        int NumberOfRows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int NumberOfSeats = scanner.nextInt();


        //Printing Cinema Array
        printVacantRows(NumberOfRows, NumberOfSeats);


        //Price Logic
        System.out.println("Enter a row number:");
        int Rows = scanner.nextInt();

        System.out.println("Enter a seat number in that row:");
        int Seat = scanner.nextInt();
        System.out.println();

        int totalNumberOfSeats = NumberOfRows * NumberOfSeats;
        System.out.println(( (NumberOfRows/2)>=Rows) || (totalNumberOfSeats<=60) ?"Ticket price: $10":"Ticket price: $8");


        //After Buying A Ticket
        printOccupiedRows(NumberOfRows, NumberOfSeats, Rows, Seat);
    }

    private static void printOccupiedRows(int NumberOfRows, int NumberOfSeats, int Rows, int Seat) {
        System.out.println();
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1; i <= NumberOfSeats; i++) {
            System.out.print(i + " ");}
        System.out.println();

        for (int i = 1; i <= NumberOfRows; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= NumberOfSeats; j++) {
                System.out.print(Rows == i && Seat == j?"B ":"S ");

            }
            System.out.println();
        }
    }

    private static void printVacantRows(int NumberOfRows, int NumberOfSeats) {
        System.out.println();
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1; i <= NumberOfSeats; i++) {
            System.out.print(i + " ");}
        System.out.println();
        for (int i = 1; i <= NumberOfRows; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= NumberOfSeats; j++) {
                System.out.print("S ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
