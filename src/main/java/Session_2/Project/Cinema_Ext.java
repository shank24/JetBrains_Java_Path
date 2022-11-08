package Session_2.Project;

import java.util.Scanner;

public class Cinema_Ext {

    final static Scanner scanner = new Scanner(System.in);
    static int numberOfRows;
    static int numberOfSeats;
    static int rowNumber;
    static int seatNumber;


    public static void main(String[] args) {

        System.out.println("Enter the number of rows:");
        numberOfRows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        numberOfSeats = scanner.nextInt();

        cinemaSeats(numberOfRows, numberOfSeats);
        calculateIncome();
    }

    private static void calculateIncome() {


        int [] [] cinemaArray  = new int[numberOfRows][numberOfSeats];

        System.out.println("Enter a row number:");
        rowNumber = scanner.nextInt();

        System.out.println("Enter a seat number in that row:");
        seatNumber = scanner.nextInt();


        int totalNumberOfSeats = numberOfRows * numberOfSeats;

        int cost = 0;
        int firstHalfRows = 0;
        int secondHalfRows = 0;

        if(totalNumberOfSeats > 81){
            return;
        }

        if(totalNumberOfSeats > 60 && numberOfRows%2!=0) {
            firstHalfRows = numberOfRows/2;
            secondHalfRows = (numberOfRows/2) + 1;

            cost = firstHalfRows * 10 * numberOfSeats + secondHalfRows * 8 * numberOfSeats;


            System.out.println("Ticket price:" + "$10");
        }

        else if(totalNumberOfSeats > 60) {
            firstHalfRows = numberOfRows/2;
            secondHalfRows = (numberOfRows/2);

            cost = firstHalfRows * 10 * numberOfSeats + secondHalfRows * 8 * numberOfSeats;
            System.out.println("Ticket price:" + "$8");
        }
        else {
            System.out.println("Ticket price:" + "$10");
            cinemaSeats(numberOfRows,numberOfSeats);

        }
    }

    private static void cinemaSeats(int rows, int cols) {
        int arr[][] = new int[rows][cols];

        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= cols; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 1; i <= rows; i++) {
            System.out.print(i);
            for (int j = 1; j <= cols ; j++) {
                if(arr[i][j] == arr[rowNumber][seatNumber]){
                    System.out.println(" B");
                }
                System.out.print(" S");
            }
            System.out.println();
        }
    }

    private static void cinemaSeatsModified(int rows, int cols) {
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= cols; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 1; i <= rows; i++) {
            System.out.print(i);
            for (int j = 1; j <= cols ; j++) {
                if(rows == rowNumber && cols == seatNumber){
                    System.out.println(" B");
                }
                System.out.print(" S");
            }
            System.out.println();
        }
    }
}
