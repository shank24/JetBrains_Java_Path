package Cinema_Room_Manager.Project;

import java.util.Scanner;

public class Cinema_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the number of rows:");
        int NumberOfRows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int NumberOfSeats = scanner.nextInt();

        System.out.println();

        printCinemaPattern(NumberOfRows, NumberOfSeats);

        System.out.println("Enter a row number:");
        int Rows = scanner.nextInt();

        System.out.println("Enter a seat number in that row:");
        int Seat = scanner.nextInt();

        System.out.println();
        calculatePrice(NumberOfRows, NumberOfSeats, Rows);
        System.out.println();

        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1;i <= NumberOfSeats; i++) {
            System.out.print(i + " ");}
        System.out.println();

        for (int i = 1;i <= NumberOfRows; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= NumberOfSeats ;j++) {
                System.out.print(Rows == i && Seat == j?"B ":"S ");

            }
            System.out.println();
        }
    }

    private static void calculatePrice(int NumberOfRows, int NumberOfSeats, int Rows) {
        int totalNumberOfSeats = NumberOfRows * NumberOfSeats;
        System.out.println(( (NumberOfRows /2)>= Rows) || (totalNumberOfSeats<=60) ?"Ticket price: $10":"Ticket price: $8");
    }

    private static void printCinemaPattern(int NumberOfRows, int NumberOfSeats) {

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
