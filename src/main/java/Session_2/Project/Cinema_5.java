package Session_2.Project;

import java.util.Scanner;

public class Cinema_5 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of rows: ");
        int numRows = console.nextInt();
        System.out.println("Enter the number of seats in each row: ");
        int seatsPerRow = console.nextInt();

        String[][] cinSeats = new String[numRows + 1][seatsPerRow + 1];

        for (int i = 0; i < cinSeats.length; i++) {
            for (int j = 0; j < cinSeats[i].length; j++) {
                cinSeats[0][0] = " ";
                cinSeats[0][j] = j + "";
                cinSeats[i][0] = i + "";
                cinSeats[i][j] = "S";
            }
        }

        printMenu(cinSeats);
    }

    public static void printMenu(String[][] cineSeats) {
        //get input from user
        System.out.println("");
        System.out.println(""+
                "\n"+"1. Show the seats"+
                "\n"+"2. Buy a ticket"+
                "\n"+"3. Statistics"+
                "\n"+"0. Exit"+
                "");
        int option = console.nextInt();

        switch (option) {
            case 1 -> showTheSeats(cineSeats);
            case 2 -> buyTicket(cineSeats);
            case 0 -> {
                return;
            }
        }
    }
    public static void showTheSeats(String[][] cineSeats) {
        System.out.println("");
        System.out.println("Cinema: ");
        for (String[] cineSeat : cineSeats) {
            for (String s : cineSeat) {
                System.out.print(s + " ");
            }
            System.out.println("");
        }
        printMenu(cineSeats);
        System.out.println("");
    }

    public static void buyTicket(String[][] cineSeats) {
        System.out.println("Enter a row number:");
        int rowN = console.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seatN = console.nextInt();
        int totalSeats = cineSeats.length * cineSeats[0].length;
        for (int i = 0; i < cineSeats.length; i++) {
            for (int j = 0; j < cineSeats[i].length; j++) {
                cineSeats[rowN][seatN] = "B";
            }
        }
        //int ticketSold = 0;
        int frontRow = (cineSeats.length - 1) / 2;
        //int backRow = (cineSeats.length - 1) / 2 + 1;
        int ticketPrice = totalSeats <= 60 ? 10 : rowN <= frontRow ? 10 : 8;
        System.out.println("Ticket price: $" + ticketPrice);
        printMenu(cineSeats);
    }
}
