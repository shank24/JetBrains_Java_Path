package Session_2.Project;

import java.util.Scanner;

public class Cinema_7 {

    static int purchasedTickets;
    static int ticketCount;
    static Scanner console = new Scanner(System.in);
    public static String[][] cinemaSeats(int row, int seat) {
        String[][] cinemaSeats = new String[row][seat];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < seat; j++) {
                cinemaSeats[i][j] = "S";
            }
        }
        return cinemaSeats;
    }

    public static void printCinema(int row, int seat, String[][] cinemaSeats) {
        System.out.println();
        System.out.println("Cinema:");
        System.out.print("  ");

        for (int i = 0; i < seat; i++) {

            System.out.print(i + 1 + " ");
        }
        System.out.println();

        for (int i = 0; i < row; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < seat; j++) {

                System.out.print(" " + cinemaSeats[i][j]);
            }
            System.out.println();
        }
    }

    public static int scannerInt(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println(" ");
        int row = scannerInt("Enter the number of rows:");
        int seat = scannerInt("Enter the number of seats in each row :");
        String[][] cinemaSeats = cinemaSeats(row, seat);
        System.out.println();
        menu(row,seat,cinemaSeats);
    }

    public static void menu(int row,int seat,String[][]cinemaSeats){

        System.out.println(" ");
        System.out.println(""+
                "\n"+"1. Show the seats"+
                "\n"+"2. Buy a ticket"+
                "\n"+"3. Statistics"+
                "\n"+"0. Exit"+
                "");
        int option = console.nextInt();

        System.out.println();

        switch (option) {

            case 1:
                printCinema( row,seat,cinemaSeats);
                System.out.println(" ");
                menu(row,seat,cinemaSeats);
                break;

            case 2:
                int rowNum = scannerInt("Enter a row number:");
                int seatNum = scannerInt("Enter a seat number in that row:");
                if (rowNum > row && seatNum > seat){
                    System.out.println("Wrong input!");
                }else if (cinemaSeats[rowNum - 1][seatNum - 1] == "B"){
                    System.out.println("That ticket has already been purchased!");
                }else{
                    buyTicket(rowNum,seatNum,cinemaSeats);
                    menu(row,seat,cinemaSeats);
                }
                break;
            case 3:
                statistics(row,seat,purchasedTickets,ticketCount);
                menu(row,seat,cinemaSeats);
                break;

            case 0:
                System.out.println(0);
                break;
            default :
                break;
        }

    }

    public static void buyTicket (int rowNum, int seatNum,String[][] cinemaSeats){
        System.out.println(" ");
        int ticketPrice;
        ticketPrice = ((cinemaSeats[0].length * cinemaSeats.length) <= 60) || (rowNum <= (cinemaSeats.length / 2))
                ? 10 : 8;

        System.out.println("\n" + "Ticket price: $" + ticketPrice);
        purchasedTickets = purchasedTickets + ticketPrice;

        //System.out.println("Ticket price: $" + (row * seat <= 60 || seatNum <= seat / 2 ? 10 : 8) + "\n");
        cinemaSeats[rowNum - 1][seatNum - 1] = "B";
        if (cinemaSeats[rowNum - 1][seatNum - 1] == "B"){
            ticketCount++;
        }
    }
    public static void statistics(int row,int seat,int ticketCount,int purchasedTickets){
        int totalIncome = row * seat;
        System.out.println(" ");
        System.out.printf("Number of purchased tickets: %d%n", purchasedTickets);
        System.out.printf("Percentage: %2f%n", 100.0 * purchasedTickets / totalIncome);
        System.out.printf("Current income: $%d%n", ticketCount);


        int ticket = 0;
        int frontRow = 0;
        int backRow = 0;
        if (totalIncome < 60){
            ticket = 10 * row * seat;

        }
        else if (row % 2 != 0) {
            frontRow = ( row / 2)* seat;
            backRow =  ((row / 2) + 1) * seat;
            ticket = (frontRow * 10) + (backRow * 8);

        }else {
            frontRow = (row / 2) * seat;
            backRow = (row / 2) * seat;
            ticket = (frontRow * 10) + (backRow * 8);

        }
        System.out.printf("Total income: $%d%n", ticket);

    }

    public static boolean isValid(String[][] arr, int row, int col) {
        return (row-1) >= 0 && (row-1) <= arr.length - 1 && (col-1) >= 0 && (col-1) <= arr[0].length - 1;
    }

    public static boolean isTaken(String[][] arr, int row, int col) {
        return arr[row - 1][col - 1].equalsIgnoreCase("B");
    }
}
