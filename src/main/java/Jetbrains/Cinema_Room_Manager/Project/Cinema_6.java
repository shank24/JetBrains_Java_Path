package Jetbrains.Cinema_Room_Manager.Project;

import java.util.Scanner;

public class Cinema_6 {
    static int countTickets = 0;
    static int income = 0;
    static int totalSeats;

    public static void main(String[] args) {
        // Write your code here
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int row = scan.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int col = scan.nextInt();

        String[][] cinemaSeats = new String[row][col];
        totalSeats = row * col;

        for (int i = 0; i < cinemaSeats.length; i++)
            for (int j = 0; j < cinemaSeats[0].length; j++)
                cinemaSeats[i][j] = "S";
        int input = -1;
        while (input != 0) {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    showSeats(cinemaSeats);
                    break;
                case 2:
                    buyTicket(cinemaSeats);
                    break;
                case 3:
                    showStatistics();
                    break;
                case 0:
                    return;
            }
        }
    }
    public static void showSeats(String[][] arr) { //problem with art
        System.out.print("Cinema:\n  ");
        for (int i = 0; i < arr[0].length; i++) //prints num of cols, top row
            System.out.print(i + 1 + " ");
        System.out.println();
        for(int j = 0; j < arr.length; j++){
            System.out.print(j + 1); //prints row num
            for (int k = 0; k < arr[0].length; k++)
                System.out.print(" " + arr[j][k]); // prints seat
            System.out.println(); //space between rows
        }
    }

    public static void buyTicket(String[][] arr) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a row number: ");
        int r = scan.nextInt();
        System.out.println("Enter a seat number in that row: ");
        int c = scan.nextInt();
        while (!isValid(arr, r, c)) {
            System.out.println("Wrong input!");
            System.out.println("Enter a row number: ");
            r = scan.nextInt();
            System.out.println("Enter a seat number in that row: ");
            c = scan.nextInt();
        }
        while (isTaken(arr, r, c) && isValid(arr, r, c)) {
            System.out.println("That ticket has already been purchased!");
            System.out.println("Enter a row number: ");
            r = scan.nextInt();
            System.out.println("Enter a seat number in that row: ");
            c = scan.nextInt();
        }
        arr[r - 1][c - 1] = "B";
        countTickets++;
        System.out.println("Ticket price: $" + ticketPrice(arr, r - 1));
        income += ticketPrice(arr, r - 1);

    }
    public static int ticketPrice(String[][] arr, int r) {
        int price;
        if (arr.length * arr[0].length < 61)
            price = 10;
        else if (r < arr.length / 2)
            price = 10;
        else
            price  = 8;
        return price;
    }

    private static int costTicket(int numberR, int rowN) {
        int ticketPrice = 10;
        int backRowsTicketPrice = 8;

        if (totalSeats > 60 && rowN > (numberR / 2)) {
            ticketPrice = backRowsTicketPrice;
        }
        return ticketPrice;
    }

    public static void showStatistics() {
        System.out.printf("Number of purchased tickets: %d%n", countTickets);
        System.out.printf("Percentage: %2f%n", 100.0 * countTickets / totalSeats);
        System.out.printf("Current income: $%d%n", income);
        System.out.printf("Total income: $%d%n", (totalSeats / 2) * 8 + (totalSeats / 2) * 10);
    }

    public static boolean isValid(String[][] arr, int row, int col) {
        return (row-1) >= 0 && (row-1) <= arr.length - 1 && (col-1) >= 0 && (col-1) <= arr[0].length - 1;
    }

    public static boolean isTaken(String[][] arr, int row, int col) {
        return arr[row - 1][col - 1].equalsIgnoreCase("B");
    }
}
